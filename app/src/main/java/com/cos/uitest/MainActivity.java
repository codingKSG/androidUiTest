package com.cos.uitest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.cos.uitest.adapter.MidContainerAdapter;
import com.cos.uitest.adapter.TopContainerAdapter;
import com.cos.uitest.model.Post;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity2";

    private RecyclerView rvTopContainer, rvMidContainer;

    private List<Post> posts = new ArrayList<>();
    private List<Integer> others = new ArrayList<>();

    private TopContainerAdapter topContainerAdapter;
    private MidContainerAdapter midContainerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        init();

        downloadTop();
        adapteTop();

        downloadMid();
        adapteMid();


    }

    private void init() {
        rvMidContainer = findViewById(R.id.rv_mid_container);
        rvTopContainer = findViewById(R.id.rv_top_container);
    }

    private void downloadMid() {
        posts.add(new Post(1, "love119", R.drawable.post3, R.drawable.cat1));
        posts.add(new Post(2, "love119", R.drawable.post3, R.drawable.cat2));
        posts.add(new Post(3, "love119", R.drawable.post3, R.drawable.cat3));
    }

    private void downloadTop() {
        others.add(1);
        others.add(2);
        others.add(3);
        others.add(4);
        others.add(5);
        others.add(6);
    }

    private void adapteTop() {
        LinearLayoutManager topManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        rvTopContainer.setLayoutManager(topManager);
        topContainerAdapter = new TopContainerAdapter(others);
        rvTopContainer.setAdapter(topContainerAdapter);
    }

    private void adapteMid() {
        LinearLayoutManager midManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rvMidContainer.setLayoutManager(midManager);
        midContainerAdapter = new MidContainerAdapter(posts);
        rvMidContainer.setAdapter(midContainerAdapter);
    }
}