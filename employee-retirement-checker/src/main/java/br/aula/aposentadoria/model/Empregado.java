package br.aula.aposentadoria.model;

public class Empregado {

    private String nome;
    private int idade;
    private int tempoTrabalho;

    public Empregado() {
    }

    public String verificarAposentadoria(){

        if (idade >= 65){
            return "Requerer aposentadoria";
        } else if (tempoTrabalho >= 30){
            return "Requerer aposentadoria";
        } else if (idade >= 60 && tempoTrabalho >= 25){
            return "Requerer aposentadoria";
        } else {
            return "Não requerer";
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTempoTrabalho() {
        return tempoTrabalho;
    }

    public void setTempoTrabalho(int tempoTrabalho) {
        this.tempoTrabalho = tempoTrabalho;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
}
