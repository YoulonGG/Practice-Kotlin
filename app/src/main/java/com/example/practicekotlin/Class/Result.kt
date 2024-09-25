package com.example.practicekotlin.Class

sealed class Result(val errorMessage: String) {
    data object Success : Result("You have passed.")
    data class Failure(
        val errorTitle: String,
        val errorCode: Int) : Result("You have Fail.")
}