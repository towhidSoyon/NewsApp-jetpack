package com.towhid.newsapp_jetpack.domain.usecases

import com.towhid.newsapp_jetpack.domain.manager.LocalUserManager
import kotlinx.coroutines.flow.Flow

class ReadAppEntry(
    private val localUserManager: LocalUserManager
) {

    suspend operator fun invoke(): Flow<Boolean>{
        return localUserManager.readAppEntry()
    }
}