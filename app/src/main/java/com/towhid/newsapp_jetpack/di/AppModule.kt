package com.towhid.newsapp_jetpack.di

import android.app.Application
import com.towhid.newsapp_jetpack.domain.usecases.AppEntryUseCases
import com.towhid.newsapp_jetpack.domain.usecases.ReadAppEntry
import com.towhid.newsapp_jetpack.domain.usecases.SaveAppEntry
import com.towhid.newsapp_jetpack.data.manager.LocalUserManagerImpl
import com.towhid.newsapp_jetpack.domain.manager.LocalUserManager
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideLocalUserManger(
        application: Application
    ): LocalUserManager = LocalUserManagerImpl(context = application)

    @Provides
    @Singleton
    fun provideAppEntryUseCases(
        localUserManger: LocalUserManager
    ): AppEntryUseCases = AppEntryUseCases(
        readAppEntry = ReadAppEntry(localUserManger),
        saveAppEntry = SaveAppEntry(localUserManger)
    )

}