package com.wono.lg.myfragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;

import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class MainFragment extends Fragment {


//프래그먼트 소스와 xml이 연결되어있다는걸 보려면 인플레이션을 통해서 메모리객체화하고 연결을 시도해야함
    //setContentView가 없어서 콜백함수로 설정


    EditText edt_memo;
    MainActivity activity;
    OnFragmentInteractionListener mListener;

    public interface OnFragmentInteractionListener {
        void onFragmentInteraction(String text);
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_main, container, false);





        Button btn = view.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //시스템이 아니기때문에 인텐트는 불가능
                //메소드로 접근
                if (mListener != null) {
                    String input = edt_memo.getText().toString();
                    Log.v("as",input);
                    mListener.onFragmentInteraction(input);
                   // activity.flagementChange(1);
                }

            }
        });


        return view;
    }


//값넘기는 메소드


    //onAttach로 액티비티에 올라와야 실행 ㄱ능

}
