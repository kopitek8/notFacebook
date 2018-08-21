package com.example.keyur.notfacebook;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class Home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        TextView textView = (TextView) findViewById(R.id.textView3);
        ListView list = (ListView) findViewById(R.id.list);



        Intent i = getIntent();


        final String [] names = {
                "Dennis Reynolds",
                "Mac",
                "Charlie Kelly",
                "Dee Reynolds",
                "Frank Reynolds",
                "The Waitress",
                "Rickety Cricket",
                "Charlie's Mom",
                "Mac's Mom",
                "Mac's Dad",
                "Liam McPoyle",
                "Ryan McPoyle",
                "Gail The Snail"
        };

        final Integer [] image = {
                R.drawable.dennis,
                R.drawable.mac,
                R.drawable.charlie,
                R.drawable.dee,
                R.drawable.frank,
                R.drawable.waitress,
                R.drawable.rickety,
                R.drawable.charliemom,
                R.drawable.macmom,
                R.drawable.macdad,
                R.drawable.liam,
                R.drawable.ryan,
                R.drawable.gail
        };
        //ArrayAdapter<String> adapter = new ArrayAdapter<String>(getApplicationContext(), android.R.layout.simple_list_item_1, names);
        Imagelist adapter = new Imagelist(this, names, image);
        list = (ListView) findViewById(R.id.list);

        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {


                if(names[position].equals("Dennis Reynolds")){
                    String name = "Hey gorgeous, I'm Dennis Reynolds";
                    String desc = "Alright alright alright!!!";
                    int img = R.drawable.dennis;

                    Intent newIntent = new Intent(getApplicationContext(), Detail.class);
                    newIntent.putExtra("name", name);
                    newIntent.putExtra("desc", desc);
                    newIntent.putExtra("img", img);
                    startActivity(newIntent);
                } else if(names[position].equals("Mac")) {

                    String name = "Heyoooo!!! Mac in the house!";
                    String desc = "I'm so angry and pumped!";
                    int img = R.drawable.mac;

                    Intent newIntent = new Intent(getApplicationContext(), Detail.class);
                    newIntent.putExtra("name", name);
                    newIntent.putExtra("desc", desc);
                    newIntent.putExtra("img", img);
                    startActivity(newIntent);
                } else if(names[position].equals("Charlie Kelly")) {

                    String name = "I'm Charlie Kelly and I'm in love with a man named God";
                    String desc = "What is your spaghetti policy here?";
                    int img = R.drawable.charlie;

                    Intent newIntent = new Intent(getApplicationContext(), Detail.class);
                    newIntent.putExtra("name", name);
                    newIntent.putExtra("desc", desc);
                    newIntent.putExtra("img", img);
                    startActivity(newIntent);
                } else if(names[position].equals("Dee Reynolds")) {

                    String name = "Goddamn you! I'm Dee Reynolds";
                    String desc = "They call me a bird";
                    int img = R.drawable.dee;

                    Intent newIntent = new Intent(getApplicationContext(), Detail.class);
                    newIntent.putExtra("name", name);
                    newIntent.putExtra("desc", desc);
                    newIntent.putExtra("img", img);
                    startActivity(newIntent);
                } else if(names[position].equals("Frank Reynolds")) {

                    String name = "Heyoo!! I'm Frank Reynolds. Wo wo, no. I'm Mantis Toboggan";
                    String desc = "What the shit is this!?";
                    int img = R.drawable.frank;

                    Intent newIntent = new Intent(getApplicationContext(), Detail.class);
                    newIntent.putExtra("name", name);
                    newIntent.putExtra("desc", desc);
                    newIntent.putExtra("img", img);
                    startActivity(newIntent);
                } else if(names[position].equals("The Waitress")) {

                    String name = "I'm not the waitress";
                    String desc = "I want Charlie to stop stalking me";
                    int img = R.drawable.waitress;

                    Intent newIntent = new Intent(getApplicationContext(), Detail.class);
                    newIntent.putExtra("name", name);
                    newIntent.putExtra("desc", desc);
                    newIntent.putExtra("img", img);
                    startActivity(newIntent);
                } else if(names[position].equals("Rickety Cricket")) {

                    String name = "My name is Matthew Mara. They call me Cricket";
                    String desc = "You guys destroyed my life";
                    int img = R.drawable.rickety;

                    Intent newIntent = new Intent(getApplicationContext(), Detail.class);
                    newIntent.putExtra("name", name);
                    newIntent.putExtra("desc", desc);
                    newIntent.putExtra("img", img);
                    startActivity(newIntent);
                } else if(names[position].equals("Charlie's Mom")) {

                    String name = "Ooo hi. I'm Charlie's Mom.";
                    String desc = "I'm scared my son will die";
                    int img = R.drawable.charliemom;

                    Intent newIntent = new Intent(getApplicationContext(), Detail.class);
                    newIntent.putExtra("name", name);
                    newIntent.putExtra("desc", desc);
                    newIntent.putExtra("img", img);
                    startActivity(newIntent);
                } else if(names[position].equals("Mac's Mom")) {

                    String name = "Hrrrrr";
                    String desc = "Where's my cigarette??!!";
                    int img = R.drawable.macmom;

                    Intent newIntent = new Intent(getApplicationContext(), Detail.class);
                    newIntent.putExtra("name", name);
                    newIntent.putExtra("desc", desc);
                    newIntent.putExtra("img", img);
                    startActivity(newIntent);
                } else if(names[position].equals("Mac's Dad")) {

                    String name = "I wish I wasn't your dad";
                    String desc = "I'mma kill you two when I get outta here";
                    int img = R.drawable.macdad;

                    Intent newIntent = new Intent(getApplicationContext(), Detail.class);
                    newIntent.putExtra("name", name);
                    newIntent.putExtra("desc", desc);
                    newIntent.putExtra("img", img);
                    startActivity(newIntent);
                }  else if(names[position].equals("Liam McPoyle")) {

                    String name = "I'm Liam. A proud McPoyle";
                    String desc = "I'm gonna fork-stab you";
                    int img = R.drawable.liam;

                    Intent newIntent = new Intent(getApplicationContext(), Detail.class);
                    newIntent.putExtra("name", name);
                    newIntent.putExtra("desc", desc);
                    newIntent.putExtra("img", img);
                    startActivity(newIntent);
                } else if(names[position].equals("Ryan McPoyle")) {

                    String name = "I'm a proud McPoyle, Ryan";
                    String desc = "Hey, time's up!";
                    int img = R.drawable.ryan;

                    Intent newIntent = new Intent(getApplicationContext(), Detail.class);
                    newIntent.putExtra("name", name);
                    newIntent.putExtra("desc", desc);
                    newIntent.putExtra("img", img);
                    startActivity(newIntent);
                } else if(names[position].equals("Gail The Snail")) {

                    String name = "I'm Gail. I'm sexually active now";
                    String desc = "Stop throwing salt at me!!";
                    int img = R.drawable.gail;

                    Intent newIntent = new Intent(getApplicationContext(), Detail.class);
                    newIntent.putExtra("name", name);
                    newIntent.putExtra("desc", desc);
                    newIntent.putExtra("img", img);
                    startActivity(newIntent);
                }

            }
        });
    }

    /*@Override
    public void onBackPressed() {
        *//*Intent backa = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(backa);*//*

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
    }*/


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater men = getMenuInflater();
        men.inflate(R.menu.addfriend, menu);
        return true;



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.addFriend:

                Intent i = new Intent(getApplicationContext(), AddData.class);
                startActivity(i);



        }

        return false;
    }




}
