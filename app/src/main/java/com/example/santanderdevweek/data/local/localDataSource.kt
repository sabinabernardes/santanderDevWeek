package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.model.Cartao
import com.example.santanderdevweek.data.model.Cliente
import com.example.santanderdevweek.data.model.Conta

class localDataSource {
    fun getLocalData(): List<Conta> {
        val cliente = Cliente("Sabina")
        val cartao = Cartao("418876645564")
        return List(
            "45454545", "252522", "4554545,55", "55457454", cliente, cartao
        )
    }

    private fun List(size: String, init: String, s: String, s1: String, cliente: Cliente, cartao: Cartao): List<Conta> {

    }
}