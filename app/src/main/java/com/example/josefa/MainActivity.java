package com.example.josefa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView contactListViewId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        contactListViewId = findViewById(R.id.contact_listView_id);

        final String contacts[] = {"Ana", "Joana", "Osvaldo", "Isabel"};
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, contactList());
        contactListViewId.setAdapter(adapter);

        contactListViewId.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent;
                intent = new Intent(MainActivity.this, MyNextActivity.class);

                Log.d("ITEM : ", contactList()[position]);

                Bundle dados = new Bundle();
                dados.putString("Nome",contactList()[position]);
                intent.putExtras(dados);


                startActivity(intent);

                finish();
            }
        });


    }

    String [] contactList(){
        String array1[] = new String[20];

        for(int i =0; i<array1.length; i++){

            array1[i]="josefa " + (i);

        }
        return array1;
    }
}

