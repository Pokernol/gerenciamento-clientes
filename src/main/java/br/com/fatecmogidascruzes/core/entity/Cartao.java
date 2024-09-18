package br.com.fatecmogidascruzes.core.entity;

public class Cartao extends Entidade {
    private String numero;
    private String nomeImpresso;
    private String cvv;
    private boolean isPreferencial;
    private Bandeira bandeira;

    public Cartao(String id, String numero, String nomeImpresso, String cvv, boolean isPreferencial, Bandeira bandeira) {
        super(id);
        this.numero = numero;
        this.nomeImpresso = nomeImpresso;
        this.cvv = cvv;
        this.isPreferencial = isPreferencial;
        this.bandeira = bandeira;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNomeImpresso() {
        return nomeImpresso;
    }

    public void setNomeImpresso(String nomeImpresso) {
        this.nomeImpresso = nomeImpresso;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public boolean isPreferencial() {
        return isPreferencial;
    }

    public void setPreferencial(boolean isPreferencial) {
        this.isPreferencial = isPreferencial;
    }

    public Bandeira getBandeira() {
        return bandeira;
    }

    public void setBandeira(Bandeira bandeira) {
        this.bandeira = bandeira;
    }

    @Override
    public void validar() {
        if (numero == null || numero.isEmpty()) {
            throw new RuntimeException("Número do cartão não pode ser vazio");
        }
        if (nomeImpresso == null || nomeImpresso.isEmpty()) {
            throw new RuntimeException("Nome impresso no cartão não pode ser vazio");
        }
        if (cvv == null || cvv.isEmpty()) {
            throw new RuntimeException("CVV não pode ser vazio");
        }
        if (bandeira == null) {
            throw new RuntimeException("Bandeira do cartão não pode ser nula");
        }
        bandeira.validar();
    }
}
