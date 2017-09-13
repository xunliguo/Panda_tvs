package com.example.asus_pc.panda_tvs.module.home;


import com.example.asus_pc.panda_tvs.model.biz.IPandaLiveModel;
import com.example.asus_pc.panda_tvs.model.biz.PandaLiveModelImpl;
import com.example.asus_pc.panda_tvs.model.entity.PandaLiveBean;
import com.example.asus_pc.panda_tvs.net.callback.MyNetWorkCallback;

/**
 * Created by xingge on 2017/7/11 .
 */

public class HomePresenter implements HomeContract.Presenter {

    private IPandaLiveModel pandaLiveModel;
    private HomeContract.View homeView;
    public HomePresenter(HomeContract.View homeView){
        this.homeView = homeView;
        this.homeView.setPresenter(this);
        pandaLiveModel = new PandaLiveModelImpl();
    }

    @Override
    public void start() {

        pandaLiveModel.getPadDaLive(new MyNetWorkCallback<PandaLiveBean>() {
            @Override
            public void onSuccess(PandaLiveBean pandaLiveBean) {

                homeView.setResult(pandaLiveBean);
            }

            @Override
            public void onError(int errorCode, String errorMsg) {

                homeView.showMessage(errorMsg);
            }
        });
    }
}
