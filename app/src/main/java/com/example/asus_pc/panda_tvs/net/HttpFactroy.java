package com.example.asus_pc.panda_tvs.net;

/**
 * Created by xingge on 2017/7/11.
 */

public class HttpFactroy {
    public static IHttp create(){
        return OkHttpUtils.getInstance();
    }
}
