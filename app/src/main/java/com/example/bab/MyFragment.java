package com.example.bab;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.ListFragment;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ListView;

import java.io.ByteArrayOutputStream;

public class MyFragment  extends ListFragment {
    ListViewAdapter adapter ;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Adapter 생성 및 Adapter 지정.
        adapter = new ListViewAdapter() ;
        setListAdapter(adapter) ;
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.han),
                "꽁양꽁양") ;
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.il),
                "세이슌") ;
        adapter.addItem(ContextCompat.getDrawable(getActivity(), R.drawable.bun),
                "제대김밥") ;

        return super.onCreateView(inflater, container, savedInstanceState);
    }
    @Override
    public void onListItemClick (ListView l, View v, int position, long id) {
        // get TextView's Text.
        ListViewItem item = (ListViewItem) l.getItemAtPosition(position) ;
        String titleStr = item.getTitle();
        Drawable iconDrawable = item.getIcon() ;

        //fragment에서는
        Intent intent = new Intent(getActivity(), EventActivity.class);
        intent.putExtra("titleStr",titleStr );
        startActivity(intent);

        // TODO : use item data.
    }
    public void addItem(Drawable icon, String title) {
        adapter.addItem(icon, title) ;
    }
}