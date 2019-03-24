package com.appmp3.appnhac.Service;

import com.appmp3.appnhac.Model.Quangcao;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface Dataservice {
    //Hàm lấy dữ liệu get từ phía server
    @GET("songbanner.php")
    //Hàm call nhận dữ liệu server trả về
    Call<List<Quangcao>> GetDataBanner();

}

