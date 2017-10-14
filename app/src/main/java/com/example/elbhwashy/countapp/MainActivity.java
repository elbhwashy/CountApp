package com.example.elbhwashy.countapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

import static com.example.elbhwashy.countapp.R.id.scoreA;
import static com.example.elbhwashy.countapp.R.id.scoreB;

public class MainActivity extends AppCompatActivity {
private int countscoreA=0;
    private int countscoreB=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    private void displayScoreA(int number) {
        TextView scoreATxt = (TextView) findViewById(scoreA);
        scoreATxt.setText(String.valueOf(number));
    }
    private void displayScoreB(int number) {
        TextView scoreBTxt = (TextView) findViewById(scoreB);
        scoreBTxt.setText(String.valueOf(number));
    }
    public void addThreeA(View view) {
        countscoreA = countscoreA +3;
        displayScoreA(countscoreA);


    }
    public void addThreeB(View view) {
        countscoreB = countscoreB +3;
        displayScoreB(countscoreB);


    }
    public void addTwoA(View view) {
        countscoreA = countscoreA +2;
        displayScoreA(countscoreA);


    }
    public void addTwoB(View view) {
        countscoreB = countscoreB +2;
        displayScoreB(countscoreB);


    }
    public void addOneA(View view) {
        countscoreA = countscoreA +1;
        displayScoreA(countscoreA);


    }
    public void addOneB(View view) {
        countscoreB = countscoreB +1;
        displayScoreB(countscoreB);


    }
    public void resetBtn(View view){
        countscoreA = 0;
        displayScoreA(countscoreA) ;
        countscoreB=0;
        displayScoreB(countscoreB);
    }
}
