package com.example.asus_pc.panda_tvs.module.observerd;

import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.example.asus_pc.panda_tvs.R;
import com.example.asus_pc.panda_tvs.base.BaseFragment;
import com.example.asus_pc.panda_tvs.model.entity.PandaLiveBean;


import butterknife.BindView;

/**
 * Created by xingge on 2017/7/11.
 */

public class ObserveFragment extends BaseFragment implements ObserverContract.View {

   ObserverContract.Presenter presenter;
    @BindView(R.id.mResultTv)
    TextView mResultTv;

    @Override
    protected int getLayoutId() {
        return R.layout.home_fragment;
    }

    @Override
    protected void init(View view) {

    }

    @Override
    protected void loadData() {

        presenter.start();

    }


    @Override
    public void showProgressDialog() {

    }

    @Override
    public void dismissDialog() {

    }

    @Override
    public void setResult(PandaLiveBean pandaLiveBean) {

        mResultTv.setText(pandaLiveBean.getLive().get(0).getTitle());
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
