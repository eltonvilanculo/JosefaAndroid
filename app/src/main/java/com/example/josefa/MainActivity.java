package com.example.josefa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView contactListViewId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactListViewId = findViewById(R.id.contact_listView_id);

        String contacts []= {"Ana","Joana","Osvaldo","Isabel"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, contactList());
        contactListViewId.setAdapter(adapter);




    }

    String [] contactList(){
        String array1[] = new String[20];

        for(int i =0; i<array1.length; i++){

            array1[i]="josefa " + (i);

        }
        return array1;
    }
}

