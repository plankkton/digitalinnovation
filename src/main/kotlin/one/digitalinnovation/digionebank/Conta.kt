package one.digitalinnovation.digionebank

import java.math.BigDecimal

class Conta constructor(
        val agencia: String,
        val numero: String,
        val saldo: BigDecimal
        )
    {
    fun deposito(valor: BigDecimal) {

    }
    fun saque(valor: BigDecimal){

    }
}
