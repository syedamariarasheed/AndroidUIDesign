package com.example.user.designing;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class BlankFragment4 extends Fragment  {

    FloatingActionButton floatingActionButton;
    private TextView textView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View v=inflater.inflate(R.layout.fragment_blank_fragment4, container, false);
        floatingActionButton =(FloatingActionButton)v.findViewById(R.id.floatingButton);
        textView=(TextView)v.findViewById(R.id.infoeditin);
        floatingActionButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bottomsheetclass bottomsheetclass=new bottomsheetclass();
                bottomsheetclass.show(getFragmentManager(),"");
            }
        });

        return v;



    }


}
