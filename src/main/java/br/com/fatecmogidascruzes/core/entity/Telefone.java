package br.com.fatecmogidascruzes.core.entity;

public class Telefone extends Entidade {
    private TipoTelefone tipo;
    private String ddd;
    private String numero;

    public Telefone(String id, TipoTelefone tipo, String ddd, String numero) {
        super(id);
        this.tipo = tipo;
        this.ddd = ddd;
        this.numero = numero;
    }

    public TipoTelefone getTipo() {
        return tipo;
    }

    public void setTipo(TipoTelefone tipo) {
        this.tipo = tipo;
    }

    public String getDdd() {
        return ddd;
    }

    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public void validar() {
        if (tipo == null) {
            throw new RuntimeException("Tipo de telefone não pode ser nulo");
        }
        if (ddd == null || ddd.isEmpty()) {
            throw new RuntimeException("DDD não pode ser vazio");
        }
        if (numero == null || numero.isEmpty()) {
            throw new RuntimeException("Número não pode ser vazio");
        }
    }
}
