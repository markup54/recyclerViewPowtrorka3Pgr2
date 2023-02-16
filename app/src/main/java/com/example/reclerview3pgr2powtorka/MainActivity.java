package com.example.reclerview3pgr2powtorka;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList <Widok> wszystkieWidoki;
    AdapterWidok adapterWidok;

    private  void przygotujWidoki(){
        wszystkieWidoki = new ArrayList<>();
        wszystkieWidoki.add(new Widok(R.drawable.kwiat1, "zwiastun wiosny"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat2, "pełnia lata"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat3, "oznaka jesieni"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat4, "cudny zapach"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat6, "niebiesko mi"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat7, "zwiastun wiosny"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat8, "zwiastun wiosny"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat1, "zwiastun wiosny"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat2, "pełnia lata"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat3, "oznaka jesieni"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat4, "cudny zapach"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat6, "niebiesko mi"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat7, "zwiastun wiosny"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat8, "zwiastun wiosny"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat1, "zwiastun wiosny"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat2, "pełnia lata"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat3, "oznaka jesieni"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat4, "cudny zapach"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat6, "niebiesko mi"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat7, "zwiastun wiosny"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat8, "zwiastun wiosny"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat1, "zwiastun wiosny"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat2, "pełnia lata"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat3, "oznaka jesieni"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat4, "cudny zapach"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat6, "niebiesko mi"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat7, "zwiastun wiosny"));
        wszystkieWidoki.add(new Widok(R.drawable.kwiat8, "zwiastun wiosny"));
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        przygotujWidoki();
        adapterWidok = new AdapterWidok(this,wszystkieWidoki);

    }
}