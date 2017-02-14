package com.rrmsense.banglanewspaper;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTabHost;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class BanglaNewspaperFragment extends Fragment {

    private FragmentTabHost mTabHost;

    public BanglaNewspaperFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_bangla_newspaper, container, false);

        mTabHost = (FragmentTabHost)rootView.findViewById(android.R.id.tabhost);
        mTabHost.setup(getActivity(), getChildFragmentManager(), R.id.realtabcontent);

        View tabTitleBangla=LayoutInflater.from(getActivity()).inflate(R.layout.bangla_newspaper_tab_title,null);
        View tabTitleEnglish=LayoutInflater.from(getActivity()).inflate(R.layout.english_newspaper_tab_title,null);

        mTabHost.addTab(mTabHost.newTabSpec("Bangla").setIndicator(tabTitleBangla), BanglaFragment.class, null);
       mTabHost.addTab(mTabHost.newTabSpec("English").setIndicator(tabTitleEnglish), EnglishFragment.class, null);

        return rootView;
    }
    public void onResume(){
        super.onResume();

        // Set title bar
        ((MainActivity) getActivity())
                .setActionBarTitle("বাংলা নিউজপেপার");

    }

}
