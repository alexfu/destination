package com.alexfu.destination

import android.app.Activity
import android.content.Intent

internal class ActivityLauncher(private val activity: Activity) : Launcher {
    override fun startActivity(intent: Intent) {
        activity.startActivity(intent)
    }

    override fun startActivityForResult(intent: Intent, reqCode: Int) {
        activity.startActivityForResult(intent, reqCode)
    }
}
