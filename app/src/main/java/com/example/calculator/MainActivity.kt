package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.fathzer.soft.javaluator.DoubleEvaluator
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //onclick method
    fun allClearAction(view: View) {
        workingsTV.text=""
        resultsTV.text=""

    }
    fun backSpaceAction(view: View) {
        workingsTV.text=del(workingsTV.text.toString())
    }
    fun equalsAction(view: View) {
        var eval=DoubleEvaluator()
        var expersion=workingsTV.text.replace(Regex("x"), "*" )
        var result=eval.evaluate(expersion)
        resultsTV.text=result.toString()
    }
    fun numberAction(view: View) {
        var obj= view as Button//down casting
        workingsTV.append(obj.text)
    }
    fun operationAction(view: View) {
        var obj= view as Button//down casting
        workingsTV.append(obj.text)
    }
    //math method
    fun del(string:String): String {
        var newtext:String=""
        if(string.length>0){
            newtext=string.substring(0,string.length-1)
        }
        return newtext
    }
}

