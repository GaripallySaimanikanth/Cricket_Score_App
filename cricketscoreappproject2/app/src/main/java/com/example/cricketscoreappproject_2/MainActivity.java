package com.example.cricketscoreappproject_2;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
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
    public void resetScore(View view){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }
    public void addSixForTeamA(View view){
        scoreTeamA = scoreTeamA + 6;
        displayForTeamA(scoreTeamA);
    }
    public void addFourForTeamA(View view){
        scoreTeamA = scoreTeamA + 4;
        displayForTeamA(scoreTeamA);
    }
    public void addOneForTeamA(View view){
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }
    public void addSixForTeamB(View view){
        scoreTeamB = scoreTeamB + 6;
        displayForTeamB(scoreTeamB);
    }
    public void addFourForTeamB(View view){
        scoreTeamB = scoreTeamB + 4;
        displayForTeamB(scoreTeamB);
    }
    public void addOneForTeamB(View view){
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamAscore);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.teamBscore);
        scoreView.setText(String.valueOf(score));
    }
}