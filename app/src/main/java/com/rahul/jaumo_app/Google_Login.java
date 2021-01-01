package com.rahul.jaumo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Google_Login extends AppCompatActivity {

    private EditText etEmail;
    private EditText etPassword;
    private Button btnLogin;
    private RadioGroup rgGroup;
    private RadioButton rbBtn;
    private EditText etName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_google__login);

        rgGroup = findViewById(R.id.rgGender);
        etName = findViewById(R.id.etName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etGooglePassword);
        btnLogin = findViewById(R.id.btnGoogleLogin);

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(emailValidate())
                {
                    int selectedID = rgGroup.getCheckedRadioButtonId();
                    rbBtn = findViewById(selectedID);
                    String gender = rbBtn.getText().toString();
                    if(gender.contains("Male"))
                    {
                        Toast.makeText(Google_Login.this,"Welcome "+etName.getText().toString(),Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(Google_Login.this,Home_Page.class);
//                        intent.putExtra("Google","Male");
                        startActivity(intent);
                    }
                    else if(gender.contains("Female"))
                    {
                        Toast.makeText(Google_Login.this,"Welcome "+etName.getText().toString(),Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(Google_Login.this,Home_Page_Women.class);
//                        intent.putExtra("Google","Female");
                        startActivity(intent);
                    }

                }
            }
        });


    }

    private  boolean emailValidate()
    {
        boolean email = true;
        if(!etEmail.getText().toString().contains("@gmail.com"))
        {
            etEmail.setError("please enter a valid google e-mail id");
            email = false;
        }
        return email;
    }
}