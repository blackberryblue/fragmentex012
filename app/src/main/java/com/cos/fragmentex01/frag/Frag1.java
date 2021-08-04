package com.cos.fragmentex01.frag;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.cos.fragmentex01.MainActivity;
import com.cos.fragmentex01.R;


public class Frag1 extends Fragment {

    private static final String TAG = "Frag1";
    private MainActivity mContext;

    public  Frag1(MainActivity mContext) {
        this.mContext = mContext;
    }
   //onCreateView 함수는 그림이 그려질때 자동 콜백됨.
    //onCreateView 함수에서 xml을 inflate 해야함.
    //지금은 생성자에서 super로 넘기기마 하면 됨

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable  Bundle savedInstanceState) {
        Log.d(TAG, "onCreateView: container :" + container);

        View view = inflater.inflate(R.layout.frag_1, container, false);
        TextView tvFrag1 = view.findViewById(R.id.tvFrag1);
        Log.d(TAG, "onCreateView: " + tvFrag1.getText());

        Button btnFrag1 = view.findViewById(R.id.btnFrag1);
        btnFrag1.setOnClickListener(v ->{
            tvFrag1.setText("내용변경");
            mContext.count++;
        });
        return view;
    }


}