package com.example.calculator;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestISTO extends AppCompatActivity {
    private Button startBtn;
    private Button A1Btn;
    private Button A2Btn;
    private Button A3Btn;
    private Button A4Btn;
    private List<Integer> allImageRes;
    private List<Integer> selectedImageRes;
    private List<ImageView> lstImg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_isto);
        startBtn = findViewById(R.id.startBtn);

        allImageRes = new ArrayList<>();
        allImageRes.add(R.drawable.back1);
        allImageRes.add(R.drawable.back2);
        allImageRes.add(R.drawable.back3);
        allImageRes.add(R.drawable.back4);
        allImageRes.add(R.drawable.front1);
        allImageRes.add(R.drawable.front2);
        allImageRes.add(R.drawable.front3);
        allImageRes.add(R.drawable.front4);

        selectedImageRes = new ArrayList<>();
        lstImg = new ArrayList<>();
        lstImg.add(findViewById(R.id.imageView1));
        lstImg.add(findViewById(R.id.imageView2));
        lstImg.add(findViewById(R.id.imageView3));
        lstImg.add(findViewById(R.id.imageView4));

        startBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onRandomizeButtonClick();
                updateImageViews();
                showImageNameInToast();
            }
        });
//        This is the code to choose which player can take forword - start here
        
//        This is the code to choose which player can take forword - end here
    }

    // This code randomly selects 4 images out of 8
    public void onRandomizeButtonClick() {
        Collections.shuffle(allImageRes);
        selectedImageRes.clear();
        selectedImageRes.addAll(allImageRes.subList(0, 4));
    }

    // This code updates the ImageView elements with the selected images
    private void updateImageViews() {
        for (int i = 0; i < selectedImageRes.size(); i++) {
            lstImg.get(i).setImageResource(selectedImageRes.get(i));
        }
    }

    // This code retrieves the name of the currently displayed image and shows it in a Toast
    private void showImageNameInToast() {
        StringBuilder toastMessage = new StringBuilder();
        for (int i = 0; i < lstImg.size(); i++) {
            ImageView imageView = lstImg.get(i);
            int resourceId = selectedImageRes.get(i);
            String resourceName = getResourceName(resourceId);
            toastMessage.append("Image of ImageView ").append(i + 1).append(": ").append(resourceName).append("\n");
        }
        showToast(toastMessage.toString());
    }

    private String getResourceName(int resourceId) {
        return getResources().getResourceEntryName(resourceId);
    }


    // Helper method to display a Toast message
    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
