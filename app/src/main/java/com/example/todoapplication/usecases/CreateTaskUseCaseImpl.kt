package com.example.todoapplication.usecases

import com.example.todoapplication.data.TaskRepository
import com.example.todoapplication.domain.Task
import io.reactivex.rxjava3.core.Completable

interface CreateTaskUseCase {
    operator fun invoke(task: Task): Completable
}

class CreateTaskUseCaseImpl(private val taskRepository: TaskRepository) : CreateTaskUseCase {
    override fun invoke(task: Task) = taskRepository.createTask(task)
}