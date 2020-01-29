package com.praveen.people10.repository;

import android.content.Context;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.praveen.people10.util.Constant.BASE_URL;

class RetrofitService {

    private static Retrofit retrofit;

    private static Retrofit getRetrofitInstance(Context context ) {
        if (retrofit == null) {
            OkHttpClient.Builder oktHttpClientBuilder = new OkHttpClient.Builder()
                    .addInterceptor(new RetrofitClientInterceptor(context));
            retrofit = new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .client(oktHttpClientBuilder.build())
                    .build();
        }
        return retrofit;
    }

    static <S> S createService(Class<S> serviceClass, Context context) {
        return getRetrofitInstance(context).create(serviceClass);
    }
}
