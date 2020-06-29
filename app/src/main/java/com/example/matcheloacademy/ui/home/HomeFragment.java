package com.example.matcheloacademy.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

import com.example.matcheloacademy.MathAdapter;
import com.example.matcheloacademy.MathItem;
import com.example.matcheloacademy.R;

public class HomeFragment extends Fragment {

    private ArrayList<MathItem> mathItems = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);

        RecyclerView recyclerView = root.findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        recyclerView.setAdapter(new MathAdapter(mathItems, getActivity()));
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        mathItems.add(new MathItem(R.drawable.historia01, "História da Matemática","0","0", "https://monografias.brasilescola.uol.com.br/matematica/historia-matematica.htm"));
        mathItems.add(new MathItem(R.drawable.algebra01, "Introdução à Álgebra","1","0", "https://www.kuadro.com.br/posts/introducao-a-algebra-variaveis/"));
        mathItems.add(new MathItem(R.drawable.aritmetica01, "Introdução à Aritmética","2","0", "https://resumos.mesalva.com/introducao-aritmetica-operacoes-basicas/"));
        mathItems.add(new MathItem(R.drawable.geometria01, "Introdução à Geometria","3","0", "https://mundoeducacao.uol.com.br/matematica/geometria-1.htm"));
        mathItems.add(new MathItem(R.drawable.alglinear01, "Álgebra Linear","4","0", "https://www.infoescola.com/matematica/algebra-linear/"));
        mathItems.add(new MathItem(R.drawable.algbooleana01, "Álgebra Booleana","5","0", "https://brasilescola.uol.com.br/informatica/algebra-booleana.htm"));
        mathItems.add(new MathItem(R.drawable.geoplana01, "Geometria Plana","6","0", "https://www.maisbolsas.com.br/enem/matematica/geometria-plana-conceitos-e-formulas"));
        mathItems.add(new MathItem(R.drawable.geoespacial01, "Geometria Espacial","7","0", "https://www.educamaisbrasil.com.br/enem/matematica/geometria-espacial"));
        mathItems.add(new MathItem(R.drawable.geoanalitica01, "Geometria Analítica","8","0", "https://mundoeducacao.uol.com.br/matematica/geometria-analitica.htm"));


        return root;
    }
}