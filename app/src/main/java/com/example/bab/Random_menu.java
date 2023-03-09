package com.example.bab;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Random_menu extends AppCompatActivity {
    private TextView menu,menu_title,tel,location,menutxt;
    private String menu_choice;
    private ImageButton close_button;
    private ImageView kind;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_random_menu);

        menu = findViewById(R.id.menu);
        menu_title = findViewById(R.id.menu_title);
        tel = findViewById(R.id.tel);
        location = findViewById(R.id.location);
        menutxt = findViewById(R.id.menutxt);
        menutxt.setMovementMethod(ScrollingMovementMethod.getInstance());
        kind = findViewById(R.id.kind);
        close_button= findViewById(R.id.close_button);

        Intent intent = getIntent();
        menu_choice = intent.getStringExtra("menu_choice");

        if(menu_choice.equals("han")) {
            String[] random_menu  = {"김치나베","부대찌개","매콤치즈갈비","두루치기","갈비찜","소고기해장국","뚝배기삼겹살","두루치기","정식","고기국수"};
            String[] random_menu_title = {"꽁양꽁양", "콘킹부대찌개", "밥먹젠", "학교종이땡땡땡", "상아탑식당", "깨수깡해장국", "배꼽시계", "종합강의실", "삐삐네정식","산아름국수"};
            String[] random_tel = {"064-722-0525","064-757-3379","064-711-0708","064-723-4236","064-702-0155", "064-712-5355", "064-724-4656", "064-721-4532", "064-757-4704"
                                    ,"064-755-3938"};
            String[] random_location = {"제주시 산천단동3길 16","제주시 제주대학로7길 5-2","제주시 제주대학로 107","제주시 제주대학로 113", "제주시 제주대학로7길 6-1",
                                        "제주시 제주대학로 115", "제주시 산천단동2길 15", "제주시 산천단동3길 26", "제주시 제주대학로7길 6","제주 제주시 산천단동3길 25"};
            String[] random_menutxt = {"김치나베 7,000원\n치즈돈가스 8,000원\n돈가스 7,000원\n쫄까스 7,000원",
                                        "부대찌개 7,000원\n통김치부대전골 8,000원",
                                        "매콤치즈갈비 6,500원\n순두부 6,000원\n제육덮밥 6,000원\n양념갈비 6,500원",
                                        "두루치기 6,000원\n갈비찜(소) 23,000원\n의정부 부대찌개(소) 20,000원\n동태찌개(소) 20,000원",
                                        "갈비찜 7,000원\n대표돈까스 6,000원\n김치찌개 6,000원\n순두부 6,000원\n 된장찌개 6000원",
                                        "소고기해장국 8,000원\n수제돈까스 8,000원",
                                        "뚝배기삼겹살 7,000원",
                                        "두루치기 6,000원\n부대찌개(소) 18,000원\n닭볶음탕 25,000원\n닭곰탕 6,000원\n김치찌개 6,000원",
                                        "정식 7,000원\n등심돈가스 6,000원\n불닭덮밥 6,000원",
                                        "고기국수 6,000원\n멸치국수 5,000원\n비빔국수 5,500원\n국밥\n6,000원\n비빔밥 5,500원"
            };
            int i = (int)(Math.random() * random_menu.length);
            menu.setText(random_menu[i]);
            menu_title.setText(random_menu_title[i]);
            tel.setText(random_tel[i]);
            location.setText(random_location[i]);
            menutxt.setText(random_menutxt[i]);
            kind.setImageResource(R.drawable.han);
        }
        else if(menu_choice.equals("bun")) {
            String[] random_menu  = {"감자튀김김밥","햄밥버거","치즈떡볶이","베이컨 베스트","매운멸치김밥","매력덮밥"};
            String[] random_menu_title = {"김밥천국제주대점", "봉구스밥버거","신전떡볶이","이삭토스트","제대김밥","매력식당"};
            String[] random_tel = {"064-702-6009","064-757-3379","064-723-4448","064-726-3223","064-711-0708","064-722-4593"};
            String[] random_location = {"제주시 제주대학로 103-1","제주시 제주대학로7길 6","제주시 제주대학로7길 6-1","제주시 제주대학로 73","제주시 산천단동3길 26","제주시 산천단동1길 20-9"};
            String[] random_menutxt = {
                    "참치볶음밥 6,000원\n야채비빔밥 5,000원\n된장찌개 5,000원\n순두부찌개 5,500원\n돌솥비빔밥 6,000원\n오므라이스 6,000원",
                    "봉구스밥버거 2,000원\n햄밥버거 2,500원\n치즈밥버거 2,500원\n햄치즈밥버거 3,000원\n제육밥버거 2,800원",
                    "떡볶이(순한맛/중간맛/매운맛) 3,500원\n치즈떡볶이(순한맛/중간맛/매운맛) 4,500원\n오뎅튀김(5개) 1,500원",
                    "베이컨 베스트대표 3,000원\n불갈비 mvp 3,600원\n핫치킨 mvp 3,400원\n 불고기 mvp 3,200원",
                    "제대김밥 2,500원\n참치김밥 3,500원\n돈까스김밥 3,500원\n치즈김밥 3,500원\n매운멸치김밥 3,500원",
                    "매력덮밥 6,000원\n국물떡볶이(2인) 12,000원\n치킨마요덮밥 7,000원\n닭볶음탕(2인) 12,000원\n평양냉우동 7,000원"
            };
            int i = (int)(Math.random() * random_menu.length);
            menu.setText(random_menu[i]);
            menu_title.setText(random_menu_title[i]);
            tel.setText(random_tel[i]);
            location.setText(random_location[i]);
            menutxt.setText(random_menutxt[i]);
            kind.setImageResource(R.drawable.bun);
        }
        else if(menu_choice.equals("il")) {
            String[] random_menu  = {"아우라텐동","해물야끼우동","돈고츠라멘"};
            String[] random_menu_title = {"아우라키친","오니기리와이규동","세이슌"};
            String[] random_tel = {"010-8610-3774","064-757-0290","064-753-2006"};
            String[] random_location = {"제주시 제주대학로7길 9","제주시 제주대학로 109","제주시 제주대학로 102"};
            String[] random_menutxt = {"아우라텐동 7,000원\n에비텐동 10,000원\n전복텐동 13,000원\n차돌우동 8,000원",
                                        "규동 5,900원\n가츠동 6,500원\n해물야끼우동 6,400원",
                                        "규동 6,500원\n가츠동 7,000원\n데리야끼동 6,400원\n돈고츠라멘 6,500원"
            };
            int i = (int)(Math.random() * random_menu.length);
            menu.setText(random_menu[i]);
            menu_title.setText(random_menu_title[i]);
            tel.setText(random_tel[i]);
            location.setText(random_location[i]);
            menutxt.setText(random_menutxt[i]);
            kind.setImageResource(R.drawable.il);
        }
        else if(menu_choice.equals("yang")) {
            String[] random_menu  = {"이탈리안 비엠티","부리또","B.L.T.C"};
            String[] random_menu_title = {"써브웨이","도스마스","올드소울"};
            String[] random_tel = {"064-752-7739","064-748-1253","010-3231-7090"};
            String[] random_location = {"제주시 제주대학로 113","제주시 제주대학로 115","제주시 산천단동2길 4"};
            String[] random_menutxt = {"이탈리안 비엠티 5,100원\n비엘티 5,100원\n미트볼 5,100원\n햄 4,700원",
                    "부리또 3,800원\n부리또+소다 4,500원\n부리또+소다+칩스 6,300원",
                    "B.L.T.C 6,000원\n치아바타샌드위치 6,000원\n에그새우샌드위치 6,000원\n포카치아샌드위치 6,000원"
            };
            int i = (int)(Math.random() * random_menu.length);
            menu.setText(random_menu[i]);
            menu_title.setText(random_menu_title[i]);
            tel.setText(random_tel[i]);
            location.setText(random_location[i]);
            menutxt.setText(random_menutxt[i]);
            kind.setImageResource(R.drawable.yang);
        }
        else if(menu_choice.equals("jung")) {
            String[] random_menu  = {"짜장면","마라탕","짬뽕"};
            String[] random_menu_title = {"진성반점","신룽푸마라탕","짬스뽕스"};
            String[] random_tel = {"064-725-3369","064-702-8688","064-900-8081"};
            String[] random_location = {"제주시 제주대학로 109","제주시 산천단동2길 24","제주시 산천단동3길 31"};
            String[] random_menutxt = {"짜장면 5,000원",
                    "마라탕 8,000원\n마라샹궈 16,000원\n꿔바로우(소) 9,000원",
                    "짬뽕(하얀짬뽕) 6,500원\n중화비빔밥(면) 7,000원\n짜장면 5,000원\n꿔바로우 12,000원"
            };
            int i = (int)(Math.random() * random_menu.length);
            menu.setText(random_menu[i]);
            menu_title.setText(random_menu_title[i]);
            tel.setText(random_tel[i]);
            location.setText(random_location[i]);
            menutxt.setText(random_menutxt[i]);
            kind.setImageResource(R.drawable.jung);
        }
        else if(menu_choice.equals("asian")) {
            String[] random_menu  = {"황수방우육면"};
            String[] random_menu_title = {"백일흑야"};
            String[] random_tel = {"064-725-1687"};
            String[] random_location = {"제주시 산천단동3길 26"};
            String[] random_menutxt = {"황수방우육면 8,500원\n황수방지옥마라우육면 8,800원\n대만광부돈까스면 5,900원\n왕장조림밥 6,900원\n우육탕만두 7,900원"
            };
            int i = (int)(Math.random() * random_menu.length);
            menu.setText(random_menu[i]);
            menu_title.setText(random_menu_title[i]);
            tel.setText(random_tel[i]);
            location.setText(random_location[i]);
            menutxt.setText(random_menutxt[i]);
            kind.setImageResource(R.drawable.asian);
        }
        else if(menu_choice.equals("chicken")) {
            String[] random_menu  = {"양념치킨","파불로치킨","오징어짬뽕치킨"};
            String[] random_menu_title = {"아라주는엄마치킨","푸라닭","멕시카나치킨"};
            String[] random_tel = {"064-726-5330","064-702-1588","050-7964-0047"};
            String[] random_location = {"제주시 산천단동3길 13-2","제주시 산천단동3길 13","제주시 산천단동3길 29"};
            String[] random_menutxt = {"양념치킨 17,000원\n후라이드 치킨 16,000원\n간장치킨 17,000원\n매운양념치킨 17,000원\n마늘깐풍치킨 17,000원",
                    "파불로치킨 17,900원\n레드홀릭치킨 17,900원\n블랙알리오 17,900원\n고추마요치킨 17,900원",
                    "오징어짬뽕치킨/치토스치킨 18,000원\n후라이드 16,000원\n양념치킨 17,000원\n반반치킨 17,000원\n골드(간장)치킨 17,000원\n땡초치킨/허니벌꿀치킨 18,000원"
            };
            int i = (int)(Math.random() * random_menu.length);
            menu.setText(random_menu[i]);
            menu_title.setText(random_menu_title[i]);
            tel.setText(random_tel[i]);
            location.setText(random_location[i]);
            menutxt.setText(random_menutxt[i]);
            kind.setImageResource(R.drawable.chicken);
        }
        else if(menu_choice.equals("dosirak")) {
            String[] random_menu  = {"치킨마요","빅치킨마요"};
            String[] random_menu_title = {"토마토도시락","한솥도시락"};
            String[] random_tel = {"064-725-1016","064-753-6700"};
            String[] random_location = {"제주시 산천단동3길 31","제주시 제주대학로 107"};
            String[] random_menutxt = {"치킨마요 2,900원\n데리와퍼치킨 3,800원\n제육와퍼 4,000원\n김치제육 와퍼 4,500원\n돈치와퍼 (돈불+치킨) 4,700원",
                    "치킨제육 4,400원\n빅치킨마요 3,500원\n돈까스 카레 3,900원\n소불고기 철판볶음밥 4,500원\n왕카레돈까스 덮밥 5,500원"
            };
            int i = (int)(Math.random() * random_menu.length);
            menu.setText(random_menu[i]);
            menu_title.setText(random_menu_title[i]);
            tel.setText(random_tel[i]);
            location.setText(random_location[i]);
            menutxt.setText(random_menutxt[i]);
            kind.setImageResource(R.drawable.dosirak);
        }
        else if(menu_choice.equals("fastfood")) {
            String[] random_menu  = {"치즈 쓰리스타버거","언빌리버블버거"};
            String[] random_menu_title = {"토니버거","맘스터치"};
            String[] random_tel = {"064-702-3131","064-726-9299"};
            String[] random_location = {"제주시 제주대학로 107","제주시 제주대학로 115"};
            String[] random_menutxt = {"치즈 쓰리스타버거 6,900원\n투빅 허니갈릭 버거 3,900원\n투빅버거 3,700원",
                    "언빌리버블버거 5,100원\n인크레더블버거 4,900원\n치즈베이컨버거 4,500원\n딥치즈버거 4,000원\n화이트갈릭버거 4,100원\n싸이버거 3,400원"
            };
            int i = (int)(Math.random() * random_menu.length);
            menu.setText(random_menu[i]);
            menu_title.setText(random_menu_title[i]);
            tel.setText(random_tel[i]);
            location.setText(random_location[i]);
            menutxt.setText(random_menutxt[i]);
            kind.setImageResource(R.drawable.fastfood);
        }

        else{
            String[] random_menu  = {"김치나베","부대찌개","매콤치즈갈비","두루치기","갈비찜","소고기해장국","뚝배기삼겹살","두루치기","정식","고기국수",
                    "감자튀김김밥","햄밥버거","치즈떡볶이","베이컨 베스트","매운멸치김밥","매력덮밥","아우라텐동","해물야끼우동","돈고츠라멘",
                    "이탈리안 비엠티","부리또","B.L.T.C","짜장면","마라탕","짬뽕","황수방우육면","양념치킨","파불로치킨","오징어짬뽕치킨","치킨마요","빅치킨마요",
                    "치즈 쓰리스타버거","언빌리버블버거"
            };
            String[] random_menu_title = {"꽁양꽁양", "콘킹부대찌개", "밥먹젠", "학교종이땡땡땡", "상아탑식당", "깨수깡해장국", "배꼽시계", "종합강의실", "삐삐네정식","산아름국수",
                    "김밥천국제주대점", "봉구스밥버거","신전떡볶이","이삭토스트","제대김밥","매력식당","아우라키친","오니기리와이규동","세이슌",
                    "써브웨이","도스마스","올드소울","진성반점","신룽푸마라탕","짬스뽕스","백일흑야","아라주는엄마치킨","푸라닭","멕시카나치킨","토마토도시락","한솥도시락",
                    "토니버거","맘스터치"};
            String[] random_tel = {"064-722-0525","064-757-3379","064-711-0708","064-723-4236","064-702-0155", "064-712-5355", "064-724-4656", "064-721-4532", "064-757-4704"
                    ,"064-755-3938","064-702-6009","064-757-3379","064-723-4448","064-726-3223","064-711-0708","064-722-4593","010-8610-3774","064-757-0290","064-753-2006",
                    "064-752-7739","064-748-1253","010-3231-7090","064-725-3369","064-702-8688","064-900-8081","064-725-1687","064-726-5330","064-702-1588","050-7964-0047",
                    "064-725-1016","064-753-6700","064-702-3131","064-726-9299"};
            String[] random_location = {"제주시 산천단동3길 16","제주시 제주대학로7길 5-2","제주시 제주대학로 107","제주시 제주대학로 113", "제주시 제주대학로7길 6-1",
                    "제주시 제주대학로 115", "제주시 산천단동2길 15", "제주시 산천단동3길 26", "제주시 제주대학로7길 6","제주 제주시 산천단동3길 25",
                    "제주시 제주대학로 103-1","제주시 제주대학로7길 6","제주시 제주대학로7길 6-1","제주시 제주대학로 73","제주시 산천단동3길 26","제주시 산천단동1길 20-9",
                    "제주시 제주대학로7길 9","제주시 제주대학로 109","제주시 제주대학로 102","제주시 제주대학로 113","제주시 제주대학로 115","제주시 산천단동2길 4",
                    "제주시 제주대학로 109","제주시 산천단동2길 24","제주시 산천단동3길 31","제주시 산천단동3길 26","제주시 산천단동3길 13-2","제주시 산천단동3길 13","제주시 산천단동3길 29",
                    "제주시 산천단동3길 31","제주시 제주대학로 107","제주시 제주대학로 107","제주시 제주대학로 115"
            };
            String[] random_menutxt = {"김치나베 7,000원\n치즈돈가스 8,000원\n돈가스 7,000원\n쫄까스 7,000원",
                    "부대찌개 7,000원\n통김치부대전골 8,000원",
                    "매콤치즈갈비 6,500원\n순두부 6,000원\n제육덮밥 6,000원\n양념갈비 6,500원",
                    "두루치기 6,000원\n갈비찜(소) 23,000원\n의정부 부대찌개(소) 20,000원\n동태찌개(소) 20,000원",
                    "갈비찜 7,000원\n대표돈까스 6,000원\n김치찌개 6,000원\n순두부 6,000원\n 된장찌개 6000원",
                    "소고기해장국 8,000원\n수제돈까스 8,000원",
                    "뚝배기삼겹살 7,000원",
                    "두루치기 6,000원\n부대찌개(소) 18,000원\n닭볶음탕 25,000원\n닭곰탕 6,000원\n김치찌개 6,000원",
                    "정식 7,000원\n등심돈가스 6,000원\n불닭덮밥 6,000원",
                    "고기국수 6,000원\n멸치국수 5,000원\n비빔국수 5,500원\n국밥\n6,000원\n비빔밥 5,500원",
                    "참치볶음밥 6,000원\n야채비빔밥 5,000원\n된장찌개 5,000원\n순두부찌개 5,500원\n돌솥비빔밥 6,000원\n오므라이스 6,000원",
                    "봉구스밥버거 2,000원\n햄밥버거 2,500원\n치즈밥버거 2,500원\n햄치즈밥버거 3,000원\n제육밥버거 2,800원",
                    "떡볶이(순한맛/중간맛/매운맛) 3,500원\n치즈떡볶이(순한맛/중간맛/매운맛) 4,500원\n오뎅튀김(5개) 1,500원",
                    "베이컨 베스트대표 3,000원\n불갈비 mvp 3,600원\n핫치킨 mvp 3,400원\n 불고기 mvp 3,200원",
                    "제대김밥 2,500원\n참치김밥 3,500원\n돈까스김밥 3,500원\n치즈김밥 3,500원\n매운멸치김밥 3,500원",
                    "매력덮밥 6,000원\n국물떡볶이(2인) 12,000원\n치킨마요덮밥 7,000원\n닭볶음탕(2인) 12,000원\n평양냉우동 7,000원",
                    "아우라텐동 7,000원\n에비텐동 10,000원\n전복텐동 13,000원\n차돌우동 8,000원",
                    "규동 5,900원\n가츠동 6,500원\n해물야끼우동 6,400원",
                    "규동 6,500원\n가츠동 7,000원\n데리야끼동 6,400원\n돈고츠라멘 6,500원",
                    "이탈리안 비엠티 5,100원\n비엘티 5,100원\n미트볼 5,100원\n햄 4,700원",
                    "부리또 3,800원\n부리또+소다 4,500원\n부리또+소다+칩스 6,300원",
                    "B.L.T.C 6,000원\n치아바타샌드위치 6,000원\n에그새우샌드위치 6,000원\n포카치아샌드위치 6,000원",
                    "짜장면 5,000원",
                    "마라탕 8,000원\n마라샹궈 16,000원\n꿔바로우(소) 9,000원",
                    "짬뽕(하얀짬뽕) 6,500원\n중화비빔밥(면) 7,000원\n짜장면 5,000원\n꿔바로우 12,000원",
                    "황수방우육면 8,500원\n황수방지옥마라우육면 8,800원\n대만광부돈까스면 5,900원\n왕장조림밥 6,900원\n우육탕만두 7,900원",
                    "양념치킨 17,000원\n후라이드 치킨 16,000원\n간장치킨 17,000원\n매운양념치킨 17,000원\n마늘깐풍치킨 17,000원",
                    "파불로치킨 17,900원\n레드홀릭치킨 17,900원\n블랙알리오 17,900원\n고추마요치킨 17,900원",
                    "오징어짬뽕치킨/치토스치킨 18,000원\n후라이드 16,000원\n양념치킨 17,000원\n반반치킨 17,000원\n골드(간장)치킨 17,000원\n땡초치킨/허니벌꿀치킨 18,000원",
                    "치킨마요 2,900원\n데리와퍼치킨 3,800원\n제육와퍼 4,000원\n김치제육와퍼 4,500원\n돈치와퍼(돈불+치킨) 4,700원",
                    "치킨제육 4,400원\n빅치킨마요 3,500원\n돈까스카레 3,900원\n소불고기철판볶음밥 4,500원\n왕카레돈까스 덮밥 5,500원",
                    "치즈 쓰리스타버거 6,900원\n투빅 허니갈릭 버거 3,900원\n투빅버거 3,700원",
                    "언빌리버블버거 5,100원\n인크레더블버거 4,900원\n치즈베이컨버거 4,500원\n딥치즈버거 4,000원\n화이트갈릭버거 4,100원\n싸이버거 3,400원"
            };
            String[] random_image = {"han","han","han","han","han","han","han","han","han","han","bun","bun","bun","bun","bun","bun",
                    "il","il","il","yang","yang","yang","jung","jung","jung","asian","chicken","chicken","chicken","dosirak","dosirak","fastfood","fastfood"
            };

            int i = (int)(Math.random() * random_menu.length);
            menu.setText(random_menu[i]);
            menu_title.setText(random_menu_title[i]);
            tel.setText(random_tel[i]);
            location.setText(random_location[i]);
            menutxt.setText(random_menutxt[i]);
            if(random_image[i] == "han")
                kind.setImageResource(R.drawable.han);
            else if(random_image[i] == "bun")
                kind.setImageResource(R.drawable.bun);
            else if(random_image[i] == "il")
                kind.setImageResource(R.drawable.il);
            else if(random_image[i] == "yang")
                kind.setImageResource(R.drawable.yang);
            else if(random_image[i] == "jung")
                kind.setImageResource(R.drawable.jung);
            else if(random_image[i] == "asian")
                kind.setImageResource(R.drawable.asian);
            else if(random_image[i] == "chicken")
                kind.setImageResource(R.drawable.chicken);
            else if(random_image[i] == "dosirak")
                kind.setImageResource(R.drawable.dosirak);
            else if(random_image[i] == "fastfood")
                kind.setImageResource(R.drawable.fastfood);

        }

        close_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });


    }
    }
