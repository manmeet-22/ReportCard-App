package com.androidexample.reportcard;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
/**
 * Created by MANI on 11/6/2016.
 */
public class ReportCardAdapter extends ArrayAdapter<ReportCard> {
    Context context;
    int id;
    ReportCard listDetails[] = null;

    public ReportCardAdapter(Context context, int id, ReportCard[] lists ) {
        super(context, id, lists);
        this.id = id;
        this.context = context;
        this.listDetails = lists;
    }

    static class ReportCardInfo
    {
        ImageView subIcon;
        TextView subName;
        TextView subGrade;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View list = convertView;
        ReportCardInfo reportCardTotal = null;

        if(list == null)
        {
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            list = inflater.inflate(id, parent, false);

            reportCardTotal = new ReportCardInfo();
            reportCardTotal.subIcon = (ImageView)list.findViewById(R.id.subjectImage);
            reportCardTotal.subName = (TextView)list.findViewById(R.id.subjectName);
            reportCardTotal.subGrade = (TextView)list.findViewById(R.id.subjectGrade);

            list.setTag(reportCardTotal);
        }
        else
        {
            reportCardTotal = (ReportCardInfo)list.getTag();
        }

        ReportCard Card = listDetails[position];

        reportCardTotal.subName.setText(Card.getSubName());
        reportCardTotal.subIcon.setImageResource(Card.getSubIcon());
        reportCardTotal.subGrade.setText(Card.getGrade());

        return list;
    }




}

