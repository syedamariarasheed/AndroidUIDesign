package com.example.user.designing;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.design.widget.BottomSheetDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class bottomsheetclass extends BottomSheetDialogFragment {

public String ab;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.bottomsheet1,container,false);
        Button button= view.findViewById(R.id.ConfirmButton);
         EditText editText=view.findViewById(R.id.infoedit);

        return view;
    }



}
