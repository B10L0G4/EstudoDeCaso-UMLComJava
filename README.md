# Curso de Modelagem Conceitual (UML) - Estudo de Caso 
## Esta implementação irá utilizar Java, SpringBoot e JPA

Objetivos: 

1 - Fazer uma inplemtação conceitual do modelo conceitual disponibilizado. <br>
2 - Criar a instância do modelo conceitual<br>
3- Gerar uma base de dados relacional automaticamente a partir do modelo conceitual , bem cmoo povoar a base com a instância dada. <br>
4 - Recuperar dados e disponibiliza-los por meio de um APIRest básico. Os seguintes end ponits devem ser disponibilizados : <br>

     /categoria/{id} = categoria de seus produtos 
     /clientes/{id} = Clientes, telefones e endereçoes
     /pedidos/{id} = Pedido, seu cliente, seu pagamento, seus itens do pedido e seu endereço de entrega 

* Para fazer um import automatico usar o atalho --ctrl + shift + o-- 
* Para autocompletar usar --ctrl + space--ctrl--
* Em um contrutor vazio (public NomedoAtributo (){}), com esse construtor instância-se <br> um objeto sem jogar nada nos atributos   
* Para criar um construtor com os atributos , atalho source (botão direito) , <br> generate contructor using fiedls, ele irá gerar 
* Toda classe em java por padrão os atributos são privados , ou seja não são acessados por outras classe <br> 
para que eles possam ser acessados usaremos getters e setters , atalho source / generate getters and setters <br>
* HashCode equals , para que dois objs serem comparados por valor , atalho source/generate hashCode equals (apneas id)<br>
* Classe serializable é uma declaração de implmentação de interface serializable, diz que os objs da classe <br> possam ser convertidos para uma sequancia de bits , assim os objs podem ser gravados em arquivos/ trafegados em rede e etc. (implements Serializables)