package com.test.moviehub.component.dialogs

import android.app.Dialog
import android.content.Context
import android.view.LayoutInflater
import androidx.databinding.DataBindingUtil
import com.test.moviehub.R
import com.test.moviehub.databinding.DialogLoadingBinding
import dagger.hilt.android.qualifiers.ActivityContext
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

/** loading dialog to show for loading process*/
@ActivityScoped
class LoadingDialog @Inject constructor(@ActivityContext private val context: Context) {

    lateinit var binding: DialogLoadingBinding

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
        binding = DataBindingUtil.inflate(
            LayoutInflater.from(context),
            R.layout.dialog_loading,
            null,
            false
        )
        dialog?.apply {
            //making dialog background transparent
            window!!.setBackgroundDrawableResource(android.R.color.transparent)
            setCancelable(false)
            setCanceledOnTouchOutside(false)
        }
    }

}