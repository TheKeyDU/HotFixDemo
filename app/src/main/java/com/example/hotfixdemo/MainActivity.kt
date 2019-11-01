package com.example.hotfixdemo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import com.tinkerpatch.sdk.TinkerPatch

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    //点击崩溃
    @SuppressLint("WrongConstant")
    fun crash(v: View) {

   // Toast.makeText(this,(3/0).toString(),3000).show()
    Toast.makeText(this,"fix！！！！！！！！！！！",3000).show()
    }
    //点击热修复
    fun HotFix(v: View) {
        TinkerPatch.with().fetchPatchUpdate(true)
    }

}
