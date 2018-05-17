package com.jtym.ckotlin

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.Menu
import android.view.MenuItem

import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.content_main.*

class MainActivity : AppCompatActivity() {
    companion object {
        const val TAG = "MainActivity"
        init {
            System.loadLibrary("native-lib")
        }
    }

    private external fun stringFromJNI(): String
    private external fun booleanFromJNI(): Boolean
    private external fun byteFromJNI(): Byte
    private external fun charFromJNI(): Char
    private external fun shortFromJNI(): Short
    private external fun intFromJNI(): Int
    private external fun longFromJNI(): Long
    private external fun floatFromJNI(): Float
    private external fun doubleFromJNI(): Double

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }

        // Example of a call to a native method
        sample_text.text = stringFromJNI()
        val boolean = booleanFromJNI()
        Log.i(TAG, "boolean: $boolean")
        val byte = byteFromJNI()
        Log.i(TAG, "byte: $byte")
        val char = charFromJNI()
        Log.i(TAG, "Char: $char")
        val short = shortFromJNI()
        Log.i(TAG, "Short: $short")
        val int = intFromJNI()
        Log.i(TAG, "Int: $int")
        val long = longFromJNI()
        Log.i(TAG, "Long: $long")
        val float = floatFromJNI()
        Log.i(TAG, "Float: $float")
        val double = doubleFromJNI()
        Log.i(TAG, "Double: $double")
    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        // Inflate the menu; this adds items to the action bar if it is present.
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        return when (item.itemId) {
            R.id.action_settings -> true
            else -> super.onOptionsItemSelected(item)
        }
    }
}
