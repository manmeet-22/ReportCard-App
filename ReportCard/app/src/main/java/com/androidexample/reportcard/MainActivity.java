package com.androidexample.reportcard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
int f=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button teacher = (Button) findViewById(R.id.teacherClick);

        teacher.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent shuffleIntent = new Intent(MainActivity.this, TeacherActivity.class);
                startActivity(shuffleIntent);
            }
        });

        Button student = (Button) findViewById(R.id.studentClick);

        student.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                    Intent shuffleIntent = new Intent(MainActivity.this, StudentActivity.class);

                    startActivity(shuffleIntent);
            } });

    }
}
