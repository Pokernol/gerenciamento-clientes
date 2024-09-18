package br.com.fatecmogidascruzes.core.entity;

import java.time.LocalDateTime;

public class Log extends Entidade {
    private LocalDateTime dataHora;
    private Usuario user;

    public Log(String id, Usuario user) {
        super(id);
        this.dataHora = LocalDateTime.now();
        this.user = user;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public Usuario getUser() {
        return user;
    }

    public void setUser(Usuario user) {
        this.user = user;
    }

    @Override
    public void validar() {
        if (user == null) {
            throw new RuntimeException("Usuário não pode ser nulo");
        }
        // Adicione outras validações conforme necessário
    }
}
