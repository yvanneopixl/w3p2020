package com.neopixl.lesmovies

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by Yvan Moté on 2019-10-17.
 */
@Parcelize
class Movie(val title: String, val synopsis: String, val releaseYear: Int): Parcelable {

}