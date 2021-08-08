package com.pens.themovies.model

import androidx.room.Entity

@Entity
data class MovieDetailGenres(
    var names: String = ""
)
