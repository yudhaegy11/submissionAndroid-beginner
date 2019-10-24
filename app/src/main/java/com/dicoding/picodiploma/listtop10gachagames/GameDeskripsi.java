package com.dicoding.picodiploma.listtop10gachagames;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;

import com.bumptech.glide.Glide;
import com.bumptech.glide.RequestBuilder;

public class GameDeskripsi extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deskripsi);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        Games games = (Games) getIntent().getParcelableExtra("key");
        ImageView gambar =(ImageView)findViewById(R.id.img_item_photo);
        TextView name = (TextView)findViewById(R.id.tv_item_name);
        TextView remarks = (TextView)findViewById(R.id.tv_item_remarks);
        TextView deskripsi = (TextView)findViewById(R.id.content_detail);


        Glide.with(this).load(games.getPhoto()).override(350,550).into(gambar);
        name.setText(games.getName());
        remarks.setText(games.getGenre());
        deskripsi.setText(games.getDeskripsi());


    }
}


