package com.example.modlist;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class MainDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_detail);

        getIncomingIntent();
    }

    private void getIncomingIntent() {

        if (getIntent().hasExtra("nama") && getIntent().hasExtra("foto")) {

            String nama = getIntent().getStringExtra("nama");
            String foto = getIntent().getStringExtra("foto");
            String weight = getIntent().getStringExtra("weight");
            String prange = getIntent().getStringExtra("prange");
            String size = getIntent().getStringExtra("size");
            String vrange = getIntent().getStringExtra("vrange");
            setData(nama,foto,weight,prange,size,vrange);
        }
    }

    private void setData (String nama,String foto,String weight, String prange, String size, String vrange){

        TextView mNama = findViewById(R.id.image_description);
        mNama.setText(nama);

        ImageView mFoto = findViewById(R.id.image);
        Glide.with(this)
                .asBitmap()
                .load(foto)
                .into(mFoto);

        TextView  mWeight = findViewById(R.id.weight);
        mWeight.setText(weight);

        TextView mPrange  = findViewById(R.id.powerrange);
        mPrange.setText(prange);

        TextView mVrange = findViewById(R.id.voltrange);
        mVrange.setText(vrange);

        TextView mSize = findViewById(R.id.size);
        mSize.setText(size);


    }
}
