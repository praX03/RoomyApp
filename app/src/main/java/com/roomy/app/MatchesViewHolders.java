package com.roomy.app;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MatchesViewHolders {
    public MatchesViewHolders(View layoutView) {

    }

    public class MatchesVIewHolders extends RecyclerView.ViewHolder implements View.OnClickListener{
       public TextView mMatchId;
       public MatchesVIewHolders(View itemView) {
           super(itemView);
           itemView.setOnClickListener(this);
           
           mMatchId = (TextView) itemView.findViewById(R.id.Matchid);
       }
        @Override
        public void onClick(View v) {
            
        }
    }
}
