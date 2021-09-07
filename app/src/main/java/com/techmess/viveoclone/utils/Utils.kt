package com.techmess.viveoclone.utils

import android.content.Context
import android.widget.Toast

class Utils {
    companion object{
        fun Context.toast(message: CharSequence) {
            Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
        }
    }
}