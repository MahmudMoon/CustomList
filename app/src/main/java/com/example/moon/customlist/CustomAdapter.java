package com.example.moon.customlist;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class CustomAdapter extends BaseAdapter {

    Activity activity;
    ArrayList<ObjectCreator> arrayList;
    LayoutInflater inflater;

    TextView name,phone;
    ImageView img;

    public CustomAdapter(Activity activity, ArrayList<ObjectCreator> arrayList) {
        this.activity = activity;
        this.arrayList = arrayList;
        inflater = (LayoutInflater)activity.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = inflater.inflate(R.layout.customadapter, null);
         name = (TextView)view.findViewById(R.id.name);
         phone = (TextView)view.findViewById(R.id.phone);
         img = (ImageView)view.findViewById(R.id.img);


         name.setText(arrayList.get(position).getName_());
         phone.setText(arrayList.get(position).getPhone_());
         img.setImageResource(arrayList.get(position).getImage_());

        return view;
    }
}
