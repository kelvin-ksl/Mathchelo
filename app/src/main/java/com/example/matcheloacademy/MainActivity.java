package com.example.matcheloacademy;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    ListView listView;

    String[] fruitNames = {"Algebra","Orange","Kiwi","Melancia","Banana"};
    int[] fruitImages = {R.drawable.algebra,R.drawable.oranges,R.drawable.kiwi,R.drawable.watermelon,R.drawable.banana};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //finding listview
        listView = findViewById(R.id.listview);

        CustomAdapter customAdapter = new CustomAdapter();
        listView.setAdapter(customAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
//                Toast.makeText(getApplicationContext(),fruitNames[i],Toast.LENGTH_LONG).show();
                Intent intent = new Intent(getApplicationContext(),listdata.class);
                intent.putExtra("name",fruitNames[i]);
                intent.putExtra("image",fruitImages[i]);
                startActivity(intent);

            }
        });


    }

    private class CustomAdapter extends BaseAdapter{
        @Override
        public int getCount() {
            return fruitImages.length;
        }

        @Override
        public Object getItem(int i) {
            return null;
        }

        @Override
        public long getItemId(int i) {
            return 0;
        }

        @Override
        public View getView(int i, View view, ViewGroup viewGroup) {
            View view1 = getLayoutInflater().inflate(R.layout.activity_listdata,null);
            //getting view in row_data
            TextView name = view1.findViewById(R.id.fruits);
            ImageView image = view1.findViewById(R.id.images);

            name.setText(fruitNames[i]);
            image.setImageResource(fruitImages[i]);
            return view1;
        }
    }
}
