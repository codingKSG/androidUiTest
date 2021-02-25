package com.cos.uitest.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.cos.uitest.R;
import com.cos.uitest.model.Post;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class MidContainerAdapter extends RecyclerView.Adapter<MidContainerAdapter.MyViewHolder> {

    private static final String TAG = "MidContainerAdapter2";
    private final List<Post> posts;

    public MidContainerAdapter(List<Post> posts) {
        this.posts = posts;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater inflater = (LayoutInflater)parent.getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.mid_item, parent, false);

        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.setItem(posts.get(position));
    }

    @Override
    public int getItemCount() {
        return posts.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        private TextView tvMidUserName;
        private CircleImageView civMidUserImg;
        private ImageView ivMidPostImg;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            tvMidUserName = itemView.findViewById(R.id.tv_mid_user_name);
            civMidUserImg = itemView.findViewById(R.id.civ_mid_user_img);
            ivMidPostImg = itemView.findViewById(R.id.iv_mid_post_img);
        }

        public void setItem(Post post) {
            tvMidUserName.setText(post.getUsername());
            Glide.with(itemView.getContext()).load(post.getMyImg()).into(civMidUserImg);
            Glide.with(itemView.getContext()).load(post.getPostImg()).into(ivMidPostImg);
        }
    }
}
