package com.example.asus_pc.panda_tvs.module.livechina;


import com.example.asus_pc.panda_tvs.model.biz.IPandaLiveModel;
import com.example.asus_pc.panda_tvs.model.biz.PandaLiveModelImpl;
import com.example.asus_pc.panda_tvs.model.entity.PandaLiveBean;
import com.example.asus_pc.panda_tvs.module.culturl.CulturlContract;
import com.example.asus_pc.panda_tvs.module.livepanda.LivePandaContract;
import com.example.asus_pc.panda_tvs.net.callback.MyNetWorkCallback;

/**
 * Created by xingge on 2017/7/11 .
 */

public class LiveChinaPresenter implements LiveChinaContract.Presenter {

    private IPandaLiveModel pandaLiveModel;
    private LiveChinaContract.View livepchinaView;
    public LiveChinaPresenter(CulturlContract.View homeView){
        this.livepchinaView = livepchinaView;
        this.livepchinaView.setPresenter(this);
        pandaLiveModel = new PandaLiveModelImpl();
    }

    @Override
    public void start() {

        pandaLiveModel.getPadDaLive(new MyNetWorkCallback<PandaLiveBean>() {
            @Override
            public void onSuccess(PandaLiveBean pandaLiveBean) {

                livepchinaView.setResult(pandaLiveBean);
            }

            @Override
            public void onError(int errorCode, String errorMsg) {

                livepchinaView.showMessage(errorMsg);
            }
        });
    }
}
