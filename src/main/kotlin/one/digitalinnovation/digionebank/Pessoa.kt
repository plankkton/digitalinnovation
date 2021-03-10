package one.digitalinnovation.digionebank

class Pessoa {

    var nome:String = "Sid"
    var cpf: String = "123.456.789-01"
    private set
}

fun main(){
    val sid = Pessoa()

    println(sid)
    println(sid.nome)
    println(sid.cpf)
}