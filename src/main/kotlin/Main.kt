package org.example

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
// Tarea.kt
data class Tarea(val titulo: String, var completada: Boolean = false)





fun main() {
    val gestor = GestorTareas()

    while (true) {
        println("""
            |Seleccione una opción:
            |1. Agregar tarea
            |2. Completar tarea
            |3. Mostrar tareas
            |4. Salir
        """.trimMargin())

        when (readlnOrNull()?.toIntOrNull()) {
            1 -> {
                print("Ingrese el título de la tarea: ")
                val titulo = readlnOrNull() ?: ""
                gestor.agregarTarea(Tarea(titulo))
            }
            2 -> {
                print("Ingrese el índice de la tarea a completar: ")
                val indice = readlnOrNull()?.toIntOrNull()?.minus(1) ?: -1
                gestor.completarTarea(indice)
            }
            3 -> gestor.mostrarTareas()
            4 -> return
            else -> println("Opción no válida.")
        }
    }
}