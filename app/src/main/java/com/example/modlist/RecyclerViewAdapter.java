package com.example.modlist;

import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class RecyclerViewAdapter extends RecyclerView.Adapter <RecyclerViewAdapter.ViewHolder> {

    private ArrayList<String>nama = new ArrayList<>();
    private ArrayList<String>mSize = new ArrayList<>();
    private ArrayList<String>mWeight = new ArrayList<>();
    private ArrayList<String>pRange = new ArrayList<>();
    private ArrayList<String>vRange = new ArrayList<>();
    private ArrayList<String>foto = new ArrayList<>();
    private Context context;

    public RecyclerViewAdapter(Context context, ArrayList <String> nama, ArrayList <String> mSize, ArrayList <String> mWeight, ArrayList <String> pRange, ArrayList <String> vRange, ArrayList <String> foto ){
        this.nama = nama;
        this.mSize = mSize;
        this.mWeight = mWeight;
        this.pRange = pRange;
        this.vRange = vRange;
        this.foto = foto;
        this.context = context;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
     View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_list, parent, false);
     ViewHolder holder = new ViewHolder(view);
     return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, final int position) {
        Glide.with(context)
        .asBitmap()
        .load(foto.get(position))
        .into(holder.foto);

        holder.nama.setText(nama.get(position));

        holder.parentLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context,MainDetail.class);
                intent.putExtra("nama",nama.get(position));
                intent.putExtra("foto",foto.get(position));
                intent.putExtra("vrange",vRange.get(position));
                intent.putExtra("prange",pRange.get(position));
                intent.putExtra("size",mSize.get(position));
                intent.putExtra("weight",mWeight.get(position));
                context.startActivity(intent);
            }
        });



    }

    @Override
    public int getItemCount() {
        return nama.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        CircleImageView foto;
        TextView nama;
        RelativeLayout parentLayout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            parentLayout = itemView.findViewById(R.id.parent_layout);
            nama = itemView.findViewById(R.id.image_name);
            foto = itemView.findViewById(R.id.image);
        }
    }
}
