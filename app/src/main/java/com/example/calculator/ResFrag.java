package com.example.calculator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Влад on 04.10.2016.
 */

public class ResFrag extends Fragment {
 TextView resView;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(Config.LOG,"onCreate");
       // findFragmentById(R.id.conteinerCalc);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag_res,container,false);
        Log.d(Config.LOG,"onCreateView");

        resView =(TextView) v.findViewById(R.id.twRes);
         Bundle bundle = this.getArguments();
        resView.setText(bundle.getString("RES"));
        return v;
    }
    @Override
    public void onStart() {
        super.onStart();
        Log.d(Config.LOG,"onStart");
    }

    @Override
    public void onStop() {
        super.onStop();
        Log.d(Config.LOG,"onStop");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.d(Config.LOG,"onPause");
    }


}
