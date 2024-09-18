package br.com.fatecmogidascruzes.core.entity;

public class Usuario extends Entidade {
    private String email;
    private String senha;

    public Usuario(String id, String email, String senha) {
        super(id);
        this.email = email;
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void alterarSenha(String novaSenha) {
        if (novaSenha == null || novaSenha.length() < 8) {
            throw new RuntimeException("A senha deve ter pelo menos 8 caracteres.");
        }
        this.senha = criptografarSenha(novaSenha);
    }

    private String criptografarSenha(String senha) {
        return new StringBuilder(senha).reverse().toString();
    }

    @Override
    public void validar() {
        if (email == null || email.isEmpty()) {
            throw new RuntimeException("Email não pode ser vazio");
        }
        if (senha == null || senha.isEmpty()) {
            throw new RuntimeException("Senha não pode ser vazia");
        }
    }
}
