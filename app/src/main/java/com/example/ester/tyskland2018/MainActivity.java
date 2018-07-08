package com.example.ester.tyskland2018;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
        MainFragment mainFragment = new MainFragment();


        @Override //Tryck ctrl o för att få mall snabbt
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            FragmentManager fragmentManager = getFragmentManager(); //Hanterar alla fragment, fragmentManager finns redan så den behöver inte skapas
            FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction(); //Hanterar alla övergångar. På denna anropar man replace eller annan funktion helst. Kanske ska man inte ens använda FragmentTransaction om det inte finns någon sådan funktion utan något som heter något med stack istället

            fragmentTransaction.addToBackStack(null);
            fragmentTransaction.add(R.id.main_container, mainFragment); //Lägger in startsidan i containern
            fragmentTransaction.commit(); //Öppnar painFragment
        }
}
