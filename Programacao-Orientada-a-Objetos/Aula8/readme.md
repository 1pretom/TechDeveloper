	O que é herança?

### Relacionamento de herança traduzindo para o português: *É UM*

- As classes filhas herdam os atributos e métodos das super-classes ou classes pai/mãe e possuem informações mais específicas.
- Essas super-classes são o mais generalista possível, enquanto que as classes filhas/subclasses incluem o que a super-classe tem, mas colocam ou modificam os métodos de acordo com suas especificidades.

- Ex. animal tem cor (atributo) e se alimenta (método), essas são coisas comuns a todos os animais. Mas cada tipo de animal tem sua alimentação, pode voar ou não, etc.

- Não se deve ter herança múltipla no JAVA, o que pode acontecer é haver relacionamento com mais de uma classe e essa classe herdar de outra, ou se relacionar com outra, mas herança em si, só existe uma.

### Sobre modificadores de acesso: 

- Não é possível modificar private em classe filha, só no escopo da própria classe, apenas é possível fazer alterações usando getters e setters.

- No modificador protected é possível fazer modificações tranquilamente sem precisar de get e set na classe filha, pq compartilham a ligação.

- no modificador public pode alterar em qualquer lugar, em qualquer classe.


Exemplo de [UML](https://github.com/1pretom/CertifiedTechDeveloper/blob/6ea32daeb16d2a2c302c2b097e2f1f25067b4e86/Programacao-Orientada-a-Objetos/Aula8/Clinica-Dr-Lopez-relacoes-de-heranca.drawio.png).




> Written with [StackEdit](https://stackedit.io/).
