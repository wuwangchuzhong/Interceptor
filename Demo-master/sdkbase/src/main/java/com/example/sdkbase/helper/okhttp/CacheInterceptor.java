package com.example.sdkbase.helper.okhttp;

import android.content.Context;

import com.example.sdkbase.utils.AppUtils;
import com.example.sdkbase.utils.NetworkConnectionUtils;

import java.io.IOException;

import okhttp3.CacheControl;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;

import static com.example.sdkbase.utils.HttpUtils.getUserAgent;

/**
 * Created by Administrator on 2018/1/19.
 * okHttp中拦截器
 */

public class CacheInterceptor implements Interceptor {

    @Override
    public Response intercept(Chain chain) throws IOException {
        Request request = chain.request();
        if (NetworkConnectionUtils.isNetworkConnected(AppUtils.getContext())) {
            //可以缓存一小时
            int maxAge = 60 * 60;
            request = request.newBuilder()
                    .removeHeader("User_Agent")
                    .header("User_Agent", getUserAgent())
                    .build();
            Response response = chain.proceed(request);
            return response.newBuilder()
                    .removeHeader("Pragma")
                    .removeHeader("Cache-Control")
                    .header("Cache-Control", "public, max-age=" + maxAge)
                    .build();
        } else {
            int maxStale = 60 * 60 * 24 * 28;
            request = request.newBuilder()
                    .cacheControl(CacheControl.FORCE_CACHE)
                    .removeHeader("User_Agent")
                    .header("User_Agent", getUserAgent())
                    .build();
            Response response = chain.proceed(request);
            return response.newBuilder()
                    .removeHeader("Pragma")
                    .removeHeader("Cache-Control")
                    .header("Cache-Control", "public, only-if-cached, max-stale=" + maxStale)
                    .build();
        }
    }
}
