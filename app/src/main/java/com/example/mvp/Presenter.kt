package com.example.mvp

import com.example.mvp.Repositories.NumberRepository

/**
 * Created by Noé Benjamín Reynoso Aguirre on 1/19/2023.
 */
class Presenter(private val view: MVPComponents.View, private val repository: NumberRepository?) : MVPComponents.PresenterContract{
    private val model :MVPComponents.Model = Model(this)
    override fun loadNumber() {repository?.getNumber(this)}



    override fun calculate(x: Int, y: Int) {
        model.calculate(x,y)
    }

    override fun updateCalculation(value: Int) {
        view.calculate(value)
    }

    override fun updateCalculation2(value: Int) {
        view.displayNumber(value)
    }

}