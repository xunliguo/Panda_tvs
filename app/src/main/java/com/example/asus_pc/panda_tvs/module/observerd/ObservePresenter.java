package com.example.asus_pc.panda_tvs.module.observerd;


import com.example.asus_pc.panda_tvs.model.biz.IPandaLiveModel;
import com.example.asus_pc.panda_tvs.model.biz.PandaLiveModelImpl;
import com.example.asus_pc.panda_tvs.model.entity.PandaLiveBean;

import com.example.asus_pc.panda_tvs.net.callback.MyNetWorkCallback;

/**
 * Created by xingge on 2017/7/11 .
 */

public class ObservePresenter implements ObserverContract.Presenter {

    private IPandaLiveModel pandaLiveModel;
    private ObserverContract.View observerView;
    public ObservePresenter(ObserverContract.View observerView){
        this.observerView = observerView;
        this.observerView.setPresenter(this);
        pandaLiveModel = new PandaLiveModelImpl();
    }

    @Override
    public void start() {

        pandaLiveModel.getPadDaLive(new MyNetWorkCallback<PandaLiveBean>() {
            @Override
            public void onSuccess(PandaLiveBean pandaLiveBean) {

                observerView.setResult(pandaLiveBean);
            }

            @Override
            public void onError(int errorCode, String errorMsg) {

                observerView.showMessage(errorMsg);
            }
        });
    }
}
