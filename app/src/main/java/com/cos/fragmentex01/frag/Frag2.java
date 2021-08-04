package com.cos.fragmentex01.frag;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.cos.fragmentex01.MainActivity;
import com.cos.fragmentex01.R;


public class Frag2 extends Fragment {

    private static final String TAG = "Frag2";

    private MainActivity mContext;

    public  Frag2(MainActivity mContext) {
        this.mContext = mContext;
    }
    
    @Nullable
    @Override
    public View onCreateView(@Nullable LayoutInflater inflater,@Nullable ViewGroup container, Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: ");
        Log.d(TAG, "onCreateView: "+ mContext.count);
        View view = inflater.inflate(R.layout.frag_2, container, false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}