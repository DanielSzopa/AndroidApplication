package com.example.danielszopa13575app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView txtFirstName;
    private TextView txtLastName;
    private TextView txtEmail;
    private TextView txtPhone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBtnRegisterClick(View view){
        EditText firstNameEditText = findViewById(R.id.edtTxtFirstName);
        EditText lastNameEditText = findViewById(R.id.edtTxtLastName);
        EditText emailEditText = findViewById(R.id.edtTxtEmail);
        EditText phoneEditText = findViewById(R.id.edtTxtPhone);

        String firstName = firstNameEditText.getText().toString();
        String lastName = lastNameEditText.getText().toString();
        String email = emailEditText.getText().toString();
        String phone = phoneEditText.getText().toString();

        TextView txtFirstName = findViewById(R.id.txtFirstName);
        TextView txtLastName = findViewById(R.id.txtLastName);
        TextView txtEmail = findViewById(R.id.txtEmail);
        TextView txtPhone = findViewById(R.id.txtPhone);

        txtFirstName.setText("First Name: " + firstName);
        txtLastName.setText("Last Name: " + lastName);
        txtEmail.setText("Email: " + email);
        txtPhone.setText("Call me: " + phone);
    }

    public void onBtnResetClick(View view){
        EditText firstNameEditText = findViewById(R.id.edtTxtFirstName);
        EditText lastNameEditText = findViewById(R.id.edtTxtLastName);
        EditText emailEditText = findViewById(R.id.edtTxtEmail);
        EditText phoneEditText = findViewById(R.id.edtTxtPhone);

        firstNameEditText.setText("");
        lastNameEditText.setText("");
        emailEditText.setText("");
        phoneEditText.setText("");

        TextView txtFirstName = findViewById(R.id.txtFirstName);
        TextView txtLastName = findViewById(R.id.txtLastName);
        TextView txtEmail = findViewById(R.id.txtEmail);
        TextView txtPhone = findViewById(R.id.txtPhone);

        txtFirstName.setText("First Name:");
        txtLastName.setText("Last Name:");
        txtEmail.setText("Email:");
        txtPhone.setText("Call me:");
    }
}