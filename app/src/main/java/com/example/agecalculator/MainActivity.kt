package com.example.agecalculator

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calculateAgeBtn.setOnClickListener {

            val userDoB = ageEt.text.toString().trim()
            val year:Int = Calendar.getInstance().get(Calendar.YEAR)
            if (userDoB == "") {
                Toast.makeText(this, " please enter year", Toast.LENGTH_SHORT).show()
            }
            else if (userDoB > year.toString() ) {
                Toast.makeText(this,"Enter year should be ;ess than current year",Toast.LENGTH_SHORT).show()
            }
            else {
                val myAge = year - userDoB.toInt()
                myAgeTv.text = "Age is" +myAge+ "Years"
            }
        }
    }
}

