package com.example.recyclerview_cardview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rcvCategory;
    private CategoryAdapter2 categoryAdapter2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvCategory = findViewById(R.id.rcv_category);
        categoryAdapter2 = new CategoryAdapter2(this);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this, RecyclerView.VERTICAL, false);
        rcvCategory.setLayoutManager(linearLayoutManager);

        categoryAdapter2.setData(getListCategory());
        rcvCategory.setAdapter(categoryAdapter2);
    }
    private List<Category2> getListCategory() {
        List<Category2> listCategory = new ArrayList<>();

        List<Book2> listBook = new ArrayList<>();
        listBook.add(new Book2(R.drawable.avatar_1, "Avatar 1"));
        listBook.add(new Book2(R.drawable.avatar_2, "Avatar 2"));
        listBook.add(new Book2(R.drawable.avatar_3, "Avatar 3"));
        listBook.add(new Book2(R.drawable.avatar_4, "Avatar 4"));

        listBook.add(new Book2(R.drawable.avatar_1, "Avatar 1"));
        listBook.add(new Book2(R.drawable.avatar_2, "Avatar 2"));
        listBook.add(new Book2(R.drawable.avatar_3, "Avatar 3"));
        listBook.add(new Book2(R.drawable.avatar_4, "Avatar 4"));

        listCategory.add(new Category2("Category 1", listBook));
        listCategory.add(new Category2("Category 2", listBook));
        listCategory.add(new Category2("Category 3", listBook));
        listCategory.add(new Category2("Category 4", listBook));
        return listCategory;
    }
}