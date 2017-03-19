package com.androidexample.reportcard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

/**
 * Created by MANI on 11/6/2016.
 */
public class StudentActivityClick extends AppCompatActivity {

    private String display[]={"A+","A","B+","A+","A+","A","B"};
    double cgpaValue=0;
    double cgpa=0;
    int aPlus=10;
    int a=9;
    int bPlus=8;
    int b=7;
    int cPlus=6;
    int c=5;
    int dPlus=4;
    int d=3;
    int e=2;
    int i;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.student_layout);

        Intent in = getIntent();
        String  a0= in.getExtras().getString("cstGrade");
        display[0]=a0;
        String  a1= in.getExtras().getString("cnGrade");
        display[1]=a1;
        String  a2= in.getExtras().getString("pstcGrade");
        display[2]=a2;
        String  a3= in.getExtras().getString("nmstGrade");
        display[3]=a3;
        String  a4= in.getExtras().getString("osGrade");
        display[4]=a4;
        String  a5= in.getExtras().getString("deldGrade");
        display[5]=a5;
        String  a6= in.getExtras().getString("dbmsGrade");
        display[6]=a6;


        ReportCard grade_data[] = new ReportCard[]
                {
                        new ReportCard(R.drawable.cst, "CST" , display[0]),
                        new ReportCard(R.drawable.cn, "CN" , display[1]),
                        new ReportCard(R.drawable.pstc, "PSTC" , display[2]),
                        new ReportCard(R.drawable.nmst, "NMST" , display[3]),
                        new ReportCard(R.drawable.os, "OS" , display[4]),
                        new ReportCard(R.drawable.deld, "DELD" , display[5]),
                        new ReportCard(R.drawable.dbms, "DBMS" , display[6])
                };

        ReportCardAdapter adapter = new ReportCardAdapter(this, R.layout.report_card_listview, grade_data);

        ListView listView1 = (ListView)findViewById(R.id.reportCardView);
        listView1.setAdapter(adapter);
        listView1.setTextFilterEnabled(true);

        for(i=0;i<7;i++) {
            switch (display[i]) {
                case "A+":
                    cgpa = cgpa + aPlus;
                    break;

                case "A":
                    cgpa = cgpa + a;
                    break;

                case "B+":
                    cgpa = cgpa + bPlus;
                    break;

                case "B":
                    cgpa = cgpa + b;
                    break;

                case "C+":
                    cgpa = cgpa + cPlus;
                    break;

                case "C":
                    cgpa = cgpa + c;
                    break;

                case "D+":
                    cgpa = cgpa + dPlus;
                    break;

                case "D":
                    cgpa = cgpa + d;
                    break;

                case "E":
                    cgpa = cgpa + e;
                    break;
            }
        }
        cgpaValue=(cgpa*10)/70;
        String str = String.format("%1.2f", cgpaValue);
        cgpaValue = Double.valueOf(str);

        listView1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), parent.getItemAtPosition(position).toString(),
                        Toast.LENGTH_SHORT).show();
            }
        });


    }


    public void cgpa(View view){

        Context context = getApplicationContext();
        CharSequence text = "Your Child\'s CGPA is "+cgpaValue;
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
}

