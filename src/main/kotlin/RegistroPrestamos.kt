package org.example

class RegistroPrestamos(gestor: IGestorPrestamos): GestorBiblioteca(gestor), IGestorPrestamos{
    private val historialRegistros = mutableMapOf<Libro, Usuario>()

    fun devolverPrestamo(libro: Libro, usuario: Usuario){
        catalogoLibros.add(libro)
        usuario.removeLibro(libro)
        historialRegistros[libro] = usuario
    }

    fun prestar(libro: Libro, usuario: Usuario){
        catalogoLibros.remove(libro)
        usuario.addLibro(libro)
        historialRegistros[libro] = usuario
    }
}