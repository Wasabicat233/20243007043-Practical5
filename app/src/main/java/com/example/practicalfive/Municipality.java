package com.example.practicalfive;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import android.content.Intent;
import android.net.Uri;

public class Municipality extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_municipality);

        TextProcessor processor = new TextProcessor();
        String inputCity = getIntent().getStringExtra("city_name");
        String validCity = processor.processMunicipality(inputCity);

        LinearLayout headerBar = findViewById(R.id.header_bar);
        TextView tvCityName = findViewById(R.id.tv_city_name);
        ImageView ivCityPic = findViewById(R.id.iv_city);
        TextView tvInfo = findViewById(R.id.tv_info);
        Button btnVisit = findViewById(R.id.btn_visit);

        if (validCity == null) {
            finish();
            return;
        }

        tvCityName.setText(validCity);
        String intro;
        int textColorRes = android.R.color.black;

        switch (validCity) {
            case "Beijing":
                ivCityPic.setImageResource(R.drawable.beijing);
                headerBar.setBackgroundColor(ContextCompat.getColor(this, R.color.municipality_beijing));
                btnVisit.setBackgroundColor(ContextCompat.getColor(this, R.color.municipality_beijing));
                textColorRes = R.color.municipality_beijing;
                intro = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
                break;
            case "Shanghai":
                ivCityPic.setImageResource(R.drawable.shanghai);
                headerBar.setBackgroundColor(ContextCompat.getColor(this, R.color.municipality_shanghai));
                btnVisit.setBackgroundColor(ContextCompat.getColor(this, R.color.municipality_shanghai));
                textColorRes = R.color.municipality_shanghai;
                intro = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
                break;
            case "Tianjin":
                ivCityPic.setImageResource(R.drawable.tianjin);
                headerBar.setBackgroundColor(ContextCompat.getColor(this, R.color.municipality_tianjin));
                btnVisit.setBackgroundColor(ContextCompat.getColor(this, R.color.municipality_tianjin));
                textColorRes = R.color.municipality_tianjin;
                intro = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
                break;
            case "Chongqing":
                ivCityPic.setImageResource(R.drawable.chongqing);
                headerBar.setBackgroundColor(ContextCompat.getColor(this, R.color.municipality_chongqing));
                btnVisit.setBackgroundColor(ContextCompat.getColor(this, R.color.municipality_chongqing));
                textColorRes = R.color.municipality_chongqing;
                intro = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum. Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
                break;
            default:
                intro = "";
                break;
        }
        tvInfo.setTextColor(ContextCompat.getColor(this, textColorRes));
        tvInfo.setText(intro);

        btnVisit.setOnClickListener(v -> {
            Intent intent = new Intent(Intent.ACTION_VIEW);
            String url = "";
            switch (validCity) {
                case "Beijing":
                    url = "https://www.beijing.gov.cn";
                    break;
                case "Shanghai":
                    url = "https://www.shanghai.gov.cn";
                    break;
                case "Tianjin":
                    url = "https://www.tj.gov.cn";
                    break;
                case "Chongqing":
                    url = "https://www.cq.gov.cn";
                    break;
            }
            intent.setData(Uri.parse(url));
            startActivity(intent);
        });
    }
}
