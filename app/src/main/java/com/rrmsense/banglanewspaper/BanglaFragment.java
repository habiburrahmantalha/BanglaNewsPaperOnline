package com.rrmsense.banglanewspaper;


import android.content.res.Configuration;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class BanglaFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private int mColumnNumber;
    ArrayList<BanglaNewspaper> newspapers;

    public BanglaFragment() {

    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_bangla, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_newspaper_bangla);
        int orientation=this.getResources().getConfiguration().orientation;
        if(orientation== Configuration.ORIENTATION_PORTRAIT){
            mColumnNumber = 2;

        }
        else{
            mColumnNumber = 4;
        }
        mLayoutManager = new GridLayoutManager(getActivity(),mColumnNumber);
        mRecyclerView.setLayoutManager(mLayoutManager);

        newspapers = new ArrayList<>();
        newspapers.add(new BanglaNewspaper(ContextCompat.getDrawable(getActivity(),R.drawable.prothomalo), "প্রথম আলো",1));
        newspapers.add(new BanglaNewspaper(ContextCompat.getDrawable(getActivity(),R.drawable.ittefaq), "ইত্তেফাক",2));
        newspapers.add(new BanglaNewspaper(ContextCompat.getDrawable(getActivity(),R.drawable.aajkaal), "আজকাল",3));
        newspapers.add(new BanglaNewspaper(ContextCompat.getDrawable(getActivity(),R.drawable.samakal), "সমকাল",4));
        newspapers.add(new BanglaNewspaper(ContextCompat.getDrawable(getActivity(),R.drawable.dailyinqilab), "ইনকিলাব",5));
        newspapers.add(new BanglaNewspaper(ContextCompat.getDrawable(getActivity(),R.drawable.mzamin), "মানবজমিন",6));
        newspapers.add(new BanglaNewspaper(ContextCompat.getDrawable(getActivity(),R.drawable.jugantor), "যুগান্তর",7));
        newspapers.add(new BanglaNewspaper(ContextCompat.getDrawable(getActivity(),R.drawable.kalerkontho), "কালের কণ্ঠ",8));
        newspapers.add(new BanglaNewspaper(ContextCompat.getDrawable(getActivity(),R.drawable.bhorerkagoj), "ভোরের কাগজ",9));
        newspapers.add(new BanglaNewspaper(ContextCompat.getDrawable(getActivity(),R.drawable.amadershomoy), "আমাদের সময়",10));


        mAdapter = new BanglaNewspaperAdapter(newspapers,getActivity());
        mRecyclerView.setAdapter(mAdapter);
        //mRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity()));
        //mRecyclerView.addItemDecoration(new GridDividerItemDecoration(ContextCompat.getDrawable(getActivity(), R.drawable.line_divider), ContextCompat.getDrawable(getActivity(), R.drawable.line_divider), mColumnNumber));


        return view;
    }

}
