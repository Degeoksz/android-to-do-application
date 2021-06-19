package com.example.todoapplication.data

import com.example.todoapplication.domain.Task
import io.reactivex.rxjava3.core.Completable
import io.reactivex.rxjava3.core.Single

interface TaskRepository {
    fun createTask(task: Task): Completable

    fun getTasks(): Single<List<Task>>

    fun completeTask(id: Int): Completable

    fun deleteTask(id: Int): Completable
}