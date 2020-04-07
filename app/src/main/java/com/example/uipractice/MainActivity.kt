package com.example.uipractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

// : extends 상속
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        loginBtn.setOnClickListener {

            //로그인버튼이 눌리면 할 일 지정.




            Log.d("로그인버튼", "버튼 클릭됨")
            val inputEmail = emailEdt.text.toString()

            //입력한 아이디는 ?입니다.
            val formatteredStr = "입력한 아이디는 ${inputEmail}입니다/"

            Toast.makeText(this, inputEmail,"로그인 버튼 눌림", Toast.LENGTH_SHORT).show()
        }


        loginBtn.setOnLongClickListener{

            Log.d("로그인버튼", "버튼 길게 누름")
            return@setOnLongClickListener true
            //return@함수이름 =>해당함수의 결과로 설정 명시.
            // return true : 롱클릭만 전용 처리.  false : 일반 클릭도 같이 실행.
        }
    }
}
