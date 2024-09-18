package br.com.fatecmogidascruzes.core.entity;

public class Bandeira extends Entidade {
    private String descricao;

    public Bandeira(String id, String descricao) {
        super(id);
        this.descricao = descricao;
    }

    @Override
    public void validar() {
        if (descricao == null || descricao.isEmpty()) {
            throw new RuntimeException("Descrição da bandeira não pode ser vazia");
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
