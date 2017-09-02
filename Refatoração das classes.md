#“LoboGuara” e “Ovelha”

**1. Problema:**   
1.1 As classes “LoboGuara” e “Ovelha” possuem métodos exatamente iguais ou seja, as classes possuem replicação de código sem motivo.  
1.2 As classes “LoboGuara” e “Ovelha” também possuem atributos com mesma função.  
**2. Métodos afetados:**  
2.1 Ambos os construtores e os métodos das duas classes com os nomes “estaVivo()”, “getLocalizacao()”, “setLocalizacao(Localizacao newLocalizacao)” e “setMorte()”.  
**3. Atributos Afetados:**  
3.1 private int idade;  
3.2 private boolean vivo;  
3.3 private Localizacao localizacao;  
3.4 private Campo campo;  
**4. Solução:**  
4.1 Adição de uma superclasse chamada “Animal” com os métodos e atributos repetidos que seria a classe mãe tanto de “LoboGuara” quanto de “Ovelha” além da remoção dos métodos e atributos repetidos.  
  
#“Campo”  

**1. Problema:**   
1.1 A classes “Campo” possui métodos que retornavam  - Object- em vez de Animal, apos a refatoração e criação da classe abstrata "Animal"  
**2. Métodos afetados:**  
2.1 Os métodos afetados pela mudança, “getObjectAt(Localizacao localizacao)” e “ getObjectAt(int linha, int coluna)”.  
**3. Solução:**  
3.1 O retorno de ambos os métodos agora é um objeto da classe "Animal" ou null.    

**2. Problema:**   
1.1 A classes “Campo” possui métodos que tinham como parâmetros - Object- em vez de Animal, apos a refatoração e criação da classe abstrata "Animal"  
**2. Métodos afetados:**  
2.1 Os métodos afetados pela mudança, “lugar(Animal animal, int linha, int coluna)” e “ lugar(Animal animal, Localizacao localizacao)”.  
**3. Solução:**  
3.1 Os parâmetros foram atualizados, agora Animal é da class Animal, e não da classe Object.

**3. Problema:**   
1.1 A classes “Campo” possui o método *lugar(Object animal, Localizacao localizacao)* que possibilita a inserção de um objeto em cima de outro.
**2. Métodos afetados:**  
2.1 Os métodos afetados pela mudança, “lugar(Animal animal, int linha, int coluna)” e “ lugar(Animal animal, Localizacao localizacao)”.  
**3. Solução:**  
3.1 Foi adicionada uma cláusula *if* que verifica se já existe um objeto na posição desejada(caso exista dispara uma IllegalArgumentException).