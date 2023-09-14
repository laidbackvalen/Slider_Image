package com.example.fdaslider13_09_2023latest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.smarteist.autoimageslider.SliderViewAdapter;

import java.util.ArrayList;

public class SliderAdapter extends SliderViewAdapter<SliderAdapter.SliderViewHolder> {
    Context context;
    ArrayList<SlideModel> arrSlide;

    public SliderAdapter(Context context, ArrayList<SlideModel> arrSlide) {
        this.context = context;
        this.arrSlide = arrSlide;
    }

    public class SliderViewHolder extends SliderAdapter.ViewHolder {

        TextView textAbov, textBelo;
        ImageView foodImage;

        public SliderViewHolder(View itemView) {
            super(itemView);
            textAbov = itemView.findViewById(R.id.textAboveSlide);
            textBelo = itemView.findViewById(R.id.textBelowFood);
            foodImage = itemView.findViewById(R.id.foodImage);

        }

//        public void setData(SlideModel slideModel) {
//        }
    }


    @Override
    public SliderAdapter.SliderViewHolder onCreateViewHolder(ViewGroup parent) {

        return new SliderViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.slider_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(SliderAdapter.SliderViewHolder viewHolder, int position) {
//viewHolder.setData(arrSlide.get(position));
        viewHolder.textAbov.setText(arrSlide.get(position).textAbove);
        viewHolder.textBelo.setText(arrSlide.get(position).textBelow);
        viewHolder.foodImage.setImageResource(arrSlide.get(position).foodimg);

    }

    @Override
    public int getCount() {
        return arrSlide.size();
    }


}
