package com.neopixl.exercice2

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resultTextView.text = null

        val onClickListener: (v: View) -> Unit = {
            if(canCompute()) {
                val number1 = firstNumberEditText.text.toString().toInt()
                val number2 = secondNumberEditText.text.toString().toInt()

                var result: Int? = null

                when(it.id) {
                    R.id.addButton -> result = number1+number2
                    R.id.substractButton -> result = number1-number2
                    R.id.multiplyButton -> result = number1*number2
                    R.id.divideButton -> {

                        if(number2!=0) {
                            result = number1/number2
                        } else {
                            resultTextView.text = getString(R.string.error_division_by_zero)
                        }
                    }
                }

                if(result != null) {
                    resultTextView.text = result.toString()
                }
            }
        }

        addButton.setOnClickListener(onClickListener)
        substractButton.setOnClickListener(onClickListener)
        multiplyButton.setOnClickListener(onClickListener)
        divideButton.setOnClickListener(onClickListener)

        /*
        addButton.setOnClickListener {
            if(canCompute()) {
                val number1 = firstNumberEditText.text.toString().toInt()
                val number2 = secondNumberEditText.text.toString().toInt()

                val result = number1+number2
                resultTextView.text = result.toString()
            }
        }

        substractButton.setOnClickListener {
            if(canCompute()) {
                val number1 = firstNumberEditText.text.toString().toInt()
                val number2 = secondNumberEditText.text.toString().toInt()

                val result = number1-number2
                resultTextView.text = result.toString()
            }
        }

        multiplyButton.setOnClickListener {
            if(canCompute()) {
                val number1 = firstNumberEditText.text.toString().toInt()
                val number2 = secondNumberEditText.text.toString().toInt()

                val result = number1*number2
                resultTextView.text = result.toString()
            }
        }

        divideButton.setOnClickListener {
            if(canCompute()) {
                val number1 = firstNumberEditText.text.toString().toInt()
                val number2 = secondNumberEditText.text.toString().toInt()

                if(number2!=0) {
                    val result = number1/number2
                    resultTextView.text = result.toString()
                } else {
                    resultTextView.text = getString(R.string.error_division_by_zero)
                }

            }
        }
        */
    }

    private fun canCompute() : Boolean {
        if(firstNumberEditText.text.isBlank()) {
            firstNumberEditText.setBackgroundColor(Color.RED)
            return false
        } else {
            firstNumberEditText.setBackgroundColor(Color.WHITE)
        }

        if(secondNumberEditText.text.isBlank()) {
            secondNumberEditText.setBackgroundColor(Color.RED)
            return false
        } else {
            secondNumberEditText.setBackgroundColor(Color.WHITE)
        }

        return true
    }
}
