package com.wono.lg.myfragment;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

public class MenuFragment extends Fragment {


    //프래그먼트 소스와 xml이 연결되어있다는걸 보려면 인플레이션을 통해서 메모리객체화하고 연결을 시도해야함
    //setContentView가 없어서 콜백함수로 설정
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        // attachToRoot는 activity화면에 프래그먼트를 바로 붙여줄 것인지, 호출 시에 붙여줄 것인지를 정하는 파라미터입니다. false해주시면 됩니다.
        View view = inflater.inflate(R.layout.fragment_menu, container, false);



        return view;
    }


}