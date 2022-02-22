package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {
    EditText name,email,mobile;
    RadioGroup gender;
    RadioButton selectedGen;
    Button submit;
    Spinner sprinner;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.stName);
        email = findViewById(R.id.stEmail);
        mobile = findViewById(R.id.stMobile);
        gender = findViewById(R.id.gender);
        submit =  findViewById(R.id.subButton);
        sprinner = findViewById(R.id.spinner);

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this, R.array.planets_array, R.layout.support_simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        sprinner.setAdapter(adapter);
        submit.setOnClickListener(new View.OnClickListener(){
            @Override
            public  void onClick(View view){
                String stName = name.getText().toString();
                String stEmail = email.getText().toString();
                String stMobile = mobile.getText().toString();
                int genId = gender.getCheckedRadioButtonId();
                selectedGen = findViewById(genId);
                String stGen = selectedGen.getText().toString();
                Log.d(null, " Student: name: "+ stName + " Email: "+stEmail+ " Gender: "+stGen);

            }


        }

        );
    }
}