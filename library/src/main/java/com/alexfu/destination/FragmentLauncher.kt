package com.alexfu.destination

import android.content.Intent
import androidx.fragment.app.Fragment

internal class FragmentLauncher(private val fragment: Fragment) : Launcher {
    override fun startActivity(intent: Intent) {
        fragment.startActivity(intent)
    }

    override fun startActivityForResult(intent: Intent, reqCode: Int) {
        fragment.startActivityForResult(intent, reqCode)
    }
}
