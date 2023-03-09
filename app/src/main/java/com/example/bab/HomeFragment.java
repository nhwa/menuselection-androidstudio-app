package com.example.bab;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;

public class HomeFragment  extends Fragment {
    private Button all_random;
    private Button menu_choice;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LinearLayout layout = (LinearLayout) inflater.inflate(R.layout.fragment_home, container, false);

        all_random = (Button)layout.findViewById(R.id.all_random);
        menu_choice = (Button)layout.findViewById(R.id.menu_choice);
        all_random.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).random_menu("no_menu");
            }
        });
        menu_choice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity)getActivity()).onMenu_choice_home();
            }
        });

        return layout;
    }
}
