package com.example.withk.week3_kohsan;

import android.support.design.widget.TabLayout;
import android.support.v4.content.ContextCompat;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ListView;

import com.example.withk.week3_kohsan.Adapter.ListViewAdapter;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity {


    private ViewPager viewPager;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = (ViewPager) findViewById(R.id.container);

        // listview 영역
        ListView listView = (ListView) findViewById(R.id.list_view);
        ArrayList<ListViewItem> data = new ArrayList<>();

        ListViewItem item1 = new ListViewItem(R.drawable.avatar,"고산", "like star");
        ListViewItem item2 = new ListViewItem(R.drawable.avatar,"고산", "like star");

        for (int i = 0; i < 10 ; i++) {
            data.add(item1);
            data.add(item2);
        }

        ListViewAdapter adapter = new ListViewAdapter(this, R.layout.list_view_item, data);
        listView.setAdapter(adapter);
    }
}