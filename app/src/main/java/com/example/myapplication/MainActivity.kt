package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.view.Gravity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        showMessage(NCREATE, 100)
    }

    override fun onStart() {
        super.onStart()
//        setContentView(R.layout.activity_main)
        showMessage(NSTART, Gravity.LEFT)
    }

    override fun onStop() {
        super.onStop()
//        setContentView(R.layout.activity_main)
        showMessage(NSTOP, Gravity.CENTER)
    }

    override fun onPause() {
        super.onPause()
//        setContentView(R.layout.activity_main)
        showMessage(NPAUSE, Gravity.RIGHT)
    }

    override fun onDestroy() {
        super.onDestroy()
//        setContentView(R.layout.activity_main)
        showMessage(NDESTROY, Gravity.FILL)
    }

    override fun onRestart() {
        super.onRestart()
//        setContentView(R.layout.activity_main)
        showMessage(NRESTART, Gravity.FILL_HORIZONTAL)
    }

    override fun onResume() {
        super.onResume()
//        setContentView(R.layout.activity_main)
        showMessage(NRESUME, Gravity.TOP)
    }

    private val NCREATE  = "Activity CREATED"
    private val NSTART   = "Activity STARTED"
    private val NRESUME  = "Activity RESUMED"
    private val NPAUSE   = "Activity PAUSED"
    private val NSTOP    = "Activity STOPED"
    private val NRESTART = "Activity RESTARTED"
    private val NDESTROY = "Activity DESTROYED"

    fun showMessage(s: String, align: Int){
        var t = Toast.makeText(this,s,Toast.LENGTH_SHORT)

        when (align) {
            Gravity.LEFT            -> t.setGravity(Gravity.LEFT,0,0)
            Gravity.TOP             -> t.setGravity(Gravity.TOP,0,0)
            Gravity.RIGHT           -> t.setGravity(Gravity.RIGHT,0,0)
            Gravity.CENTER          -> t.setGravity(Gravity.CENTER,0,0)
            Gravity.FILL_HORIZONTAL -> t.setGravity(Gravity.FILL_HORIZONTAL,0,0)
            Gravity.FILL            -> t.setGravity(Gravity.FILL,0,0)
        }
        t.show()
    }
}