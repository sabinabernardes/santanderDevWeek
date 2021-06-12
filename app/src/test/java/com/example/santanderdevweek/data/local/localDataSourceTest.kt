 package com.example.santanderdevweek.data.local

import com.example.santanderdevweek.data.model.Cartao
import com.example.santanderdevweek.data.model.Cliente
import com.example.santanderdevweek.data.model.Conta
import junit.framework.TestCase
import org.junit.Test
import org.mockito.kotlin.mock
import org.mockito.kotlin.whenever


class localDataSourceTest : TestCase() {
    private val local: localDataSource = mock()

    @Test
    fun testGetLocalData() {

        //Given
        val conta: Conta = listOf(
            val numero:String,
            val agencia:String,
            val saldo:String,
            val limite:String,
            val cliente: Cliente,
            val cartao: Cartao
        )

        whenever(local.getLocalData()).thenReturn(listOf(conta))

        //When

        val result = local.getLocalData()

        //Then

        result.test().assertValue()

    }
}