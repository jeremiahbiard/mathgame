package net.excession.mathgame;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.io.BufferedReader;

public class GameActivity extends Activity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        // Initialize the variables
        int partA = 2;
        int partB = 2;
        int correctAnswer = partA * partB;
        int wrongAnswer1 = correctAnswer - 1;
        int wrongAnswer2 = correctAnswer + 1;

        /*
        Here we get a working object based on either the Button or TextView class
        and base as well as link our new objects directly to the apropos UI elements
        which we previously created.
         */

        TextView textObjectPartA = findViewById(R.id.textPartA);
        TextView textObjectPartB = findViewById(R.id.textPartB);
        Button buttonObjectChoice1 = findViewById(R.id.buttonChoice1);
        Button buttonObjectChoice2 = findViewById(R.id.buttonChoice2);
        Button buttonObjectChoice3 = findViewById(R.id.buttonChoice3);

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

        @Override
                public void onClick(View v) {

        }



    }
}
