package com.novatech.novamovies.presentation.di

import com.novatech.novamovies.presentation.MainActivity
import dagger.Subcomponent

@MovieScope
@Subcomponent(modules = [MovieModule::class])
interface MovieSubComponent {

    fun inject(movieActivity: MainActivity)

    @Subcomponent.Factory
    interface Factory {
        fun create() : MovieSubComponent
    }
}