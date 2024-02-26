package org.techtown.myquizzapp1

data class Question(
    // 질문, 이미지
    val id: Int,
    val question: String,
    val image: Int, // integer속성으로 부르기 가능
    val optionOne: String,
    val optionTwo: String,
    val optionThree: String,
    val optionFour: String,
    val correctAnswer: Int
)
