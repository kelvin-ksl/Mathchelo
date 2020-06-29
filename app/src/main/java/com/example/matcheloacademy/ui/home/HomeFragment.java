package com.example.matcheloacademy.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.loader.content.CursorLoader;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import com.example.matcheloacademy.CoffeeAdapter;
import com.example.matcheloacademy.CoffeeItem;
import com.example.matcheloacademy.R;

public class HomeFragment extends Fragment {

    private ArrayList<CoffeeItem> coffeeItems = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView recyclerView = root.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new CoffeeAdapter(coffeeItems, getActivity()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        coffeeItems.add(new CoffeeItem(R.drawable.coffee01, "Historia da Matemática","0","0", "https://google.com"));
        coffeeItems.add(new CoffeeItem(R.drawable.coffee02, "Álgebra","1","0", "https://monografias.brasilescola.uol.com.br/matematica/historia-matematica.htm"));
        coffeeItems.add(new CoffeeItem(R.drawable.coffee03, "Aritmética","2","0", "https://monografias.brasilescola.uol.com.br/matematica/historia-matematica.htm"));
        coffeeItems.add(new CoffeeItem(R.drawable.coffee04, "Geometria","3","0", "https://www.todamateria.com.br/matematica/geometria"));
        coffeeItems.add(new CoffeeItem(R.drawable.coffee05, "Magic Coffee","4","0", "https://google.com"));
        coffeeItems.add(new CoffeeItem(R.drawable.coffee06, "Swedish Coffee","5","0", "https://google.com"));
        coffeeItems.add(new CoffeeItem(R.drawable.coffee07, "Mint Coffee","6","0", "https://google.com"));
        coffeeItems.add(new CoffeeItem(R.drawable.coffee08, "Espresso","7","0", "https://google.com"));
        coffeeItems.add(new CoffeeItem(R.drawable.coffee09, "Americano","8","0", "https://google.com"));


        return root;
    }
}