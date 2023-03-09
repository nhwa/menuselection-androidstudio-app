package com.example.bab;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class Menuchoice_placeFragment extends Fragment {
    private ImageButton han,bun,il,yang,jung,asian,chicken,pizza,jokbal,dosirak,fastfood,cafe;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.fragment_menuchoice_place, container, false);

        han = layout.findViewById(R.id.han);
        han.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).random_place("han");
            }
        });
        bun = layout.findViewById(R.id.bun);
        bun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).random_place("bun");
            }
        });
        il = layout.findViewById(R.id.il);
        il.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).random_place("il");
            }
        });
        yang = layout.findViewById(R.id.yang);
        yang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).random_place("yang");
            }
        });
        jung = layout.findViewById(R.id.jung);
        jung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).random_place("jung");
            }
        });
        asian = layout.findViewById(R.id.asian);
        asian.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).random_place("asian");
            }
        });
        chicken = layout.findViewById(R.id.chicken);
        chicken.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).random_place("chicken");
            }
        });
        pizza = layout.findViewById(R.id.pizza);
        pizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
        jokbal = layout.findViewById(R.id.jokbal);
        jokbal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
        dosirak = layout.findViewById(R.id.dosirak);
        dosirak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).random_place("dosirak");
            }
        });
        fastfood = layout.findViewById(R.id.fastfood);
        fastfood.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).random_place("fastfood");
            }
        });
        cafe = layout.findViewById(R.id.cafe);
        cafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });

        return layout;
    }
}
