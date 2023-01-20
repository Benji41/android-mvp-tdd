package com.example.mvp

/**
 * Created by Noé Benjamín Reynoso Aguirre on 1/19/2023.
 */
class Model : MVPComponents.Model {
    private lateinit var presenter:MVPComponents.PresenterContract

    constructor(presenter: MVPComponents.PresenterContract) {
        this.presenter = presenter
    }

    override fun calculate(x: Int, y: Int) {
        presenter.updateCalculation(x*y)
    }
}