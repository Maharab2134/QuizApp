package com.example.quiz_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.quiz_app.Activity.EditPasswordActivity;
import com.example.quiz_app.Activity.HistoryActivity;
import com.example.quiz_app.Activity.LoginActivity;
import com.example.quiz_app.Activity.QuizOptionActivity;
import com.example.quiz_app.Activity.RuleActivity;
import com.example.quiz_app.data.User;
import com.example.quiz_app.other.SharedPref;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);// page connected

        TextView tvUsername = findViewById(R.id.tvUsernameHome);
        CardView cvStartQuiz = findViewById(R.id.cvStartQuiz);
        CardView cvRule = findViewById(R.id.cvRule);
        CardView cvHistory = findViewById(R.id.cvHistory);
        CardView cvEditPassword = findViewById(R.id.cvEditPassword);
        CardView cvLogout = findViewById(R.id.cvLogout);

        SharedPref sharedPref = SharedPref.getInstance();
        User user = sharedPref.getUser(this);

        tvUsername.setText("Hello, " + user.getUsername());

        cvStartQuiz.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, QuizOptionActivity.class)));

        cvRule.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, RuleActivity.class)));

        cvHistory.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, HistoryActivity.class)));

        cvEditPassword.setOnClickListener(view -> startActivity(new Intent(MainActivity.this, EditPasswordActivity.class)));

        cvLogout.setOnClickListener(view -> {
            sharedPref.clearSharedPref(MainActivity.this);
            Intent intent = new Intent(MainActivity.this, LoginActivity.class);
            startActivity(intent);
            finish();
        });

    }
}