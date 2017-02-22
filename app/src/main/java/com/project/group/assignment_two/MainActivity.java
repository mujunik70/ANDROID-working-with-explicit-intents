package com.project.group.assignment_two;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v.getId() == R.id.submit){

                    EditText a = (EditText) findViewById(R.id.fname);
                    String str1 = a.getText().toString();

                    EditText b = (EditText) findViewById(R.id.lname);
                    String str2 = b.getText().toString();

                    String str3 =  str1 + "  " + str2 ;

                    Intent i = new Intent(MainActivity.this, SecondActivity.class);
                    i.putExtra("Full_Name", str3);
                    startActivity(i);

                }
            }
        });

    }


}
