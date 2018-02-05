package com.example.android.quizproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startingpage);
    }

    int question = 0;
    int score = 0;

    public void startButton(View view) {
        question = question + 1;
        setContentView(R.layout.activity_main);

    }


    public void nextButton(View view) {
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        radioGroup.clearCheck();
        if (question == 0) {
            ((ImageView) findViewById(R.id.cartoonImage)).setImageResource(R.drawable.ninasimone);
            ((TextView) findViewById(R.id.questionText)).setText(getText(R.string.mainAnswerOne));
            ((RadioButton) findViewById(R.id.answerTwo)).setText(getText(R.string.mainAnswerTwo));
            ((RadioButton) findViewById(R.id.answerThree)).setText(getText(R.string.mainAnswerThree));
            question = question + 1;
            return;
        }

        // Question 2
        if (question == 1) {
            ((ImageView) findViewById(R.id.cartoonImage)).setImageResource(R.drawable.jackblack);
            ((TextView) findViewById(R.id.questionText)).setText(getText(R.string.firstQuestion));
            ((RadioButton) findViewById(R.id.answerOne)).setText(getText(R.string.firstAnswerOne));
            ((RadioButton) findViewById(R.id.answerTwo)).setText(getText(R.string.firstAnswerTwo));
            ((RadioButton) findViewById(R.id.answerThree)).setText(getText(R.string.firstAnswerThree));
            question = question + 1;
            return;
        }
        // Question 3
        if (question == 2) {
            ((ImageView) findViewById(R.id.cartoonImage)).setImageResource(R.drawable.mickjagger);
            ((TextView) findViewById(R.id.questionText)).setText(getText(R.string.secondQuestion));
            ((RadioButton) findViewById(R.id.answerOne)).setText(getText(R.string.secondAnswerOne));
            ((RadioButton) findViewById(R.id.answerTwo)).setText(getText(R.string.secondAnswerTwo));
            ((RadioButton) findViewById(R.id.answerThree)).setText(getText(R.string.secondAnswerThree));
            question = question + 1;
            return;
        }
        // Question 4
        if (question == 3) {
            ((ImageView) findViewById(R.id.cartoonImage)).setImageResource(R.drawable.eltonjohn);
            ((TextView) findViewById(R.id.questionText)).setText(getText(R.string.thirdQuestion));
            ((RadioButton) findViewById(R.id.answerOne)).setText(getText(R.string.thirdAnswerOne));
            ((RadioButton) findViewById(R.id.answerTwo)).setText(getText(R.string.thirdAnswerTwo));
            ((RadioButton) findViewById(R.id.answerThree)).setText(getText(R.string.thirdAnswerThree));
            question = question + 1;
            return;
        }
        // Question 5
        if (question == 4) {
            ((ImageView) findViewById(R.id.cartoonImage)).setImageResource(R.drawable.freddiemercury);
            ((TextView) findViewById(R.id.questionText)).setText(getText(R.string.forthQuestion));
            ((RadioButton) findViewById(R.id.answerOne)).setText(getText(R.string.forthAnswerOne));
            ((RadioButton) findViewById(R.id.answerTwo)).setText(getText(R.string.forthAnswerTwo));
            ((RadioButton) findViewById(R.id.answerThree)).setText(getText(R.string.forthAnswerThree));
            question = question + 1;
            return;
        }
        // Question 6
        if (question == 5) {
            ((ImageView) findViewById(R.id.cartoonImage)).setImageResource(R.drawable.jimmypage);
            ((TextView) findViewById(R.id.questionText)).setText(getText(R.string.fifthQuestion));
            ((RadioButton) findViewById(R.id.answerOne)).setText(getText(R.string.fifthAnswerOne));
            ((RadioButton) findViewById(R.id.answerTwo)).setText(getText(R.string.fifthAnswerTwo));
            ((RadioButton) findViewById(R.id.answerThree)).setText(getText(R.string.fifthAnswerThree));
            question = question + 1;
            return;
        }
        // Question 7
        if (question == 6) {
            ((ImageView) findViewById(R.id.cartoonImage)).setImageResource(R.drawable.michaeljackson);
            ((TextView) findViewById(R.id.questionText)).setText(getText(R.string.sixthQuestion));
            ((RadioButton) findViewById(R.id.answerOne)).setText(getText(R.string.sixthAnswerOne));
            ((RadioButton) findViewById(R.id.answerTwo)).setText(getText(R.string.sixthAnswerTwo));
            ((RadioButton) findViewById(R.id.answerThree)).setText(getText(R.string.sixthAnswerThree));
            question = question + 1;
            return;
        }
        // Question 8
        if (question == 7) {
            ((ImageView) findViewById(R.id.cartoonImage)).setImageResource(R.drawable.robertplantcaricature);
            ((TextView) findViewById(R.id.questionText)).setText(getText(R.string.seventhQuestion));
            ((RadioButton) findViewById(R.id.answerOne)).setText(getText(R.string.seventhAnswerOne));
            ((RadioButton) findViewById(R.id.answerTwo)).setText(getText(R.string.seventhAnswerTwo));
            ((RadioButton) findViewById(R.id.answerThree)).setText(getText(R.string.seventhAnswerThree));
            question = question + 1;
            return;
        }
        if (question == 8)
            setContentView(R.layout.endpage);


    }

    public void backButton(View view) {
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        radioGroup.clearCheck();
        if (question == 1) {
            ((ImageView) findViewById(R.id.cartoonImage)).setImageResource(R.drawable.ninasimone);
            ((TextView) findViewById(R.id.questionText)).setText(getText(R.string.mainAnswerOne));
            ((RadioButton) findViewById(R.id.answerTwo)).setText(getText(R.string.mainAnswerTwo));
            ((RadioButton) findViewById(R.id.answerThree)).setText(getText(R.string.mainAnswerThree));
            question = question - 1;
            return;
        }

        // Question 2
        if (question == 2) {
            ((ImageView) findViewById(R.id.cartoonImage)).setImageResource(R.drawable.jackblack);
            ((TextView) findViewById(R.id.questionText)).setText(getText(R.string.firstQuestion));
            ((RadioButton) findViewById(R.id.answerOne)).setText(getText(R.string.firstAnswerOne));
            ((RadioButton) findViewById(R.id.answerTwo)).setText(getText(R.string.firstAnswerTwo));
            ((RadioButton) findViewById(R.id.answerThree)).setText(getText(R.string.firstAnswerThree));
            question = question - 1;
            return;
        }
        // Question 3
        if (question == 3) {
            ((ImageView) findViewById(R.id.cartoonImage)).setImageResource(R.drawable.mickjagger);
            ((TextView) findViewById(R.id.questionText)).setText(getText(R.string.secondQuestion));
            ((RadioButton) findViewById(R.id.answerOne)).setText(getText(R.string.secondAnswerOne));
            ((RadioButton) findViewById(R.id.answerTwo)).setText(getText(R.string.secondAnswerTwo));
            ((RadioButton) findViewById(R.id.answerThree)).setText(getText(R.string.secondAnswerThree));
            question = question - 1;


        }
        // Question 4
        if (question == 4) {
            ((ImageView) findViewById(R.id.cartoonImage)).setImageResource(R.drawable.eltonjohn);
            ((TextView) findViewById(R.id.questionText)).setText(getText(R.string.thirdQuestion));
            ((RadioButton) findViewById(R.id.answerOne)).setText(getText(R.string.thirdAnswerOne));
            ((RadioButton) findViewById(R.id.answerTwo)).setText(getText(R.string.thirdAnswerTwo));
            ((RadioButton) findViewById(R.id.answerThree)).setText(getText(R.string.thirdAnswerThree));
            question = question - 1;
            return;
        }
        // Question 5
        if (question == 5) {
            ((ImageView) findViewById(R.id.cartoonImage)).setImageResource(R.drawable.freddiemercury);
            ((TextView) findViewById(R.id.questionText)).setText(getText(R.string.forthQuestion));
            ((RadioButton) findViewById(R.id.answerOne)).setText(getText(R.string.forthAnswerOne));
            ((RadioButton) findViewById(R.id.answerTwo)).setText(getText(R.string.forthAnswerTwo));
            ((RadioButton) findViewById(R.id.answerThree)).setText(getText(R.string.forthAnswerThree));
            question = question - 1;
            return;
        }
        // Question 6
        if (question == 6) {
            ((ImageView) findViewById(R.id.cartoonImage)).setImageResource(R.drawable.jimmypage);
            ((TextView) findViewById(R.id.questionText)).setText(getText(R.string.fifthQuestion));
            ((RadioButton) findViewById(R.id.answerOne)).setText(getText(R.string.fifthAnswerOne));
            ((RadioButton) findViewById(R.id.answerTwo)).setText(getText(R.string.fifthAnswerTwo));
            ((RadioButton) findViewById(R.id.answerThree)).setText(getText(R.string.fifthAnswerThree));
            question = question - 1;
            return;
        }
        // Question 7
        if (question == 7) {
            ((ImageView) findViewById(R.id.cartoonImage)).setImageResource(R.drawable.michaeljackson);
            ((TextView) findViewById(R.id.questionText)).setText(getText(R.string.sixthQuestion));
            ((RadioButton) findViewById(R.id.answerOne)).setText(getText(R.string.sixthAnswerOne));
            ((RadioButton) findViewById(R.id.answerTwo)).setText(getText(R.string.sixthAnswerTwo));
            ((RadioButton) findViewById(R.id.answerThree)).setText(getText(R.string.sixthAnswerThree));
            question = question - 1;
            return;
        }
        // Question 8
        if (question == 8) {
            ((ImageView) findViewById(R.id.cartoonImage)).setImageResource(R.drawable.robertplantcaricature);
            ((TextView) findViewById(R.id.questionText)).setText(getText(R.string.seventhQuestion));
            ((RadioButton) findViewById(R.id.answerOne)).setText(getText(R.string.seventhAnswerOne));
            ((RadioButton) findViewById(R.id.answerTwo)).setText(getText(R.string.seventhAnswerTwo));
            ((RadioButton) findViewById(R.id.answerThree)).setText(getText(R.string.seventhAnswerThree));
            question = question - 1;
        }


    }

    public void onRadioButtonClicked(View view) {
        // Is the button now checked?
        boolean checked = ((RadioButton) view).isChecked();


        // Check which radio button was clicked
        switch (view.getId()) {
            case R.id.answerOne:
                if (checked)
                    // first radio button
                    // correct
                    if (question == 4)
                        Toast.makeText(this, "That is correct", Toast.LENGTH_SHORT).show();
                if (question == 6)
                    Toast.makeText(this, "That is correct", Toast.LENGTH_SHORT).show();
                if (question == 8)
                    Toast.makeText(this, "That is correct", Toast.LENGTH_SHORT).show();
                // wrong
                if (question == 2)
                    Toast.makeText(this, "Nope", Toast.LENGTH_SHORT).show();
                if (question == 5)
                    Toast.makeText(this, "Nope", Toast.LENGTH_SHORT).show();

                if (question == 0)
                    Toast.makeText(this, "Nope", Toast.LENGTH_SHORT).show();
                if (question == 1)
                    Toast.makeText(this, "Nope", Toast.LENGTH_SHORT).show();
                if (question == 3)
                    Toast.makeText(this, "Nope", Toast.LENGTH_SHORT).show();
                if (question == 7)
                    Toast.makeText(this, "Nope", Toast.LENGTH_SHORT).show();

                //else Toast.makeText(this, "NOPE", Toast.LENGTH_SHORT).show();
                break;
            case R.id.answerTwo:
                if (checked)
                    // second radio button
                    // correct
                    if (question == 2)
                        Toast.makeText(this, "That is correct", Toast.LENGTH_SHORT).show();
                if (question == 5)
                    Toast.makeText(this, "That is correct", Toast.LENGTH_SHORT).show();
                // wrong
                if (question == 0)
                    Toast.makeText(this, "Nope", Toast.LENGTH_SHORT).show();
                if (question == 1)
                    Toast.makeText(this, "Nope", Toast.LENGTH_SHORT).show();
                if (question == 3)
                    Toast.makeText(this, "Nope", Toast.LENGTH_SHORT).show();
                if (question == 7)
                    Toast.makeText(this, "Nope", Toast.LENGTH_SHORT).show();
                if (question == 4)
                    Toast.makeText(this, "Nope", Toast.LENGTH_SHORT).show();
                if (question == 6)
                    Toast.makeText(this, "Nope", Toast.LENGTH_SHORT).show();
                if (question == 8)
                    Toast.makeText(this, "Nope", Toast.LENGTH_SHORT).show();

                // else Toast.makeText(this, "NOPE", Toast.LENGTH_SHORT).show();
                break;

            case R.id.answerThree:
                if (checked)
                    // third radio button
                    // correct

                    if (question == 0)
                        Toast.makeText(this, "That is correct", Toast.LENGTH_SHORT).show();
                if (question == 1)
                    Toast.makeText(this, "That is correct", Toast.LENGTH_SHORT).show();
                if (question == 3)
                    Toast.makeText(this, "That is correct", Toast.LENGTH_SHORT).show();
                if (question == 7)
                    Toast.makeText(this, "That is correct", Toast.LENGTH_SHORT).show();
                // wrong
                if (question == 2)
                    Toast.makeText(this, "Nope", Toast.LENGTH_SHORT).show();
                if (question == 5)
                    Toast.makeText(this, "Nope", Toast.LENGTH_SHORT).show();
                if (question == 4)
                    Toast.makeText(this, "Nope", Toast.LENGTH_SHORT).show();
                if (question == 6)
                    Toast.makeText(this, "Nope", Toast.LENGTH_SHORT).show();
                if (question == 8)
                    Toast.makeText(this, "Nope", Toast.LENGTH_SHORT).show();

                // else Toast.makeText(this, "NOPE", Toast.LENGTH_SHORT).show();

                break;

        }
    }

    public void resetButton(View view) {
        question = 0;
        setContentView(R.layout.activity_main);
    }
}