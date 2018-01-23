package com.example.modelview.Home;


import com.example.modelview.Home.entity.TextBook;

import retrofit2.http.GET;
import retrofit2.http.Query;
import rx.Observable;

/**
 * Created by win764-1 on 2016/12/12.
 */

public interface RetrofitService {
    @GET("book/search")
    Observable<TextBook> getSearchBooks(@Query("q") String name,
                                        @Query("tag") String tag, @Query("start") int start,
                                        @Query("count") int count);

    @GET("api/ad/ydAuctionHomePageAd")
    Observable<TextBook> getBanner();

}
