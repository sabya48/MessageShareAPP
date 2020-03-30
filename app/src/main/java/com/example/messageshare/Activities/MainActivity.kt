package com.example.messageshare.Activities

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.messageshare.Constants
import com.example.messageshare.R
import com.example.messageshare.showToast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity: AppCompatActivity(){

    companion object{
        val TAG: String = MainActivity::class.java.simpleName
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnShowToast.setOnClickListener {
            // code
            Log.i( TAG,"Button was Clicked !")
            showToast("Button was Clicked !", Toast.LENGTH_LONG)

        }
        btnsendMsgtonextAvctivity.setOnClickListener {

            val message:String= etUsermessage.text.toString()
            Toast.makeText(this , message,Toast.LENGTH_SHORT).show()

            val intent =Intent(this, SecondActivity::class.java)
            intent.putExtra(Constants.USER_MSG_KEY,"value")
            startActivity(intent)
        }
        btnShareToOtherApps.setOnClickListener {
            val message:String= etUsermessage.text.toString()
            val intent = Intent()
            intent.action = Intent.ACTION_SEND
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type= "text/plain"
            startActivity(Intent.createChooser(intent,"Share to :"))
        }
        btnRecycleViewDemo.setOnClickListener {
            val intent = Intent(this, HobbiesActivity::class.java)
            startActivity(intent)
        }
    }
}
