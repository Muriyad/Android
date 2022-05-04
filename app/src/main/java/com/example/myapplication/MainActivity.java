package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.concurrent.TimeUnit;

public class MainActivity extends AppCompatActivity {
    EditText editTextTextPersonName, editTextPhone, editTextTextEmailAddress, editTextTextAddress;
    TextView nameView, phoneView, mailView, addressView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editTextTextPersonName = findViewById(R.id.editTextTextPersonName);
        editTextPhone = findViewById(R.id.editTextPhone);
        editTextTextEmailAddress = findViewById(R.id.editTextTextEmailAddress);
        editTextTextAddress = findViewById(R.id.editTextTextAddress);
        button = findViewById(R.id.button);
        nameView = findViewById(R.id.nameView);
        phoneView = findViewById(R.id.phoneView);
        mailView = findViewById(R.id.mailView);
        addressView = findViewById(R.id.addressView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(validate()){
                    nameView.setText("Name: " + editTextTextPersonName.getText().toString());
                    phoneView.setText("Phone: " + editTextPhone.getText().toString());
                    mailView.setText("Email: " + editTextTextEmailAddress.getText().toString());
                    addressView.setText("Email: " + editTextTextAddress.getText().toString());

                }
            }
        });
    }
    public boolean validate() {
        if (editTextTextPersonName.getText().toString().isEmpty()) {
            Toast.makeText(this, "enter a valid name, address, phone, or email", Toast.LENGTH_LONG).show();
            return false;
        }
        if (editTextPhone.getText().toString().length() != 10) {
            Toast.makeText(this, "enter a valid name, address, phone, or email", Toast.LENGTH_LONG).show();
            return false;
        }
        if(editTextTextEmailAddress.getText().toString().length()>=30){
            Toast.makeText(this, "enter a valid name, address, phone, or email", Toast.LENGTH_LONG).show();
            return false;
        }
        if(editTextTextAddress.getText().toString().length()>=30){
            Toast.makeText(this, "enter a valid name, address, phone, or email", Toast.LENGTH_LONG).show();
            return false;
        }

        return true;
    }
}

