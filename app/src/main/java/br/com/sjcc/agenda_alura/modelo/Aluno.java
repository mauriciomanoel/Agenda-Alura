package br.com.sjcc.agenda_alura.modelo;

/**
 * Created by Mauricio on 16/08/2016.
 */
public class Aluno {
    private String nome;
    private String email;
    private String telefone;
    private float nota;

    public Aluno(String nome, String email, String telefone, float nota) {
        this.setNome(nome);
        this.setEmail(email);
        this.setTelefone(telefone);
        this.setNota(nota);
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}
