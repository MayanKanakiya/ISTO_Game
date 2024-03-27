package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.Toast;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ISTO extends AppCompatActivity {
    Button btn;
    List<Integer> imageRes;
    List<ImageView> lstImg;
    GridLayout gridLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_isto);

        btn = findViewById(R.id.startBtn);
        gridLayout = findViewById(R.id.gridLayout);

        imageRes = new ArrayList<>();
        imageRes.add(R.drawable.front1);
        imageRes.add(R.drawable.front2);
        imageRes.add(R.drawable.front3);
        imageRes.add(R.drawable.front4);
        imageRes.add(R.drawable.back1);
        imageRes.add(R.drawable.back2);
        imageRes.add(R.drawable.back3);
        imageRes.add(R.drawable.back4);


        lstImg = new ArrayList<>();
        lstImg.add(findViewById(R.id.imageView1));
        lstImg.add(findViewById(R.id.imageView2));
        lstImg.add(findViewById(R.id.imageView3));
        lstImg.add(findViewById(R.id.imageView4));

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRandomizeButtonClick(v);
            }
        });
    }

    public void onRandomizeButtonClick(View v) {
        Collections.shuffle(imageRes);
        updateImageViews();
    }

    private void updateImageViews() {
        for (int i = 0; i < imageRes.size(); i++) {
            lstImg.get(i).setImageResource(imageRes.get(i));
        }
    }
}
