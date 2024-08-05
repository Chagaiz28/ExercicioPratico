# Sistema de Vendas de Computadores

Este projeto Java simula um sistema de vendas de computadores, permitindo ao usuário escolher entre diferentes configurações de computadores e calcular o total da compra.

## Tecnologias Utilizadas

- Java

## Funcionalidades

- Permite ao usuário escolher entre diferentes configurações de computadores.
- Calcula o total da compra com base nas escolhas do usuário.
- Exibe informações detalhadas sobre o cliente e os computadores selecionados.

## Estrutura do Projeto

O projeto é composto pelas seguintes classes:

- `Cliente`: Representa o cliente, contendo informações como nome, CPF e uma lista de computadores selecionados.
- `Computador`: Representa um computador, contendo informações como marca, preço e hardware básico (processador, memória RAM, HD).
- `HardwareBasico`: Representa um componente de hardware básico, contendo informações como nome e capacidade.
- `MemoriaUSB`: Representa uma memória USB, contendo informações como nome e capacidade.
- `SO`: Representa o sistema operacional, contendo informações como nome e tipo.

## Como Executar

1. Certifique-se de ter o JDK instalado em seu sistema.
2. Compile o código usando o comando: javac main.java
3. Execute o programa com o comando: java main

## Entrada de Dados

- O programa solicita ao usuário que escolha entre diferentes promoções de computadores (1, 2, 3) ou sair (0).
- O usuário pode selecionar quantos computadores desejar, adicionando-os à sua compra.

## Saída de Dados

- O programa exibe informações detalhadas sobre o cliente e os computadores selecionados.
- Ao final, o total da compra é calculado e exibido.
