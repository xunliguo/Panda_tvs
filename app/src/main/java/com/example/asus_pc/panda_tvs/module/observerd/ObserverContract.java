package com.example.asus_pc.panda_tvs.module.observerd;


import com.example.asus_pc.panda_tvs.base.BasePresenter;
import com.example.asus_pc.panda_tvs.base.BaseView;
import com.example.asus_pc.panda_tvs.model.entity.PandaLiveBean;

/**
 * Created by xingge on 2017/7/11.
 */

public interface ObserverContract {

    interface View extends BaseView<Presenter> {

        void showProgressDialog();
        void dismissDialog();
        void setResult(PandaLiveBean pandaLiveBean);
        void showMessage(String msg);
    }

    interface Presenter extends BasePresenter {

    }
}
