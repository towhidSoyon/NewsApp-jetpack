package com.towhid.newsapp_jetpack.domain.usecases

import com.towhid.newsapp_jetpack.domain.manager.LocalUserManager

class SaveAppEntry(
    private val localUserManager: LocalUserManager
) {

    suspend operator fun invoke(){
        localUserManager.saveAppEntry()
    }
}