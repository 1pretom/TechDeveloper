    Aula 14

## Sprintboot

O que é um **Maven**? É o responsável por gerir as dependências de uma aplicação, mas o que é uma dependência? É biblioteca, api, como log4j e h2. Invés de precisar importar, baixar e colocar no projeto manualmente, o **Maven** é quem faz.

#### Como criar projeto com **Maven**:

cria o projeto normalmente, porém faz a seguinte seleção -> Language: Java > Build system: Maven.

Dessa forma as dependencias ficam dentro do arquivo pom.xml

Podemos fazer configurações no Maven na aba Maven do programa.

Pra importar a dependência só pesquisar no google ´<nomeDaDependencia> Maven´ e colar no arquivo pom.xml. Ou acessar o site [mvnrepository.com](mvnrepository.com) e buscar diretamente a dependência que desejar.

Atenção: O arquivo log4j.properties fica dentro do resources

Dependências Junit, Log4j e h2

    <dependencies>
        <!-- https://mvnrepository.com/artifact/org.junit.jupiter/junit-jupiter-api -->
        <dependency>
            <groupId>org.junit.jupiter</groupId>
            <artifactId>junit-jupiter-api</artifactId>
            <version>5.8.1</version>
            <scope>test</scope>
        </dependency>


        <!-- https://mvnrepository.com/artifact/log4j/log4j -->
        <dependency>
            <groupId>log4j</groupId>
            <artifactId>log4j</artifactId>
            <version>1.2.17</version>
        </dependency>

        <!-- https://mvnrepository.com/artifact/com.h2database/h2 -->
        <dependency>
            <groupId>com.h2database</groupId>
            <artifactId>h2</artifactId>
            <version>1.4.200</version>
            <scope>test</scope>
        </dependency>


    </dependencies>
