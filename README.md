# 💻 Desafio - Conta Terminal

Este repositório contém a solução do **Desafio da Trilha Java Cloud Native - Bradesco** na plataforma [DIO](https://www.dio.me/), que faz parte do módulo de **Sintaxe Java**.

## 📋 Descrição

O objetivo do desafio é criar uma aplicação simples em Java que simule a abertura de uma conta bancária através do terminal. O projeto segue as instruções disponíveis no repositório oficial da DIO:

🔗 [Desafio no GitHub da DIO](https://github.com/digitalinnovationone/trilha-java-basico/tree/main/desafios/sintaxe)

## 📌 Funcionalidades

- Leitura de dados do usuário via terminal:
  - Número da conta
  - Número da agência
  - Nome do cliente
  - Saldo inicial
- Exibição de mensagem personalizada com os dados inseridos.

## 🚀 Tecnologias Utilizadas

- Java 17+ (ou versão compatível)
- IDE de sua preferência (IntelliJ, Eclipse, VS Code, etc.)
- Terminal / Console
- Scanner (para entrada de dados)

## 🧠 Lógica do Código

- Utiliza Scanner para capturar entradas do usuário com ponto como separador decimal (ex: 1234.56).
  
```java
Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
```

- Exibe a mensagem de boas-vindas formatada com os dados da conta.
  
```java
System.out.println("Olá " + nomeCliente + ...
```
## 📷 Exemplo de Uso
```yaml
Digite o número da conta: 1021
Digite o número da agência: 067-8
Informe o nome do Cliente: MARIA
Informe o saldo da Conta: 237.48

Olá MARIA, obrigado por criar uma conta em nosso banco, sua agência é 067-8, conta 1021 e seu saldo 237.48 já está disponível para saque.
```
## 👨‍💻 Autor
Desenvolvido por [Larissa Thalia](https://github.com/ltsilva23) como parte do desafio de aprendizagem na DIO.
