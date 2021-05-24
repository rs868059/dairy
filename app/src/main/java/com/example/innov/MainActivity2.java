package com.example.innov;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
       RecyclerView recycler=(RecyclerView) findViewById(R.id.recycle);
       recycler.setHasFixedSize(true);
        recycler.setLayoutManager(new LinearLayoutManager(this));
      cardview[] myMovieData=new cardview[]{
              new cardview("Allen Copperrr ","Breaking view of the Rocky from the hotel. loving the vacation today in.","#Travel #Nature #Beauty #Trekk","02 December","50","Rome","Italy",R.drawable.ccirclecropped,R.drawable.firstimage),
              new cardview("Mark Swareign ","Breaking view of the Rocky from the hotel. loving the vacation today in.","#Travel #Nature #Beauty #Trekk","05 November","50","Neywork","USA",R.drawable.cccirclecropped,R.drawable.lan),

              new cardview("Kevin vaugh ","Breaking view of the Rocky from the hotel. loving the vacation today in.","#Travel #Nature #Beauty #Trekk","02 januaryr","50","Neywork","USA",R.drawable.circlecropped,R.drawable.landscapee),

              new cardview("Hareald Bald ","Breaking view of the Rocky from the hotel. loving the vacation today in.","#Travel #Nature #Beauty #Trekk","02 April","50","Neywork","USA",R.drawable.ccirclecropped,R.drawable.lan),
              new cardview("Allen Copper ","Breaking view of the Rocky from the hotel. loving the vacation today in.","#Travel #Nature #Beauty #Trekk","02 December","50","Neywork","USA",R.drawable.ccirclecropped,R.drawable.firstimage),
              new cardview("Mark Swareign ","Breaking view of the Rocky from the hotel. loving the vacation today in.","#Travel #Nature #Beauty #Trekk","05 November","50","Neywork","USA",R.drawable.cccirclecropped,R.drawable.lan),

              new cardview("Kevin vaugh ","Breaking view of the Rocky from the hotel. loving the vacation today in.","#Travel #Nature #Beauty #Trekk","02 januaryr","50","Neywork","USA",R.drawable.circlecropped,R.drawable.landscapee),

              new cardview("Hareald Bald ","Breaking view of the Rocky from the hotel. loving the vacation today in.","#Travel #Nature #Beauty #Trekk","02 April","50","Neywork","USA",R.drawable.ccirclecropped,R.drawable.lan),
              new cardview("Allen Copper ","Breaking view of the Rocky from the hotel. loving the vacation today in.","#Travel #Nature #Beauty #Trekk","02 December","50","Neywork","USA",R.drawable.ccirclecropped,R.drawable.firstimage),
              new cardview("Mark Swareign ","Breaking view of the Rocky from the hotel. loving the vacation today in.","#Travel #Nature #Beauty #Trekk","05 November","50","Neywork","USA",R.drawable.cccirclecropped,R.drawable.lan),

              new cardview("Kevin vaugh ","Breaking view of the Rocky from the hotel. loving the vacation today in.","#Travel #Nature #Beauty #Trekk","02 januaryr","50","Neywork","USA",R.drawable.circlecropped,R.drawable.landscapee),

              new cardview("Hareald Bald ","Breaking view of the Rocky from the hotel. loving the vacation today in.","#Travel #Nature #Beauty #Trekk","02 April","50","Neywork","USA",R.drawable.ccirclecropped,R.drawable.lan),
      };

 Adapter myMovieAdapter =new Adapter(myMovieData,MainActivity2.this);
 recycler.setAdapter(myMovieAdapter);

    }
}