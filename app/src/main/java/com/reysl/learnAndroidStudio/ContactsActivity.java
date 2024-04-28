package com.reysl.learnAndroidStudio;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class ContactsActivity extends AppCompatActivity {

    String[] namesArr = new String[] {"John", "George", "Josh", "Bob", "Alex"};
    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contacts);

        listView = findViewById(R.id.listView);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.name_item, R.id.user_name, namesArr);
        listView.setAdapter(adapter);
    }

    public void goHome(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}