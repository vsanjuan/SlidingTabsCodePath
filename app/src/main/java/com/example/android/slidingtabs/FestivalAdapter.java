package com.example.android.slidingtabs;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Salvador on 15/08/2016.
 */
public class FestivalAdapter extends ArrayAdapter<Festival> {

    public FestivalAdapter(Context context, ArrayList<Festival> festivals) {
        super (context ,0 , festivals);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View listView = convertView;

        if(listView == null) {
            listView = LayoutInflater.from(getContext()).inflate(
                    R.layout.festival_list, parent, false);
        }

        // Get the {@link AndroidFlavor} object located at this position in the list
        Festival currentFestival = getItem(position);

        TextView titleTextView = (TextView) listView.findViewById(R.id.title_tour_item);
        titleTextView.setText(currentFestival.getmTitle());

        ImageView iconImageView = (ImageView) listView.findViewById(R.id.icon_tour_item);
        iconImageView.setImageResource(currentFestival.getmIcon());



        return listView;
    }
}
