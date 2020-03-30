package com.example.messageshare.Activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.messageshare.Constants
import com.example.messageshare.R
import com.example.messageshare.showToast
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    companion object{
        val TAG: String = SecondActivity::class.java.simpleName
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        // safe call ?.
        // safe call with let ?.let{}


        val bundle: Bundle?=intent.extras
        bundle?.let {

            val msg = bundle.getString(Constants.USER_MSG_KEY)
            showToast(msg.toString())
            txtUserMessage.text = msg

        }

    }
}