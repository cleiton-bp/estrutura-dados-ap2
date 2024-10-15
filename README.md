# Sistema de Gerenciamento de Pedidos e Biblioteca

## Estrutura do Projeto

O projeto está organizado em três pastas principais: `base`, `exercicioum` e `exerciciodois`.

### Pasta `base`

- **No.java**: Implementa a classe genérica `No`, que representa um nó de uma lista simplesmente ligada. Cada nó contém um dado e uma referência para o próximo nó.
- **NoDuplo.java**: Implementa a classe genérica `NoDuplo`, que representa um nó de uma lista duplamente ligada. Cada nó contém um dado, uma referência para o nó anterior e uma referência para o próximo nó.

### Pasta `exercicioum`

- **Pilha.java**: Implementa a classe genérica `Pilha`, que representa uma pilha utilizando uma lista simplesmente ligada. A pilha possui operações para adicionar (empilhar), remover (desempilhar) e imprimir (imprimirPilha) elementos.
- **Fila.java**: Implementa a classe genérica `Fila`, que representa uma fila utilizando uma lista simplesmente ligada. A fila possui operações para adicionar (enfileirar), remover (desenfileirar) e imprimir (imprimirFila) elementos.
- **Pedido.java**: Implementa a classe `Pedido`, que representa um pedido na cafeteria. Cada pedido possui um ID e uma descrição.

### Pasta `exerciciodois`

- **Livro.java**: Implementa a classe `Livro`, que representa um livro na biblioteca. Cada livro possui um ID, um título e um autor.
- **ListaDuplamenteLigada.java**: Implementa a classe genérica `ListaDuplamenteLigada`, que representa uma lista duplamente ligada. A lista permite a adição e remoção de elementos tanto no início quanto no fim, além de permitir a navegação em ambas as direções.

## Funcionalidades Implementadas

### Exercicio 1: Sistema de Gerenciamento de Pedidos para uma Cafeteria

1. **Adicionar Novo Pedido**: Adiciona um novo pedido à fila de pedidos pendentes.
2. **Atender Pedido**: Remove o pedido mais antigo da fila de pedidos pendentes e exibe qual pedido foi atendido.
3. **Cancelar Pedido**: Remove o pedido mais antigo da fila de pedidos pendentes, adiciona-o à pilha de pedidos cancelados e exibe qual pedido foi cancelado.
4. **Restaurar Pedido**: Remove o último pedido cancelado da pilha e insere-o de volta à fila de pedidos pendentes. Exibe o pedido restaurado.
5. **Imprimir Pedidos Pendentes**: Imprime todos os pedidos presentes na fila de pedidos pendentes, exibindo seu ID e descrição.
6. **Imprimir Pedidos Cancelados**: Imprime todos os pedidos presentes na pilha de pedidos cancelados, exibindo seu ID e descrição.

### Exercicio 2: Sistema de Gerenciamento de Livros para uma Biblioteca

1. **Adicionar Novo Livro no Início**: Adiciona um livro no início da lista, incluindo o ID, título e autor.
2. **Adicionar Novo Livro no Fim**: Adiciona um livro no final da lista, incluindo o ID, título e autor.
3. **Remover Primeiro Livro**: Remove o livro do início da lista, simulando a remoção de um livro mais antigo.
4. **Remover Último Livro**: Remove o livro do fim da lista, simulando uma remoção especial.
5. **Buscar Livro por ID**: Dado um ID, percorre a lista e exibe as informações do livro correspondente, se ele for encontrado.
6. **Imprimir Livros na Ordem Original**: Percorre a lista e exibe todos os livros do primeiro ao último.
7. **Imprimir Livros na Ordem Reversa**: Percorre a lista e exibe todos os livros do último ao primeiro.
