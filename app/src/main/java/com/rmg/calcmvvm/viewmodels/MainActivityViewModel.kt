package com.rmg.calcmvvm.viewmodels

import android.view.View
import androidx.databinding.ObservableField

class MainActivityViewModel {
    var fieldA: ObservableField<String> = ObservableField("")
    var fieldB: ObservableField<String> = ObservableField("")
    var fieldResult: ObservableField<String> = ObservableField("")

    fun calculateSum(){
        var a = fieldA.get().toString().toDouble()
        var b = fieldB.get().toString().toDouble()

        var result = a + b

        fieldResult.set(result.toString())
    }
}