package one.digitalinnovation.digionebank.teste

import one.digitalinnovation.digionebank.Analista

fun main(){
    val joao = Analista("João","1234567899", 2000.0)
    ImprimeRelatorioFuncionario.imprime(joao)
}
