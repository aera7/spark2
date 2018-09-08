package net.simplifiedcoding.retrofitandroidtutorial;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by cyril.elbaz on 07/09/2018.
 */

public interface Api {

    @FormUrlEncoded
    @POST("createuser")
    Call<ResponseBody>  createUser(
                @Field("name") String name
            );
}
