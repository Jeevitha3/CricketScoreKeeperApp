
package com.example.android.cricketscorekeeper;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    int team_a_score=0;
    int team_b_score=0;
    int team_a_wicket=0;
    int team_b_wicket=0;
    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        team_a_score=team_a_score+1;
        displayForTeamA(team_a_score);
    }

    /**
     * Increase the score for Team A by 2 points.
     */
    public void addTwoForTeamA(View v) {
        team_a_score=team_a_score+2;
        displayForTeamA(team_a_score);
    }

    /**
     * Increase the score for Team A by 4 points.
     */
    public void addFourForTeamA(View v) {
        team_a_score=team_a_score+4;
        displayForTeamA(team_a_score);
    }
    /**
     * Increase the score for Team A by 6 points.
     */
    public void addSixForTeamA(View v) {
        team_a_score=team_a_score+6;
        displayForTeamA(team_a_score);
    }
    public void addOneWicketForTeamA(View v) {
        team_a_wicket=team_a_wicket+1;
        displayForTeamAWicket(team_a_wicket);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamAWicket(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_wicket);
        scoreView.setText(String.valueOf(score));
    }
    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        team_b_score=team_b_score+1;
        displayForTeamB(team_b_score);
    }

    /**
     * Increase the score for Team B by 2 points.
     */
    public void addTwoForTeamB(View v) {
        team_b_score = team_b_score + 2;
        displayForTeamB(team_b_score);
    }

    /**
     * Increase the score for Team B by 4 points.
     */
    public void addFourForTeamB(View v) {
        team_b_score=team_b_score+4;
        displayForTeamB(team_b_score);
    }
    public void addSixForTeamB(View v) {
        team_b_score=team_b_score+6;
        displayForTeamB(team_b_score);
    }
    public void addOneWicketForTeamB(View v) {
        team_b_wicket=team_b_wicket+1;
        displayForTeamBWicket(team_b_wicket);
    }
    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayForTeamBWicket(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_wicket);
        scoreView.setText(String.valueOf(score));
    }
    public void reset(View v)
    {
        team_a_score=0;
        team_b_score=0;
        team_a_wicket=0;
        team_b_wicket=0;
        displayForTeamA(team_a_score);
        displayForTeamB(team_b_score);
        displayForTeamAWicket(team_a_wicket);
        displayForTeamBWicket(team_b_wicket);

    }
}
