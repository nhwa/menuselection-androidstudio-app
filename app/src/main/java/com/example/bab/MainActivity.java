package com.example.bab;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.design.widget.BottomNavigationView;
import android.os.Bundle;
import android.view.MenuItem;

import com.kakao.usermgmt.UserManagement;
import com.kakao.usermgmt.callback.LogoutResponseCallback;

public class MainActivity extends AppCompatActivity {

    private FragmentManager fragmentManager = getSupportFragmentManager();
    // 4개의 메뉴에 들어갈 Fragment들
    private HomeFragment fragment_home = new HomeFragment();
    private PlaceFragment fragment_place = new PlaceFragment();
    private NearFragment fragment_near = new NearFragment();
    private MyFragment fragment_my = new MyFragment();
    private SettingFragment fragment_setting = new SettingFragment();
    private Random_menu fragment_random_menu = new Random_menu();
    private Menuchoice_homeFragment fragment_menuchoice_home = new Menuchoice_homeFragment();
    private Menuchoice_placeFragment fragment_menuchoice_place = new Menuchoice_placeFragment();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //지도 nearfragment
        if (savedInstanceState == null) {
            NearFragment nearFragment = new NearFragment();
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.frame_layout, nearFragment, "near")
                    .commit();
        }

        // 첫 화면 지정
        BottomNavigationView bottomNavigationView = findViewById(R.id.bottom_navigation_view);
        // BottomNavigationView 메뉴를 선택할 때마다 위치가 변하지 않도록
        BottomNavigationHelper.disableShiftMode(bottomNavigationView);
        //fragment 교체
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frame_layout, fragment_home).commitAllowingStateLoss();

        //닉네임,프로필 전송
        Kakaoinfo();

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                FragmentTransaction transaction = fragmentManager.beginTransaction();
                switch (item.getItemId()) {
                    case R.id.navigation_Home: {
                        transaction.replace(R.id.frame_layout, fragment_home).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.navigation_Place: {
                        transaction.replace(R.id.frame_layout, fragment_place).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.navigation_Near: {
                        transaction.replace(R.id.frame_layout, fragment_near).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.navigation_My: {
                        transaction.replace(R.id.frame_layout, fragment_my).commitAllowingStateLoss();
                        break;
                    }
                    case R.id.navigation_setting: {
                        transaction.replace(R.id.frame_layout, fragment_setting).commitAllowingStateLoss();
                        break;
                    }
                }
                return true;
            }
        });
    }

    public void Kakaoinfo(){
        //카카오로그인 닉네임+프로필 이미지 받아와서 fragment_setting 에다가 bundle로 정보전송
        Intent intent = getIntent();
        String nickname = intent.getExtras().getString("nickname");
        String profileImagePath = intent.getExtras().getString("profileImagePath");
        Bundle bundle = new Bundle();
        bundle.putString("nickname", nickname);
        bundle.putString("profileImagePath", profileImagePath);
        fragment_setting.setArguments(bundle);
    }


    //로그아웃기능
    public void onClickLogout() {
        UserManagement.requestLogout(new LogoutResponseCallback() {
            @Override
            public void onCompleteLogout() {
                final Intent intent = new Intent(MainActivity.this, LoginActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    public void random_place(String menu_choice){
        Intent intent = new Intent(this,Random_place.class);
        intent.putExtra("menu_choice",menu_choice); /*송신*/
        startActivity(intent);
    }

    public void random_menu(String menu_choice){
        Intent intent = new Intent(this, Random_menu.class);
        intent.putExtra("menu_choice",menu_choice); /*송신*/
        startActivity(intent);
    }

    public void onMenu_choice_home(){
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frame_layout, fragment_menuchoice_home).commitAllowingStateLoss();
    }

    public void onMenu_choice_place(){
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.replace(R.id.frame_layout, fragment_menuchoice_place).commitAllowingStateLoss();
    }

}