package com.example.lixiang.dailypic2_android.model.api;


import com.example.lixiang.dailypic2_android.model.entity.HomePageSlide;
import com.example.lixiang.dailypic2_android.model.entity.HomePageUnits;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by lixiang on 2017/10/20.
 */

public interface ApiService {

    @GET("global/homePageSlide")
    Call<HomePageSlide> HomePageSlide();

    @GET("global/homePageUnits")
    Call<HomePageUnits> HomePageUnits();


//    @POST("mobile/homePage")
//    @FormUrlEncoded
//    Call<HomePage> HomePage(@Field("pageSize") String targetSentence,
//                            @Field("pageNum") String targetSentence2);
//
//    @POST("mobile/getDailyPicDetail")
//    @FormUrlEncoded
//    Call<DailyPicDetail> DailyPicDetail(@Field("imageId") String targetSentence);
//
//    @POST("mobile/getPlanetEarthDetail")
//    @FormUrlEncoded
//    Call<PlanetEarthDetail> PlanetEarthDetail(@Field("videoId") String targetSentence);
//
//    @POST("mobile/getDailyPic")
//    @FormUrlEncoded
//    Call<DailyPic> DailyPic(@Field("pageSize") String targetSentence,
//                            @Field("pageNum") String targetSentence2);
//
//    @POST("mobile/getPlanetEarth")
//    @FormUrlEncoded
//    Call<PlanetEarth> PlanetEarth(@Field("pageSize") String targetSentence,
//                                  @Field("pageNum") String targetSentence2);
//
//    @POST("mobile/sendMessage")
//    @FormUrlEncoded
//    Call<SendMessage> SendMessage(@Field("telephone") String targetSentence);
//
//    @POST("mobile/checkMessage")
//    @FormUrlEncoded
//    Call<CheckMessage> CheckMessage(@Field("telephone") String targetSentence,
//                                    @Field("code") String targetSentence2);
//
//    @POST("mobile/register")
//    @FormUrlEncoded
//    Call<Register> Register(@Field("telephone") String targetSentence,
//                            @Field("name") String targetSentence2);
//
//    @POST("mobile/checkName")
//    @FormUrlEncoded
//    Call<CheckName> CheckName(@Field("name") String targetSentence);
//
//    @POST("mobile/getArticleAttach")
//    @FormUrlEncoded
//    Call<ArticleAttach> ArticleAttach(@Field("articleId") String targetSentence,
//                                      @Field("userId") String targetSentence2,
//                                      @Field("type") String targetSentence3);
//
//    @POST("mobile/upvote")
//    @FormUrlEncoded
//    Call<UpVote> Upvote(@Field("articleId") String targetSentence,
//                        @Field("userId") String targetSentence2,
//                        @Field("type") String targetSentence3);
//
//
//    @POST("mobile/downvote")
//    @FormUrlEncoded
//    Call<DownVote> DownVote(@Field("articleId") String targetSentence,
//                            @Field("userId") String targetSentence2,
//                            @Field("type") String targetSentence3);
//
//    @POST("mobile/addCollection")
//    @FormUrlEncoded
//    Call<AddCollection> AddCollection(@Field("articleId") String targetSentence,
//                                      @Field("userId") String targetSentence2,
//                                      @Field("type") String targetSentence3);
//
//    @POST("mobile/cancelCollection")
//    @FormUrlEncoded
//    Call<CancelCollection> CancelCollection(@Field("articleId") String targetSentence,
//                                            @Field("userId") String targetSentence2);
//
//
//    @POST("mobile/submitComment")
//    @FormUrlEncoded
//    Call<SubmitComment> SubmitComment(@Field("userId") String targetSentence,
//                                      @Field("articleId") String targetSentence2,
//                                      @Field("articleType") String targetSentence3,
//                                      @Field("content") String targetSentence4);
//
//    @POST("mobile/myCollection")
//    @FormUrlEncoded
//    Call<MyCollection> MyCollection(@Field("userId") String targetSentence,
//                                    @Field("pageSize") String targetSentence2,
//                                    @Field("pageNum") String targetSentence3);
//
//    @GET("mobile/homePageSlide")
//    Call<HomePageSlide> HomePageSlide();

}
