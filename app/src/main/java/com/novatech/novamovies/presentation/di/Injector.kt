package com.novatech.novamovies.presentation.di

interface Injector {
    fun createMovieSubComponent() : MovieSubComponent
}