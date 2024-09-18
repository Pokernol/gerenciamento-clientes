package br.com.fatecmogidascruzes.core.entity;

import java.time.LocalDate;
import java.util.List;
import java.util.ArrayList;

public class Cliente extends Entidade {
    private String nome;
    private LocalDate dataNascimento;
    private String email;
    private String cpf;
    private int ranking;
    private Genero genero;
    private List<Endereco> enderecos;
    private List<Cartao> cartoes;
    private List<Telefone> telefones;

    // Construtores
    public Cliente(String id, String nome, LocalDate dataNascimento, String email, String cpf, int ranking, Genero genero) {
        super(id);
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.email = email;
        this.cpf = cpf;
        this.ranking = ranking;
        this.genero = genero;
        this.enderecos = new ArrayList<>();
        this.cartoes = new ArrayList<>();
        this.telefones = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public List<Cartao> getCartoes() {
        return cartoes;
    }

    public void setCartoes(List<Cartao> cartoes) {
        this.cartoes = cartoes;
    }

    public List<Telefone> getTelefones() {
        return telefones;
    }

    public void setTelefones(List<Telefone> telefones) {
        this.telefones = telefones;
    }

    public void adicionarEndereco(Endereco endereco) {
        if (endereco == null) {
            throw new RuntimeException("Endereço não pode ser nulo");
        }
        if (enderecos.stream().anyMatch(e -> e.getTipo() == endereco.getTipo())) {
            throw new RuntimeException("Já existe um endereço do tipo " + endereco.getTipo());
        }
        this.enderecos.add(endereco);
    }

    public void adicionarTelefone(Telefone telefone) {
        if (telefone == null) {
            throw new RuntimeException("Telefone não pode ser nulo");
        }
        if (telefones.stream().anyMatch(t -> t.getTipo() == telefone.getTipo() && t.getNumero().equals(telefone.getNumero()))) {
            throw new RuntimeException("Já existe um telefone do mesmo tipo e número");
        }
        this.telefones.add(telefone);
    }

    public void adicionarCartao(Cartao cartao) {
        if (cartao.isPreferencial()) {
            for (Cartao c : cartoes) {
                if (c.isPreferencial()) {
                    c.setPreferencial(false);
                    break;
                }
            }
        }
        this.cartoes.add(cartao);
    }

    public void inativar() {
        // Lógica para inativar o cliente
        setAtivo(false);
    }

    @Override
    public void validar() {
        if (nome == null || nome.isEmpty()) {
            throw new RuntimeException("Nome não pode ser vazio");
        }
        if (dataNascimento == null) {
            throw new RuntimeException("Data de nascimento não pode ser nula");
        }
        if (email == null || email.isEmpty()) {
            throw new RuntimeException("Email não pode ser vazio");
        }
        if (cpf == null || cpf.isEmpty()) {
            throw new RuntimeException("CPF não pode ser vazio");
        }
        if (enderecos.isEmpty()) {
            throw new RuntimeException("Cliente deve ter pelo menos um endereço");
        }
        if (telefones.isEmpty()) {
            throw new RuntimeException("Cliente deve ter pelo menos um telefone");
        }
    }
}
