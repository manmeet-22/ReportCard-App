package com.androidexample.reportcard;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;

/**
 * Created by MANI on 11/6/2016.
 */
public class TeacherActivity extends AppCompatActivity {

    int f1=0;
    int f2=0;
    int f3=0;
    int f4=0;
    int f5=0;
    int f6=0;
    int f7=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.teacher_layout);
    }

    public void marks(View view){
        EditText cst=(EditText)findViewById(R.id.cst);
        EditText cn=(EditText)findViewById(R.id.cn);
        EditText pstc=(EditText)findViewById(R.id.pstc);
        EditText nmst=(EditText)findViewById(R.id.nmst);
        EditText os=(EditText)findViewById(R.id.os);
        EditText deld=(EditText)findViewById(R.id.deld);
        EditText dbms=(EditText)findViewById(R.id.dbms);

        String cstGrade = cst.getText().toString().toUpperCase().trim();
        String cnGrade = cn.getText().toString().toUpperCase().trim();
        String pstcGrade = pstc.getText().toString().toUpperCase().trim();
        String nmstGrade = nmst.getText().toString().toUpperCase().trim();
        String osGrade = os.getText().toString().toUpperCase().trim();
        String deldGrade = deld.getText().toString().toUpperCase().trim();
        String dbmsGrade = dbms.getText().toString().toUpperCase().trim();


        if (TextUtils.isEmpty(cstGrade)) {
            f1 = 0;
            cst.setError("Please Enter the Grade");
        }
        else {
            f1 = 1;
        }
        if (TextUtils.isEmpty(cnGrade)) {
            f2 = 0;
            cn.setError("Please Enter the Grade");
        }
        else {
            f2 = 1;
        }
        if (TextUtils.isEmpty(pstcGrade)) {
            f3 = 0;
            pstc.setError("Please Enter the Grade");
        }
        else {
            f3 = 1;
        }
        if (TextUtils.isEmpty(nmstGrade)) {
            f4 = 0;
            nmst.setError("Please Enter the Grade");
        }
        else {
            f4 = 1;
        }
        if (TextUtils.isEmpty(osGrade)) {
            f5 = 0;
            os.setError("Please Enter the Grade");
        }
        else {
            f5 = 1;
        }
        if (TextUtils.isEmpty(deldGrade)) {
            f6 = 0;
            deld.setError("Please Enter the Grade");
        }
        else {
            f6 = 1;
        }
        if (TextUtils.isEmpty(dbmsGrade)) {
            f7 = 0;
            dbms.setError("Please Enter the Grade");
        }
        else {
            f7 = 1;
        }

    if(f1==1 && f2==1 && f3==1 && f4==1 &&f5==1 && f6==1 && f7==1)
    {
        Intent intent = new Intent(this, StudentActivityClick .class);
        Bundle extras = new Bundle();
        extras.putString("cstGrade", cst.getText().toString().toUpperCase().trim());
        extras.putString("cnGrade", cn.getText().toString().toUpperCase().trim());
        extras.putString("pstcGrade", pstc.getText().toString().toUpperCase().trim());
        extras.putString("nmstGrade", nmst.getText().toString().toUpperCase().trim());
        extras.putString("osGrade", os.getText().toString().toUpperCase().trim());
        extras.putString("deldGrade", deld.getText().toString().toUpperCase().trim());
        extras.putString("dbmsGrade", dbms.getText().toString().toUpperCase().trim());
        intent.putExtras(extras);
        startActivity(intent);
    }
    else if(f1==0 && f2==0 && f3==0 && f4==0 &&f5==0 && f6==0 && f7==0)
    {}
}}
