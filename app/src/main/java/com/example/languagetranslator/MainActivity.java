package com.example.languagetranslator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ListView animallist=(ListView)findViewById(R.id.animalslist1);
        final ArrayAdapter<CharSequence> animaladapter=ArrayAdapter.createFromResource(this,R.array.animals,android.R.layout.simple_list_item_1);
        animallist.setAdapter(animaladapter);
        animallist.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id)
            {
                String message=getString(R.string.toastmessage)+ animaladapter.getItem(position);
                        Toast.makeText(getApplicationContext(),message,Toast.LENGTH_SHORT).show();
            }
        });

    }
}
