package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    int scoreTeamA = 0;
    int scoreTeamB = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void addThreeForA(View view) {
        scoreTeamA =  scoreTeamA+ 3 ;
        displayForTeamA(scoreTeamA);
    }
    public void addTwoForA(View view) {
        scoreTeamA =  scoreTeamA +2;
        displayForTeamA(scoreTeamA);
    }
    public void addOneForA(View view) {
        scoreTeamA =  scoreTeamA +1;
        displayForTeamA(scoreTeamA);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void addThreeForB(View view) {
        scoreTeamB =  scoreTeamB+ 3 ;
        displayForTeamB(scoreTeamB);
    }
    public void addTwoForB(View view) {
        scoreTeamB =  scoreTeamB +2;
        displayForTeamB(scoreTeamB);
    }
    public void addOneForB(View view) {
        scoreTeamB =  scoreTeamB +1;
        displayForTeamB(scoreTeamB);
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void reset(View view) {
        scoreTeamB =0;
        scoreTeamA =0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);

    }
}
