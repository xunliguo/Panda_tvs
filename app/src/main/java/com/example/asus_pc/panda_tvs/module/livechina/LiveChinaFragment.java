package com.example.asus_pc.panda_tvs.module.livechina;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asus_pc.panda_tvs.R;
import com.example.asus_pc.panda_tvs.base.BaseFragment;
import com.example.asus_pc.panda_tvs.model.entity.PandaLiveBean;
import com.example.asus_pc.panda_tvs.module.livepanda.LivePandaContract;

import butterknife.BindView;

/**
 * Created by xingge on 2017/7/11.
 */

public class LiveChinaFragment extends BaseFragment implements LiveChinaContract.View {

    LiveChinaContract.Presenter presenter;


    @Override
    protected int getLayoutId() {
        return R.layout.livechina_fragment;
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
    public void setPresenter(LiveChinaContract.Presenter presenter) {
        this.presenter = presenter;
    }
}
