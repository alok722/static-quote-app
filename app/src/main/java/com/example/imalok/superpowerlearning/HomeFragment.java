package com.example.imalok.superpowerlearning;


import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public class HomeFragment extends Fragment {


    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_home, container, false);
        RecyclerView homeFragment = (RecyclerView)view.findViewById(R.id.home_recycleView);
        homeFragment.setLayoutManager(new LinearLayoutManager(getActivity()));
        String category[] = {"FITNESS","MONEY","WEIGHT LOSS","BOUNCE BACK","BACK PAIN RELIEF"};
        int cat_img[] = {R.drawable.fitness,
        R.drawable.money,
        R.drawable.weight_loss,
        R.drawable.bounce_back,
        R.drawable.back_pain_relief};

        homeFragment.setAdapter(new HomeRecyclerViewAdapter(category,cat_img,getContext()));

        return view;
    }


}
