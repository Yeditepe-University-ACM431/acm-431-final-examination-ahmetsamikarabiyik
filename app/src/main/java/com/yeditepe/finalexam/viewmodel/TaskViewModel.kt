package com.yeditepe.finalexam.viewmodel

import androidx.lifecycle.ViewModel

class TaskViewModel : ViewModel() {

    // TODO 1: Create a mutable state list of Task objects
    // Initially add at least 2 tasks
    var tasks by mutableStateOf(
    listOf(
        Task(1, "Submit Final Project", false),
        Task(2, "Prepare Presentation", false)
    )
)
    private set


    fun toggleTask(taskId: Int) {
        // TODO 2: Update isCompleted for the given task
        fun toggleTask(taskId: Int) {
    tasks = tasks.map { task ->
        if (task.id == taskId) {
            task.copy(isCompleted = !task.isCompleted)
        } else {
            task
        }
    }
}

    }
}
