package com.example.user.designing;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.PopupMenu;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {

    BlankFragment3 blankFragment3;
    ArrayList<Info> data;
    LayoutInflater inflater;

    public Adapter(BlankFragment3 blankFragment3, ArrayList<Info> data) {
    this.blankFragment3=blankFragment3;
    this.data=data;
    inflater=LayoutInflater.from(blankFragment3.getContext());
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view=inflater.inflate(R.layout.listrow,viewGroup,false);
        ViewHolder holder=new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull final ViewHolder viewHolder, final int i) {


        viewHolder.propic.setImageResource(data.get(i).imageid);
        viewHolder.NAME.setText(data.get(i).Name);
        viewHolder.MESS.setText(data.get(i).Message);
        viewHolder.STAR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                viewHolder.STAR.setImageResource(R.drawable.ic_star_black_24dp);
            }
        });
        viewHolder.POPUP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu=new PopupMenu(blankFragment3.getContext(),viewHolder.POPUP);
                popupMenu.inflate(R.menu.options);
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem menuItem) {
                        switch (menuItem.getItemId()){
                            case R.id.Delete:
                                data.remove(i);
                                notifyDataSetChanged();
                                break;
                            case R.id.Refresh:
                                viewHolder.STAR.setImageResource(R.drawable.ic_star_border_black_24dp);
                            break;
                            default:
                                break;
                        }

                        return false;
                    }
                });

                popupMenu.show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder{

        TextView NAME;
        TextView MESS;
        ImageView POPUP,STAR,propic;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            propic=(ImageView)itemView.findViewById(R.id.Propic);
            STAR=(ImageView)itemView.findViewById(R.id.f);
            POPUP=(ImageView)itemView.findViewById(R.id.POPUP);
            NAME=(TextView) itemView.findViewById(R.id.NameText);
            MESS=(TextView)itemView.findViewById(R.id.MessageText);
        }
    }
}
