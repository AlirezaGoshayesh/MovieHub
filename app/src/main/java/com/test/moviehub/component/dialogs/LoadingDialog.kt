package com.test.moviehub.component.dialogs

import android.app.Dialog
import android.content.Context
import com.test.moviehub.R
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class LoadingDialog @Inject constructor(@ActivityContext private val context: Context) {

    private var dialog: Dialog? = null

    init {
        dialog = Dialog(context)
        parseView()
    }

    fun show() {
        dialog?.show()
    }

    fun hide() {
        if (dialog != null) {
            dialog!!.dismiss()
        }
    }

    private fun parseView() {
        dialog?.apply {
            setContentView(R.layout.dialog_loading)
            window!!.setBackgroundDrawableResource(android.R.color.transparent)
            setCancelable(false)
            setCanceledOnTouchOutside(false)
        }
    }

}