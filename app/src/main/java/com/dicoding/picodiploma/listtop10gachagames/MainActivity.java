package com.dicoding.picodiploma.listtop10gachagames;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvGames;
    private List<Games> games = new ArrayList();
    private ListGamesAdapter viewAdapter;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvGames = (RecyclerView) findViewById(R.id.rv_games);
        rvGames.setHasFixedSize(true);
        games.addAll(GamesData.getListData());
        showRecyclerList();

    }

    private void showRecyclerList() {
        viewAdapter = new ListGamesAdapter(this, games);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        rvGames.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        rvGames.setItemAnimator(new DefaultItemAnimator());
        rvGames.setAdapter(viewAdapter);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        final int id = item.getItemId();
        switch (id){
            case R.id.profil :
                Intent intent = new Intent(MainActivity.this , ProfilActivity.class);
                startActivity(intent);
                break;

        }
        return super.onOptionsItemSelected(item);
    }
}
