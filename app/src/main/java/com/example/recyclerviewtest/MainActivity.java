package com.example.recyclerviewtest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private List<Fruit> fruitList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFruits();
        RecyclerView recyclerView = (RecyclerView)findViewById(R.id.recycler_view);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(3, StaggeredGridLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(layoutManager);
        FruitAdapter adapter = new FruitAdapter(fruitList);
        recyclerView.setAdapter(adapter);

    }


    private void initFruits() {
        for (int i = 0; i < 2; i++) {
            Fruit apple = new Fruit(getRandomLengName("apple"), R.drawable.ic_launcher_foreground);
            fruitList.add(apple);
            Fruit apple1 = new Fruit(getRandomLengName("apple1"), R.drawable.ic_launcher_foreground);
            fruitList.add(apple1);
            Fruit apple2 = new Fruit(getRandomLengName("apple2"), R.drawable.ic_launcher_foreground);
            fruitList.add(apple2);
            Fruit apple3 = new Fruit(getRandomLengName("apple3"), R.drawable.ic_launcher_foreground);
            fruitList.add(apple3);
            Fruit apple4 = new Fruit(getRandomLengName("apple4"), R.drawable.ic_launcher_foreground);
            fruitList.add(apple4);
            Fruit apple5 = new Fruit(getRandomLengName("apple5"), R.drawable.ic_launcher_foreground);
            fruitList.add(apple5);
            Fruit apple6 = new Fruit(getRandomLengName("apple6"), R.drawable.ic_launcher_foreground);
            fruitList.add(apple6);
            Fruit apple7 = new Fruit(getRandomLengName("apple7"), R.drawable.ic_launcher_foreground);
            fruitList.add(apple7);
            Fruit apple8 = new Fruit(getRandomLengName("apple8"), R.drawable.ic_launcher_foreground);
            fruitList.add(apple8);
            Fruit apple9 = new Fruit(getRandomLengName("apple9"), R.drawable.ic_launcher_foreground);
            fruitList.add(apple9);
            Fruit apple10 = new Fruit(getRandomLengName("apple10"), R.drawable.ic_launcher_foreground);
            fruitList.add(apple10);
            Fruit apple11 = new Fruit(getRandomLengName("apple11"), R.drawable.ic_launcher_foreground);
            fruitList.add(apple11);

        }

    }


    private String getRandomLengName(String name){
        Random random = new Random();
        int length = random.nextInt(20)+1;
        StringBuilder builder = new StringBuilder();
        for(int i = 0;i <length;i++){
            builder.append(name);

        }
        return builder.toString();
    }


}
