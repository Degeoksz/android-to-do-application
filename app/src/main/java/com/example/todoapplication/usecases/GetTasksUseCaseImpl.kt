package com.example.todoapplication.usecases

import com.example.todoapplication.data.TaskRepository
import com.example.todoapplication.domain.Task
import io.reactivex.rxjava3.core.Single

interface GetTasksUseCase {
    operator fun invoke(): Single<List<Task>>
}

class GetTasksUseCaseImpl(private val taskRepository: TaskRepository) : GetTasksUseCase {
    override fun invoke() = taskRepository.getTasks()
}