package com.example.lixiang.dailypic2_android.util;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by yyfwptz on 2017/8/3.
 */

public class NetUtils {
    private static Retrofit retrofit = null;
    private NetUtils(){}
    public static Retrofit getRetrofit(){
        if (retrofit == null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(Constants.UrlPrefix)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
