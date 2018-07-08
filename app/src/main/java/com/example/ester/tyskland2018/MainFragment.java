package com.example.ester.tyskland2018;

import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.PopupMenu;

public class MainFragment extends Fragment{
    public MainFragment() {
    }

    private ImageButton menu;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.main_layout, container, false);
        menu = (ImageButton) v.findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                PopupMenu popup = new PopupMenu(getContext(), v);
                MenuInflater inflater = popup.getMenuInflater();
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId()){
                            case R.id.fullast:
                                return true;
                            case R.id.utbud:
                                return true;
                            case R.id.location:
                                return true;
                            case R.id.baradmin:
                                Fragment fragment = new BarAdminLogInFragment();// the fragment which you ant to display
                                FragmentManager fragmentManager = getFragmentManager();
                                fragmentManager.beginTransaction().replace(R.id.main_container,fragment).commit();
                                return true;
                            default:
                                return false;
                        }
                    }
                });
                inflater.inflate(R.menu.main, popup.getMenu()); //R.menu.main: Define content of the menu
                popup.show();
            }
        });
        return v;

    }

    public void showMenu(View v){
        menu = (ImageButton) v.findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                PopupMenu popup = new PopupMenu(getContext(), v);
                MenuInflater inflater = popup.getMenuInflater();
                popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId()){
                            case R.id.fullast:
                                return true;
                            case R.id.utbud:
                                return true;
                            case R.id.location:
                                return true;
                            case R.id.baradmin:
                                FragmentManager fragmentManager=getFragmentManager();
                                FragmentTransaction fragmentTransaction=fragmentManager.beginTransaction();
                                BarAdminLogInFragment barAdminLogInFragment=new BarAdminLogInFragment();
                                fragmentTransaction.replace(R.id.main_container,barAdminLogInFragment);
                                fragmentTransaction.commit();
                                return true;
                            default:
                                return false;
                        }
                    }
                });
                inflater.inflate(R.menu.main, popup.getMenu()); //R.menu.main: Define content of the menu
                popup.show();
            }
        });
    }
}
