package com.alexfu.destination

import android.content.Intent

/**
 * Launches an [android.app.Activity].
 */
internal interface Launcher {
    fun startActivity(intent: Intent)
    fun startActivityForResult(intent: Intent, reqCode: Int)
}
