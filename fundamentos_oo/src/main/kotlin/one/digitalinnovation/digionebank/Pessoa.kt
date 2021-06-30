package one.digitalinnovation.digionebank

class Pessoa {
    var name: String = "Lucas"
    var cpf: String = "123.123.123-12"
    private set

    constructor()

    fun pessoaInfo() = "$name e $cpf"


}

fun main(){
    var lucas = Pessoa()
    println(lucas.pessoaInfo())

}