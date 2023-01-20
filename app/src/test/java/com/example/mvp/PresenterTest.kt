package com.example.mvp

import android.util.Log
import com.example.mvp.Repositories.NumberRepository
import org.junit.Assert.*
import org.junit.Test

/**
 * Created by Noé Benjamín Reynoso Aguirre on 1/19/2023.
 */
class PresenterTest{

    //@Test
    //fun shouldPass() = assertEquals(1,1+0)
    @Test
    fun shouldPassNumberToView(){
        //given
        val view = MockView()
        val repository = MockRepository()
        //when
        val presenter = Presenter(view,repository)
        presenter.loadNumber()
        //then
        assertEquals(true,view.passed)
    }
    private class MockView : MVPComponents.View{
        var passed= false
        override fun calculate(value: Int) {
            TODO("Not yet implemented")
        }

        override fun displayNumber(value: Int) {
            println(value)
            passed=true
        }

    }

    private class MockRepository : NumberRepository{
        override fun getNumber(presenterContract: MVPComponents.PresenterContract) {
            presenterContract.updateCalculation2(41)
        }


    }
}

