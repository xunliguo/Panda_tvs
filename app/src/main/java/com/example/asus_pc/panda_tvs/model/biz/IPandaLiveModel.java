package com.example.asus_pc.panda_tvs.model.biz;


import com.example.asus_pc.panda_tvs.model.entity.PandaLiveBean;
import com.example.asus_pc.panda_tvs.net.callback.MyNetWorkCallback;

/**
 * Created by xingge on 2017/7/11.
 */

public interface IPandaLiveModel extends BaseModel{

    void getPadDaLive(MyNetWorkCallback<PandaLiveBean> callback);
}
