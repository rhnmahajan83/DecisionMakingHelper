package com.finalexam.decisionmakinghelper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Page1_options extends AppCompatActivity implements View.OnClickListener {

    Button btn_yesorno = null;
    Button btn_selectone = null;
    Button btn_askothers = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_page1_options);

        btn_yesorno = (Button)findViewById(R.id.btn_yesorno);
        btn_selectone = (Button)findViewById(R.id.btn_selectone);
        btn_askothers = (Button)findViewById(R.id.btn_askothers);

        btn_yesorno.setOnClickListener(this);
        btn_selectone.setOnClickListener(this);
        btn_askothers.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.btn_yesorno:
                startActivity(new Intent(this,Page2_yesorno.class));
            break;
            case R.id.btn_selectone:
                startActivity(new Intent(this,Page3_selectone.class));
                break;
            case R.id.btn_askothers:
                startActivity(new Intent(this,Page4_askothers.class));
                break;
        }
    }
}
