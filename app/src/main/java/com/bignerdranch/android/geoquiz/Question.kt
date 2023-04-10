package com.bignerdranch.android.geoquiz
//Just a class to make Question objects
import androidx.annotation.StringRes

data class Question(@StringRes val textResId: Int, val answer: Boolean)