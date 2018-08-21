package com.example.keyur.notfacebook;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    SharedPreferences pref;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pref = getApplicationContext().getSharedPreferences("MyPref", Context.MODE_PRIVATE);
        String us = pref.getString("username", "NA");

        if(!us.equals("NA")) {
            Intent in = new Intent(this, MyProf.class);
            startActivity(in);
            finish();
        }

        Intent i = getIntent();




        Button signIn = (Button) findViewById(R.id.login);
        signIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText username = (EditText) findViewById(R.id.username);
                String a = username.getText().toString();

                EditText password = (EditText) findViewById(R.id.password);
                String b = password.getText().toString();

                if(a.equals("admin") && b.equals("password")){
                    Toast toast= Toast.makeText(getApplicationContext(),"Login Successful",Toast.LENGTH_LONG);
                    toast.show();

                    SharedPreferences.Editor editor = pref.edit();
                /*String us = pref.getString("a", "NA");
                String pw = pref.getString("b", "NA");*/

                    editor.putString("username", a);
                    editor.putString("password", b);
                    editor.commit();
                    Intent i = new Intent(getApplicationContext(), MyProf.class);
                    startActivity(i);
                    finish();
                } else {
                    Toast toast= Toast.makeText(getApplicationContext(),"Error",Toast.LENGTH_SHORT);
                    toast.show();
                }

            }
        });

        Button clear = (Button) findViewById(R.id.clear);
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText username = (EditText) findViewById(R.id.username);
                username.setText("");

                EditText password = (EditText) findViewById(R.id.password);
                password.setText("");

                Toast toast = Toast.makeText(getApplicationContext(), "Username and Password Cleared", Toast.LENGTH_SHORT);
                toast.show();



            }
        });



    }

     /*if(!us.equals("NA")) {
        Intent in = new Intent(this, Home.class);
        startActivity(in);
    }*/

    @Override
    public void onBackPressed() {

        //Clear username and password when back pressed
        /*Intent press = getIntent();

        EditText username = (EditText) findViewById(R.id.username);
        username.setText("");

        EditText password = (EditText) findViewById(R.id.password);
        password.setText("");*/


        //Dialog box "Do you want to exit"?
        final AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Do you want to exit the application?");
        builder.setCancelable(true);
        builder.setNegativeButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                finish();
            }
        });

        builder.setPositiveButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.cancel();
            }
        });

        AlertDialog ad = builder.create();
        ad.show();

    }


}
