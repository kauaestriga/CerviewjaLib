package com.example.cerviewjalib

import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager

class SystemUtils {

    companion object {
        fun View.hideKeyboard() {
            val imm = context.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(windowToken, 0)
        }
    }
}