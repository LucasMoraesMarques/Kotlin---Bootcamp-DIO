package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Analista
import one.digitalinnovation.digionebank.Funcionario

fun main(){
    val lucas = Analista(nome="Lucas Moraes", cpf="123.123.123-12", salario=2000.0)
    ImprimeRelatorioFuncionario.imprime(lucas)

}

