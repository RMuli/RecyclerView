package com.example.recyclerview;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private MyAdapter adapter;
    private List<Item> itemList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize RecyclerView
        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Initialize data
        itemList = new ArrayList<>();
        itemList.add(new Item("John Doe", "john@example.com", "1234567890"));
        itemList.add(new Item("Jane Smith", "jane@example.com", "0987654321"));
        // Add more items as needed

        // Initialize adapter
        adapter = new MyAdapter(itemList);

        // Set adapter to RecyclerView
        recyclerView.setAdapter(adapter);
    }
}
