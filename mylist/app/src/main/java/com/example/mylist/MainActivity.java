package com.example.mylist;

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
        ListView listViewAnimals = (ListView) findViewById(R.id.listview);
        final ArrayAdapter<CharSequence> adapteranimals = ArrayAdapter.createFromResource(this,
                R.array.animalsarray,
                android.R.layout.simple_list_item_1
                );
        listViewAnimals.setAdapter(adapteranimals);
        listViewAnimals.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            public  void  onItemClick(AdapterView<?>parent, View view, int position, long id )
            {
                String message = "You picked"+" "+adapteranimals.getItem(position);
                Toast.makeText(getApplicationContext(),
                        message,
                        Toast.LENGTH_SHORT).show();
            }
                                               }

        );
    }
}
