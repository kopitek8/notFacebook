package com.example.keyur.notfacebook;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Imagelist extends ArrayAdapter<String> {

    private final Activity context;
    private final String[] itemname;
    private final Integer[] imgid;



    public Imagelist(Activity context, String[] itemname, Integer[] imgid) {
        super(context, R.layout.imagelist, itemname);
        // TODO Auto-generated constructor stub

        this.context=context;
        this.itemname=itemname;
        this.imgid=imgid;
    }



    public View getView(int position, View view, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.imagelist, null,true);

        TextView name = (TextView) rowView.findViewById(R.id.name);
        ImageView image = (ImageView) rowView.findViewById(R.id.icon);
        TextView desc = (TextView) rowView.findViewById(R.id.desc);

        name.setText(itemname[position]);
        image.setImageResource(imgid[position]);
        desc.setText("This is "+itemname[position]+" from Philly");
        return rowView;

    };
}