# Cadastro e Autenticação de Senha

Este projeto é uma aplicação Java que permite ao usuário cadastrar e validar senhas, garantindo que elas atendam a critérios específicos de segurança. A aplicação verifica se as senhas inseridas possuem letras maiúsculas, minúsculas e caracteres especiais, além de permitir que o usuário confirme a senha com um máximo de três tentativas.

## Funcionalidades

- Cadastro de senhas.
- Validação de senhas com requisitos de segurança.
- Confirmação de senha com tentativas limitadas.

## Estrutura do Projeto

### Classes

1. **Programa**
   - Classe principal que gerencia a entrada e a lógica do usuário.
   - Solicita a senha ao usuário e chama o validador de senha.
   - Permite ao usuário confirmar a senha com até três tentativas.

2. **ValidadorDeSenha**
   - Classe responsável por validar a senha conforme os seguintes critérios:
     - Contém pelo menos uma letra maiúscula.
     - Contém pelo menos uma letra minúscula.
     - Contém pelo menos um caractere especial (ex.: !, @, #, $, etc.).
