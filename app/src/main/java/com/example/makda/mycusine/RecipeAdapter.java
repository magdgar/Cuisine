package com.example.makda.mycusine;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


public class RecipeAdapter extends ArrayAdapter<ListItem> {
    private final Context context;
    private final ArrayList<ListItem> values;

    public RecipeAdapter(@NonNull Context context, ArrayList<ListItem> list) {
        super(context, -1, list);
        this.context = context;
        this.values = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(context).inflate(R.layout.row_layout, parent,false);

        ListItem currentMovie = values.get(position);

        ImageView image = (ImageView)listItem.findViewById(R.id.rowItemImage);
        image.setImageResource(currentMovie.getmImageDrawable());

        TextView name = (TextView) listItem.findViewById(R.id.rowItemText);
        name.setText(currentMovie.getmName());

        return listItem;
    }
}
