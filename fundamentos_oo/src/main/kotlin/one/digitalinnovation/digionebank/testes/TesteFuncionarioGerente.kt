package one.digitalinnovation.digionebank.testes

import one.digitalinnovation.digionebank.Gerente

fun main(){
    val lucas = Gerente(nome="Lucas Moraes", cpf="123.123.123-12", salario=5000.0)
    ImprimeRelatorioFuncionario.imprime(lucas)
}

