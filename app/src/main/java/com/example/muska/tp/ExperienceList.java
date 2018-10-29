package com.example.muska.tp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.TextView;

import java.util.List;

public class ExperienceList extends ArrayAdapter<experience> {
    private Activity context;
    private List<experience> expList;

    public ExperienceList(Activity context, List<experience> expList){
        super(context, R.layout.list_layout, expList);
        this.context = context;
        this.expList = expList;
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View ListViewItem = inflater.inflate(R.layout.activity_show_experience, null, true);

        TextView name = (EditText) ListViewItem.findViewById(R.id.name);
        TextView batch = (EditText) ListViewItem.findViewById(R.id.batch);
        TextView company = (EditText) ListViewItem.findViewById(R.id.company);
        TextView experience = (EditText) ListViewItem.findViewById(R.id.exper);

        experience exprs = expList.get(position);
        name.setText(exprs.nameofs);
        batch.setText(exprs.batch);
        company.setText(exprs.company);
        experience.setText(exprs.exp);

        return ListViewItem;
    }
}
