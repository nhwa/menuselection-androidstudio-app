package com.example.bab;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class EventActivity extends AppCompatActivity {
    private TextView event_title;
    private TextView tel;
    private TextView location;
    private TextView etc;
    private ImageButton close_button;
    private ImageView kind;
    private String str,telstr,locationstr;
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_event);
        close_button = (ImageButton)findViewById(R.id.close_button);
        close_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
            });

        //리스트뷰에서 누른 객체 인텐트로 보내 받음
         Bundle extras = getIntent().getExtras();
        String titleStr = extras.getString("titleStr");

        event_title = (TextView)findViewById(R.id.menu_title);
        event_title.setText(titleStr);

        tel = (TextView)findViewById(R.id.tel);
        etc = (TextView)findViewById(R.id.menutxt);
        location = (TextView)findViewById(R.id.location);
        kind = findViewById(R.id.kind);

        switch (titleStr){
            case "꽁양꽁양":
                telstr ="064-722-0525";
                locationstr ="제주시 산천단동3길 16";
                str="김치나베 7,000원\n치즈돈가스 8,000원\n돈가스 7,000원\n쫄까스 7,000원\n부대찌개 7,000원\n통김치부대전골 8,000원";
                kind.setImageResource(R.drawable.han);
                break;

            case "세이슌":
                telstr ="064-753-2006";
               locationstr ="제주시 제주대학로 102";
               str= "규동 6,500원\n가츠동 7,000원\n데리야끼동 6,400원\n돈고츠라멘 6,500원";
                kind.setImageResource(R.drawable.han);
               break;

            case "제대김밥":
                telstr ="064-711-0708";
                locationstr ="제주시 산천단동3길 26";
                str= "제대김밥 2,500원\n참치김밥 3,500원\n돈까스김밥 3,500원\n치즈김밥 3,500원\n매운멸치김밥 3,500원";
                kind.setImageResource(R.drawable.han);
                break;
        }

        tel.setText(telstr);
        etc.setText(str);
        location.setText(locationstr);
    }
}
