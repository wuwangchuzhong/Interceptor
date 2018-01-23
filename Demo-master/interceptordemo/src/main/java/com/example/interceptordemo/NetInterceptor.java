package com.example.interceptordemo;

import android.util.Log;

import java.io.IOException;
import java.util.logging.Logger;

import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

/**
 * Created by maio on 2018/1/23.
 * 案例一   Request request1=chain.request();
 *          直接将 request1添加到 Response中的方法chain.proceed（）中
 *          此方法贯穿请求与返回
 * 案例二  直接原文中显示的 打印LOG日志
 *
 */

public class NetInterceptor implements Interceptor {
    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request1=chain.request();

        Request request=request1.newBuilder()
                .removeHeader("User-Agent")
                .header("User-Agent","OkHttp Example")
                .build();

        long t1=System.nanoTime();
        Log.i("TAG","Sending request %s on %s%n%s请求中。。。"+request.url()+""+chain.connection()+"请求头"+request.headers());


        Response response=chain.proceed(request);
        long t2 = System.nanoTime();

        Log.i("TAG","Received response for %s in %.1fms%n%s结果中。。。"+""+response.request().url()+"时间区"+(t2 - t1) / 1e6d+"请求头"+response.headers());
        return response;
    }
}
