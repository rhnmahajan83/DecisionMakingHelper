package com.finalexam.decisionmakinghelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page2_yesorno extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page2_yesorno);

        Button btn_questions = (Button) findViewById(R.id.questions);
        btn_questions.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.questions:
                startActivity(new Intent(this, Page5_questionslist.class));
        }
    }
}
