package com.example.arrayadapter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    String[] team={"India"," Australia","England","South Africa","Pakistan","Bangladesh"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView= (ListView)findViewById(R.id.ls); //id of draged list view in activity_main.xml

        ArrayAdapter<String> arrayAdapter=
                new ArrayAdapter<String>(this,R.layout.item_view,R.id.itemTextView,team);
        listView.setAdapter(arrayAdapter);

    }
}