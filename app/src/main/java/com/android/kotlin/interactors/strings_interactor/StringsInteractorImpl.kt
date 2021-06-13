package com.android.kotlin.interactors.strings_interactor

import android.content.Context
import com.android.kotlin.R

class StringsInteractorImpl (private val context: Context): StringsInteractor {
    override var helloMVP = context.getString(R.string.hello_mvp)
}