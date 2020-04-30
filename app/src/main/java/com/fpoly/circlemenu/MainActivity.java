package com.fpoly.circlemenu;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Toast;

import com.hitomi.cmlibrary.CircleMenu;
import com.hitomi.cmlibrary.OnMenuSelectedListener;
import com.hitomi.cmlibrary.OnMenuStatusChangeListener;

public class MainActivity extends AppCompatActivity {
    private CircleMenu circleMenu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initAction();
    }

    private void initAction() {
        // max: 8 addSubMenu
        circleMenu.setMainMenu(Color.parseColor("#CDCDCD"), R.drawable.ic_menu, R.drawable.ic_clear)
                .addSubMenu(Color.parseColor("#258CFF"), R.drawable.ic_flight)
                .addSubMenu(Color.parseColor("#30A400"), R.drawable.ic_local_mall)
                .addSubMenu(Color.parseColor("#FF4B32"), R.drawable.ic_restaurant)
                .addSubMenu(Color.parseColor("#8A39FF"), R.drawable.ic_search)
                .addSubMenu(Color.parseColor("#FF6A00"), R.drawable.ic_settings)
                .setOnMenuSelectedListener(new OnMenuSelectedListener() {

                    @Override
                    public void onMenuSelected(int index) {
                        Toast.makeText(MainActivity.this, "" + index, Toast.LENGTH_SHORT).show();
                    }

                }).setOnMenuStatusChangeListener(new OnMenuStatusChangeListener() {

            @Override
            public void onMenuOpened() {
            }

            @Override
            public void onMenuClosed() {
            }

        });
    }

    private void initView() {
        circleMenu = findViewById(R.id.circle_menu);
    }
}
