package com.example.projetocadastroclientepetshop;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
             //USUARIO DAO
public class BancoController {


    private Conexao conexao;
    private SQLiteDatabase banco;

    public BancoController(Context context){ //context para criar a conexao
        conexao=new Conexao(context);
        banco=conexao.getWritableDatabase(); //inicia o banco (conexao)
        //faco a conexao e pego banco.
    }
    public long inserirDadosUsuario(Usuario usuario){
        ContentValues values = new ContentValues();
        values.put("nome",usuario.getNome());
        values.put("endereco",usuario.getEndereco());
        values.put("telefone",usuario.getTelefone());

       return banco.insert("usuarios",null,values);

    }

}
