package com.example.bajajjetpackcomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.bajajjetpackcomponents.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        var mainXl: ActivityMainBinding =
            DataBindingUtil.setContentView(this, R.layout.activity_main)


        var myViewModel = ViewModelProvider(this).get(ViewModelClass::class.java)

        var userObj = Users("Kshitij")
        mainXl.myuser = userObj

        myViewModel.factsLiveData.observe(this) {

            Log.d("Main Activity", it)
            mainXl.resultTextView.setText(it)
        }

        mainXl.clickButton.setOnClickListener {
            myViewModel.updateLiveData()
        }
    }
}