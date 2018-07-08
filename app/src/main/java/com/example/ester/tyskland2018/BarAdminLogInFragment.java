package com.example.ester.tyskland2018;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.PopupMenu;

public class BarAdminLogInFragment extends Fragment{
    public BarAdminLogInFragment() {
    }

    private ImageButton menu;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.bar_admin_login_layout, container, false);
        menu = (ImageButton) v.findViewById(R.id.menu);
        menu.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                PopupMenu popup = new PopupMenu(getContext(), v);
                MenuInflater inflater = popup.getMenuInflater();
                inflater.inflate(R.menu.main, popup.getMenu()); //R.menu.main: Define content of the menu
                popup.show();
            }
        });
        return v;

    }
}
