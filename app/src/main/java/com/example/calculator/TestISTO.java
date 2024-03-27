    package com.example.calculator;

    import android.graphics.drawable.BitmapDrawable;
    import android.os.Bundle;
    import android.util.Log;
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
        //array 4 number for current position
        //array 4 number for next position
        //    This below three lines of code for shuffling random 8 images(Front-4 and back-4) into 4 imageView
        private List<Integer> allImageResRandom;
        private List<Integer> selectedImageResRandom;
        private List<ImageView> lstImgRandom;

        //  This below three lines of code for get imageView id if image are place into them : image 4 and imageView 100
        private List<Integer> allImageResDashBoard;
        private List<ImageView> lstImgDashboard;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            getSupportActionBar().hide();
            setContentView(R.layout.activity_test_isto);
            startBtn = findViewById(R.id.startBtn);

    //        Random image shuffling
            allImageResRandom = new ArrayList<>();
            allImageResRandom.add(R.drawable.back1);
            allImageResRandom.add(R.drawable.back2);
            allImageResRandom.add(R.drawable.back3);
            allImageResRandom.add(R.drawable.back4);
            allImageResRandom.add(R.drawable.front1);
            allImageResRandom.add(R.drawable.front2);
            allImageResRandom.add(R.drawable.front3);
            allImageResRandom.add(R.drawable.front4);

            selectedImageResRandom = new ArrayList<>();
            lstImgRandom = new ArrayList<>();
            lstImgRandom.add(findViewById(R.id.imageView1));
            lstImgRandom.add(findViewById(R.id.imageView2));
            lstImgRandom.add(findViewById(R.id.imageView3));
            lstImgRandom.add(findViewById(R.id.imageView4));


    //        Dashboard
            allImageResDashBoard = new ArrayList<>();
            allImageResDashBoard.add(R.drawable.p1);
            allImageResDashBoard.add(R.drawable.p2);
            allImageResDashBoard.add(R.drawable.p3);
            allImageResDashBoard.add(R.drawable.p4);

            lstImgDashboard = new ArrayList<>();
            lstImgDashboard.add(findViewById(R.id.A1_P1_0));
            lstImgDashboard.add(findViewById(R.id.A2_P2_0));
            lstImgDashboard.add(findViewById(R.id.A3_P3_0));
            lstImgDashboard.add(findViewById(R.id.A4_P4_0));
            lstImgDashboard.add(findViewById(R.id.A1_P1_1));
            lstImgDashboard.add(findViewById(R.id.A2_P2_1));
            lstImgDashboard.add(findViewById(R.id.A3_P3_1));
            lstImgDashboard.add(findViewById(R.id.A4_P4_1));
            lstImgDashboard.add(findViewById(R.id.A1_P1_2));
            lstImgDashboard.add(findViewById(R.id.A2_P2_2));
            lstImgDashboard.add(findViewById(R.id.A3_P3_2));
            lstImgDashboard.add(findViewById(R.id.A4_P4_2));
            lstImgDashboard.add(findViewById(R.id.A1_P1_3));
            lstImgDashboard.add(findViewById(R.id.A2_P2_3));
            lstImgDashboard.add(findViewById(R.id.A3_P3_3));
            lstImgDashboard.add(findViewById(R.id.A4_P4_3));
            lstImgDashboard.add(findViewById(R.id.A1_P1_4));
            lstImgDashboard.add(findViewById(R.id.A2_P2_4));
            lstImgDashboard.add(findViewById(R.id.A3_P3_4));
            lstImgDashboard.add(findViewById(R.id.A4_P4_4));
            lstImgDashboard.add(findViewById(R.id.A1_P1_5));
            lstImgDashboard.add(findViewById(R.id.A2_P2_5));
            lstImgDashboard.add(findViewById(R.id.A3_P3_5));
            lstImgDashboard.add(findViewById(R.id.A4_P4_5));
            lstImgDashboard.add(findViewById(R.id.A1_P1_6));
            lstImgDashboard.add(findViewById(R.id.A2_P2_6));
            lstImgDashboard.add(findViewById(R.id.A3_P3_6));
            lstImgDashboard.add(findViewById(R.id.A4_P4_6));
            lstImgDashboard.add(findViewById(R.id.A1_P1_7));
            lstImgDashboard.add(findViewById(R.id.A2_P2_7));
            lstImgDashboard.add(findViewById(R.id.A3_P3_7));
            lstImgDashboard.add(findViewById(R.id.A4_P4_7));
            lstImgDashboard.add(findViewById(R.id.A1_P1_8));
            lstImgDashboard.add(findViewById(R.id.A2_P2_8));
            lstImgDashboard.add(findViewById(R.id.A3_P3_8));
            lstImgDashboard.add(findViewById(R.id.A4_P4_8));
            lstImgDashboard.add(findViewById(R.id.A1_P1_9));
            lstImgDashboard.add(findViewById(R.id.A2_P2_9));
            lstImgDashboard.add(findViewById(R.id.A3_P3_9));
            lstImgDashboard.add(findViewById(R.id.A4_P4_9));
            lstImgDashboard.add(findViewById(R.id.A1_P1_10));
            lstImgDashboard.add(findViewById(R.id.A2_P2_10));
            lstImgDashboard.add(findViewById(R.id.A3_P3_10));
            lstImgDashboard.add(findViewById(R.id.A4_P4_10));
            lstImgDashboard.add(findViewById(R.id.A1_P1_11));
            lstImgDashboard.add(findViewById(R.id.A2_P2_11));
            lstImgDashboard.add(findViewById(R.id.A3_P3_11));
            lstImgDashboard.add(findViewById(R.id.A4_P4_11));
            lstImgDashboard.add(findViewById(R.id.A1_P1_12));
            lstImgDashboard.add(findViewById(R.id.A2_P2_12));
            lstImgDashboard.add(findViewById(R.id.A3_P3_12));
            lstImgDashboard.add(findViewById(R.id.A4_P4_12));
            lstImgDashboard.add(findViewById(R.id.A1_P1_13));
            lstImgDashboard.add(findViewById(R.id.A2_P2_13));
            lstImgDashboard.add(findViewById(R.id.A3_P3_13));
            lstImgDashboard.add(findViewById(R.id.A4_P4_13));
            lstImgDashboard.add(findViewById(R.id.A1_P1_14));
            lstImgDashboard.add(findViewById(R.id.A2_P2_14));
            lstImgDashboard.add(findViewById(R.id.A3_P3_14));
            lstImgDashboard.add(findViewById(R.id.A4_P4_14));
            lstImgDashboard.add(findViewById(R.id.A1_P1_15));
            lstImgDashboard.add(findViewById(R.id.A2_P2_15));
            lstImgDashboard.add(findViewById(R.id.A3_P3_15));
            lstImgDashboard.add(findViewById(R.id.A4_P4_15));
            lstImgDashboard.add(findViewById(R.id.A1_P1_16));
            lstImgDashboard.add(findViewById(R.id.A2_P2_16));
            lstImgDashboard.add(findViewById(R.id.A3_P3_16));
            lstImgDashboard.add(findViewById(R.id.A4_P4_16));
            lstImgDashboard.add(findViewById(R.id.A1_P1_17));
            lstImgDashboard.add(findViewById(R.id.A2_P2_17));
            lstImgDashboard.add(findViewById(R.id.A3_P3_17));
            lstImgDashboard.add(findViewById(R.id.A4_P4_17));
            lstImgDashboard.add(findViewById(R.id.A1_P1_18));
            lstImgDashboard.add(findViewById(R.id.A2_P2_18));
            lstImgDashboard.add(findViewById(R.id.A3_P3_18));
            lstImgDashboard.add(findViewById(R.id.A4_P4_18));
            lstImgDashboard.add(findViewById(R.id.A1_P1_19));
            lstImgDashboard.add(findViewById(R.id.A2_P2_19));
            lstImgDashboard.add(findViewById(R.id.A3_P3_19));
            lstImgDashboard.add(findViewById(R.id.A4_P4_19));
            lstImgDashboard.add(findViewById(R.id.A1_P1_20));
            lstImgDashboard.add(findViewById(R.id.A2_P2_20));
            lstImgDashboard.add(findViewById(R.id.A3_P3_20));
            lstImgDashboard.add(findViewById(R.id.A4_P4_20));
            lstImgDashboard.add(findViewById(R.id.A1_P1_21));
            lstImgDashboard.add(findViewById(R.id.A2_P2_21));
            lstImgDashboard.add(findViewById(R.id.A3_P3_21));
            lstImgDashboard.add(findViewById(R.id.A4_P4_21));
            lstImgDashboard.add(findViewById(R.id.A1_P1_22));
            lstImgDashboard.add(findViewById(R.id.A2_P2_22));
            lstImgDashboard.add(findViewById(R.id.A3_P3_22));
            lstImgDashboard.add(findViewById(R.id.A4_P4_22));
            lstImgDashboard.add(findViewById(R.id.A1_P1_23));
            lstImgDashboard.add(findViewById(R.id.A2_P2_23));
            lstImgDashboard.add(findViewById(R.id.A3_P3_23));
            lstImgDashboard.add(findViewById(R.id.A4_P4_23));
            lstImgDashboard.add(findViewById(R.id.A1_P1_24));
            lstImgDashboard.add(findViewById(R.id.A2_P2_24));
            lstImgDashboard.add(findViewById(R.id.A3_P3_24));
            lstImgDashboard.add(findViewById(R.id.A4_P4_24));

            startBtn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    onRandomizeButtonClick();
                    updateImageViews();
                    showImageNameInRandom();
                }
            });
        }

        // This code randomly selects 4 images out of 8
        public void onRandomizeButtonClick() {
            Collections.shuffle(allImageResRandom);
            selectedImageResRandom.clear();
            selectedImageResRandom.addAll(allImageResRandom.subList(0, 4));
        }

        // This code updates the ImageView elements with the selected images
        // This code updates the ImageView elements with the selected images
        private void updateImageViews() {
            for (int i = 0; i < selectedImageResRandom.size() && i < lstImgRandom.size(); i++) {
                lstImgRandom.get(i).setImageResource(selectedImageResRandom.get(i));
            }
        }


        // This code retrieves the name of the currently displayed image and shows it in a Toast
        private void showImageNameInRandom() {
            int frontCount = 0;

            // Count the number of front images
            for (Integer imageRes : selectedImageResRandom) {
                if (isFront(imageRes)) {
                    frontCount++;
                }
            }

            // Move images forward in lstImgDashboard based on front count
            if (frontCount > 0) {
                for (int i = 0; i < frontCount; i++) {
                    int newImageIndex = i + frontCount;
                    if (newImageIndex <= 24) {
                        int resourceId = getResources().getIdentifier("A" + (i + 1) + "_P" + (i + 1) + "_" + newImageIndex, "id", getPackageName());
                        ImageView newImageView = findViewById(resourceId);
                        newImageView.setImageResource(allImageResDashBoard.get(i));
                    }}}

            // Show the toast message
            showToast("Moved " + frontCount + " images forward in lstImgDashboard.");
        }


        // Check if the image is a front image
        private boolean isFront(int imageRes) {
            return imageRes == R.drawable.front1 || imageRes == R.drawable.front2 ||
                    imageRes == R.drawable.front3 || imageRes == R.drawable.front4;
        }

        // Helper method to display a Toast message
        private void showToast(String message) {
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
        }

        // This method for retrieve the image resource name in randomly move
        private String getResourceName(int resourceId) {
            return getResources().getResourceEntryName(resourceId);
        }
    }
