package com.example.quiz_app.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;

import com.example.quiz_app.R;
import com.example.quiz_app.other.Constants;


public class QuizOptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_option);

        CardView cvMath = findViewById(R.id.cvMath);
        CardView cvGeography = findViewById(R.id.cvGeography);
        CardView cvLiterature = findViewById(R.id.cvLiterature);
        CardView cvPrograming = findViewById(R.id.cvPrograming);
        CardView cvIq = findViewById(R.id.cvIq);
        CardView cvSports = findViewById(R.id.cvSports);
        CardView cvHistory = findViewById(R.id.cvHistory);
        CardView cvReligion = findViewById(R.id.cvReligion);

        findViewById(R.id.imageViewQuizOption).setOnClickListener(view -> finish());

        cvMath.setOnClickListener(view -> {
            Intent intent = new Intent(QuizOptionActivity.this, MathQuizActivity.class);
            intent.putExtra(Constants.SUBJECT,getString(R.string.math));
            startActivity(intent);
        });

        cvGeography.setOnClickListener(view -> {
            Intent intent = new Intent(QuizOptionActivity.this, GeographyOrLiteratureQuizActivity.class);
            intent.putExtra(Constants.SUBJECT,getString(R.string.geography));
            startActivity(intent);
        });

        cvLiterature.setOnClickListener(view -> {
            Intent intent = new Intent(QuizOptionActivity.this, GeographyOrLiteratureQuizActivity.class);
            intent.putExtra(Constants.SUBJECT,getString(R.string.literature));
            startActivity(intent);
        });

        cvPrograming.setOnClickListener(v -> {
            Intent intent = new Intent(QuizOptionActivity.this, GeographyOrLiteratureQuizActivity.class);
            intent.putExtra(Constants.SUBJECT,getString(R.string.programming));
            startActivity(intent);
        });
        cvIq.setOnClickListener(v -> {
            Intent intent = new Intent(QuizOptionActivity.this, GeographyOrLiteratureQuizActivity.class);
            intent.putExtra(Constants.SUBJECT,getString(R.string.iqQuestion));
            startActivity(intent);
        });
        cvSports.setOnClickListener(v -> {
            Intent intent = new Intent(QuizOptionActivity.this, GeographyOrLiteratureQuizActivity.class);
            intent.putExtra(Constants.SUBJECT,getString(R.string.sports));
            startActivity(intent);
        });
        cvHistory.setOnClickListener(v -> {
            Intent intent = new Intent(QuizOptionActivity.this, GeographyOrLiteratureQuizActivity.class);
            intent.putExtra(Constants.SUBJECT,getString(R.string.history));
            startActivity(intent);
        });
        cvReligion.setOnClickListener(v -> {
            Intent intent = new Intent(QuizOptionActivity.this, GeographyOrLiteratureQuizActivity.class);
            intent.putExtra(Constants.SUBJECT,getString(R.string.islam));
            startActivity(intent);
        });
    }
}