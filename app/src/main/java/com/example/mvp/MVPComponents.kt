package com.example.mvp

/**
 * Created by Noé Benjamín Reynoso Aguirre on 1/19/2023.
 */
interface MVPComponents {
    interface View{
        fun calculate(value:Int)
        fun displayNumber(value:Int)
    }

    interface PresenterContract{
        fun loadNumber()
        fun calculate(x:Int,y:Int)
        fun updateCalculation(value:Int)
        fun updateCalculation2(value:Int)
    }
    interface Model{
        fun calculate(x:Int,y:Int)
    }
}