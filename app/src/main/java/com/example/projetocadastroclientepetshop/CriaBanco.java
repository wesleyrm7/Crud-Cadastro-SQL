package com.example.projetocadastroclientepetshop;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class CriaBanco extends SQLiteOpenHelper {

    private static final String NAME="banco.db";
    private static final String TABELA = "usuarios";
    private static final String ID = "_id";
    private static final String NOME = "nome";
    private static final String ENDERECO = "endereco";
    private static final String TELEFONE = "telefone";
    private static final int VERSION=1;


    public CriaBanco(Context context) {
        super(context,NAME, null, VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = "CREATE TABLE"+TABELA+"("
                + ID + " integer primary key autoincrement,"
                + NOME + " text,"
                + ENDERECO + " text,"
                + TELEFONE + " text"
                +")";

        db.execSQL(sql);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {

        db.execSQL("DROP TABLE IF EXISTS"+ TABELA);
        onCreate(db);
    }
}
