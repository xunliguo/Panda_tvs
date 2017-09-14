package com.example.asus_pc.panda_tvs.module.observerd;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asus_pc.panda_tvs.R;
import com.example.asus_pc.panda_tvs.base.BaseFragment;
import com.example.asus_pc.panda_tvs.model.entity.PandaLiveBean;


import butterknife.BindView;

import static com.example.asus_pc.panda_tvs.R.id.mResultTv;

/**
 * Created by xingge on 2017/7/11.
 */

public class ObserveFragment extends BaseFragment implements ObserverContract.View {

   ObserverContract.Presenter presenter;


    @Override
    protected int getLayoutId() {
        return R.layout.observr_fragment;
    }

    @Override
    protected void init(View view) {

    }

    @Override
    protected void loadData() {



    }


    @Override
    public void showProgressDialog() {

    }

    @Override
    public void dismissDialog() {

    }

    @Override
    public void setResult(PandaLiveBean pandaLiveBean) {


    }

    @Override
    public void showMessage(String msg) {
        Toast.makeText(getContext(), msg, Toast.LENGTH_SHORT).show();
    }

    @Override
    public void setPresenter(ObserverContract.Presenter presenter) {
        this.presenter = presenter;
    }
}
