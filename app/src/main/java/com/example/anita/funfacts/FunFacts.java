package com.example.anita.funfacts;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;

//

/*

With your newfound knowledge of random numbers and Toast messages, add another random number
generator that will occasionally show a bonus Toast fact about yourself. For example, generate
a random number from 0-19 and only show the Toast for one of the numbers.

 */


public class FunFacts extends Activity {

    public static final String TAG = FunFacts.class.getSimpleName();

    private FactBook mFactBook = new FactBook();
    private ColorWheel mColorWheel= new ColorWheel();
    private AnitaFactBook mAnitaFactBook = new AnitaFactBook();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        // Declare our View variables and assign the Views from the layout file
        final TextView factLabel = (TextView) findViewById(R.id.factTextView);
        Button showFactButton = (Button) findViewById(R.id.showFactButton);
        final RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.relativeLayout);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fact = mAnitaFactBook.getAnitaFact();
                factLabel.setText(fact);

                // Change background color
                String color = mColorWheel.getColor();
                relativeLayout.setBackgroundColor(Color.parseColor(color));

                // Get a random anita fact and display as toast
                Log.d(TAG, mAnitaFactBook.getAnitaFact());
                //Toast.makeText(FunFacts.this, mAnitaFactBook.getAnitaFact(), Toast.LENGTH_SHORT).show();
            }
        };

        showFactButton.setOnClickListener(listener);
    }
}
