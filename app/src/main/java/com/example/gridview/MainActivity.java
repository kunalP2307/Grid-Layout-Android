package com.example.gridview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MainActivity extends AppCompatActivity {


    GridView gridCompanies;
    String[] strCompanies = new String[]{"C","<-","%","/","7","8","9","*","4","5","6","-","1","2","3","+","~","0",".","="};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridCompanies = findViewById(R.id.gridCompanies);

        List<String> values = new ArrayList<String>();
        for (int y = 0; y < strCompanies.length; y++) {
            values.add(strCompanies[y]);
        }
        gridCompanies.setAdapter(new ArrayAdapter<String>(this, R.layout.gird_item, values));
    }
}