package com.github.jarvvski.play4k

import dev.forkhandles.result4k.Success
import dev.forkhandles.state4k.StateBuilder
import dev.forkhandles.state4k.StateIdLens
import dev.forkhandles.state4k.StateMachine

val lens = StateIdLens(Task::state) { entity, state -> entity.copy(state = state) }

val commands = { entity: Task, command: TaskCommands ->
    println("Issuing command $command for $entity")
    Success(Unit)
}

//val taskStateMachine = StateMachine<
//        TaskState,
//        Task,
//        TaskEvent,
//        TaskCommands,
//        String>()
