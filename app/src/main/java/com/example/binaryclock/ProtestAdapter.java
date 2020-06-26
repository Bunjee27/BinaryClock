package com.example.binaryclock;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;



import java.util.ArrayList;



public class ProtestAdapter extends ArrayAdapter<Protest> {
    public ProtestAdapter(Context context, ArrayList<Protest> list) {
        super(context, 0, list);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.protest_item, parent, false);
        Protest protest = getItem(position);
        TextView times = convertView.findViewById(R.id.protestTime);
        String s = protest.getTime();
        byte[] bytes = s.getBytes();
        StringBuilder binary = new StringBuilder();
        for (byte b : bytes)
        {
            int val = b;
            for (int i = 0; i < 8; i++)
            {
                binary.append((val & 128) == 0 ? 0 : 1);
                val <<= 1;
            }
            binary.append(' ');
        }
        times.setText(binary);

        TextView locations = convertView.findViewById(R.id.protestLocation);
        locations.setText(protest.getLocation());

        TextView titles = convertView.findViewById(R.id.protestTitle);
        titles.setText(protest.getTitle());


        return convertView;
    }
}