package com.plcoding.cryptocurrencyappyt.data.remote

import com.plcoding.cryptocurrencyappyt.data.remote.dto.CoinDto
import retrofit2.http.GET

interface CoinPaprikaApi {


    @GET("/v1/coins")
    suspend fun getCoins(): List<CoinDto>
}