package com.example.bpaz1701ivanovlab04;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Добавляем RecycleView
        RecyclerView rv = findViewById(R.id.list);
        // Обязательно установить менеджер слоёв.
        rv.setLayoutManager(new LinearLayoutManager(this));
        // Установить адаптер для списка.
        rv.setAdapter(new DetailActivity.RViewAdapter(this, DummyContent.ITEMS));
    }
}
