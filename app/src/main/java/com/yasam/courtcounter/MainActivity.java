package com.yasam.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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
}
