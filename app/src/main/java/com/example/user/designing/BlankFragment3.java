package com.example.user.designing;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;



public class BlankFragment3 extends Fragment {

    RecyclerView recyclerView;
    Adapter adapter;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v=inflater.inflate(R.layout.fragment_blank_fragment3, container, false);
        recyclerView=v.findViewById(R.id.Recyclerview);
        adapter=new Adapter(this,data.getData());
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this.getContext()));
        // Inflate the layout for this fragment
        return v;


    }


}
