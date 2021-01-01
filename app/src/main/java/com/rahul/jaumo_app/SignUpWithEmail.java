package com.rahul.jaumo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

public class SignUpWithEmail extends AppCompatActivity {
    EditText et_email, et_password;
    TextView tv_email, tv_password;
    Button btn_signin;
    ImageView ibDropDownList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_with_email);
        initUI();

    }

    private void initUI() {
        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);
        tv_email = findViewById(R.id.tv_email);
        ibDropDownList = findViewById(R.id.ivMore);
        tv_password = findViewById(R.id.tv_password);
        btn_signin = findViewById(R.id.btn_signin);
        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
              if(isValidForm()){
                  Intent intent= new Intent(SignUpWithEmail.this,Gender.class);
                  startActivity(intent);
              }
            }
        });

        ibDropDownList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignUpWithEmail.this,Support.class);
                startActivity(intent);
            }
        });
    }
    private boolean isValidForm() {
        boolean isValid = true;
        if (et_email.getText().toString().isEmpty()) {
            et_email.setError("Please enter email address");
            isValid = false;
        }
        else if (et_password.getText().toString().isEmpty()) {
            et_password.setError("Please enter password");
            isValid = false;
        }
         if (et_password.getText().toString().length() < 7) {
            et_password.setError("Password should be minimum 7 characters ");
            isValid = false;
        }
        return  isValid;
    }
}