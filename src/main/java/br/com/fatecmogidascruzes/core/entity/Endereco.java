package br.com.fatecmogidascruzes.core.entity;

public class Endereco extends Entidade {
    private String cep;
    private String numero;
    private String complemento;
    private String logradouro;
    private String tipoLogradouro;
    private String bairro;
    private String cidade;
    private String estado;
    private Pais pais;
    private TipoEndereco tipo;

    public Endereco(String id, String cep, String numero, String complemento, String logradouro, String tipoLogradouro, String bairro, String cidade, String estado, Pais pais, TipoEndereco tipo) {
        super(id);
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
        this.logradouro = logradouro;
        this.tipoLogradouro = tipoLogradouro;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.pais = pais;
        this.tipo = tipo;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getTipoLogradouro() {
        return tipoLogradouro;
    }

    public void setTipoLogradouro(String tipoLogradouro) {
        this.tipoLogradouro = tipoLogradouro;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public TipoEndereco getTipo() {
        return tipo;
    }

    public void setTipo(TipoEndereco tipo) {
        this.tipo = tipo;
    }

    @Override
    public void validar() {
        if (cep == null || cep.isEmpty()) {
            throw new RuntimeException("CEP não pode ser vazio");
        }
        if (numero == null || numero.isEmpty()) {
            throw new RuntimeException("Número não pode ser vazio");
        }
        if (logradouro == null || logradouro.isEmpty()) {
            throw new RuntimeException("Logradouro não pode ser vazio");
        }
        if (bairro == null || bairro.isEmpty()) {
            throw new RuntimeException("Bairro não pode ser vazio");
        }
        if (cidade == null || cidade.isEmpty()) {
            throw new RuntimeException("Cidade não pode ser vazia");
        }
        if (estado == null || estado.isEmpty()) {
            throw new RuntimeException("Estado não pode ser vazio");
        }
        if (pais == null) {
            throw new RuntimeException("País não pode ser nulo");
        }
        pais.validar();
    }
}