package com.example.homework43;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    List<Plant> plants = new ArrayList<Plant>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        SetInitialData();

        RecyclerView recyclerView = findViewById(R.id.viewrec);

        PlantAdapter plantAdapter = new PlantAdapter(this.getLayoutInflater(), plants);

        recyclerView.setAdapter(plantAdapter);
    }
    private void SetInitialData(){
        plants.add(new Plant("Боярышник", "Род листопадных, редко полувечнозелёных высоких кустарников или небольших деревьев, относящихся к семейству Розовые",
                R.drawable.boyar, "380"));
        plants.add(new Plant("Подорожник", "Род одно- и многолетних трав, реже полукустарников семейства Подорожниковые (Plantaginaceae)",
                R.drawable.podoroj, "158"));
        plants.add(new Plant("Шиповник", "Род растений семейства Розовые (Rosaceae) порядка Розоцветные (Rosales)",
                R.drawable.ship, "366"));
        plants.add(new Plant("Герань", "Род семейства Гераниевые",
                R.drawable.geran, "400+"));
        plants.add(new Plant("Берёза", "Род листопадных деревьев и кустарников семейства Берёзовые (Betulaceae)",
                R.drawable.bereza, "120+"));

    }

    }
