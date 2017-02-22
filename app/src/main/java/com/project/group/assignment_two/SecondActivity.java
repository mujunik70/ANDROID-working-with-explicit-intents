package com.project.group.assignment_two;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Sticky on 2/21/2017.
 */

public class SecondActivity extends Activity {
    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);

        String fullname = getIntent().getStringExtra("Full_Name");

        TextView textview = (TextView) findViewById(R.id.fullname);
        textview.setText(fullname);
    }
}
