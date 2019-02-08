package com.example.crap_.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.util.Log
import android.widget.Button
import android.widget.TextView
import java.lang.RuntimeException


class MainActivity : AppCompatActivity() {

    val numberList : MutableList<String> = mutableListOf()
    val opelatorList : MutableList<String> = mutableListOf()
    var numberstream : String = String()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.one).setOnClickListener(onNumberClickListener)
        findViewById<Button>(R.id.two).setOnClickListener(onNumberClickListener)
        findViewById<Button>(R.id.three).setOnClickListener(onNumberClickListener)
        findViewById<Button>(R.id.four).setOnClickListener(onNumberClickListener)
        findViewById<Button>(R.id.five).setOnClickListener(onNumberClickListener)
        findViewById<Button>(R.id.six).setOnClickListener(onNumberClickListener)
        findViewById<Button>(R.id.seven).setOnClickListener(onNumberClickListener)
        findViewById<Button>(R.id.eight).setOnClickListener(onNumberClickListener)
        findViewById<Button>(R.id.nine).setOnClickListener(onNumberClickListener)
        findViewById<Button>(R.id.zero).setOnClickListener(onNumberClickListener)

        // TODO: 足りないClickListenerを登録する
    }

    private val onNumberClickListener = object:View.OnClickListener {
        override fun onClick(button: View?) {
            val formula : TextView = findViewById(R.id.formula)
            var tmp : String = ""
            if(button is Button) {
                when (button.id) {
                    R.id.one -> {
                        tmp = "1"
                        numberstream = "{$numberstream}1"
                        Log.d("Button", "call 1")
                    }
                    R.id.two -> {
                        tmp = "2"
                        numberstream = "{$numberstream}2"
                        Log.d("Button", "call 2")
                    }
                    R.id.three -> {
                        tmp = "3"
                        numberstream = "{$numberstream}3"
                        Log.d("Button", "call 3")
                    }
                    R.id.four -> {
                        tmp = "4"
                        numberstream = "{$numberstream}4"
                        Log.d("Button", "call 4")
                    }
                    R.id.five -> {
                        tmp = "5"
                        numberstream = "{$numberstream}5"
                        Log.d("Button", "call 5")
                    }
                    R.id.six -> {
                        tmp = "6"
                        numberstream = "{$numberstream}6"
                        Log.d("Button", "call 6")
                    }
                    R.id.seven -> {
                        tmp = "7"
                        numberstream = "{$numberstream}7"
                        Log.d("Button", "call 7")
                    }
                    R.id.eight -> {
                        tmp = "8"
                        numberstream = "{$numberstream}8"
                        Log.d("Button", "call 8")
                    }
                    R.id.nine -> {
                        tmp = "9"
                        numberstream = "{$numberstream}9"
                        Log.d("Button", "call 9")
                    }
                    R.id.zero -> {
                        tmp = "0"
                        numberstream = "{$numberstream}0"
                        Log.d("Button", "call 0")
                    }
                }
                formula.text = "${formula.text}$tmp"
            } else {
                throw RuntimeException("button is null.")
            }
        }

    }

    private val onOpelatorsClickListener = object:View.OnClickListener{
        override fun onClick(button: View?) {
            val formula : TextView = findViewById(R.id.formula)

            if(button is Button){
                when(button.id){
                    R.id.add -> {
                        numberList.add(numberstream)
                        opelatorList.add("+")
                        formula.text = "${formula.text}+"
                        Log.d("opelator", "add called")
                    }
                    R.id.sub -> {
                        numberList.add(numberstream)
                        opelatorList.add("-")
                        formula.text = "${formula.text}-"
                        Log.d("opelator", "sub called")
                    }
                    R.id.multiple -> {
                        numberList.add(numberstream)
                        opelatorList.add("*")
                        formula.text = "${formula.text}*"
                        Log.d("opelator", "multi called")
                    }
                    R.id.divition -> {
                        numberList.add(numberstream)
                        opelatorList.add("/")
                        formula.text = "${formula.text}/"
                        Log.d("opelator", "div called")
                    }
                    R.id.mod -> {
                        numberList.add(numberstream)
                        opelatorList.add("%")
                        formula.text = "${formula.text}%"
                        Log.d("opelator", "mod called")
                    }
                }
            }else{
                throw RuntimeException("undifind Opelator.")
            }
        }
    }

    private val onCalcListener = object:View.OnClickListener{
        override fun onClick(button : View?){
            numberList.add(numberstream)
            // TODO: エンターを押した処理を書く
            Log.d("Calc", "numberList size : ${numberList.size}")
        }
    }

    // TODO: Delete, Clear,符号反転処理を書く
}