package com.blimas.materialdesign;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class MainActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main);


        /**
         * CONFIGURA SLIDE SIMPLES
         * */
//        setButtonBackVisible(false);
//        setButtonNextVisible(false);
//
//        addSlide(new SimpleSlide.Builder().
//                title("Tela 1")
//                .description("Exibicão da tela 1")
//                .image(R.drawable.um)
//                .background(android.R.color.holo_orange_light)
//                .build());
//
//        addSlide(new SimpleSlide.Builder().
//                title("Tela 2")
//                .description("Exibicão da tela 2")
//                .image(R.drawable.dois)
//                .background(android.R.color.holo_orange_light)
//                .build());

        addSlide(new FragmentSlide
                .Builder()
                .background(android.R.color.white)
                .fragment(R.layout.into_slide1)
                .build());

        addSlide(new FragmentSlide
                .Builder()
                .background(android.R.color.white)
                .fragment(R.layout.into_slide2)
                .build());
    }
}

