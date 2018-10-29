package com.example.muska.tp;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class JobsList extends ArrayAdapter<CompanyInformation> {

    private Activity context;
    private List<CompanyInformation> jobsList;

    public JobsList(Activity context, List<CompanyInformation> jobsList){
        super(context,R.layout.show_jobs,jobsList);
        this.context = context;
        this.jobsList = jobsList;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = context.getLayoutInflater();
        View listViewItem = inflater.inflate(R.layout.show_jobs,null,true);
        TextView textViewJobName = (TextView)listViewItem.findViewById(R.id.textViewJobName);
        TextView textViewCompanyName = (TextView)listViewItem.findViewById(R.id.textViewCompanyName);
        TextView textViewStipend = (TextView)listViewItem.findViewById(R.id.textViewStipend);
        TextView textViewJobType = (TextView)listViewItem.findViewById(R.id.textViewJobType);
        TextView textViewCGPA = (TextView)listViewItem.findViewById(R.id.textViewCGPA);

        CompanyInformation company = jobsList.get(position);
        textViewJobName.setText(company.jobName);
        textViewCompanyName.setText(company.companyName);
        textViewStipend.setText("Stipend: "+company.stipend);
        textViewJobType.setText(company.jobType);
        textViewCGPA.setText("CGPA: "+company.CGPA);

        return listViewItem;
    }
}
