package com.example.ch07_menu;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout baseLayout;
    Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("배경색 바꾸기");
        baseLayout = (LinearLayout) findViewById(R.id.baseLayout);
        button1 = (Button) findViewById(R.id.button1);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // 메뉴를 화면에 출력하는 2가지 방식
        // 1. XML 사용 (추천)
//      MenuInflater menuInflater = getMenuInflater();
//      menuInflater.inflate(R.menu.menu1, menu);
//      return super.onCreateOptionsMenu(menu);

        // 2. java에서 직접 메소드로 메뉴항목 추가 (비추천)
        super.onCreateOptionsMenu(menu);
        menu.add(0, 1, 0, "배경색 (빨강)");
        menu.add(0, 2, 0, "배경색 (초록)");
        menu.add(0, 3, 0, "배경색 (파랑)");

        SubMenu sMenu = menu.addSubMenu("버튼 변경 >>");
        sMenu.add(0, 4, 0, "버튼 45도 회전");
        sMenu.add(0, 5, 0, "버튼 2배 확대");

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
//            // 1. XML 사용 시
//            case R.id.itemRed:
//                baseLayout.setBackgroundColor(Color.RED);
//                return true;
//            case R.id.itemGreen:
//                baseLayout.setBackgroundColor(Color.GREEN);
//                return true;
//            case R.id.itemBlue:
//                baseLayout.setBackgroundColor(Color.BLUE);
//                return true;
//            case R.id.subRotate:
//                button1.setRotation(45);
//                return true;
//            case R.id.subSize:
//                button1.setScaleX(2);
//                return true;

            // 2. java
            case 1:
                baseLayout.setBackgroundColor(Color.RED);
                return true;
            case 2:
                baseLayout.setBackgroundColor(Color.GREEN);
                return true;
            case 3:
                baseLayout.setBackgroundColor(Color.BLUE);
                return true;
            case 4:
                button1.setRotation(45);
                return true;
            case 5:
                button1.setScaleX(2);
                return true;

        }
        return false;
    }
}