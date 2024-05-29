package com.novatech.novamovies

import android.app.Application
import com.novatech.novamovies.presentation.di.AppComponent
import com.novatech.novamovies.presentation.di.AppModule
import com.novatech.novamovies.presentation.di.DaggerAppComponent
import com.novatech.novamovies.presentation.di.Injector
import com.novatech.novamovies.presentation.di.MovieSubComponent
import com.novatech.novamovies.presentation.di.NetModule
import com.novatech.novamovies.presentation.di.RemoteDataModule

class App : Application(), Injector {
    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()

        // this is preparing the appcontext, retrofit and room
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule(BuildConfig.BASE_URL))
            .remoteDataModule(RemoteDataModule(BuildConfig.API_KEY))
            .build()
    }

    override fun createMovieSubComponent(): MovieSubComponent {
        return appComponent.movieSubComponent().create()
    }
}