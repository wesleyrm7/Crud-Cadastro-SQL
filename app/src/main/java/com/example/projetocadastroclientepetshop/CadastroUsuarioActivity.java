package com.example.projetocadastroclientepetshop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class CadastroUsuarioActivity extends AppCompatActivity {

    private EditText nome,endereco,telefone;
    private Button cadastro;
    private BancoController usuarioDao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastro_usuario);

        nome = findViewById(R.id.editNome);
        endereco = findViewById(R.id.editEndereco);
        telefone = findViewById(R.id.editEndereco);
        cadastro = findViewById(R.id.buttonCadastro);
        usuarioDao = new BancoController(this);


    }

    public void salvar(View view){

        Usuario a=new Usuario();
        a.setNome(nome.getText().toString());
        a.setEndereco(endereco.getText().toString());
        a.setTelefone(telefone.getText().toString());
        long id=usuarioDao.inserirDadosUsuario(a);

        Toast.makeText(this,"Usuario inserido com id"+id, Toast.LENGTH_LONG).show();
    }
}