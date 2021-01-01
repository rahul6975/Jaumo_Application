package com.rahul.jaumo_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class SignUpWithEmail extends AppCompatActivity {
    EditText et_email, et_password;
    TextView tv_email, tv_password, tv_newaccount, et_name;
    Button btn_signin;
    RadioGroup rgGender;
    RadioButton rbMale;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up_with_email);
        initUI();

    }

    private void initUI() {
        rgGender = findViewById(R.id.rgGender);
        rbMale = findViewById(R.id.rbMale);
        et_email = findViewById(R.id.et_email);
        et_password = findViewById(R.id.et_password);
        tv_email = findViewById(R.id.tv_email);
        tv_password = findViewById(R.id.tv_password);
        btn_signin = findViewById(R.id.btn_signin);
        tv_newaccount = findViewById(R.id.tv_newaccount);
        et_name = findViewById(R.id.et_name);


        tv_newaccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SignUpWithEmail.this, Start_Page.class);
                startActivity(intent);
            }
        });
        btn_signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isValidForm()) {
                    int radioButtonID = rgGender.getCheckedRadioButtonId();

                    RadioButton radioButton = (RadioButton) rgGender.findViewById(radioButtonID);

                    String gender = radioButton.getText().toString();
                    if (gender.equalsIgnoreCase("Female")) {
                        Toast.makeText(SignUpWithEmail.this, "Welcome " + et_name.getText().toString(), Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(SignUpWithEmail.this, Home_Page_Women.class);
                        startActivity(intent);
                    } else if (gender.equalsIgnoreCase("male")) {
                        Toast.makeText(SignUpWithEmail.this, "Welcome " + et_name.getText().toString(), Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(SignUpWithEmail.this, Home_Page.class);
                        startActivity(intent);
                    }
                }
            }
        });


    }

    private boolean isValidForm() {
        boolean isValid = true;
        if (et_name.getText().toString().isEmpty()) {
            et_name.setError("Please enter Name");
            isValid = false;
        }
        if (et_email.getText().toString().isEmpty()) {
            et_email.setError("Please enter email address");
            isValid = false;
        } else if (et_password.getText().toString().isEmpty()) {
            et_password.setError("Please enter password");
            isValid = false;
        }
        if (!et_email.getText().toString().contains("@gmail.com")) {
            et_email.setError("please enter a valid google e-mail id");
            isValid = false;
        }
        if (et_password.getText().toString().length() < 7) {
            et_password.setError("Password should be minimum 7 characters ");
            isValid = false;
        }
        if (rgGender.getCheckedRadioButtonId() == -1) {
            rbMale.setError("Please select gender");
            isValid = false;
        }

        return isValid;
    }
}