package br.com.sjcc.agenda_alura;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class ListaAlunosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_alunos);

        ListView listaAluno = (ListView) findViewById(R.id.lista_alunos);

        String[] nomes = {"Mauricio","Manoel","Coelho","Júnior"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, nomes);
        listaAluno.setAdapter(adapter);

        FloatingActionButton btnAdicionar = (FloatingActionButton) findViewById(R.id.botao_salvar_aluno);
        btnAdicionar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intentFormularioAluno = new Intent(ListaAlunosActivity.this, FormularioActivity.class);
                startActivity(intentFormularioAluno);
            }
        });

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
    }

}
