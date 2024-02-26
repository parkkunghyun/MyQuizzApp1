package org.techtown.myquizzapp1

object Constants {
    // 사용자 이름이나 질문

    // 질문 전부를 가져옴
    fun getQuestions(): ArrayList<Question> {
        val questionsList = ArrayList<Question>()

        val que1 = Question(
            1,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina",
            "Australia",
            "Korea",
            "China",
            1
        )
        questionsList.add(que1)

        val que2 = Question(
            2,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Argentina",
            "Australia",
            "Korea",
            "China",
            2
        )
        questionsList.add(que2)

        val que3 = Question(
            3,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Argentina",
            "Belgium",
            "Korea",
            "China",
            2
        )
        questionsList.add(que3)

        val que4 = Question(
            4,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Argentina",
            "Belgium",
            "Brazil",
            "China",
            3
        )
        questionsList.add(que4)

        val que5 = Question(
            5,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Argentina",
            "Belgium",
            "Brazil",
            "Denmark",
            4
        )
        questionsList.add(que5)

        val que6 = Question(
            6,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Argentina",
            "Fiji",
            "Brazil",
            "China",
            2
        )
        questionsList.add(que6)

        val que7 = Question(
            7,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Argentina",
            "Belgium",
            "Brazil",
            "Germany",
            4
        )
        questionsList.add(que7)

        val que8 = Question(
            8,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_india,
            "Argentina",
            "Belgium",
            "India",
            "China",
            3
        )
        questionsList.add(que8)

        val que9 = Question(
            9,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Argentina",
            "Belgium",
            "Brazil",
            "Kuwait",
            4
        )
        questionsList.add(que9)

        val que10 = Question(
            10,
            "What country this flag belong to?",
            R.drawable.ic_flag_of_new_zealand,
            "Argentina",
            "Belgium",
            "Brazil",
            "New_zealand",
            3
        )
        questionsList.add(que10)

        return questionsList
    }
}