package com.yasam.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        displayForTeamA(0);
    }

    /**
     * Displays the given score for Team A
     * @param score - given score for Team A to display
     */
    private void displayForTeamA(int score){
        TextView scoreTeamA = (TextView) findViewById(R.id.txtVw_scoreTeamA);
        if(scoreTeamA!=null)
            scoreTeamA.setText(String.valueOf(score));
    }

    /**
     * Increases the score for Team A by 3 points.
     */
    public void addThreeForTeamA(View view) {
        int step = 3;
        displayForTeamA(step);
    }

    /**
     * Increases the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View view) {
        int step = 2;
        displayForTeamA(step);
    }

    /**
     * Increases the score for Team A by 1 point.
     */
    public void addOneForTeamA(View view) {
        int step = 1;
        displayForTeamA(step);
    }
}
