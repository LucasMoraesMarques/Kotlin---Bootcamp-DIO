package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.ClienteTipo

fun main(){
    ClienteTipo.values().forEach{
        elemento -> println("${elemento.name} - ${elemento.desc}")
    }

    val pf = ClienteTipo.PF
    println("${pf.name} - ${pf.desc}")

    val pj = ClienteTipo.PJ
    println("${pj.name} - ${pj.desc}")

}