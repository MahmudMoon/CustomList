package com.example.moon.customlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {


    String[] names = {"ABC","CDR","STH","GHF","XYZ",
            "ABC","CDR","STH","GHF","XYZ",
            "ABC","CDR","STH","GHF","XYZ",
            "ABC","CDR","STH","GHF","XYZ",
            "ABC","CDR","STH","GHF","XYZ"};

    String[] phones = {"+880167xxxxxx","+880717xxxxxxxx","+880181846xxxxxx","+8801553xxxxxx","+8801919xxxxxx",
            "+880167xxxxxx","+880717xxxxxxxx","+880181846xxxxxx","+8801553xxxxxx","+8801919xxxxxx",
            "+880167xxxxxx","+880717xxxxxxxx","+880181846xxxxxx","+8801553xxxxxx","+8801919xxxxxx"
            ,"+880167xxxxxx","+880717xxxxxxxx","+880181846xxxxxx","+8801553xxxxxx","+8801919xxxxxx",
            "+880167xxxxxx","+880717xxxxxxxx","+880181846xxxxxx","+8801553xxxxxx","+8801919xxxxxx"};

    int[] images = {R.drawable.c1,R.drawable.c2,R.drawable.c3,R.drawable.c4,R.drawable.c5,
            R.drawable.c1,R.drawable.c2,R.drawable.c3,R.drawable.c4,R.drawable.c5,
            R.drawable.c1,R.drawable.c2,R.drawable.c3,R.drawable.c4,R.drawable.c5,
            R.drawable.c1,R.drawable.c2,R.drawable.c3,R.drawable.c4,R.drawable.c5,
            R.drawable.c1,R.drawable.c2,R.drawable.c3,R.drawable.c4,R.drawable.c5
    };


    ArrayList<ObjectCreator> arrayList;
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        arrayList = new ArrayList<>();
        listView = (ListView)findViewById(R.id.listView);


        for(int i = 0;i<names.length;i++){
            ObjectCreator objectCreator = new ObjectCreator(names[i],phones[i],images[i]);
            arrayList.add(objectCreator);
        }


        CustomAdapter customAdapter = new CustomAdapter(this,arrayList);
        listView.setAdapter(customAdapter);

    }
}
