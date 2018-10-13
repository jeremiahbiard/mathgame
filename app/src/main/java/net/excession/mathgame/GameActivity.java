package net.excession.mathgame;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;

public class GameActivity extends Activity implements View.OnClickListener {

    private final static String TAG = R.class.getSimpleName();
    // Initialize the variables
    protected int correctAnswer;
    Button buttonObjectChoice1;
    Button buttonObjectChoice2;
    Button buttonObjectChoice3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        int partA = 2;
        int partB = 2;
        correctAnswer = partA * partB;
        int wrongAnswer1 = correctAnswer - 1;
        int wrongAnswer2 = correctAnswer + 1;
        /*
        Here we get a working object based on either the Button or TextView class
        and base as well as link our new objects directly to the apropos UI elements
        which we previously created.
         */
        TextView textObjectPartA = findViewById(R.id.textPartA);
        TextView textObjectPartB = findViewById(R.id.textPartB);

        buttonObjectChoice1 = findViewById(R.id.buttonChoice1);
        buttonObjectChoice2 = findViewById(R.id.buttonChoice2);
        buttonObjectChoice3 = findViewById(R.id.buttonChoice3);

        /*
        Now we use setText method of our objexts to show variable values on the UI elements
         */
        textObjectPartA.setText("" + partA);
        textObjectPartB.setText("" + partB);

        buttonObjectChoice1.setText("" + correctAnswer);
        buttonObjectChoice2.setText("" + wrongAnswer1);
        buttonObjectChoice3.setText("" + wrongAnswer2);

        buttonObjectChoice1.setOnClickListener(this);
        buttonObjectChoice2.setOnClickListener(this);
        buttonObjectChoice3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int answerGiven = 0;
        switch (v.getId()) {

            case R.id.buttonChoice1:
                Log.i(TAG, "Clicked buttonChoice1");
                answerGiven = Integer.parseInt("" + buttonObjectChoice1.getText());
                break;
            case R.id.buttonChoice2:
                Log.i(TAG, "Clicked buttonChoice2");
                answerGiven = Integer.parseInt("" + buttonObjectChoice2.getText());
                break;
            case R.id.buttonChoice3:
                Log.i(TAG, "Clicked buttonChoice3");
                answerGiven = Integer.parseInt("" + buttonObjectChoice3.getText());
                break;
            default:
                // Somethings gone horribly wrong if we get here
                Log.e(TAG, "Somehow managed to click on a button that doesn't exit!");
                throw new RuntimeException("barf!");
        }
        if (answerGiven == correctAnswer) {
            Toast.makeText(getApplicationContext(), "Well done!", Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(getApplicationContext(), "STUPID! YOU SO STUPID!", Toast.LENGTH_LONG).show();
        }
    }
}
