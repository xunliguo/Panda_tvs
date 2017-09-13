package com.example.asus_pc.panda_tvs.model.biz;


import com.example.asus_pc.panda_tvs.config.Urls;
import com.example.asus_pc.panda_tvs.model.entity.PandaLiveBean;
import com.example.asus_pc.panda_tvs.net.callback.MyNetWorkCallback;

/**
 * Created by xingge on 2017/7/11.
 */

public class PandaLiveModelImpl implements IPandaLiveModel {

    @Override
    public void getPadDaLive(MyNetWorkCallback<PandaLiveBean> callback) {
        //发送网络请求
        iHttp.get(Urls.PANDALIVE,null,callback);
    }
}
