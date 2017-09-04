# Refatorações #
### Inspeção ###
A inspeção e documentação da mesma foi realizado em conjunto por Vitor Hugo e Iderli. O documento oficial pode ser acessado no seguinte link: [INSPEÇÂO](https://bitbucket.org/rpiv_grupo4/rpiv_grupo4/wiki/Inspe%C3%A7%C3%A3o)  
As refatorações que ocorreram após esta etapa fora a seguinte:  



Correção 1    
1.1 Classe: ‘LoboGuara’  
1.2 Método: ‘procria()’  
1.3 Linha ‘108’(mais especificamente no “IF”)  
1.4 Erro: Método para procriação incorreto pois a probabilidade de procriação fica menor que ‘0.75 ao invés de ‘0.75’’  
1.5 Solução: Substituir o ‘<’ por ‘<=’ na linha 108   

Correção 2     
2.1 Classe: ‘LoboGuara’  
2.2 Método: ‘podeProcriar()’   
2.3 Linha: ‘119’  
2.4 Erro: Método exige que a idade do lobo para procriar seja maior que a idade de procriação quando a idade do lobo  deveria ser maior ou igual a idade de procriação  
2.5 Solução: Substituir ‘>’ por ‘>=’ na linha 119   

Correção 3      
3.1 Classe: ‘Randomizador’  
3.2 Método: ‘Nesse caso toda a classe será refatorada’  
3.3 Linha: ‘Todas basicamente’  
3.4 Erro: ‘Padrão singleton muito mal implementado e com diversos problemas’  
3.5 Solução: ‘Aplicação do padrão singleton e exclusão das variáveis “useShared” e “SEED” ’  

Correção 4  
4.1 Classe: ‘Simulador’  
4.2 Método: ‘Simulador(int profundidade, int largura)’  
4.3 Linha: ‘33’  
4.4 Erro: Aceita simulações com largura ou/e profundidade iguais a 0  
4.5 Solução: Mudança dos dois operadores ‘<’ por ‘<=’  

Correção 5  
5.1 Classe: ‘Simulador’  
5.2 Método: ‘simulacaoUmaEtapa()’  
5.3 Linha: ‘61’  
5.4 Erro: Remove todas as ovelhas que estão vivas ao invés das que morreram  
5.5 Solução: Mudança do if de ‘if (ovelha.estaViva())’ para ‘if (!ovelha.estaViva())’  

Correção 6     
6.1 Classe: ‘Simulador’  
6.2 Método: ‘simulacaoUmaEtapa()’  
6.3 Linha: ‘74’  
6.4 Erro: Remove todos os lobos guará que estão vivos ao invés dos que morreram  
6.5 Solução: Mudança do if de ‘if (loboGuara.estaVivo())’ para ‘if (!loboGuara.estaVivo())’  


Correção 7 - Encontrado por meio do Junit  
7.1 Classe: ‘Campo’  
7.2 Método: ‘localizacoesAdjacentes(Localizacao localizacao)’  
7.3 Linha: 78  
7.4 Erro: O método aceita uma Localizacao com linha/coluna maior que a profundidade/largura do campo  
7.5 Solução: Adição de uma condição ‘if’ na linha 78 que exige que a linha/coluna da localização seja menor que a profundidade/largura do campo.  




Correção 8 - Encontrado por meio do Junit  
8.1 Classe: ‘Localizacao’  
8.2 Método: Construtor  
8.3 Linha: 20  
8.4 Erro: Não lançava exceção quando recebia dados inválidos  
8.5 Solução: Refatoração do ‘if’ de ‘(linha>=0 && coluna>=0)’ para ‘(linha<0 || coluna<0)’ e quando satisfeita a condição fazer com que lance uma exceção ‘IllegalArgumentException’ além da mudança do código que antes estava   
8.6 dentro do ‘if’ para dentro do ‘else’   


Correção 9 - Encontrado por meio do Junit   
9.1 Classe: ‘Campo’  
9.2 Método: ‘localizacaoAdjacenteRandomica(Localizacao localizacao)’  
9.3 Linha: 51  
9.4 Erro: Caso a lista usada no método esteja vazia o sistema retornará uma exceção ‘IndexOutOfBoundsException’  
9.5 Solução: Adição de cláusula ‘if’ para verificar o tamanho da ‘List’ e adição de um ‘return null;’ fora da  cláusula.  

Correção 10 - Encontrado por meio do Junit
10.Classe: ‘LoboGuara’  
10.1 Método: ‘daALuz(List<LoboGuara> novosLobos)’  
10.2 Linha: 97  
10.3 Erro: Quando o método é chamado ele não compara se tem a quantidade correta de localizações livres para 
introduzir os filhotes de lobo guará.  
10.4 Solução:  



Correção 11 - Encontrado por meio do Junit  
11.Classe: ‘LoboGuara’  
11.1 Método: ‘procuraComida(Localizacao localizacao)’  
11.2 Linha: 82  
11.3 Erro:  Não verifica se o animal encontrado é uma ovelha  
11.4 Solução: Fazer um instanceOf dentro de um condicional if.



Correção 12 - Encontrado por meio do Junit  
  
12.1 As classes “LoboGuara” e “Ovelha” possuem métodos exatamente iguais ou seja, as classes possuem replicação de código sem motivo.  
12.2 As classes “LoboGuara” e “Ovelha” também possuem atributos com mesma função.  
12. Métodos afetados:**  
12.1 Ambos os construtores e os métodos das duas classes com os nomes “estaVivo()”, “getLocalizacao()”, “setLocalizacao(Localizacao newLocalizacao)” e “setMorte()”.  


Correção 13 - Encontrado por meio do Junit  
13.1 private int idade;  
13.2 private boolean vivo;  
13.3 private Localizacao localizacao;  
13.4 private Campo campo;  


Correção 14 - Encontrado por meio do Junit  

14.1 A classes “Campo” possui métodos que retornavam  - Object- em vez de Animal, apos a refatoração e criação da classe abstrata "Animal"  
14.2 Métodos afetados:**  
14.3 Os métodos afetados pela mudança, “getObjectAt(Localizacao localizacao)” e “ getObjectAt(int linha, int coluna)”.  
14.4 Solução:  
14.4.1 O retorno de ambos os métodos agora é um objeto da classe "Animal" ou null.    

Correção 15 - Encontrado por meio do Junit  
 
1.1 A classes “Campo” possui métodos que tinham como parâmetros - Object- em vez de Animal, apos a refatoração e criação da classe abstrata "Animal"  
2. Métodos afetados:
2.1 Os métodos afetados pela mudança, “lugar(Animal animal, int linha, int coluna)” e “ lugar(Animal animal, Localizacao localizacao)”.  
3. Solução:
3.1 Os parâmetros foram atualizados, agora o parâmetro animal é da class Animal, e não da classe Object.

Correção 16 - Encontrado por meio do Junit  
  
16.1 A classes “Campo” possui o método *lugar(Object animal, Localizacao localizacao)* que remove um objeto e adiciona outro em seu lugar.  
16.2 Métodos afetados:
16.3 Os métodos afetados pela mudança, “lugar(Animal animal, int linha, int coluna)” e “ lugar(Animal animal, Localizacao localizacao)”.  
16.4 Solução:  
16.5 Foi adicionada uma cláusula *if* que verifica se já existe um objeto na posição desejada(caso exista dispara uma IllegalArgumentException).


Correção 17 - Encontrado por meio do Junit
##Diagrama de Classe
###Diagrama de Classe Antigo

![Diagrama de Classe Logo Guara e Ovelha versão antiga.png](https://bitbucket.org/repo/z8947B5/images/1703861044-Diagrama%20de%20Classe%20Logo%20Guara%20e%20Ovelha%20vers%C3%A3o%20antiga.png)  
  

![Diagrama de Classe Logo Guara e Ovelha.png](https://bitbucket.org/repo/z8947B5/images/626485898-Diagrama%20de%20Classe%20Logo%20Guara%20e%20Ovelha.png)