package com.example.user.barcode;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class LoginPage extends AppCompatActivity {
    UserDb db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        this.db=new UserDb(this);
    }

    public void toRegisterPage(View view) {
        Intent registerPage = new Intent(this, RegistrationPage.class);
        startActivity(registerPage);
    }



    public void Login(View view) {
        String email=((EditText) findViewById(R.id.userEmail)).getText().toString().trim();
        String password=((EditText) findViewById(R.id.userPassword)).getText().toString().trim();

        if(db.Login(email,password)){
            Intent barcodeMenu = new Intent(this, BarcodeMenu.class);
            startActivity(barcodeMenu);
        }
        else{
            TextView errors=(TextView) findViewById(R.id.login_errors) ;
            errors.setText("Access Denied");
        }
    }
}
