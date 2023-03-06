    Aula 10

# Transações nos bancos de dados

Faz a alteração, mas só é executada quando é feito um commit. Caso precise ser desfeita, fazemos um roolback
O padrão de quando se faz uma alteração no banco de dados é um commit automático, para fazer uma transação, precisa que esse padrão seja desativado, por isso usamos as transações com try e catch.

## O que são transações?

Uma transação é um conjunto de operações em um banco de dados que deve ser executado como uma unidade.
Há ocasiões em que é necessário a realização de várias operações no banco de dados como um único bloco, ou seja, que sejam executadas todas as operações ou nenhuma, mas que não realize apenas algumas dessas operações. Ou tudo, ou nada.
Se forem executadas parcialmente até o momento em que uma operação falhar, o estado dos dados no banco de dados podem ficar inconsistentes. Neste caso precisamos de um mecanismo para devolvê-lo ao estado anterior, podendo desfazer todas as operações realizadas. 
Se tudo der certo, salva a operação com um commit, se algo der errado, cancela a operação por inteiro.

Exemplo:  Suponha que vamos reservar um voo de São Paulo para Sydney.
Para chegar a Sydney, temos que fazer várias paradas. Teremos que reservar um de São Paulo a Madrid, outro de Madrid a Dubai e, finalmente, voar de Dubai a Sydney. Se representarmos cada reserva como uma inserção no banco de dados, teremos as seguintes instruções:

    try {
        s.executeUpdate("INSERT INTO RESERVAS (passageiro, origem, destino) VALUES ('Felipe', 'São Paulo', 'Madrid')");
        s.executeUpdate("INSERT INTO RESERVAS (passageiro, origem, destino) VALUES ('Felipe', 'Madrid', 'Dubai')");
        s.executeUpdate("INSERT INTO RESERVAS (passageiro, origem, destino) VALUES ('Felipe', 'Dubai', 'Sydney')");
    } catch(SQLException e) {
        // Ocorreu um erro, mas não sabemos onde
        // Quais operações foram realizadas? Como desfazê-la?
    }

Um objeto **Connection** por padrão executa automaticamente todas as operações no banco de dados. Isso significa que toda vez que uma instrução é executada, ela é refletida no banco de dados e não pode ser desfeita. Por padrão, o **modo auto-commit**  na conexão está habilitado.
Os seguintes métodos na interface de conexão (Connection) são usados para gerenciar transações no banco de dados:

    void setAutoCommit(boolean valor) //para não fazer mais commit automático
    void commit() //para chamar o commit
    void rollback() //para desfazer o que foi feito

Para iniciar uma transação, desabilitamos o modo auto-commit usando o método setAutoCommit(false). Isso nos dá o controle sobre o que é realizado e quando é realizado.
Um chamada para o método commit() realizará todas as instruções emitidas desde a última chamada do método commit().
Uma chamada para rollback() irá desfazer todas as mudanças realizadas desde o último commit(). Depois que uma instrução commit() é emitida, essas transações não podem ser revertidas com o rollback().