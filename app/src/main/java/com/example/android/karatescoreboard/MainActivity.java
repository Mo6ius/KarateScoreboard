package com.example.android.karatescoreboard;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // Track the score for LaRusso
    int scoreLR = 0;

    // Track the score for Cobra Kai
    int scoreCK = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for LaRusso by 2 points.
     */
    public void addTwoForLR(View view) {
        scoreLR += 2;
        displayForLR(scoreLR);
    }

    /**
     * Increase the score for LaRusso by 3 points.
     */
    public void addThreeForLR(View view) {
        scoreLR += 3;
        displayForLR(scoreLR);
    }

    /**
     * Increase the score for LaRusso by 5 points.
     */
    public void addFiveForLR(View view) {
        scoreLR += 5;
        displayForLR(scoreLR);
    }

    /**
     * Displays the given score for LaRusso.
     */
    public void displayForLR(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamLR);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Increase the score for Cobra Kai by 2 points.
     */
    public void addTwoForCK(View view) {
        scoreCK += 2;
        displayForCK(scoreCK);
    }

    /**
     * Increase the score for Cobra Kai by 3 points.
     */
    public void addThreeForCK(View view) {
        scoreCK += 3;
        displayForCK(scoreCK);
    }

    /**
     * Increase the score for Cobra Kai by 5 points.
     */
    public void addFiveForCK(View view) {
        scoreCK += 5;
        displayForCK(scoreCK);
    }

    /**
     * Displays the given score for Cobra Kai.
     */
    public void displayForCK(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamCK);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View view) {
        scoreLR = 0;
        scoreCK = 0;
        displayForLR(scoreLR);
        displayForCK(scoreCK);
    }

}