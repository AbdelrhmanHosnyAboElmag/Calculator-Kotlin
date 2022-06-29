package com.example.calculator

import androidx.compose.runtime.Composable
import java.lang.Exception

class MathModel {
    companion object {
        fun mathhandler(mutableList: MutableList<String>): String {
            var sum = 0.0
            var i = 0
            try {
                while (i < mutableList.size) {
                    when (mutableList[i]) {
                        "+" -> {
                            val secandnumber: Double = mutableList[i + 1].toDouble()
                            sum += secandnumber
                            mutableList[i + 1] = sum.toString()
                        }
                        "-" -> {
                            val secandnumber: Double = mutableList[i + 1].toDouble()
                            sum -= secandnumber
                            mutableList[i + 1] = sum.toString()
                        }
                        "/" -> {
                            val secandnumber: Double = mutableList[i + 1].toDouble()
                            sum /= secandnumber
                            mutableList[i + 1] = sum.toString()
                        }
                        "*" -> {
                            val secandnumber: Double = mutableList[i + 1].toDouble()
                            sum *= secandnumber
                            mutableList[i + 1] = sum.toString()
                        }
                        else -> {
                            sum = mutableList[i].toDouble()
                        }
                    }
                    i++
                }
                mutableList.clear()
                return sum.toString()
            } catch (e: Exception) {
                mutableList.clear()
                return "MATH ERROR"
            }
        }

        val deleteNumber: (String) -> String = { it -> it.substring(0, it.length - 1) }
    }

}