package com.bignerdranch.android.geoquiz

import android.util.Log
import androidx.lifecycle.ViewModel

private const val TAG = "QuizViewModel"

class QuizViewModel : ViewModel() {
// Make the global and local variables needed for keys, cheater boolean, and current index
    var currentIndex = 0
    var isCheater = false
//Make the question bank using a list of string and boolean pairs
    private val questionBank = listOf(
        Question(R.string.question_australia, true),
        Question(R.string.question_oceans, true),
        Question(R.string.question_mideast, false),
        Question(R.string.question_africa, false),
        Question(R.string.question_americas, true),
        Question(R.string.question_asia, true)
    )

    val currentQuestionAnswer: Boolean
        get() = questionBank[currentIndex].answer
// Vals for the current question and answer
    val currentQuestionText: Int
        get() = questionBank[currentIndex].textResId
// Function to move to the next question by setting the current index to itself plus 1
    fun moveToNext() {
        currentIndex = (currentIndex + 1) % questionBank.size
    }
}
