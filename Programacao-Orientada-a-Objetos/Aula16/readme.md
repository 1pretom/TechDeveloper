    Aula 16

# Exceptions parte 1

De uma maneira muito geral, existem **2 tipos** de **exceções**: 
- Quando a gente erra enquanto programador, e aí temos de identificar o que fizemos de errado.
- Quando o sistema tem algum tipo de falha que não é de desenvolvimento ou escrita de código, mas é uma falha de lógica, acesso ao banco e aparece para quem tá usando o sistema.

**Exceções** são uma forma que temos de tratar o erro em java para que o usuário possa entender de uma forma mais clara e amigável o que tá acontecendo. Servem também para que nós programadores possamos identificar melhor onde está o problema. <br> 
A **exceção** é uma forma elegante de trabalhar com a falha, existem algumas que são próprias do java e outras que criamos para se comportarem da forma que quisermos.

- Todas as **excessões** herdam de `Exception`.
- Muitas das classes `RuntimeExceptions` são devidas a erros cometidos ao escrever o código, e aí o programa nem roda o código
- As `IOExceptions` são aquelas que não dependem do código, por exemplo, criamos um programa que faz upload de arquivos, mas na hora do upload o arquivo foi excluído ou está danificado, este tipo de **exceção** não é da responsabilidade do programador, mas quando programamos devemos antecipar que eles podem ocorrer. `IndexOutOfRangeException` quando usamos um índice que está fora do intervalo..
- `ArithmeticException`: é quando uma operação aritmética é inválida ou não pode ser resolvida.
- `InputMismatchException`: Lançada pela classe Scanner, indica que o valor recuperado não corresponde ao esperado, ou seja, quando pelo Scanner é feita uma entrada de dados errada.
- Existem diversas outros tipos de **exceções**.