package com.example.keyur.notfacebook;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        //Intent getInt = getIntent();
        //final String [] namess = getInt.getStringArrayExtra("nam");
        //final Integer [] imgs = getInt.getIntegerArrayListExtra("img");
        //Imagelist adapter = new Imagelist(this, namess, imgs);

        Intent geti = getIntent();
        String name = geti.getStringExtra("name");
        String desc = geti.getStringExtra("desc");
        int pic = geti.getIntExtra("img", 0);

        ImageView img = (ImageView) findViewById(R.id.pic);
        TextView na = (TextView) findViewById(R.id.name);
        TextView de = (TextView) findViewById(R.id.desc);

        img.setImageResource(pic);
        na.setText(name);
        de.setText(desc);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        super.onCreateOptionsMenu(menu);
        MenuInflater men = getMenuInflater();
        men.inflate(R.menu.edit, menu);
        return true;



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.edit:



        }

        return false;
    }


}
