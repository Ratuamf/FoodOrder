package com.example.ngeunah;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.ngeunah.Adapter.FoodAdapter;
import com.example.ngeunah.Model.Food;

import java.util.ArrayList;

public class MenuActivity extends AppCompatActivity {
    public static final int REQUEST_CODE =1;
    FoodAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        final ArrayList<Food> foods = new ArrayList<>();

        foods.add(new Food("CAH KANGKUNG", R.drawable.b2, 10000,"- Pilih Makanan atau Minuman \n- Kirim permintaan Max jam 10 AM \n- Makanan diantar jam 11.30 AM \n- Bayar Cash \n -Tidak ada pembatalan pesanan \n -Pemesanan hanya untuk wilayah cikupa-curug-tigaraksa"));
        foods.add(new Food("KENTANG ATI BALADO", R.drawable.b3, 15000,"- Pilih Makanan atau Minuman \n- Kirim permintaan Max jam 10 AM \n- Makanan diantar jam 11.30 AM \n- Bayar Cash \n -Tidak ada pembatalan pesanan \n -Pemesanan hanya untuk wilayah cikupa-curug-tigaraksa"));
        foods.add(new Food("SAYUR ASEM ", R.drawable.b4, 10000,"- Pilih Makanan atau Minuman \n- Kirim permintaan Max jam 10 AM \n- Makanan diantar jam 11.30 AM \n- Bayar Cash \n -Tidak ada pembatalan pesanan \n -Pemesanan hanya untuk wilayah cikupa-curug-tigaraksa"));
        foods.add(new Food("SAYUR KACANG PANJANG", R.drawable.b6, 10000,"- Pilih Makanan atau Minuman \n- Kirim permintaan Max jam 10 AM \n- Makanan diantar jam 11.30 AM \n- Bayar Cash \n -Tidak ada pembatalan pesanan \n -Pemesanan hanya untuk wilayah cikupa-curug-tigaraksa"));
        foods.add(new Food("ES CENDOL", R.drawable.b1, 5000,"- Pilih Makanan atau Minuman\n- Kirim permintaan Max jam 10 AM \n- Makanan diantar jam 11.30 AM \n- Bayar Cash \n -Tidak ada pembatalan pesanan \n -Pemesanan hanya untuk wilayah cikupa-curug-tigaraksa"));
        foods.add(new Food("ES TEH MANIS", R.drawable.b5, 5000,"- Pilih Makanan atau Minuman\n- Kirim permintaan Max jam 10 AM \n- Makanan diantar jam 11.30 AM \n- Bayar Cash \n -Tidak ada pembatalan pesanan \n -Pemesanan hanya untuk wilayah cikupa-curug-tigaraksa"));

        adapter = new FoodAdapter(this, foods);
        ListView orderListView = (ListView) findViewById(R.id.order_list_view);
        orderListView.setAdapter(adapter);
        orderListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent i = new Intent(MenuActivity.this, FoodDetailActivity.class);
                Food currentFood = foods.get(position);
                Log.e("FOOD NAME",currentFood.getFoodName());
                i.putExtra("name", currentFood.getFoodName());
                i.putExtra("image", currentFood.getmImageResouce());
                i.putExtra("price", currentFood.getFoodPrice());
                i.putExtra("type",currentFood.getType());
                startActivity(i);
            }
        });
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return super.onCreateOptionsMenu(menu);  }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_cart:
                Intent i = new Intent(MenuActivity.this, CartListActivity.class);
                startActivity(i);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

