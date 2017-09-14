package com.example.asus_pc.panda_tvs.module.culturl;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asus_pc.panda_tvs.R;
import com.example.asus_pc.panda_tvs.base.BaseFragment;
import com.example.asus_pc.panda_tvs.model.entity.PandaLiveBean;
import com.example.asus_pc.panda_tvs.module.home.HomeContract;

import butterknife.BindView;

import static com.example.asus_pc.panda_tvs.R.id.mResultTv;

/**
 * Created by xingge on 2017/7/11.
 */

public class CulturlFragment extends BaseFragment implements CulturlContract.View {

    CulturlContract.Presenter presenter;


    @Override
    protected int getLayoutId() {
        return R.layout.culturl_fragment;
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
    public void setPresenter(CulturlContract.Presenter presenter) {
        this.presenter = presenter;
    }
}
