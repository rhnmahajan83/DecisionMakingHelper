package com.finalexam.decisionmakinghelper;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;

import java.util.ArrayList;

import static java.security.AccessController.getContext;


public class CustomAdapter extends BaseAdapter {

    Context context;
    String[] questionsList;
    LayoutInflater inflter;

    public static ArrayList<String> selectedAnswers;

    public CustomAdapter(Context applicationContext, String[] questionsList) {
        this.context = context;
        this.questionsList = questionsList;

// initialize arraylist and add static string for all the questions
        selectedAnswers = new ArrayList<>();
        for (int i = 0; i < questionsList.length; i++) {
            selectedAnswers.add("Not Attempted");
        }
        inflter = (LayoutInflater) applicationContext.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return questionsList.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(final int i, View view, ViewGroup viewGroup) {

        view = inflter.inflate(R.layout.list_items, null);
// get the reference of TextView and Button's
        TextView question = (TextView) view.findViewById(R.id.question);
        RadioButton yes = (RadioButton) view.findViewById(R.id.yes);
        RadioButton no = (RadioButton) view.findViewById(R.id.no);
// perform setOnCheckedChangeListener event on yes button
        yes.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
// set Yes values in ArrayList if RadioButton is checked
                if (isChecked)
                    selectedAnswers.set(i, "Yes");
            }
        });
// perform setOnCheckedChangeListener event on no button
        no.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
// set No values in ArrayList if RadioButton is checked
                if (isChecked)
                    selectedAnswers.set(i, "No");

            }
        });
// set the value in TextView
        question.setText(questionsList[i]);
        return view;
    }
}
