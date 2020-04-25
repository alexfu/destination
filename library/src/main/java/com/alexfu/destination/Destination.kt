package com.alexfu.destination

import android.content.Intent

/**
 * A [Destination] describes how to navigate to an [android.app.Activity] using an
 * [android.content.Intent].
 */
interface Destination {
    fun getIntent(): Intent
}
