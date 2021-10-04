package com.example.prueba;

import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.prueba.databinding.ActivityMainBinding;

import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private AppBarConfiguration appBarConfiguration;
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Login button created
        Button btnLogin = findViewById(R.id.btnSignin);
        //Name and password fields created
        EditText txtUserName = findViewById(R.id.txtUserName);
        EditText txtPassword = findViewById(R.id.txtPassword);
        //The textview created
        TextView lblLoginResult = findViewById(R.id.lblLoginResult);
        lblLoginResult.setVisibility(View.INVISIBLE); //Textview invisible

        //If we click on button login
        btnLogin.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                //Check if the name and password fields are correct
                if (txtUserName.getText().toString().equals("Alonso") && txtPassword.getText().toString().equals("1234")){

                    lblLoginResult.setText("Successful login");//Set message on the textview
                    Log.i("Test","Successful login");

                }else{
                    lblLoginResult.setText("Wrong name or password");//Set message on the textview
                    Log.i("Test","Wrong name or password");
                }
                //Text view turn in visible
                lblLoginResult.setVisibility(View.VISIBLE);
            }
        });

    }

}