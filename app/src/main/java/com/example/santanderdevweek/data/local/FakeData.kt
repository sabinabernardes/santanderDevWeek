package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.model.Cartao
import com.example.santanderdevweek.data.model.Cliente
import com.example.santanderdevweek.data.model.Conta

class FakeData {
    fun getLocalData(): Conta {
        val cliente = Cliente("Sabina")
        val cartao = Cartao("418876645564")
        return Conta(
            "45454545", "252522", "4554545,55", "55457454", cliente, cartao
        )
    }
}