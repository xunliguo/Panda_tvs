package com.example.asus_pc.panda_tvs.module.livepanda;


import com.example.asus_pc.panda_tvs.model.biz.IPandaLiveModel;
import com.example.asus_pc.panda_tvs.model.biz.PandaLiveModelImpl;
import com.example.asus_pc.panda_tvs.model.entity.PandaLiveBean;
import com.example.asus_pc.panda_tvs.module.culturl.CulturlContract;
import com.example.asus_pc.panda_tvs.net.callback.MyNetWorkCallback;

/**
 * Created by xingge on 2017/7/11 .
 */

public class LivePandaPresenter implements LivePandaContract.Presenter {

    private IPandaLiveModel pandaLiveModel;
    private LivePandaContract.View livepandaView;
    public LivePandaPresenter(CulturlContract.View homeView){
        this.livepandaView = livepandaView;
        this.livepandaView.setPresenter(this);
        pandaLiveModel = new PandaLiveModelImpl();
    }

    @Override
    public void start() {

        pandaLiveModel.getPadDaLive(new MyNetWorkCallback<PandaLiveBean>() {
            @Override
            public void onSuccess(PandaLiveBean pandaLiveBean) {

                livepandaView.setResult(pandaLiveBean);
            }

            @Override
            public void onError(int errorCode, String errorMsg) {

                livepandaView.showMessage(errorMsg);
            }
        });
    }
}
