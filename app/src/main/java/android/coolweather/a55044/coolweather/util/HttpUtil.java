package android.coolweather.a55044.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class HttpUtil {
    public static void sendOkHttpRequest(String address,okhttp3.Callback callback)
    {
        OkHttpClient client=new OkHttpClient();
        //发起http请求
        Request request=new Request.Builder().url(address).build();

        client.newCall(request).enqueue(callback);
    }

}
