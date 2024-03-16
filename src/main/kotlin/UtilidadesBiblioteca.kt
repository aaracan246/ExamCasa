package org.example

open class UtilidadesBiblioteca{
    /**
     * @return Int
     *
     * Mediante un companion object creamos una función que genere un ID randomizado (número de 1 a 120).
     *
     * */
    companion object{
        private val listaIds = mutableSetOf<Int>()

        fun generateID(): Int{
            var randomId: Int
            do {
                randomId = (1..120).random()
            } while (randomId in listaIds)
            listaIds.add(randomId)

            return randomId
        }
    }


}