package com.example.android1hometask3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText editText;

    RecyclerView recyclerView;
    MainAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setContentView(R.layout.activity_main);
        super.onCreate(savedInstanceState);
        recyclerView = findViewById(R.id.recycler_view);
        adapter = new MainAdapter();
        recyclerView.setAdapter(adapter);
        editText = findViewById(R.id.edit_text);
    }

    public void Show_text(View view) {
        String text = editText.getText().toString();
        adapter.addText(text);


    }

}
