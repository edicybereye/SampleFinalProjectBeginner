package com.cybereye_community.interactive;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText txtEmail, txtPass;
    Button btnLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtEmail = (EditText)findViewById(R.id.email);
        txtPass = (EditText)findViewById(R.id.pass);
        btnLogin = (Button)findViewById(R.id.login);



        txtEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtEmail.setText("edi.cybereye@gmail.com");
            }
        });


        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (txtEmail.getText().toString().equals("")){
                    txtEmail.setError("Masukkan Email Anda");
                }else if(txtPass.getText().toString().equals("")){
                    txtPass.setError("Masukkan Password Anda");
                }else {
                    if(txtEmail.getText().toString().equals("edi.cybereye@gmail.com") &&
                            txtPass.getText().toString().equals("password")){

                        Intent I = new Intent(getApplicationContext(), Menu.class);
                        startActivity(I);

                    }else{
                        Toast.makeText(getApplicationContext(),
                                "Email dan Password Salah",Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });

    }
}
