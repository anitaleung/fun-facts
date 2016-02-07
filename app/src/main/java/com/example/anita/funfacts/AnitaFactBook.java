package com.example.anita.funfacts;

import java.util.Random;

/**
 * Created by anita on 11/26/14.
 */
public class AnitaFactBook {

    private String[] mAnitaFacts = {
        "Anita is coding",
        "Anita is 18 years old",
        "Anita goes to school",
        "Anita is making an app",
        "Anita likes Nutella",
    };

    public String getAnitaFact() {
        Random randGen = new Random();
        int randNum = randGen.nextInt(mAnitaFacts.length);
        return mAnitaFacts[randNum];
    }

}
