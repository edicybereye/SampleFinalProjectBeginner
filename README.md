# Sample Project Beginner (Indonesia Android Kejar)
In here we training develop everything and build everything about layout and App Interactive, for sample application we create on this session is Login which any View EditText with Email and Password also View Button for Submit authentication with some statement IF .. ELSEIF .. ELSE and some operation Math 
## Layout XML 
Create New project | File - New - New Project and for Project Name "Interactive" Company Domain "cybereye-community.com" and Activity with "Empty Activity" Activity Name is Default

![main](https://cloud.githubusercontent.com/assets/28985797/26512628/9871d2d4-4291-11e7-803a-a10b5c1336e2.jpeg)
```
<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:layout_width="match_parent"
    android:orientation="vertical"
    android:layout_height="match_parent"
    tools:context="com.cybereye_community.interactive.MainActivity">
    <EditText
        android:id="@+id/email"
        android:inputType="textEmailAddress"
        android:drawableLeft="@drawable/ic_email_black_24dp"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />
    <EditText
        android:id="@+id/pass"
        android:inputType="textPassword"
        android:drawableLeft="@drawable/ic_lock_black_24dp"
        android:layout_width="match_parent"
        android:layout_height="wrap_content" />
    <Button
        android:id="@+id/login"
        android:text="Login"
        android:textAllCaps="false"
        android:layout_width="wrap_content"
        android:layout_height="wrap_content" />


</LinearLayout>
```
**Noted :** in xml I have assign 3 id or initial with attribute name **android:id**
## Java Class
We create global variable on Java Class with Call view what we assign the initial or ID in XML and making relation with global variable with ID xml 

**Create Global Variable :**
```
EditText txtEmail, txtPass;
Button btnLogin;
```
**Making Relation GLobal Variable with ID XML View :**
```
 txtEmail = (EditText)findViewById(R.id.email);
        txtPass = (EditText)findViewById(R.id.pass);
        btnLogin = (Button)findViewById(R.id.login);
```
**Sample Content Click view :**
We try enable click function on componen or view EditText email which if we click EditText email automatic will fill my email

![image](https://cloud.githubusercontent.com/assets/28985797/26513147/248606f8-4294-11e7-989d-3ad68d264981.png)

```
txtEmail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtEmail.setText("edi.cybereye@gmail.com");
            }
        });
```
**Complete Java Class Code :**
```
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

```
