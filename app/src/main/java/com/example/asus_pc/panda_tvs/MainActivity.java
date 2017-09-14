package com.example.asus_pc.panda_tvs;

import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.util.Log;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import com.example.asus_pc.panda_tvs.base.BaseActivity;
import com.example.asus_pc.panda_tvs.module.culturl.CulturlFragment;
import com.example.asus_pc.panda_tvs.module.home.HomeFragment;
import com.example.asus_pc.panda_tvs.module.home.HomePresenter;
import com.example.asus_pc.panda_tvs.module.livechina.LiveChinaFragment;
import com.example.asus_pc.panda_tvs.module.livepanda.LivePandaFragment;
import com.example.asus_pc.panda_tvs.module.observerd.ObserveFragment;

import butterknife.BindView;

import static android.R.attr.id;

public class MainActivity extends BaseActivity implements View.OnClickListener {
    @BindView(R.id.mContainer)
    FrameLayout mContainer;

    private HomeFragment homeFragment;
    private RadioButton shouye;
    private RadioButton guancha;
    private RadioButton wenhua;
    private RadioButton live;

    private RadioButton livechina;
    private RadioGroup layout;
    private HomeFragment homeFragment1;
    private ObserveFragment observeFragment;
    private CulturlFragment culturlFragment;
    private LivePandaFragment pandaFragment;
    private LiveChinaFragment liveChinaFragment;
    private TextView text;
    private ImageView image1;

    @Override
    protected int getLayoutId()  {
        return R.layout.activity_main;
    }

    @Override
    protected void initView() {
        layout = (RadioGroup) findViewById(R.id.layout);
        shouye = (RadioButton) findViewById(R.id.shouye);
        guancha = (RadioButton) findViewById(R.id.guancha);
        wenhua = (RadioButton) findViewById(R.id.wenhua);
        live = (RadioButton) findViewById(R.id.live);
        text = (TextView) findViewById(R.id.text);
        image1 = (ImageView) findViewById(R.id.image1);
        livechina = (RadioButton) findViewById(R.id.live_home);
        shouye.setOnClickListener(this);
        Log.e("TAG", "initView: "+"cwl+33333333333333333333333333333333333333333333333333" );
        guancha.setOnClickListener(this);
        wenhua.setOnClickListener(this);
        live.setOnClickListener(this);
        livechina.setOnClickListener(this);


        homeFragment = new HomeFragment();
        new HomePresenter(homeFragment);
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(R.id.mContainer, homeFragment, "HomeFragment");
        image1.setVisibility(View.VISIBLE);
        transaction.commit();


    }


    @Override
    public void onClick(View view) {
        FragmentManager manager = getSupportFragmentManager();
        FragmentTransaction transaction = manager.beginTransaction();
        liall(transaction);

        switch (view.getId()) {
            case R.id.shouye:
                image1.setVisibility(View.VISIBLE);
                text.setText("  ");
                if (homeFragment==null){
                    homeFragment= new HomeFragment();
                    transaction.add(R.id.mContainer,homeFragment);
                }else{
                    transaction.show(homeFragment);
                }
                break;

            case R.id.guancha:
                text.setText("熊猫观察");
                image1.setVisibility(View.GONE);
                if (observeFragment==null){
                    observeFragment = new ObserveFragment();
                    transaction.add(R.id.mContainer,observeFragment);
                }else{
                    transaction.show(observeFragment);
                }

               if (observeFragment==null){
                   observeFragment = new ObserveFragment();
                   transaction.add(R.id.mContainer,observeFragment);

               }else{
                   transaction.show(observeFragment);

               }
                break;

            case R.id.wenhua:
                text.setText("熊猫文化");
                image1.setVisibility(View.GONE);
                if(culturlFragment==null){
                    culturlFragment = new CulturlFragment();
                    transaction.add(R.id.mContainer,culturlFragment);
                }else{
                    transaction.show(culturlFragment);
                }
                break;
            case R.id.live:
                text.setText("熊猫直播");
                image1.setVisibility(View.GONE);
                if(pandaFragment==null){
                    pandaFragment = new LivePandaFragment();
                    transaction.add(R.id.mContainer,pandaFragment);
                }else{
                    transaction.show(pandaFragment);
                }
                break;
            case R.id.live_home:
                text.setText("直播中国");
                image1.setVisibility(View.GONE);
                if(liveChinaFragment==null){
                    liveChinaFragment = new LiveChinaFragment();
                    transaction.add(R.id.mContainer,liveChinaFragment);
                }else{
                    transaction.show(liveChinaFragment);
                }
                break;
        }
        transaction.commit();
    }
//xhr小黄人好
    private void liall(FragmentTransaction transaction) {
        if(homeFragment!=null){
         transaction.hide(homeFragment);
        }
        //大家好我是李强
        if(observeFragment!=null){
            transaction.hide(observeFragment);
        }
        if(culturlFragment!=null){
            transaction.hide(culturlFragment);
        }
        if(pandaFragment!=null){
            transaction.hide(pandaFragment);
        }
        if (liveChinaFragment!=null){
            transaction.hide(liveChinaFragment);
        }
    }
}