package org.uhworks.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import org.uhworks.swoosh.Utilities.LOG_TAG

// Base Activity class to study Activity Lifecycle
open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        Log.d(LOG_TAG, "${javaClass.simpleName} OnCreate")
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        Log.d(LOG_TAG, "${javaClass.simpleName} OnStart")
        super.onStart()
    }

    override fun onResume() {

        Log.d(LOG_TAG, "${javaClass.simpleName} OnResume")
        super.onResume()
    }

    override fun onRestart() {
        Log.d(LOG_TAG, "${javaClass.simpleName} onRestart")

        super.onRestart()
    }

    override fun onPause() {
        Log.d(LOG_TAG, "${javaClass.simpleName} OnPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(LOG_TAG, "${javaClass.simpleName} OnStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(LOG_TAG, "${javaClass.simpleName} onDestroy")

        super.onDestroy()
    }

}
