package com.example.ngeunah.Adapter;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.ngeunah.Model.Food;
import com.example.ngeunah.R;

import java.util.ArrayList;

public class FoodAdapter extends ArrayAdapter<Food> {

    public FoodAdapter(Activity context, ArrayList<Food> foods) {
        super(context, 0, foods);
    }

    public View getView(int position, View convertView, ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_item, parent, false);
        }
        Food currentFood = getItem(position);
        TextView foodNameTextView = (TextView) listItemView.findViewById(R.id.food_name_text_view);
        foodNameTextView.setText(currentFood.getFoodName());

        TextView priceTextView = (TextView) listItemView.findViewById(R.id.price_text_view);
        priceTextView.setText(Integer.toString(currentFood.getFoodPrice()));
        ImageView imageView = (ImageView) listItemView.findViewById(R.id.image);
        imageView.setImageResource(currentFood.getmImageResouce());
        imageView.setVisibility(View.VISIBLE);

        return listItemView;

    }
}