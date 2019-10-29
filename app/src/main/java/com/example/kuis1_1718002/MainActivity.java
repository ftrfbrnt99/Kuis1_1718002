package com.example.kuis1_1718002;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private KeluargaAdapter adapter;
    private ArrayList<Keluarga> keluargaArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        addData();

        recyclerView = (RecyclerView)findViewById(R.id.recyclerview);
        adapter = new KeluargaAdapter(keluargaArrayList);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(MainActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }

    private void addData() {
        keluargaArrayList = new ArrayList<>();
        keluargaArrayList.add(new Keluarga("Aznil", "49 Tahun", "Ayah",getDrawable(R.drawable.father) ));
        keluargaArrayList.add(new Keluarga("Katemi", "46 Tahun", "Ibu",getDrawable(R.drawable.mother)));
        keluargaArrayList.add(new Keluarga("Fitri Febrianti", "20 Tahun", "Kakak",getDrawable(R.drawable.sister)));
        keluargaArrayList.add(new Keluarga("Farid Fadlurahman", "13 Tahun", "Adik",getDrawable(R.drawable.brother)));

    }
}
