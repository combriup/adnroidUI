package com.yimeng.arouterdemo;


import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.alibaba.android.arouter.facade.annotation.Route;


/**
 * A simple {@link Fragment} subclass.
 */
@Route(path = "/app/test1_fragment")
public class Test1Fragment extends Fragment {


    public Test1Fragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_test1, container, false);
    }

}
