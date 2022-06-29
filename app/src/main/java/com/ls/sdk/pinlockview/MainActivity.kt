package com.ls.sdk.pinlockview

import android.app.Activity
import android.os.Bundle


class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mPinLockView = findViewById<PinLockView>(R.id.pin_lock_view)
        mPinLockView.setPinLockListener(object : PinLockListener{
            override fun onComplete(pin: String?) {
            }

            override fun onDel(curPin: String?) {
            }

            override fun onEmpty() {
            }

            override fun onPinChange(pinLength: Int, intermediatePin: String?) {
            }
        })
    }
}