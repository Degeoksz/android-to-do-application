package com.example.todoapplication.usecases

import com.example.todoapplication.data.TaskRepository
import io.reactivex.rxjava3.core.Completable

interface DeleteTaskUseCase {
    operator fun invoke(id: Int): Completable
}

class DeleteTaskUseCaseImpl(private val taskRepository: TaskRepository) : CompleteTaskUseCase {
    override fun invoke(id: Int) = taskRepository.deleteTask(id)
}