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