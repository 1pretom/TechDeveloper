    Aula 22

# DTO
Sua função é fazer com que consigamos juntar, alterar atributos e dar segurança pra aplicação, a gente consegue filtrar o que o banco dá. por ex.: estamos cuidando do usuário e colocando todos os dados, rg, cpf, etc, e alguén ibterbamente precisa das informações do banco, supontod que estão todos os dados na mesma tabela, mas o setor só precisa do nome, não terá necessidade de ver os outros dados, então é criado o dto pra fazer o filtro e só passar o que o setor precisa e que serão necessários
é importante também que o frond end não receba o id

###### Dependencias para usar no DTO
<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core -->
		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-core</artifactId>
			<version>2.12.1</version>
		</dependency>
		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-databind</artifactId>
			<version>2.12.1</version>
		</dependency>
		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-annotations</artifactId>
			<version>2.12.1</version>
		</dependency>

O dto deve ser pra retornar pro cliente através do controler

Dentro do service colocamos

    public list<ProdutoDTO>  buscar(){
        List<Produto> listProduto = produtoDao.buscar();
        List<ProdutoDTO> listProdutoDTO = new Arraylist<>();

        ObjectMapper mapper = new ObjectMapper();

        Produto produto = new Produto();

        ProdutoDTO produtoDTO = mapper.convertValue(listProduto.get(0), ProdutoDTO.class); //fazendo a conversão

        return produtoDAO.buscar();
    }