package com.cybereye_community.interactive;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by edikurniawan on 5/21/17.
 */

public class CustomList extends ArrayAdapter<String> {

    private final Activity con;
    private final String[]provider;
    private final Integer[]imgId;

    public CustomList(Activity con, String[]provider, Integer[]imgId )
    {
        super(con, R.layout.txt_label, provider);
        this.con = con;
        this.provider = provider;
        this.imgId = imgId;
    }

    public View getView(int position, View view, ViewGroup parent){
        LayoutInflater inflater = con.getLayoutInflater();
        View abc = inflater.inflate(R.layout.txt_label, null, true);

        ImageView img = (ImageView)abc.findViewById(R.id.gambar);
        TextView txt = (TextView)abc.findViewById(R.id.txtProvider);

        img.setImageResource(imgId[position]);
        txt.setText(provider[position]);
        return abc;
    };

}



