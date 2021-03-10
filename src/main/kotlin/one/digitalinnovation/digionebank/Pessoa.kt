package one.digitalinnovation.digionebank

class Pessoa {

    var nome:String = "Sid"
    var cpf: String = "123.456.789-01"
    private set

    constructor()

    fun pessoaInfo()="$nome e $cpf"
}

fun main(){
    val sid = Pessoa()

    println(sid.pessoaInfo())

}