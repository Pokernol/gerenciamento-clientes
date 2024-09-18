package br.com.fatecmogidascruzes.core.entity;

public class Pais extends Entidade {
    private String nome;
    private String sigla;

    public Pais(String id, String nome, String sigla) {
        super(id);
        this.nome = nome;
        this.sigla = sigla;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public void validar() {
        if (nome == null || nome.isEmpty()) {
            throw new RuntimeException("Nome do país não pode ser vazio");
        }
        if (sigla == null || sigla.isEmpty()) {
            throw new RuntimeException("Sigla do país não pode ser vazia");
        }
    }
}
