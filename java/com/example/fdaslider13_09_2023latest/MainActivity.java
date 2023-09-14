package com.example.fdaslider13_09_2023latest;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;

import com.smarteist.autoimageslider.IndicatorView.animation.type.IndicatorAnimationType;
import com.smarteist.autoimageslider.SliderAnimations;
import com.smarteist.autoimageslider.SliderView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<SlideModel> arrSlide = new ArrayList<>();
    SliderAdapter sliderAdapter;
    SliderView sliderView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sliderView = findViewById(R.id.sliderView);




        arrSlide.add(new SlideModel(R.drawable.slidfo, "Crispy Fried Chicken & Jollof/Fried Rice Combo", "Enjoy this mouth watering-finger licking Special meal of the Week!"));
        arrSlide.add(new SlideModel(R.drawable.foodone, "Crispy Fried Chicken & Jollof/Fried Rice Combo", "Enjoy this mouth watering-finger licking Special meal of the Week!"));
        arrSlide.add(new SlideModel(R.drawable.foodtwo, "Crispy Fried Chicken & Jollof/Fried Rice Combo", "Enjoy this mouth watering-finger licking Special meal of the Week!"));
        arrSlide.add(new SlideModel(R.drawable.foodthree, "Crispy Fried Chicken & Jollof/Fried Rice Combo", "Enjoy this mouth watering-finger licking Special meal of the Week!"));





        SliderAdapter sd = new SliderAdapter(this, arrSlide);
        sliderView.setSliderAdapter(sd);



        sliderView.setIndicatorAnimation(IndicatorAnimationType.WORM);
        sliderView.setSliderTransformAnimation(SliderAnimations.SIMPLETRANSFORMATION);
        sliderView.setAutoCycleDirection(SliderView.AUTO_CYCLE_DIRECTION_RIGHT);
        sliderView.setIndicatorSelectedColor(Color.BLACK);
        sliderView.setIndicatorUnselectedColor(Color.GRAY);
        sliderView.setScrollTimeInSec(5);
        sliderView.setAutoCycle(true);
        sliderView.startAutoCycle();
        sd.notifyDataSetChanged();

    }
}