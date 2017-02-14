package com.rrmsense.banglanewspaper;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.content.ContextCompat;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class EnglishFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    private int mColumnNumber;
    ArrayList<BanglaNewspaper> newspapers;



    public EnglishFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_english, container, false);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.recycler_view_newspaper_english);
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
        newspapers.add(new BanglaNewspaper(ContextCompat.getDrawable(getActivity(),R.drawable.theindependentbd), "The Independent",21));
        newspapers.add(new BanglaNewspaper(ContextCompat.getDrawable(getActivity(),R.drawable.newagebd), "New Age",22));
        newspapers.add(new BanglaNewspaper(ContextCompat.getDrawable(getActivity(),R.drawable.observerbd), "The Daily Observer",23));
        newspapers.add(new BanglaNewspaper(ContextCompat.getDrawable(getActivity(),R.drawable.thedailynewnation), "The New Nation",24));
        newspapers.add(new BanglaNewspaper(ContextCompat.getDrawable(getActivity(),R.drawable.bdnews24), "bdnews24.com",25));
        newspapers.add(new BanglaNewspaper(ContextCompat.getDrawable(getActivity(),R.drawable.dhakatribune), "Dhaka Tribune",26));
        newspapers.add(new BanglaNewspaper(ContextCompat.getDrawable(getActivity(),R.drawable.thefinancialexpress), "The Financial Express",27));
        newspapers.add(new BanglaNewspaper(ContextCompat.getDrawable(getActivity(),R.drawable.dailysun), "The Daily Sun",28));

        mAdapter = new BanglaNewspaperAdapter(newspapers,getActivity());
        mRecyclerView.setAdapter(mAdapter);
        //mRecyclerView.addItemDecoration(new DividerItemDecoration(getActivity()));
        //mRecyclerView.addItemDecoration(new GridDividerItemDecoration(ContextCompat.getDrawable(getActivity(), R.drawable.line_divider), ContextCompat.getDrawable(getActivity(), R.drawable.line_divider), mColumnNumber));

        return view;
    }


}
