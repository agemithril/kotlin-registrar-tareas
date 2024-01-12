package org.example

class GestorTareas {
    private val tareas = mutableListOf<Tarea>()

    fun agregarTarea(tarea: Tarea) {
        tareas.add(tarea)
    }

    fun completarTarea(indice: Int) {
        if (indice in tareas.indices) {
            tareas[indice].completada = true
        } else {
            println("Índice no válido.")
        }
    }

    fun mostrarTareas() {
        println("Lista de tareas:")
        for ((indice, tarea) in tareas.withIndex()) {
            println("${indice + 1}. [${if (tarea.completada) "X" else " "}] ${tarea.titulo}")
        }
    }
}