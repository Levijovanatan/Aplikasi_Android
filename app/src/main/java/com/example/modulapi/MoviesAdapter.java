package com.example.modulapi;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class MoviesAdapter extends RecyclerView.Adapter<MoviesAdapter.MoviesHolder> {
    private Context context;
    private List movielist;

    public MoviesAdapter(Context context, List movies) {
        this.context = context;
        movielist = movies;
    }

    @NonNull
    @Override
    public MoviesHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item,parent,false);
        return new MoviesHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MoviesHolder holder, int position) {
        Movies movies = (Movies) movielist.get(position);
        holder.title.setText(movies.getTitle());
        holder.description.setText(movies.getDescription());
        holder.publishedAt.setText(movies.getPublishedAt());
        Picasso.get().load(movies.getUrlToImage()).into(holder.imageView);

    }

    @Override
    public int getItemCount() {
        return movielist.size();
    }

    public class MoviesHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView title,description,publishedAt;
        public MoviesHolder(@NonNull View itemView) {
            super(itemView);
            imageView = itemView.findViewById(R.id.movieposter);
            title = itemView.findViewById(R.id.judulfilm);
            description = itemView.findViewById(R.id.deskripsifilm);
            publishedAt = itemView.findViewById(R.id.rilisfilm);
        }
    }
}
