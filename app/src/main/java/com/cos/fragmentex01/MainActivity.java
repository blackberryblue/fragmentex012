package com.cos.fragmentex01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.cos.fragmentex01.frag.Frag1;
import com.cos.fragmentex01.frag.Frag2;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity2";
    private MainActivity mContext = MainActivity.this;
    private Frag1 frag1;
    private Frag2 frag2;
    private Button btn1, btn2;

    public int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    frag1 = new Frag1(mContext);
    frag2 = new Frag2(mContext);

    btn1 = findViewById(R.id.btn1);
    btn2 = findViewById(R.id.btn2);

    // replace() 이전 프레그먼트를 제거한 후 새로운 프래그먼트 추가
    // add() 이전 프래그먼트 위에 새로운 프래그먼트 추가
    btn1.setOnClickListener(v->{
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container,frag1)
                .commit();

    });

    btn2.setOnClickListener(v->{
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container,frag2)
                .commit();
    });


    }
}