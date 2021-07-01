package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Funcionario
import one.digitalinnovation.digionebank.Pessoa
import java.math.BigDecimal

fun main(){
    var lucas = Pessoa(nome="Lucas", cpf="123.123.123-12")
    println(lucas.nome)
    println(lucas.cpf)

    val joao = Funcionario(nome="Lucas Moraes", cpf="123.123.123-12", salario=BigDecimal(2000.0))
    println(joao.nome)
    println(joao.cpf)
    println(joao.salario)
}