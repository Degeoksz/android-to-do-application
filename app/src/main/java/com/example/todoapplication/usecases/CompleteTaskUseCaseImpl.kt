package com.example.todoapplication.usecases

import com.example.todoapplication.data.TaskRepository
import io.reactivex.rxjava3.core.Completable

interface CompleteTaskUseCase {
    operator fun invoke(id: Int): Completable
}

class CompleteTaskUseCaseImpl(private val taskRepository: TaskRepository) : CompleteTaskUseCase {
    override fun invoke(id: Int) = taskRepository.completeTask(id)
}