package com.example.animeapp.Data

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Anime(
    val name: String,
    val city: String,
    val image: Int,
    val hot: String,
    val uri: String
):Parcelable



