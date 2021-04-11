package com.test.moviehub.component

import android.app.Activity
import android.view.View
import android.widget.TextView
import androidx.core.view.ViewCompat
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar

fun Fragment.showSnackBar(root: View, message: String) {
    val snackBar = Snackbar.make(root, message, Snackbar.LENGTH_LONG)
    val tv = snackBar.view.findViewById(com.google.android.material.R.id.snackbar_text) as TextView
    ViewCompat.setLayoutDirection(snackBar.view, ViewCompat.LAYOUT_DIRECTION_RTL)
    snackBar.show()
}

fun Activity.showSnackBar(root: View, message: String) {
    val snackBar = Snackbar.make(root, message, Snackbar.LENGTH_LONG)
    val tv = snackBar.view.findViewById(com.google.android.material.R.id.snackbar_text) as TextView
    ViewCompat.setLayoutDirection(snackBar.view, ViewCompat.LAYOUT_DIRECTION_RTL)
    snackBar.show()
}