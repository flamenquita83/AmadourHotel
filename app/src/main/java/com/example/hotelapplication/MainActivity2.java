package com.example.hotelapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity2 extends AppCompatActivity  {

    private RecyclerView mRecyclerView;
    public List <Donnees> liste = new ArrayList<>();
    private MyDonneesAdapter mAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        RecyclerView rv = (RecyclerView)findViewById(R.id.recyclerViewID);
        rv.setLayoutManager(new LinearLayoutManager(this));

        //donnees, Reférence pour attacher à un écouteur

        liste.add(new Donnees("Contact","email adress, webSite, phone number",R.drawable.contact));
        liste.add(new Donnees("INFORMATION","Breakfast,restaurants...",R.drawable.information));
        liste.add(new Donnees("URGENCE","Doctors, Taxi...",R.drawable.urgence));
        liste.add(new Donnees("MAPS","Maps, Car Park...",R.drawable.map));


         mAdapter = new MyDonneesAdapter(liste,this);
        rv.setAdapter(mAdapter);


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.example_menu,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {

        switch(item.getItemId()) {


            case R.id.item2 :
                Toast.makeText(this,"item 2",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.item3 :
                Toast.makeText(this,"item 3",Toast.LENGTH_SHORT).show();
                return true;


            default:
                return super.onOptionsItemSelected(item);
        }

    }

    public List<Donnees> getListe() {
        return liste;
    }

    public void setListe(List<Donnees> liste) {
        this.liste = liste;
    }



    public void onItemClick(int position) {

        Toast.makeText(this,"click", Toast.LENGTH_SHORT).show();

    }

   
    public void onLongItemClick(int position) {
        Toast.makeText(this,"ok",Toast.LENGTH_LONG).show();
         Intent intent = new Intent(MainActivity2.this,MainActivityPlan.class);
         startActivity(intent);




    }
}