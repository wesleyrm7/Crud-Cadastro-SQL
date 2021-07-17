package com.example.projetocadastroclientepetshop;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

public class BancoController {


    private CriaBanco conexao;
    private SQLiteDatabase banco;

    public BancoController(Context context){
        conexao=new CriaBanco(context);
        banco=conexao.getWritableDatabase();
        //faco a conexao e pego banco.
    }
    public long inserirDadosUsuario(Usuario usuario){
        ContentValues values = new ContentValues();


       values.put("nome",usuario.getNome());
       values.put("endereco",usuario.getEndereco());
       values.put("telefone",usuario.getTelefone());

       banco.close();


       return banco.insert("usuarios",null,values);

    }

}
