package com.example.subteacher;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    private TextView SubTeacher;
    private EditText Email;
    private TextView Pass;
    private TextView Username;
    private TextView Password;
    private TextView ForgetPassword;
    private Button Login;
    private Button Signup;
    private int counter = 5;


    @SuppressLint("WrongViewCast")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        SubTeacher = (TextView) findViewById(R.id.edSubTeacher);
        Email = (EditText)findViewById(R.id.edEmail);
        Pass = (EditText)findViewById(R.id.edPass);
        SubTeacher = (TextView) findViewById(R.id.edSubTeacher);
        Username = (TextView) findViewById(R.id.txtUsername);
        Password = (TextView) findViewById(R.id.txtPassword);
        ForgetPassword = (TextView)findViewById(R.id.txtFrgtPW);
        Login = (Button)findViewById(R.id.btnLogin);
        Signup = (Button)findViewById(R.id.btnSignup);

        Login.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                validate(Email.getText().toString(),Pass.getText().toString());
            }
        });


    }

    private void validate(String userEmail, String userPassword)
    {
        if((userEmail.equalsIgnoreCase("Admin") && (userPassword.equalsIgnoreCase("1234"))))
        {
           Intent intent = new Intent(MainActivity.this, SecondActivity.class);
            startActivity(intent);
        }
        else
        {
        counter--;



        if(counter == 0)
        {
            Login.setEnabled(false);
        }

        }


    }

}