package com.example.roman.roman_pset1;

import android.media.Image;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView eyes;
    private ImageView ears;
    private ImageView eyebrows;
    private ImageView hat;
    private ImageView shoes;
    private ImageView nose;
    private ImageView mouth;
    private ImageView mustache;
    private ImageView glasses;
    private ImageView arms;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        eyes = findViewById(R.id.Eyes);
        ears = findViewById(R.id.Ears);
        eyebrows = findViewById(R.id.Eyebrows);
        hat = findViewById(R.id.Hat);
        shoes = findViewById(R.id.Shoes);
        nose = findViewById(R.id.Nose);
        mouth = findViewById(R.id.Mouth);
        mustache = findViewById(R.id.Mustache);
        glasses = findViewById(R.id.Glasses);
        arms = findViewById(R.id.Arms);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        Log.d("CREATION", "onSaveInstanceState is being executed ");
        outState.putInt("eyes", eyes.getVisibility());
        outState.putInt("ears", ears.getVisibility());
        outState.putInt("eyebrows", eyebrows.getVisibility());
        outState.putInt("hat", hat.getVisibility());
        outState.putInt("shoes", shoes.getVisibility());
        outState.putInt("nose", nose.getVisibility());
        outState.putInt("mouth", mouth.getVisibility());
        outState.putInt("mustache", mustache.getVisibility());
        outState.putInt("glasses", glasses.getVisibility());
        outState.putInt("arms", arms.getVisibility());

    }


    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        Log.d("CREATION", "onRestoreInstanceState is being executed ");
        eyes.setVisibility(savedInstanceState.getInt("eyes"));
        ears.setVisibility(savedInstanceState.getInt("ears"));
        eyebrows.setVisibility(savedInstanceState.getInt("eyebrows"));
        hat.setVisibility(savedInstanceState.getInt("hat"));
        shoes.setVisibility(savedInstanceState.getInt("shoes"));
        nose.setVisibility(savedInstanceState.getInt("nose"));
        mouth.setVisibility(savedInstanceState.getInt("mouth"));
        mustache.setVisibility(savedInstanceState.getInt("mustache"));
        glasses.setVisibility(savedInstanceState.getInt("glasses"));
        arms.setVisibility(savedInstanceState.getInt("arms"));
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        switch(view.getId()) {
            case R.id.eyes:
                if (checked)
                    eyes.setVisibility(View.VISIBLE);
                else
                    eyes.setVisibility(View.INVISIBLE);
                break;
            case R.id.ears:
                if (checked)
                    ears.setVisibility(View.VISIBLE);
                else
                    ears.setVisibility(View.INVISIBLE);
                break;
            case R.id.eyebrows:
                if (checked)
                    eyebrows.setVisibility(View.VISIBLE);
                else
                    eyebrows.setVisibility(View.INVISIBLE);
                break;
            case R.id.hat:
                if (checked)
                    hat.setVisibility(View.VISIBLE);
                else
                    hat.setVisibility(View.INVISIBLE);
                break;
            case R.id.shoes:
                if (checked)
                    shoes.setVisibility(View.VISIBLE);
                else
                    shoes.setVisibility(View.INVISIBLE);
                break;
            case R.id.nose:
                if (checked)
                    nose.setVisibility(View.VISIBLE);
                else
                    nose.setVisibility(View.INVISIBLE);
                break;
            case R.id.mouth:
                if (checked)
                    mouth.setVisibility(View.VISIBLE);
                else
                    mouth.setVisibility(View.INVISIBLE);
                break;
            case R.id.mustache:
                if (checked)
                    mustache.setVisibility(View.VISIBLE);
                else
                    mustache.setVisibility(View.INVISIBLE);
                break;
            case R.id.glasses:
                if (checked)
                    glasses.setVisibility(View.VISIBLE);
                else
                    glasses.setVisibility(View.INVISIBLE);
                break;
            case R.id.arms:
                if (checked)
                    arms.setVisibility(View.VISIBLE);
                else
                    arms.setVisibility(View.INVISIBLE);
                break;
        }
    }
}
