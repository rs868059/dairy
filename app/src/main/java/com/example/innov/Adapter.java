package com.example.innov;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder>{
    cardview[] myMovieData;
    Context context;
    public Adapter(cardview[] myMovieData,MainActivity2 activity) {
        this.myMovieData=myMovieData;
        this.context=activity;

    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater =LayoutInflater.from(parent.getContext());
        View view=layoutInflater.inflate(R.layout.cardview,parent,false);
        ViewHolder viewHolder=new ViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final cardview myMovieDataList=myMovieData[position];
        holder.textViewName3.setText(myMovieDataList.getTextView3());
        holder.textViewName5.setText(myMovieDataList.getTextView5());
        holder.textViewName6.setText(myMovieDataList.getTextView6());
        holder.textViewName7.setText(myMovieDataList.getTextView7());
        holder.textViewNametime.setText(myMovieDataList.getTextViewtime());
        holder.textViewNamestate.setText(myMovieDataList.getTextViewstate());
        holder.textViewNameplace.setText(myMovieDataList.getTextViewplace());
        holder.movieImage.setImageResource(myMovieDataList.getImageView());
        holder.movieImage4.setImageResource(myMovieDataList.getImageView4());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,myMovieDataList.getTextView3(),Toast.LENGTH_SHORT).show();

            }
        });

    }

    @Override
    public int getItemCount() {
        return myMovieData.length;
    }

    public class  ViewHolder extends RecyclerView.ViewHolder{
        ImageView movieImage ;
        ImageView movieImage4 ;
        TextView textViewName3;
        TextView textViewName5;
        TextView textViewName6;
        TextView textViewName7;
        TextView textViewNametime;
        TextView textViewNamestate;
        TextView textViewNameplace;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            movieImage=itemView.findViewById(R.id.imageView);
            movieImage4=itemView.findViewById(R.id.imageView4);
            textViewName3=itemView.findViewById(R.id.textView3);
            textViewName5=itemView.findViewById(R.id.textView5);
            textViewName6=itemView.findViewById(R.id.textView6);
            textViewName7=itemView.findViewById(R.id.textView7);
            textViewNametime=itemView.findViewById(R.id.textViewtime);
            textViewNamestate=itemView.findViewById(R.id.textViewstate);
            textViewNameplace=itemView.findViewById(R.id.textViewplace);
        }
    }
}
