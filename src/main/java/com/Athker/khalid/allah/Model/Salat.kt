package com.Athker.khalid.allah.Model
import com.google.gson.annotations.SerializedName


data class Salat(
    @SerializedName("address")
    val address: String,
    @SerializedName("city")
    val city: String,
    @SerializedName("country")
    val country: String,
    @SerializedName("country_code")
    val countryCode: String,
    @SerializedName("daylight")
    val daylight: String,
    @SerializedName("for")
    val forX: String,
    @SerializedName("items")
    val items: List<Item>,
    @SerializedName("latitude")
    val latitude: String,
    @SerializedName("link")
    val link: String,
    @SerializedName("longitude")
    val longitude: String,
    @SerializedName("map_image")
    val mapImage: String,
    @SerializedName("method")
    val method: Int,
    @SerializedName("postal_code")
    val postalCode: String,
    @SerializedName("prayer_method_name")
    val prayerMethodName: String,
    @SerializedName("qibla_direction")
    val qiblaDirection: String,
    @SerializedName("query")
    val query: String,
    @SerializedName("sealevel")
    val sealevel: String,
    @SerializedName("state")
    val state: String,
    @SerializedName("status_code")
    val statusCode: Int,
    @SerializedName("status_description")
    val statusDescription: String,
    @SerializedName("status_valid")
    val statusValid: Int,
    @SerializedName("timezone")
    val timezone: String,
    @SerializedName("title")
    val title: String,
    @SerializedName("today_weather")
    val todayWeather: TodayWeather
) {
    data class Item(
        @SerializedName("asr")
        val asr: String,
        @SerializedName("date_for")
        val dateFor: String,
        @SerializedName("dhuhr")
        val dhuhr: String,
        @SerializedName("fajr")
        val fajr: String,
        @SerializedName("isha")
        val isha: String,
        @SerializedName("maghrib")
        val maghrib: String,
        @SerializedName("shurooq")
        val shurooq: String
    )

    data class TodayWeather(
        @SerializedName("pressure")
        val pressure: String,
        @SerializedName("temperature")
        val temperature: String
    )
}