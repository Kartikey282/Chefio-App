package com.kar.chef.Remote;

import io.reactivex.Observable;
import okhttp3.ResponseBody;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface TCloudFunctions {

    @GET("getCustomToken")
    Observable<ResponseBody> getCustomToken (@Query("access_token")String accessToken);
}
