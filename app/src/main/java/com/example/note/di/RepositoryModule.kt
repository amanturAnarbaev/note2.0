package com.example.note.di

import data.repository.NoteRepositoryImpl
import domain.repository.NoteRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun noteRepository(noteRepositoryImpl: NoteRepositoryImpl): NoteRepository
}