package com.example.keyur.notfacebook;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddData extends AppCompatActivity {

    Handler handler;
    EditText name, desc;
    Button addbtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_data);

        Intent i = getIntent();

        handler = new Handler(this);
        name = (EditText) findViewById(R.id.nametxt);
        desc = (EditText) findViewById(R.id.desctxt);
        addbtn = (Button) findViewById(R.id.addbtn);
        add();

    }

    public void add() {

        addbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean isInserted = handler.addData(name.getText().toString(), desc.getText().toString());

                if(isInserted = true)
                    Toast.makeText(getApplicationContext(), "Crew Member Added", Toast.LENGTH_LONG).show();
                else
                    Toast.makeText(getApplicationContext(), "Error in adding crew member", Toast.LENGTH_LONG).show();

            }
        });
    }
}
