package br.com.sjcc.agenda_alura;

import android.widget.EditText;
import android.widget.RatingBar;

import br.com.sjcc.agenda_alura.modelo.Aluno;

/**
 * Created by Mauricio on 16/08/2016.
 */
public class FormularioAlunoHelper {

    private final EditText campoNome;
    private final EditText campoEmail;
    private final EditText campoTelefone;
    private final RatingBar campoNota;

    public FormularioAlunoHelper(FormularioActivity activity) {
        campoNome = (EditText) activity.findViewById(R.id.aluno_nome);
        campoEmail = (EditText) activity.findViewById(R.id.aluno_email);
        campoTelefone = (EditText) activity.findViewById(R.id.aluno_telefone);
        campoNota = (RatingBar) activity.findViewById(R.id.aluno_nota);
    }

    public Aluno criarAluno() {
        float nota = Float.parseFloat(String.valueOf(campoNota.getRating()));
        Aluno aluno = new Aluno(this.campoNome.getText().toString(), this.campoEmail.getText().toString(), this.campoTelefone.getText().toString(), nota);
        return aluno;
    }
}
