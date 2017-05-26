package com.cybereye_community.interactive;

import android.app.Activity;
import android.app.ListActivity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class Menu extends Activity {
    ListView list;
    String [] provider = {
            "Mentari",
            "Telkomsel",
            "Esia",
            "Flexi",
            "IM3",
            "AS"
    };

    Integer[] imgId = {
            R.drawable.icon2,
            R.drawable.icon1,
            R.drawable.esia,
            R.drawable.flexi,
            R.drawable.icon3,
            R.drawable.icon1
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);

        CustomList ab = new CustomList(this, provider,imgId);
        list = (ListView)findViewById(R.id.bbb);
        list.setAdapter(ab);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String apa = provider[+position];
                    
                    Intent i = new Intent(getApplicationContext(),Price.class);
                    i.putExtra("a",apa);
                    startActivity(i);

            }
        });

    }
}
