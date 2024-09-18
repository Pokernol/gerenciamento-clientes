package br.com.fatecmogidascruzes.core.entity;

public abstract class Entidade {
    private String id;
    private boolean isAtivo;

    // Construtores
    public Entidade(String id) {
        this.id = id;
        this.isAtivo = true;
    }

    public boolean isAtivo() {
        return isAtivo;
    }

    public void setAtivo(boolean isAtivo) {
        this.isAtivo = isAtivo;
    }

    // Método abstrato para ser implementado pelas subclasses
    public abstract void validar();
}