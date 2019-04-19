package com.example.android.takehomeassignment07;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<President> presidents;
    PresidentAdapter adapter;
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialData(); //notice we call the method in onCreate. why here?

        recyclerView = findViewById(R.id.recycler_view);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new PresidentAdapter(presidents, this);
        recyclerView.setAdapter(adapter);
    }

    private void initialData() {
        presidents = new ArrayList<>();
        presidents.add(new President("Bill Clinton", "1993-2001", R.drawable.clinton));
        presidents.add(new President("George W. Bush", "2001-2009", R.drawable.bush));
        presidents.add(new President("Barack Obama", "2009-2017", R.drawable.obama));
        presidents.add(new President("Bill Clinton", "1993-2001", R.drawable.clinton));
        presidents.add(new President("George W. Bush", "2001-2009", R.drawable.bush));
        presidents.add(new President("Barack Obama", "2009-2017", R.drawable.obama));
        presidents.add(new President("Bill Clinton", "1993-2001", R.drawable.clinton));
        presidents.add(new President("George W. Bush", "2001-2009", R.drawable.bush));
        presidents.add(new President("Barack Obama", "2009-2017", R.drawable.obama));
    }


    public boolean onCreateOptionsMenu (Menu menu){
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected (MenuItem item){
        switch (item.getItemId()) {
            case R.id.save:
                Toast.makeText(this, "Saved", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.share:
                Toast.makeText(this, "Share it baby", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void shareIt (MenuItem item){
        Toast.makeText(this, "Share it baby", Toast.LENGTH_SHORT).show();
    }

}