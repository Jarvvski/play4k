package com.github.jarvvski.play4k

data class Task(val name: String, val state: TaskState)

enum class TaskState {
    Scheduled, InProgress, Completed, Failed
}

enum class TaskCommands {
    Execute
}

sealed interface TaskEvent {
    data object TaskScheduled : TaskEvent
    data object TaskStarted : TaskEvent
    data object TaskFailed : TaskEvent
    data object TaskCompleted : TaskEvent
}
