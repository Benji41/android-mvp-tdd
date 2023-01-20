package com.example.mvp.Repositories

import com.example.mvp.MVPComponents

/**
 * Created by Noé Benjamín Reynoso Aguirre on 1/19/2023.
 */
interface NumberRepository {
    fun getNumber(presenterContract: MVPComponents.PresenterContract)
}