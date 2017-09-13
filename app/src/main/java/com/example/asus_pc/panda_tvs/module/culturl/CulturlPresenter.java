package com.example.asus_pc.panda_tvs.module.culturl;


import com.example.asus_pc.panda_tvs.model.biz.IPandaLiveModel;
import com.example.asus_pc.panda_tvs.model.biz.PandaLiveModelImpl;
import com.example.asus_pc.panda_tvs.model.entity.PandaLiveBean;
import com.example.asus_pc.panda_tvs.module.home.HomeContract;
import com.example.asus_pc.panda_tvs.net.callback.MyNetWorkCallback;

/**
 * Created by xingge on 2017/7/11 .
 */

public class CulturlPresenter implements CulturlContract.Presenter {

    private IPandaLiveModel pandaLiveModel;
    private CulturlContract.View culturlView;
    public CulturlPresenter(CulturlContract.View homeView){
        this.culturlView = culturlView;
        this.culturlView.setPresenter(this);
        pandaLiveModel = new PandaLiveModelImpl();
    }

    @Override
    public void start() {

        pandaLiveModel.getPadDaLive(new MyNetWorkCallback<PandaLiveBean>() {
            @Override
            public void onSuccess(PandaLiveBean pandaLiveBean) {

                culturlView.setResult(pandaLiveBean);
            }

            @Override
            public void onError(int errorCode, String errorMsg) {

                culturlView.showMessage(errorMsg);
            }
        });
    }
}
