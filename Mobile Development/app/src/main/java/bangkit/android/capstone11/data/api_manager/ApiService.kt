package bangkit.android.capstone11.data.api_manager

import bangkit.android.capstone11.data.api_manager.api_response.LoginResponse
import bangkit.android.capstone11.data.api_manager.api_response.RegisterResponse
import bangkit.android.capstone11.data.api_manager.api_response.ScanResponse
import bangkit.android.capstone11.data.api_manager.api_response.UpdateResponse
import okhttp3.MultipartBody
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.Multipart
import retrofit2.http.POST
import retrofit2.http.PUT
import retrofit2.http.Part
import retrofit2.http.Path

interface ApiService {
    @FormUrlEncoded
    @POST("api/auth/signup")
    suspend fun register(
        @Field("username") username: String,
        @Field("email") email: String,
        @Field("password") password: String
    ): RegisterResponse

    @FormUrlEncoded
    @POST("api/auth/signin")
    suspend fun login(
        @Field("username") username: String,
        @Field("password") password: String
    ): LoginResponse

    @FormUrlEncoded
    @PUT("api/auth/update/{id}")
    suspend fun Update(
        @Path("id") id: String,
        @Field("username") username: String,
        @Field("email") email: String
    ): UpdateResponse


    @Multipart
    @POST("api/predict")
    suspend fun postImage(
        @Part file: MultipartBody.Part
    ): ScanResponse
}