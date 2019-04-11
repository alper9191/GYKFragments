package com.abeyler.gykfragments;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

public class HealthyFoodsFragment extends Fragment {


    private RecyclerView recyclerView;
    private CustomAdapter customAdapter;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_healthy_foods,container,false);

        recyclerView = view.findViewById(R.id.recyclerViewFoods);

        Food food1 = new Food(R.drawable.home,"Elma");
        Food food2 = new Food(R.drawable.home,"Armut");
        Food food3 = new Food(R.drawable.home,"Ispanak");
        Food food4 = new Food(R.drawable.home,"Muz");
        Food food5 = new Food(R.drawable.home,"Ekmek");
        Food food6 = new Food(R.drawable.home,"Pırasa");
        Food food7 = new Food(R.drawable.home,"Döner");
        Food food8 = new Food(R.drawable.home,"Karnıyarık");
        Food food9 = new Food(R.drawable.home,"Dolma");

        List<Food> list = new ArrayList<>();
        list.add(food1);
        list.add(food2);
        list.add(food3);
        list.add(food4);
        list.add(food5);
        list.add(food6);
        list.add(food7);
        list.add(food8);
        list.add(food9);
        customAdapter = new CustomAdapter(list);

        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getActivity());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(customAdapter);

        return view;
    }
}
