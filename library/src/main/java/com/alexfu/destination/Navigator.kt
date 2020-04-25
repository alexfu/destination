package com.alexfu.destination

import android.app.Activity
import androidx.fragment.app.Fragment

/**
 * Navigates to a [Destination].
 */
class Navigator private constructor(private val launcher: Launcher) {
    constructor(activity: Activity) : this(ActivityLauncher(activity))
    constructor(fragment: Fragment) : this(FragmentLauncher(fragment))

    fun navigateTo(destination: Destination, reqCode: Int? = null) {
        if (reqCode == null) {
            launcher.startActivity(destination.getIntent())
        } else {
            launcher.startActivityForResult(destination. getIntent(), reqCode)
        }
    }
}
