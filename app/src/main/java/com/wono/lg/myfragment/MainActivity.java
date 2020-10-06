package com.wono.lg.myfragment;

import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn,btn2;


    FragmentListener fragmentListener;
    MainFragment fragment1;
    MenuFragment fragment2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fragment1 = new MainFragment();
        fragment2 = new MenuFragment();

        btn= findViewById(R.id.btn);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //소스코드를 통해 fragment 추가 하는 방법
                //버튼 클릭마다 만드니 만들지 않는다
               // fragment1 =new MainFragment();
                //추가 해봅니다

                //트랜잭션을 추가해서 복잡하구먼
                //fragmentlayout에 id추가하기
                //add먼저 해보기 add는 더하기 replace로 바꾸는걸로 바꾸기
                getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment1).commit();


            }
        });

        btn2= findViewById(R.id.button2);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //소스코드를 통해 fragment 추가 하는 방법


               // fragment2 =new MenuFragment();

                //트랜잭션을 추가해서 복잡하구먼
                //fragmentlayout에 id추가하기
               // fragment2 = (MenuFragment) getSupportFragmentManager().findFragmentById(R.id.textView2);
                getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment2).commit();

            }
        });
    }


    // 플래그먼트가 메소드로 접근할수 있도록
    public void flagementChange(int index){
        if(index == 0){
            getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment1).commit();
        }else if(index ==1){
            getSupportFragmentManager().beginTransaction().replace(R.id.container, fragment2).commit();
        }
    }



}
