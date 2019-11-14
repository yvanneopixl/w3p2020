package com.neopixl.intenttest

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    private val REQUEST_CODE_THIRD_ACTIVITY = 1010

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        secondResultTextView.text = null

        secondButton.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivityForResult(intent, REQUEST_CODE_THIRD_ACTIVITY)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)

        when(requestCode) {
            REQUEST_CODE_THIRD_ACTIVITY -> {
                if(resultCode== Activity.RESULT_OK) {
                    secondResultTextView.text = getString(R.string.message_ok)
                } else {
                    secondResultTextView.text = getString(R.string.message_cancel)
                }
            }
        }
    }
}
