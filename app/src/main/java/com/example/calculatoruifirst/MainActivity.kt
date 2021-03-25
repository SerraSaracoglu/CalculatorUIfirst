package com.example.calculatoruifirst

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val birinciSayi:EditText=findViewById(R.id.firstNumber)
        val ikinciSayi:EditText=findViewById(R.id.ikinciSayi)
        val sonuc:TextView=findViewById(R.id.solution)
        val toplama:Button=findViewById(R.id.addition)

        toplama.setOnClickListener {
            val number1:Int=Integer.parseInt(birinciSayi.toString())
            val number2:Int=Integer.parseInt((ikinciSayi.toString()))
            val last=number1+number2
            sonuc.text=last.toString()
        }


        val cikarma:Button=findViewById(R.id.substraction)

        cikarma.setOnClickListener {
            val number1:Int=Integer.parseInt(birinciSayi.toString())
            val number2:Int=Integer.parseInt((ikinciSayi.toString()))
            val last=number1-number2
            sonuc.text=last.toString()
        }
        val carpma:Button=findViewById(R.id.multiplication)

        carpma.setOnClickListener {
            val number1:Int=Integer.parseInt(birinciSayi.toString())
            val number2:Int=Integer.parseInt((ikinciSayi.toString()))
            val last=number1*number2
            sonuc.text=last.toString()
        }
        var bolme:Button=findViewById(R.id.division)
        bolme.setOnClickListener {
            val number1:Int=Integer.parseInt(birinciSayi.toString())
            val number2:Int=Integer.parseInt((ikinciSayi.toString()))
            val last=number1/number2
            sonuc.text=last.toString()
        }
    }
}