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


    int question = 0;
    int score = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startingpage);
    }


    public void startButton(View view) {
        question = question + 1;
        setContentView(R.layout.activity_main);

    }


    public void nextButton(View view) {
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        radioGroup.clearCheck();
        ImageView cartoonImage = (ImageView) findViewById(R.id.cartoonImage);
        TextView questionText = (TextView) findViewById(R.id.questionText);
        RadioButton answerOne = (RadioButton) findViewById(R.id.answerOne);
        RadioButton answerTwo = (RadioButton) findViewById(R.id.answerTwo);
        RadioButton answerThree = (RadioButton) findViewById(R.id.answerThree);
        if (question == 0) {
            cartoonImage.setImageResource(R.drawable.ninasimone);
            questionText.setText(getText(R.string.mainAnswerOne));
            answerTwo.setText(getText(R.string.mainAnswerTwo));
            answerThree.setText(getText(R.string.mainAnswerThree));
            question = question + 1;
            return;
        }

        // Question 2
        if (question == 1) {
            cartoonImage.setImageResource(R.drawable.jackblack);
            questionText.setText(getText(R.string.firstQuestion));
            answerOne.setText(getText(R.string.firstAnswerOne));
            answerTwo.setText(getText(R.string.firstAnswerTwo));
            answerThree.setText(getText(R.string.firstAnswerThree));
            question = question + 1;
            return;
        }
        // Question 3
        if (question == 2) {
            cartoonImage.setImageResource(R.drawable.mickjagger);
            questionText.setText(getText(R.string.secondQuestion));
            answerOne.setText(getText(R.string.secondAnswerOne));
            answerTwo.setText(getText(R.string.secondAnswerTwo));
            answerThree.setText(getText(R.string.secondAnswerThree));
            question = question + 1;
            return;
        }
        // Question 4
        if (question == 3) {
            cartoonImage.setImageResource(R.drawable.eltonjohn);
            questionText.setText(getText(R.string.thirdQuestion));
            answerOne.setText(getText(R.string.thirdAnswerOne));
            answerTwo.setText(getText(R.string.thirdAnswerTwo));
            answerThree.setText(getText(R.string.thirdAnswerThree));
            question = question + 1;
            return;
        }
        // Question 5
        if (question == 4) {
            cartoonImage.setImageResource(R.drawable.freddiemercury);
            questionText.setText(getText(R.string.forthQuestion));
            answerOne.setText(getText(R.string.forthAnswerOne));
            answerTwo.setText(getText(R.string.forthAnswerTwo));
            answerThree.setText(getText(R.string.forthAnswerThree));
            question = question + 1;
            return;
        }
        // Question 6
        if (question == 5) {
            cartoonImage.setImageResource(R.drawable.jimmypage);
            questionText.setText(getText(R.string.fifthQuestion));
            answerOne.setText(getText(R.string.fifthAnswerOne));
            answerTwo.setText(getText(R.string.fifthAnswerTwo));
            answerThree.setText(getText(R.string.fifthAnswerThree));
            question = question + 1;
            return;
        }
        // Question 7
        if (question == 6) {
            cartoonImage.setImageResource(R.drawable.michaeljackson);
            questionText.setText(getText(R.string.sixthQuestion));
            answerOne.setText(getText(R.string.sixthAnswerOne));
            answerTwo.setText(getText(R.string.sixthAnswerTwo));
            answerThree.setText(getText(R.string.sixthAnswerThree));
            question = question + 1;
            return;
        }
        // Question 8
        if (question == 7) {
            cartoonImage.setImageResource(R.drawable.robertplantcaricature);
            questionText.setText(getText(R.string.seventhQuestion));
            answerOne.setText(getText(R.string.seventhAnswerOne));
            answerTwo.setText(getText(R.string.seventhAnswerTwo));
            answerThree.setText(getText(R.string.seventhAnswerThree));
            question = question + 1;
            return;
        }
        if (question == 8)
            setContentView(R.layout.endpage);


    }

    public void backButton(View view) {
        RadioGroup radioGroup = findViewById(R.id.radioGroup);
        radioGroup.clearCheck();
        ImageView cartoonImage = (ImageView) findViewById(R.id.cartoonImage);
        TextView questionText = (TextView) findViewById(R.id.questionText);
        RadioButton answerOne = (RadioButton) findViewById(R.id.answerOne);
        RadioButton answerTwo = (RadioButton) findViewById(R.id.answerTwo);
        RadioButton answerThree = (RadioButton) findViewById(R.id.answerThree);
        score = score - 1;
        displayScore(score);

        if (question == 1) {
            cartoonImage.setImageResource(R.drawable.ninasimone);
            questionText.setText(getText(R.string.mainAnswerOne));
            answerOne.setText(getText(R.string.mainAnswerTwo));
            answerThree.setText(getText(R.string.mainAnswerThree));
            question = question - 1;
            return;
        }

        // Question 2
        if (question == 2) {
            cartoonImage.setImageResource(R.drawable.jackblack);
            questionText.setText(getText(R.string.firstQuestion));
            answerOne.setText(getText(R.string.firstAnswerOne));
            answerTwo.setText(getText(R.string.firstAnswerTwo));
            answerThree.setText(getText(R.string.firstAnswerThree));
            question = question - 1;
            return;
        }
        // Question 3
        if (question == 3) {
            cartoonImage.setImageResource(R.drawable.mickjagger);
            questionText.setText(getText(R.string.secondQuestion));
            answerOne.setText(getText(R.string.secondAnswerOne));
            answerTwo.setText(getText(R.string.secondAnswerTwo));
            answerThree.setText(getText(R.string.secondAnswerThree));
            question = question - 1;


        }
        // Question 4
        if (question == 4) {
            cartoonImage.setImageResource(R.drawable.eltonjohn);
            questionText.setText(getText(R.string.thirdQuestion));
            answerOne.setText(getText(R.string.thirdAnswerOne));
            answerTwo.setText(getText(R.string.thirdAnswerTwo));
            answerThree.setText(getText(R.string.thirdAnswerThree));
            question = question - 1;
            return;
        }
        // Question 5
        if (question == 5) {
            cartoonImage.setImageResource(R.drawable.freddiemercury);
            questionText.setText(getText(R.string.forthQuestion));
            answerOne.setText(getText(R.string.forthAnswerOne));
            answerTwo.setText(getText(R.string.forthAnswerTwo));
            answerThree.setText(getText(R.string.forthAnswerThree));
            question = question - 1;
            return;
        }
        // Question 6
        if (question == 6) {
            cartoonImage.setImageResource(R.drawable.jimmypage);
            questionText.setText(getText(R.string.fifthQuestion));
            answerOne.setText(getText(R.string.fifthAnswerOne));
            answerTwo.setText(getText(R.string.fifthAnswerTwo));
            answerThree.setText(getText(R.string.fifthAnswerThree));
            question = question - 1;
            return;
        }
        // Question 7
        if (question == 7) {
            cartoonImage.setImageResource(R.drawable.michaeljackson);
            questionText.setText(getText(R.string.sixthQuestion));
            answerOne.setText(getText(R.string.sixthAnswerOne));
            answerTwo.setText(getText(R.string.sixthAnswerTwo));
            answerThree.setText(getText(R.string.sixthAnswerThree));
            question = question - 1;
            return;
        }
        // Question 8
        if (question == 8) {
            cartoonImage.setImageResource(R.drawable.robertplantcaricature);
            questionText.setText(getText(R.string.seventhQuestion));
            answerOne.setText(getText(R.string.seventhAnswerOne));
            answerTwo.setText(getText(R.string.seventhAnswerTwo));
            answerThree.setText(getText(R.string.seventhAnswerThree));
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
                        score = score + 1;
                Toast.makeText(this, "That is correct", Toast.LENGTH_SHORT).show();
                if (question == 6)
                    score = score + 1;
                    Toast.makeText(this, "That is correct", Toast.LENGTH_SHORT).show();
                if (question == 8)
                    score = score + 1;
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
                displayScore(score);
                break;
            case R.id.answerTwo:
                if (checked)
                    // second radio button
                    // correct
                    if (question == 2)
                        score = score + 1;
                        Toast.makeText(this, "That is correct", Toast.LENGTH_SHORT).show();
                if (question == 5)
                    score = score + 1;
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
                displayScore(score);
                break;

            case R.id.answerThree:
                if (checked)
                    // third radio button
                    // correct

                    if (question == 0)
                        score = score + 1;
                Toast.makeText(this, "That is correct", Toast.LENGTH_SHORT).show();


                if (question == 1)
                    score = score + 1;
                Toast.makeText(this, "That is correct", Toast.LENGTH_SHORT).show();
                if (question == 3)
                    score = score + 1;
                Toast.makeText(this, "That is correct", Toast.LENGTH_SHORT).show();
                if (question == 7)
                    score = score + 1;
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
                displayScore(score);

                break;

        }
    }

    public void displayScore(int score) {
        TextView viewScore = findViewById(R.id.viewScore);
        viewScore.setText("" + score);
    }

    public void resetButton(View view) {
        question = 0;
        setContentView(R.layout.activity_main);
    }
}