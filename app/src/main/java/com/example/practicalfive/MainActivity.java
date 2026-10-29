package com.example.practicalfive;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_CITY = "city_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextProcessor processor = new TextProcessor();
        EditText etInput = findViewById(R.id.et_input_city);

        etInput.setOnEditorActionListener((v, actionId, event) -> {
            String rawText = etInput.getText().toString();
            String cityName = processor.processMunicipality(rawText);

            if (cityName == null) {
                Toast.makeText(MainActivity.this, "Invalid municipality name", Toast.LENGTH_SHORT).show();
                return true;
            }
            Intent intent = new Intent(MainActivity.this, Municipality.class);
            intent.putExtra(EXTRA_CITY, cityName);
            startActivity(intent);
            return true;
        });
    }
}
