package com.dicoding.picodiploma.listtop10gachagames;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.view.View.OnClickListener;
import com.dicoding.picodiploma.listtop10gachagames.CustomOnItemClick.OnItemClickCallback;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import java.util.List;


public class ListGamesAdapter extends RecyclerView.Adapter<ListGamesAdapter.ListViewHolder> {
    private List<Games> listGames;
    private Context context;

    public ListGamesAdapter(Context context , List<Games> listGames){
        this.listGames = listGames;
        this.context = context;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_row_games, parent, false);
        return new ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, int position) {
        final Games games = listGames.get(position);
        Glide.with(holder.itemView.getContext())
                .load(games.getPhoto())
                .apply(new RequestOptions().override(55 , 55))
                .into(holder.imagesGames);
        holder.nameGames.setText(games.getName());
        holder.genreGames.setText(games.getGenre());
        holder.rlGames.setOnClickListener(new CustomOnItemClick(position, new CustomOnItemClick.OnItemClickCallback() {
            @Override
            public void onItemClicked(View view, int position) {
                Intent intent = new Intent(context , GameDeskripsi.class);
                intent.putExtra("key", games);
                context.startActivity(intent);
            }
        }));
    }

    @Override
    public int getItemCount() {
        return listGames.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imagesGames;
        TextView nameGames , genreGames, jenisGames;
        Games games;
        RelativeLayout rlGames;
        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imagesGames = itemView.findViewById(R.id.img_item_photo);
            nameGames = itemView.findViewById(R.id.tv_item_name);
            genreGames = itemView.findViewById(R.id.tv_game_genre);
            jenisGames = itemView.findViewById(R.id.tv_jenis);
            rlGames= itemView.findViewById(R.id.RLGames);

            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View view) {
            Intent intent = new Intent(context , GameDeskripsi.class);
            intent.putExtra("key", games);
            context.startActivity(intent);
        }
    }
}