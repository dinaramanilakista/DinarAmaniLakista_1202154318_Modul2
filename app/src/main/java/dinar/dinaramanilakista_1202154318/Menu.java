package dinar.dinaramanilakista_1202154318;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.v7.app.AlertController;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.view.menu.MenuAdapter;
import android.widget.AbsListView;

import java.util.LinkedList;


public class Menu extends AppCompatActivity {

    // untuk deklarasi objek
    private final LinkedList<String> foods = new LinkedList<>();
    private final LinkedList<Integer> priceses = new LinkedList<>();
    private final LinkedList<Integer> photos = new LinkedList<>();
    private int mCount = 0;

    private RecyclerView mRecyclerView;
    private MenuAdapter mAdapter;

    // method ketika dijalankan saat activity dibuat
    @SuppressLint("RestrictedApi")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymenu);
        dummiesData();
        mRecyclerView = (recyclerView) findViewById(R.id.recyclerview);
        // membuat adapter dan memanggil data yang akan ditampilkan
        mAdapter = new MenuAdapter(this, foods, priceses, photos);
        // menghubungkan adaptor dengan RecyclerView.
        mRecyclerView.setAdapter(mAdapter);
        // memberikan RecyclerView sebagai pengelola tata letak default.
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

    private void dummiesData(){
        for (int i = 0;i < 3; i++){
            // memberi dan memanggil nama untuk data yang ditampilkan
            foods.add("bubur");
            foods.add("coffe");
            foods.add("cupcake");
            foods.add("donat");
            foods.add("juice");
            foods.add("kentang");
            foods.add("puding");
            foods.add("roti");
            foods.add("teh");
            foods.add("shoecake");

            // mamanggil harga
            priceses.add(2000);
            priceses.add(30000);
            priceses.add(200000);
            priceses.add(25000);
            priceses.add(25000);
            priceses.add(20000);
            priceses.add(20000);
            priceses.add(10000);
            priceses.add(10000);

            // memanggil foto yang ada di drawable
            photos.add(R.drawable.coffe);
            photos.add(R.drawable.cupcake);
            photos.add(R.drawable.donat);
            photos.add(R.drawable.juice);
            photos.add(R.drawable.kentang);
            photos.add(R.drawable.roti);
            photos.add(R.drawable.shoecake);
            photos.add(R.drawable.puding);
            photos.add(R.drawable.bubur);
        }
    }
}