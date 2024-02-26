package org.techtown.myquizzapp1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName: EditText = findViewById(R.id.et_name)
        val btnStart: Button = findViewById(R.id.btn_start)

        btnStart.setOnClickListener{
            if (etName.text.isEmpty()) {
                Toast.makeText(this, "Please enter your Enter", Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                // java파일이라 저렇게 설정함!
                startActivity(intent)
                finish() //지금메인 액티비티가 닫힘! 즉 뒤로 가면 이 액티비티가 더는 안보임

            }
        }
    }
}