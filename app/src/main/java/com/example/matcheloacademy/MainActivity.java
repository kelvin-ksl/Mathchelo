package com.example.matcheloacademy;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.text.DateFormatSymbols;
import java.util.zip.DataFormatException;

public class MainActivity extends AppCompatActivity {

    ListView lvAulas;
    String mNome[] = {"Algebra","Aritmética","Geometria","Análise Matemática"};
    String mDescricao[] = {"a","b","c","d"};
    int mImagem[] = {R.drawable.ic_baseline_star_24,R.drawable.ic_dashboard_black_24dp,R.drawable.ic_home_black_24dp,R.drawable.ic_notifications_black_24dp};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);

        //Começo do ListView
        lvAulas = findViewById(R.id.lvAulas);

        MyAdapter adapter = new MyAdapter(this , mNome, mDescricao, mImagem);
        lvAulas.setAdapter(adapter);

        lvAulas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Toast.makeText(MainActivity.this,"a", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this,"b", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this,"c", Toast.LENGTH_SHORT).show();
                }
                if (position == 0) {
                    Toast.makeText(MainActivity.this,"d", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
    class MyAdapter extends ArrayAdapter<String> {
        Context context;
        String rNome[];
        String rDescricao[];
        int rImagem[];

        MyAdapter (Context c, String nome[], String descricao[], int imagem[]) {
            super(c,R.layout.lista_objetos,R.id.textView1, nome);
            this.context = c;
            this.rNome = nome;
            this.rDescricao = descricao;
            this.rImagem = imagem;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View lista_objetos = layoutInflater.inflate(R.layout.lista_objetos, parent, false);
            ImageView myImagem = lista_objetos.findViewById(R.id.image);
            TextView myNome = lista_objetos.findViewById(R.id.textView1);
            TextView myDescricao = lista_objetos.findViewById(R.id.textView2);

            myImagem.setImageResource(rImagem[position]);
            myNome.setText(rNome[position]);
            myDescricao.setText(rDescricao[position]);

            return lista_objetos;
        }
    }
}
