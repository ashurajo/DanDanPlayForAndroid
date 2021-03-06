package com.xyoye.common_component.extension

import android.content.Context
import android.content.res.Configuration
import android.graphics.Point
import android.graphics.drawable.Drawable
import android.os.Build
import android.view.WindowManager
import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

/**
 * Created by xyoye on 2020/9/29.
 */

fun Context.getResColor(@ColorRes colorRes: Int): Int {
    return ContextCompat.getColor(this, colorRes)
}

fun Context.getResDrawable(@DrawableRes drawableRes: Int): Drawable? {
    return ContextCompat.getDrawable(this, drawableRes)
}

fun Context.getResString(@StringRes id: Int): String {
    return resources.getString(id)
}

fun Context.isNightMode(): Boolean {
    val mode = resources.configuration.uiMode and Configuration.UI_MODE_NIGHT_MASK
    return mode == Configuration.UI_MODE_NIGHT_YES
}

fun Context.getScreenHeight(): Int {
    val wm = getSystemService(Context.WINDOW_SERVICE) as WindowManager
    val point = Point()
    wm.defaultDisplay.getRealSize(point)
    return point.y
}

fun Context.getScreenWidth(): Int {
    val wm = getSystemService(Context.WINDOW_SERVICE) as WindowManager
    val point = Point()
    wm.defaultDisplay.getRealSize(point)
    return point.x
}

fun AppCompatActivity.getResColor(@ColorRes colorRes: Int): Int {
    return ContextCompat.getColor(this, colorRes)
}

fun AppCompatActivity.getResDrawable(@DrawableRes drawableRes: Int): Drawable? {
    return ContextCompat.getDrawable(this, drawableRes)
}