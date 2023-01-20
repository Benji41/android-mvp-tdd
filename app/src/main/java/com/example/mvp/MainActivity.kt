package com.example.mvp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity : AppCompatActivity(),MVPComponents.View {
    private val presenter : MVPComponents.PresenterContract =  Presenter(this,null)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        presenter.calculate(5,6)


    }

    override fun calculate(value: Int) {
        Toast.makeText(this,"value: $value",Toast.LENGTH_LONG).show()
    }

    override fun displayNumber(value: Int) {
        TODO("Not yet implemented")
    }
}