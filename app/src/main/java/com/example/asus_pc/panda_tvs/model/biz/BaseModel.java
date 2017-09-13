package com.example.asus_pc.panda_tvs.model.biz;


import com.example.asus_pc.panda_tvs.net.HttpFactroy;
import com.example.asus_pc.panda_tvs.net.IHttp;

/**
 * Created by xingge on 2017/7/11.
 */

public interface BaseModel {
    public static IHttp iHttp = HttpFactroy.create();
}
