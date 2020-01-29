package com.praveen.people10.repository;

import com.praveen.people10.model.FeedResponse;

import retrofit2.Call;
import retrofit2.http.GET;

public interface FeedApi {

    @GET("facts.json")
    Call<FeedResponse> getFeedList();
}
