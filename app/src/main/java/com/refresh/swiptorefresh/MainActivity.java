package com.refresh.swiptorefresh;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
SwipeRefreshLayout swipeRefreshLayout;
TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        swipeRefreshLayout=findViewById(R.id.refresh_layout);
        textView=findViewById(R.id.textview);

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                String refreshText="Refeshed!😉";
                Toast.makeText(MainActivity.this, refreshText, Toast.LENGTH_SHORT).show();
                textView.setText(refreshText);

                swipeRefreshLayout.setRefreshing(false);
            }
        });


    }
}