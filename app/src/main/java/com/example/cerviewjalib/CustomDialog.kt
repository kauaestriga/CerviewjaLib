package com.example.cerviewjalib

import android.app.AlertDialog
import android.content.Context

class CustomDialog(
    var context: Context
) {

    fun showError(message: String?) {
        val errorDialog = AlertDialog.Builder(context)
        errorDialog.setTitle("Ops...")
        errorDialog.setMessage(message)
        errorDialog.setNeutralButton("Entendi") { dialog, _ -> dialog.dismiss() }
        errorDialog.show()
    }

    fun showError(messageId: Int) {
        showError(context.getString(messageId))
    }

    fun showMessage(message: String?) {
        val errorDialog = AlertDialog.Builder(context)
        errorDialog.setTitle("Oba!!")
        errorDialog.setMessage(message)
        errorDialog.setPositiveButton("Tá bom!") { dialog, _ -> dialog.dismiss() }
        errorDialog.show()
    }

    fun showMessage(messageId: Int) {
        showMessage(context.getString(messageId))
    }
}
