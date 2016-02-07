package com.example.anita.funfacts;

import java.util.Random;

/**
 * Created by anita on 11/22/14.
 */
public class ColorWheel {
    public String[] mColors = {
            "#39add1", // light blue
            "#3079ab", // dark blue
            "#c25975", // mauve
            "#e15258", // red
            "#f9845b", // orange
            "#838cc7", // lavender
            "#7d669e", // purple
            "#53bbb4", // aqua
            "#51b46d", // green
            "#e0ab18", // mustard
            "#637a91", // dark gray
            "#f092b0", // pink
            "#b7c0c7"  // light gray
    };
    public String getColor() {
        Random randomGenerator = new Random(); // Construct new random num generator
        int randNum = randomGenerator.nextInt(mColors.length);
        String color = mColors[randNum];
        return color;
    }
}
