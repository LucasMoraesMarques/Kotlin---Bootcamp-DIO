package one.digitalinnovation.digionebank

class Pessoa {
    var name: String = "Lucas"
    val cpf: String = "123.123.123-12"
}

fun main(){
    var lucas = Pessoa()
    println(lucas.name)
}