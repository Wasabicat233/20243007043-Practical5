package com.example.practicalfive;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Municipality extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_municipality);

        TextProcessor processor = new TextProcessor();
        String inputCity = getIntent().getStringExtra("city_name");
        String validCity = processor.processMunicipality(inputCity);

        TextView tvCityName = findViewById(R.id.tv_city_name);
        ImageView ivCityPic = findViewById(R.id.iv_city);
        TextView tvInfo = findViewById(R.id.tv_info);
        Button btnVisit = findViewById(R.id.btn_visit);

        if (validCity == null) {
            finish();
            return;
        }

        tvCityName.setText(validCity);

        switch (validCity) {
            case "Beijing":
                ivCityPic.setImageResource(R.drawable.beijing);
                break;
            case "Shanghai":
                ivCityPic.setImageResource(R.drawable.shanghai);
                break;
            case "Tianjin":
                ivCityPic.setImageResource(R.drawable.tianjin);
                break;
            case "Chongqing":
                ivCityPic.setImageResource(R.drawable.chongqing);
                break;
        }
    }
}
