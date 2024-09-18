# Gerenciamento de Clientes

## Descrição 📝

Esta aplicação é um sistema de gerenciamento de clientes desenvolvido em Java, atividade essa dada em sala de aula pelo professor [Rodrigo Rocha](https://www.linkedin.com/in/rrochas/). O sistema permite o cadastro, consulta, alteração e inativação de clientes, além de gerenciar endereços, telefones e cartões de crédito associados aos clientes. A aplicação também inclui funcionalidades de segurança, como criptografia de senhas e validações de dados.

## Índice 🔗

=================

   * [Titulo](#gerenciamento-de-clientes)
   * [Descrição](#descrição)
   * [Estrutura do Projeto](#estrutura-do-projeto)
   * [Entrega](#entrega)
   * [Funcionalidades Previstas](#funcionalidades-previstas)
   * [Classes Principais](#classes-principais)
   * [Requisitos](#requisitos)
   * [Como Executar](#como-executar)
   * [Contribuição](#contribuição)
   * [Contato](#contato)

=================

## Estrutura do Projeto 🗂
```
C:.
├───.idea
│   └───inspectionProfiles
└───src
    ├───main
    │   ├───java
    │   │   └───br
    │   │       └───com
    │   │           └───fatecmogidascruzes
    │   │               └───core
    │   │                   └───entity
    │   │                        ├── Cliente.java
    │   │                        ├── Endereco.java
    │   │                        ├── Cartao.java
    │   │                        ├── Telefone.java
    │   │                        ├── Usuario.java
    │   │                        ├── Bandeira.java
    │   │                        ├── Pais.java
    │   │                        ├── Log.java
    │   │                        └── Entidade.java
    │   └───resources
    └───test
        └───java
```

## Entrega 📦
Nesta entrega, foram desenvolvidas as classes de domínio do sistema, que representam as entidades principais com seus respectivos atributos, métodos getters e setters, além da aplicação dos conceitos de herança e polimorfismo. As classes criadas incluem Cliente, Endereco, Cartao, Telefone, Usuario, Bandeira, Pais, Log e Entidade. Cada classe foi projetada para encapsular os dados e comportamentos específicos de cada entidade, garantindo uma estrutura robusta e reutilizável para o sistema de gerenciamento de clientes.

## Funcionalidades previstar🔮

### Cadastro de Clientes 📝
- **Cadastrar Cliente:** Permitirá o cadastro de novos clientes com informações pessoais, endereços, telefones e cartões de crédito.
- **Alterar Cliente:** Permitirá a alteração dos dados cadastrais dos clientes.
- **Inativar Cliente:** Permitirá inativar o cadastro de um cliente.
- **Consultar Clientes:** Permitirá a consulta de clientes com base em filtros definidos pelo usuário.
- **Consultar Transações:** Permitirá a consulta de todas as transações realizadas por um cliente.

### Gerenciamento de Endereços 🏠
- **Cadastro de Endereços de Entrega:** Permitirá associar diversos endereços de entrega ao cadastro de um cliente.
- **Alteração de Endereços:** Permitirá alterar ou adicionar endereços de entrega ou cobrança de forma simples.

### Gerenciamento de Cartões de Crédito 💳
- **Cadastro de Cartões de Crédito:** Permitirá associar diversos cartões de crédito ao cadastro de um cliente, com um cartão preferencial.

### Segurança 🔒
- **Alteração de Senha:** Permitirá alterar a senha do usuário, com validação de senha forte e criptografia.
- **Log de Transações:** Registrará a data, hora e usuário responsável para todas as operações de escrita (inserção ou alteração).

## Classes Principais 📚

### Cliente
Representa um cliente no sistema, com atributos como nome, data de nascimento, email, CPF, ranking, gênero, endereços, cartões e telefones. Inclui métodos para adicionar endereços, telefones e cartões, inativar o cliente, alterar a senha e validar os dados.

### Endereco
Representa um endereço associado a um cliente, com atributos como CEP, número, complemento, logradouro, tipo de logradouro, bairro, cidade, estado, país e tipo de endereço.

### Cartao
Representa um cartão de crédito associado a um cliente, com atributos como número, nome impresso, CVV, bandeira e se é preferencial.

### Telefone
Representa um telefone associado a um cliente, com atributos como tipo, DDD e número.

### Usuario
Representa um usuário do sistema, com atributos como email e senha.

### Bandeira
Representa a bandeira de um cartão de crédito, com atributos como descrição.

### Pais
Representa um país, com atributos como nome e sigla.

### Log
Registra as operações de escrita no sistema, com atributos como data e hora da operação e o usuário responsável.

### Entidade
Classe abstrata base para todas as entidades do sistema, com atributos como ID e status de atividade, e um método abstrato para validação.

## Requisitos 📋

- **Java 21**

## Como Executar 🚀

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/gerenciamento-clientes.git
   
2. Navegue até o diretório do projeto:
   ```bash
   cd gerenciamento-clientes

## Contribuição 🤝

1. Faça um fork do projeto.
2. Crie uma branch para sua feature (git checkout -b feature/nova-feature).
3. Commit suas mudanças (git commit -am 'Adiciona nova feature').
4. Faça o push para a branch (git push origin feature/nova-feature).
5. Abra um Pull Request.

## Autor

<div align="center">
<a href="https://www.linkedin.com/in/leonardo-vin%C3%ADcius25/">
<img style="border-radius: 50%;" src="https://avatars.githubusercontent.com/u/100011077?v=4" width="100px;" alt="foto do autor"/>
 <br />

[![Linkedin Badge linktree](https://img.shields.io/badge/-Leonardo_Vinícius-blue?style=flat-square&logo=Linkedin&logoColor=white&link=https://www.linkedin.com/in/leonardo-vin%C3%ADcius25/)](https://www.linkedin.com/in/leonardo-vin%C3%ADcius25/)
[![Linkedin Badge linkedin](https://img.shields.io/badge/-Leonardo_Vinícius-39E09B?style=flat-square&logo=linktree&logoColor=white&link=https://linktr.ee/pokernol)](https://linktr.ee/pokernol)

</div>

## Feedback

Se você tiver algum feedback, por favor me deixe saber por meio de meu Email:

[![Gmail Badge](https://img.shields.io/badge/-Lenardopoke25@gmail.com-c14438?style=flat-square&logo=Gmail&logoColor=white&link=mailto:leonardopoke25.com)](mailto:leonardopoke25.com)
