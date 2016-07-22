package com.adityapc.aditya.retrofitimagedownloading;

import android.app.Fragment;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

/**
 * Created by aditya on 21/7/16.
 */

public class DataAdapter extends RecyclerView.Adapter<DataAdapter.ViewHolder> {

    private ArrayList<ImageList> image;
    private Context context;

    public DataAdapter(Context context, ArrayList<ImageList> image){
        this.image = image;
        this.context = context;
    }

    @Override
    public DataAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_row,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(DataAdapter.ViewHolder holder, int position) {
        //holder.iv_download.setImage(image.get(position).getImages());
        ImageList imageList = image.get(position);

        Picasso
                .with(context)
                .load(imageList.getImages())
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher)
                .resize(800,400)
                .centerCrop()
                .into(holder.iv_download);
    }

    @Override
    public int getItemCount() {
        return image.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView iv_download,iv_for_glide;
        public ViewHolder(View itemView) {
            super(itemView);
            iv_download = (ImageView) itemView.findViewById(R.id.iv_download);
        }
    }
}