package com.example.santanderdevweek.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.santanderdevweek.R
import com.example.santanderdevweek.data.Conta

class MainActivity : AppCompatActivity() {
    private lateinit var viewModel: MainViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(findViewById((R.id.toolbar)))

        val viewModel = ViewModelProvider(this,
            MainViewModel.MainViewModelFactory()).get(MainViewModel::class.java)
        viewModel.buscarContaCliente().observe(this, Observer {result ->
            bindOnView(result)
        })
    }
    fun bindOnView(conta: Conta){
        findViewById<TextView>(R.id.tv_ag).text=conta.agencia
        findViewById<TextView>(R.id.tv_cc).text=conta.numero
        findViewById<TextView>(R.id.tv_saldo).text=conta.saldo
        findViewById<TextView>(R.id.tv_saldo_limite).text=conta.limite
        findViewById<TextView>(R.id.tv_usuario).text=conta.cliente.nome
    }
}