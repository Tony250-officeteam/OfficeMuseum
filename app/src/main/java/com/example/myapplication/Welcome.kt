package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_main.*
import android.content.Intent
import android.os.Parcel
import android.os.Parcelable


class Welcome() : AppCompatActivity(), Parcelable {

    private val tag ="Welcome"

    constructor(parcel: Parcel) : this() {
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome)
        val button1: Button = findViewById(R.id.button2)
        button1.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            //跳转后关闭当前欢迎页面
            //跳转后关闭当前欢迎页面
            this.finish()
        }
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<Welcome> {
        override fun createFromParcel(parcel: Parcel): Welcome {
            return Welcome(parcel)
        }

        override fun newArray(size: Int): Array<Welcome?> {
            return arrayOfNulls(size)
        }
    }

}
