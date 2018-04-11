package com.example.android.scabblescore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import static java.lang.Integer.parseInt;

public class MainActivity extends AppCompatActivity {
    int player1Total;
    int player2Total;
    int player1Current;
    int player2Current;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //resets player 1's total score
    public void player1Reset(View view) {
        player1Total = 0;
        player1Current = 0;
        displayPlayer1Total(0);
        displayPlayer1Current(0);
    }

    //adds 1 point to player 1's current word score
    public void player1Add1(View view) {
        player1Current += 1;
        displayPlayer1Current(player1Current);
    }

    //adds 2 points to player 1's current word score
    public void player1Add2(View view) {
        player1Current += 2;
        displayPlayer1Current(player1Current);
    }

    //adds 3 points to player 1's current word score
    public void player1Add3(View view) {
        player1Current += 3;
        displayPlayer1Current(player1Current);
    }

    //adds 4 points to player 1's current word score
    public void player1Add4(View view) {
        player1Current += 4;
        displayPlayer1Current(player1Current);
    }

    //adds 5 points to player 1's current word score
    public void player1Add5(View view) {
        player1Current += 5;
        displayPlayer1Current(player1Current);
    }

    //doubles player 1's current word score
    public void player1Double(View view) {
        player1Current *= 2;
        displayPlayer1Current(player1Current);
    }

    // triples player 1's current word score
    public void player1Triple(View view) {
        player1Current *= 3;
        displayPlayer1Current(player1Current);
    }

    //adds player 1's current word score (from view hint or from user input) to total score
    //clears player 1's current word score
    public void player1AddToTotal(View view) {
        EditText currentScoreTextView = (EditText) findViewById(R.id.player1_current_score);
        String inputScore = currentScoreTextView.getText().toString();
        if (!inputScore.matches("")) {
            player1Current = parseInt(inputScore);
            currentScoreTextView.getText().clear();
        }
        player1Total += player1Current;
        player1Current = 0;
        displayPlayer1Current(0);
        displayPlayer1Total(player1Total);
    }


    private void displayPlayer1Total(int number) {
        TextView totalTextView = (TextView) findViewById(R.id.player1_total);
        totalTextView.setText("" + number);
    }

    private void displayPlayer1Current(int number) {
        TextView currentScoreTextView = (TextView) findViewById(R.id.player1_current_score);
        currentScoreTextView.setHint("" + number);
    }


    //resets player 2's total score
    public void player2Reset(View view) {
        player2Total = 0;
        player2Current = 0;
        displayPlayer2Total(0);
        displayPlayer2Current(0);
    }

    //adds 1 point to player 1's current word score
    public void player2Add1(View view) {
        player2Current += 1;
        displayPlayer2Current(player2Current);
    }

    //adds 2 points to player 2's current word score
    public void player2Add2(View view) {
        player2Current += 2;
        displayPlayer2Current(player2Current);
    }

    //adds 3 points to player 2's current word score
    public void player2Add3(View view) {
        player2Current += 3;
        displayPlayer2Current(player2Current);
    }

    //adds 4 points to player 2's current word score
    public void player2Add4(View view) {
        player2Current += 4;
        displayPlayer2Current(player2Current);
    }

    //adds 5 points to player 2's current word score
    public void player2Add5(View view) {
        player2Current += 5;
        displayPlayer2Current(player2Current);
    }

    //doubles player 2's current word score
    public void player2Double(View view) {
        player2Current *= 2;
        displayPlayer2Current(player2Current);
    }

    // triples player 2's current word score
    public void player2Triple(View view) {
        player2Current *= 3;
        displayPlayer2Current(player2Current);
    }

    //adds player 1's current word score (from view hint or from user input) to total score
    //clears player 1's current word score
    public void player2AddToTotal(View view) {
        EditText currentScoreTextView = (EditText) findViewById(R.id.player2_current_score);
        String inputScore = currentScoreTextView.getText().toString();
        if (!inputScore.matches("")) {
            player2Current = parseInt(inputScore);
            currentScoreTextView.getText().clear();
        }
        player2Total += player2Current;
        player2Current = 0;
        displayPlayer2Current(0);
        displayPlayer2Total(player2Total);
    }

    private void displayPlayer2Total(int number) {
        TextView totalTextView = (TextView) findViewById(R.id.player2_total);
        totalTextView.setText("" + number);
    }

    private void displayPlayer2Current(int number) {
        TextView currentScoreTextView = (TextView) findViewById(R.id.player2_current_score);
        currentScoreTextView.setHint("" + number);
    }
}





















