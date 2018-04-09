package com.gmail.farasabiyyu12.daftarhalalmui.ApiRetrofit;

import com.gmail.farasabiyyu12.daftarhalalmui.ResponseServer.ResponseReadData;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by farasabiyyuhandoko on 30/03/2018.
 */

public interface ApiService {
    @GET("echo?user_content_key=O76MGse2YApACsA9YQ6URLKDh7HlwOuBgGGY8olxnpXhgXEksNGFdAZvHQTo66EaDqr5Eg2dC-rnYt1TxGj5mrmpC-VIoXblOJmA1Yb3SEsKFZqtv3DaNYcMrmhZHmUMWojr9NvTBuB6lHT6qnqYcmFWggwoSVQQy1I5Bo9qCEkCzCDqo9woNJdb-TW_oskRAvMiLJmfu8uHcCUBLJV6YgIO_Ew8o_0imBB_KEA6gBFJTkuTqaPWp36w6lqZ9_xTy2bHR3CakFrc_ScPTHfLrg&lib=MUBVDLa2DH4xDzprwWT1Nz4v1P8nYvko1")
    Call<ResponseReadData> response_read_data();
}
