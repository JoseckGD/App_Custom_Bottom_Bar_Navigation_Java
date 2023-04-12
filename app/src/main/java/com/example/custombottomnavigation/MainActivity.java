package com.example.custombottomnavigation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.ScaleAnimation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int selectedTab = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final LinearLayout homeLayout = findViewById(R.id.homeLayout);
        final LinearLayout likeLayout = findViewById(R.id.likeLayout);
        final LinearLayout notificationLayout = findViewById(R.id.notificationLayout);
        final LinearLayout profileLayout = findViewById(R.id.profileLayout);

        final ImageView homeImage = findViewById(R.id.homeImage);
        final ImageView likeImage = findViewById(R.id.likeImage);
        final ImageView notificationImage = findViewById(R.id.notificationImage);
        final ImageView profileImage = findViewById(R.id.profileImage);

        final TextView homeText = findViewById(R.id.homeText);
        final TextView likeText = findViewById(R.id.likeText);
        final TextView notificationText = findViewById(R.id.notificationText);
        final TextView profileText = findViewById(R.id.profileText);

        //==========================================================================================

        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(getResources().getColor(R.color.home));

        getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.fragmentContainer, HomeFragment.class, null).commit();


        homeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedTab!=1){

                    window.setStatusBarColor(getResources().getColor(R.color.home));

                    getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.fragmentContainer, HomeFragment.class, null).commit();

                    likeText.setVisibility(View.GONE);
                    notificationText.setVisibility(View.GONE);
                    profileText.setVisibility(View.GONE);

                    likeImage.setImageResource(R.drawable.like_icon);
                    notificationImage.setImageResource(R.drawable.notifications_icon);
                    profileImage.setImageResource(R.drawable.profile_icon);

                    likeLayout.setBackgroundColor(Color.TRANSPARENT);
                    notificationLayout.setBackgroundColor(Color.TRANSPARENT);
                    profileLayout.setBackgroundColor(Color.TRANSPARENT);

                    homeText.setVisibility(View.VISIBLE);
                    homeImage.setImageResource(R.drawable.home_icon_selected);
                    homeLayout.setBackgroundResource(R.drawable.round_back_home_100);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f,1f,1f, Animation.RELATIVE_TO_SELF, 0.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);

                    homeLayout.startAnimation(scaleAnimation);

                    selectedTab=1;
                }
            }
        });


        likeLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedTab!=2){

                    window.setStatusBarColor(getResources().getColor(R.color.like));

                    getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.fragmentContainer, LikeFragment.class, null).commit();

                    homeText.setVisibility(View.GONE);
                    notificationText.setVisibility(View.GONE);
                    profileText.setVisibility(View.GONE);

                    homeImage.setImageResource(R.drawable.home_icon);
                    notificationImage.setImageResource(R.drawable.notifications_icon);
                    profileImage.setImageResource(R.drawable.profile_icon);

                    homeLayout.setBackgroundColor(Color.TRANSPARENT);
                    notificationLayout.setBackgroundColor(Color.TRANSPARENT);
                    profileLayout.setBackgroundColor(Color.TRANSPARENT);

                    likeText.setVisibility(View.VISIBLE);
                    likeImage.setImageResource(R.drawable.like_icon_selected);
                    likeLayout.setBackgroundResource(R.drawable.round_back_like_100);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f,1f,1f, Animation.RELATIVE_TO_SELF, 1.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);

                    likeLayout.startAnimation(scaleAnimation);

                    selectedTab=2;
                }
            }
        });


        notificationLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedTab!=3){

                    window.setStatusBarColor(getResources().getColor(R.color.notification));

                    getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.fragmentContainer, NotificationFragment.class, null).commit();

                    homeText.setVisibility(View.GONE);
                    likeText.setVisibility(View.GONE);
                    profileText.setVisibility(View.GONE);

                    homeImage.setImageResource(R.drawable.home_icon);
                    likeImage.setImageResource(R.drawable.like_icon);
                    profileImage.setImageResource(R.drawable.profile_icon);

                    homeLayout.setBackgroundColor(Color.TRANSPARENT);
                    likeLayout.setBackgroundColor(Color.TRANSPARENT);
                    profileLayout.setBackgroundColor(Color.TRANSPARENT);

                    notificationText.setVisibility(View.VISIBLE);
                    notificationImage.setImageResource(R.drawable.notifications_icon_selected);
                    notificationLayout.setBackgroundResource(R.drawable.round_back_notification_100);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f,1f,1f, Animation.RELATIVE_TO_SELF, 1.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);

                    notificationLayout.startAnimation(scaleAnimation);

                    selectedTab=3;
                }
            }
        });


        profileLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (selectedTab!=4){

                    window.setStatusBarColor(getResources().getColor(R.color.profile));

                    getSupportFragmentManager().beginTransaction().setReorderingAllowed(true).replace(R.id.fragmentContainer, ProfileFragment.class, null).commit();

                    homeText.setVisibility(View.GONE);
                    likeText.setVisibility(View.GONE);
                    notificationText.setVisibility(View.GONE);

                    homeImage.setImageResource(R.drawable.home_icon);
                    likeImage.setImageResource(R.drawable.like_icon);
                    notificationImage.setImageResource(R.drawable.notifications_icon);

                    homeLayout.setBackgroundColor(Color.TRANSPARENT);
                    likeLayout.setBackgroundColor(Color.TRANSPARENT);
                    notificationLayout.setBackgroundColor(Color.TRANSPARENT);

                    profileText.setVisibility(View.VISIBLE);
                    profileImage.setImageResource(R.drawable.profile_icon_selected);
                    profileLayout.setBackgroundResource(R.drawable.round_back_profile_100);

                    ScaleAnimation scaleAnimation = new ScaleAnimation(0.8f, 1.0f,1f,1f, Animation.RELATIVE_TO_SELF, 1.0f, Animation.RELATIVE_TO_SELF, 0.0f);
                    scaleAnimation.setDuration(200);
                    scaleAnimation.setFillAfter(true);

                    profileLayout.startAnimation(scaleAnimation);

                    selectedTab=4;
                }
            }
        });


    }
}