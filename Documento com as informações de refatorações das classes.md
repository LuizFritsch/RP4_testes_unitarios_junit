# Refatorações #
### Inspeção ###
A inspeção e documentação da mesma foi realizada em conjunto por Vitor Hugo e Iderli. O documento oficial pode ser acessado no seguinte link: [INSPEÇÂO](https://bitbucket.org/rpiv_grupo4/rpiv_grupo4/wiki/Inspe%C3%A7%C3%A3o)  
As refatorações que ocorreram após esta etapa foram as seguintes:  



Correção 1    
1.1 Classe: ‘LoboGuara’  
1.2 Método: ‘procria()’  
1.3 Linha ‘108’(mais especificamente no “IF”)  
1.4 Erro: Método para procriação incorreto pois a probabilidade de procriação fica menor que ‘0.75 ao invés de ‘0.75’’  
1.5 Solução: Substituir o ‘<’ por ‘<=’ na linha 108            
1.6 Rastreabilidade: [Inspeção INS01](https://bitbucket.org/rpiv_grupo4/rpiv_grupo4/wiki/Inspe%C3%A7%C3%A3o)  

Correção 2     
2.1 Classe: ‘LoboGuara’  
2.2 Método: ‘podeProcriar()’   
2.3 Linha: ‘119’  
2.4 Erro: Método exige que a idade do lobo para procriar seja maior que a idade de procriação quando a idade do lobo  deveria ser maior ou igual a idade de procriação  
2.5 Solução: Substituir ‘>’ por ‘>=’ na linha 119             
2.6 Rastreabilidade: [Inspeção INS01](https://bitbucket.org/rpiv_grupo4/rpiv_grupo4/wiki/Inspe%C3%A7%C3%A3o)    

Correção 3      
3.1 Classe: ‘Randomizador’  
3.2 Método: ‘Nesse caso toda a classe será refatorada’  
3.3 Linha: ‘Todas basicamente’  
3.4 Erro: ‘Padrão singleton muito mal implementado e com diversos problemas’  
3.5 Solução: ‘Aplicação do padrão singleton e exclusão das variáveis “useShared” e “SEED” ’              
3.6 Rastreabilidade: [Inspeção INS01](https://bitbucket.org/rpiv_grupo4/rpiv_grupo4/wiki/Inspe%C3%A7%C3%A3o)

Correção 4  
4.1 Classe: ‘Simulador’  
4.2 Método: ‘Simulador(int profundidade, int largura)’  
4.3 Linha: ‘33’  
4.4 Erro: Aceita simulações com largura ou/e profundidade iguais a 0  
4.5 Solução: Mudança dos dois operadores ‘<’ por ‘<=’              
4.6 Rastreabilidade: [Inspeção INS01](https://bitbucket.org/rpiv_grupo4/rpiv_grupo4/wiki/Inspe%C3%A7%C3%A3o)

Correção 5  
5.1 Classe: ‘Simulador’  
5.2 Método: ‘simulacaoUmaEtapa()’  
5.3 Linha: ‘61’  
5.4 Erro: Remove todas as ovelhas que estão vivas ao invés das que morreram  
5.5 Solução: Mudança do if de ‘if (ovelha.estaViva())’ para ‘if (!ovelha.estaViva())’            
5.6 Rastreabilidade: [Inspeção INS01](https://bitbucket.org/rpiv_grupo4/rpiv_grupo4/wiki/Inspe%C3%A7%C3%A3o)  

Correção 6     
6.1 Classe: ‘Simulador’  
6.2 Método: ‘simulacaoUmaEtapa()’  
6.3 Linha: ‘74’  
6.4 Erro: Remove todos os lobos guará que estão vivos ao invés dos que morreram  
6.5 Solução: Mudança do if de ‘if (loboGuara.estaVivo())’ para ‘if (!loboGuara.estaVivo())’            
6.6 Rastreabilidade: [Inspeção INS01](https://bitbucket.org/rpiv_grupo4/rpiv_grupo4/wiki/Inspe%C3%A7%C3%A3o)  


Correção 7 - Encontrado por meio do Junit  
7.1 Classe: ‘Campo’  
7.2 Método: ‘localizacoesAdjacentes(Localizacao localizacao)’  
7.3 Linha: 78  
7.4 Erro: O método aceita uma Localizacao com linha/coluna maior que a profundidade/largura do campo  
7.5 Solução: Adição de uma condição ‘if’ na linha 78 que exige que a linha/coluna da localização seja menor que a profundidade/largura do campo.  
7.6 Rastreabilidade: [JUnit](https://bitbucket.org/rpiv_grupo4/rpiv_grupo4/wiki/Documenta%C3%A7%C3%A3o%20dos%20casos%20de%20teste)



Correção 8 - Encontrado por meio do Junit  
8.1 Classe: ‘Localizacao’  
8.2 Método: Construtor  
8.3 Linha: 20  
8.4 Erro: Não lançava exceção quando recebia dados inválidos  
8.5 Solução: Refatoração do ‘if’ de ‘(linha>=0 && coluna>=0)’ para ‘(linha<0 || coluna<0)’ e quando satisfeita a condição fazer com que lance uma exceção ‘IllegalArgumentException’ além da mudança do código que antes estava dentro do ‘if’ para dentro do ‘else’   
8.6 Rastreabilidade: [JUnit](https://bitbucket.org/rpiv_grupo4/rpiv_grupo4/wiki/Documenta%C3%A7%C3%A3o%20dos%20casos%20de%20teste)    

Correção 9 - Encontrado por meio do Junit   
9.1 Classe: ‘Campo’  
9.2 Método: ‘localizacaoAdjacenteRandomica(Localizacao localizacao)’  
9.3 Linha: 51  
9.4 Erro: Caso a lista usada no método esteja vazia o sistema retornará uma exceção ‘IndexOutOfBoundsException’  
9.5 Solução: Adição de cláusula ‘if’ para verificar o tamanho da ‘List’ e adição de um ‘return null;’ fora da  cláusula.    
9.6 Rastreabilidade: [JUnit](https://bitbucket.org/rpiv_grupo4/rpiv_grupo4/wiki/Documenta%C3%A7%C3%A3o%20dos%20casos%20de%20teste)    

Correção 10 - Encontrado por meio do Junit
10.1Classe: ‘LoboGuara’  
10.2 Método: ‘daALuz(List<LoboGuara> novosLobos)’  
10.3 Linha: 97  
10.4 Erro: Quando o método é chamado ele não compara se tem a quantidade correta de localizações livres para 
introduzir os filhotes de lobo guará.  
10.5 Solução:    
10.6 Rastreabilidade: [JUnit](https://bitbucket.org/rpiv_grupo4/rpiv_grupo4/wiki/Documenta%C3%A7%C3%A3o%20dos%20casos%20de%20teste)    


Correção 11 - Encontrado por meio do Junit  
11.1 Classe: ‘LoboGuara’  
11.2 Método: ‘procuraComida(Localizacao localizacao)’  
11.3 Linha: 82  
11.4 Erro:  Não verifica se o animal encontrado é uma ovelha  
11.5 Solução: Fazer um instanceOf dentro de um condicional if.
11.6 Rastreabilidade: [JUnit](https://bitbucket.org/rpiv_grupo4/rpiv_grupo4/wiki/Documenta%C3%A7%C3%A3o%20dos%20casos%20de%20teste)    


Correção 12 - Encontrado por meio do Junit  
  
12.1 As classes “LoboGuara” e “Ovelha” possuem métodos exatamente iguais ou seja, as classes possuem replicação de código sem motivo.  
12.2 As classes “LoboGuara” e “Ovelha” também possuem atributos com mesma função.  
12. Métodos afetados:**  
12.1 Ambos os construtores e os métodos das duas classes com os nomes “estaVivo()”, “getLocalizacao()”, “setLocalizacao(Localizacao newLocalizacao)” e “setMorte()”.    
12.6 Rastreabilidade: [JUnit](https://bitbucket.org/rpiv_grupo4/rpiv_grupo4/wiki/Documenta%C3%A7%C3%A3o%20dos%20casos%20de%20teste)    

Correção 13 - Encontrado por meio do Junit  
13.1 private int idade;  
13.2 private boolean vivo;  
13.3 private Localizacao localizacao;  
13.4 private Campo campo;  


Correção 14 - Encontrado por meio do Junit  

14.1 A classes “Campo” possui métodos que retornavam  - Object- em vez de Animal, após a refatoração e criação da classe abstrata "Animal"  
14.2 Métodos afetados:**  
14.3 Os métodos afetados pela mudança, “getObjectAt(Localizacao localizacao)” e “ getObjectAt(int linha, int coluna)”.  
14.4 Solução:  
14.4.1 O retorno de ambos os métodos agora é um objeto da classe "Animal" ou null.    

Correção 15 - Encontrado por meio do Junit  
 
1.1 A classes “Campo” possui métodos que tinham como parâmetros - Object- em vez de Animal, após a refatoração e criação da classe abstrata "Animal"  
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
16.6 Rastreabilidade: [JUnit](https://bitbucket.org/rpiv_grupo4/rpiv_grupo4/wiki/Documenta%C3%A7%C3%A3o%20dos%20casos%20de%20teste)    

Correção 17 -   
17.1 Classe: "CampoEstatistica"    
17.2 Método: "geraContadores(Campo campo)"    
17.3 Linha: 69     
17.4 Erro: Não exige que sejam herdeiros da classe Animal        
17.5 Solução: Fazer casting para do objeto retornado pelo método “getObjectAt(linha, coluna)” de “Object” para “Animal”       
17.6 Rastreabilidade: [JUnit](https://bitbucket.org/rpiv_grupo4/rpiv_grupo4/wiki/Documenta%C3%A7%C3%A3o%20dos%20casos%20de%20teste) 

Correção 18 -      
18.1 Classe: “CampoTest”     
18.2 Método: “testLugarObjectLocalizacao2()”     
18.3 Linha: 258     
18.4 Erro: Método não necessita de um assert e precisa da adição do (expected = IllegalArgumenteException.class) pois ao enviar null no método “lugar(null, l)” o sistema retorna a exceção.       
18.5 Solução: Remoção do assert desnecessário e adição da cláusula (expected = IllegalArgumenteException.class) no método refatorado.    
18.6 Rastreabilidade: Análise em grupo        

Correção 19 -      
19.1 Classe: “SimuladorTela”       
19.2 Método: “setCor(Class animalClass, Color color)”      
19.3 Linha: 43      
19.4 Erro: Aceita dados inválidos como por exemplo “null”         
19.5 Solução: Adição de cláusula “if” para verificar se os valores são nulos e disparar as devidas exceções e verificar se a classe do animal recebido é uma das herdeira de “Animal”    
19.6 Rastreabilidade: [JUnit](https://bitbucket.org/rpiv_grupo4/rpiv_grupo4/wiki/Documenta%C3%A7%C3%A3o%20dos%20casos%20de%20teste)    

Correção 20 -      
20.1 Classe: “Animal”       
20.2 Método: “setLocalizacao(Localizacao newLocalizacao)”     
20.3 Linha: 31      
20.4 Erro: O método “setLocalizacao(Localizacao newLocalizacao)” aceita uma localização com linha ou coluna igual a tamanho máximo+1         
20.5 Solução:  Adição de “-1” logo após cada comparação na cláusula “if” da linha 35 possibilitando apenas localizações com tamanho menor que o tamanho máximo do campo.    
20.6 Rastreabilidade: [JUnit](https://bitbucket.org/rpiv_grupo4/rpiv_grupo4/wiki/Documenta%C3%A7%C3%A3o%20dos%20casos%20de%20teste)        

Correção 21 -      
21.1 Classe: “Simulador”       
21.2 Método: “povoa()”      
21.3 Linha: 101 e 105      
21.4 Erro: Condições para procriação estão invertidas. A probabilidade de criar ovelhas na realidade cria lobos e a de criar lobos cria ovelhas.        
21.5 Solução: Inversão do código dentro do “if” da linha 101 para o “else if” linha 105 e vice versa.    
21.6 Rastreabilidade: Análise em grupo        

Correção 22 -     
22.1 Classe: “LoboGuara”       
22.2 Método: “procuraComida(Localizacao localizacao)”     
22.3 Linha: 62      
22.4 Erro: Não confere se o animal recebido é uma ovelha       
22.5 Solução: Adição de cláusula “if” para verificar se o objeto é uma instância de Ovelha.    
22.6 Rastreabilidade: [JUnit](https://bitbucket.org/rpiv_grupo4/rpiv_grupo4/wiki/Documenta%C3%A7%C3%A3o%20dos%20casos%20de%20teste)    

Correção 23 -      
23.1 Classe: “Contador”       
23.2 Método: construtor     
23.3 Linha: 17       
23.4 Erro: Mostra o nome do pacote no método "getName()"        
23.5 Solução: Adição de cláusula "if" para verificar se é uma Ovelha ou um LoboGuara     
23.6 Rastreabilidade: [JUnit](https://bitbucket.org/rpiv_grupo4/rpiv_grupo4/wiki/Documenta%C3%A7%C3%A3o%20dos%20casos%20de%20teste)     
 
Correção 24 -       
24.1 Classe: “Simulador”     
24.2 Método: “simulacaoUmaEtapa()”     
24.3 Linha: 83     
24.4 Erro: Não adicionava +1 a variável global "etapa" ao fim de cada etapa     
24.5 Solução: adição da linha “etapa++;” na linha 83    
24.6 Rastreabilidade: Análise em grupo  

Correção 25 -     
25.1 Classe: “Ovelha”    
25.2 Método: “daALuz(List<Ovelha> novasOvelhas)”     
25.3 Linha: 58     
25.4 Erro: Não verificava se a lista de posições livres estava vazia    
25.5 Solução: Adição da cláusula “if” na linha 58 que verifica se a lista está vazia e cláusula “else” após o “if” com um break       
25.6 Rastreabilidade: Análise em grupo

Correção 26 -     
26.1 Classe: “Lobo”    
26.2 Método: “daALuz(List<Ovelha> novasOvelhas)”    
26.3 Linha: 79    
26.4 Erro: Não verificava se a lista de posições livres estava vazia    
26.5 Solução: Adição da cláusula “if” na linha 79 e cláusula “else” após o “if” com um break        
26.6 Rastreabilidade: Análise em grupo

Correção 27 -     
27.1 Classe: “Simulador”     
27.2 Método: “povoa()”    
27.3 Linha: 111    
27.4 Erro: Criava um objeto sem ter idade randômica   
27.5 Solução: Substituição do argumento false para true     
27.6 Rastreabilidade: Análise em grupo  
 
Correção 28 -    
28.1 Classe: “LoboGuara”    
28.2 Método: “procuraComida(Localizacao localizacao)”    
28.3 Linha: 63     
28.4 Erro: O objeto utilizado para guardar a ovelha era do tipo “Object” ao invés do tipo “Ovelha”     
28.5 Solução: Substituir o tipo do objeto usado para guardar a ovelha de “Object” para “Ovelha”.        
28.6 Rastreabilidade: Análise em grupo  

Correção 29 -    
29.1 Classe: “LoboGuara”    
29.2 Método: “caca(List<LoboGuara> novosLobos)”    
29.3 Linha: 26     
29.4 Erro: O lobo sempre morria caso não encontrasse comida ao invés de reduzir sua barra de fome     
29.5 Solução: Substituir o "setMorte()" da cláusula "else" para "decrementaFome()"       
29.6 Rastreabilidade: Análise em grupo

Correção 30 -    
30.1 Classe: "Campo"    
30.2 Método: "localizacaoAdjacenteRandomica(Localizacao localizacao)"    
30.3 Linha: 69     
30.4 Erro: Usava "lista.size()==0"  ao invés de "isEmpty()"     
30.5 Solução: Substituir o "lista.size()==0" por "isEmpty()"   
30.6 Rastreabilidade: Análise em grupo  
  
Correção 31 -    
31.1 Classe: "LoboGuara"    
31.2 Método: "Construtor LoboGuara"    
31.3 Linha: 24     
31.4 Erro: nivelFome ao ser iniciado pela rand, podia receber 0. 0 de fome o lobo deve estar morto.      
31.5 Solução: "Adicionar + 1. Após o sorteio feito pelo rand"   
31.6 Rastreabilidade:  [ Documentação caso de teste](https://bitbucket.org/rpiv_grupo4/rpiv_grupo4/wiki/Documenta%C3%A7%C3%A3o%20dos%20casos%20de%20teste) CT53.  
  
  
Correção 32 -    
32.1 Classe: "LoboGuara"    
32.2 Método: "caca"    
32.3 Linha: 44     
32.4 Erro: Se o lobo não se move, nível fome não se altera corretamente.      
32.5 Solução: "Adicionar método decremetafome() dentro do if"   
32.6 Rastreabilidade:  [ Documentação caso de teste](https://bitbucket.org/rpiv_grupo4/rpiv_grupo4/wiki/Documenta%C3%A7%C3%A3o%20dos%20casos%20de%20teste) CT54 e CT55. 
  
  
Correção 33 -    
33.1 Classe: "Ovelha"    
33.2 Método: "corre"    
33.3 Linha: 26     
33.4 Erro: A localização influencia na quantidade de individuos máximo.      
33.5 Solução: " Ovelha corre, só então executa  daLuz"   
33.6 Rastreabilidade:  [ Documentação caso de teste](https://bitbucket.org/rpiv_grupo4/rpiv_grupo4/wiki/Documenta%C3%A7%C3%A3o%20dos%20casos%20de%20teste) CT57 e CT58.  
  
Correção 34 -    
34.1 Classe: "Ovelha"    
34.2 Método: "daALuz"    
34.3 Linha: 56     
34.4 Erro: "else" desnecessário. Refatorações anteriores não removeu.      
34.5 Solução: "remover o else do condicional IF".   
34.6 Rastreabilidade:  [Inspeção - Reinspeção](https://bitbucket.org/rpiv_grupo4/rpiv_grupo4/wiki/Inspe%C3%A7%C3%A3o)  
  
Correção 35 -    
35.1 Classe: "Ovelha"    
35.2 Método: "procia"    
35.3 Linha: 75     
35.4 Erro: ovelha morta, poderia dar a luz.      
35.5 Solução: "Adição do this.vivo dentro do condicional if"   
35.6 Rastreabilidade:  [ Documentação caso de teste](https://bitbucket.org/rpiv_grupo4/rpiv_grupo4/wiki/Documenta%C3%A7%C3%A3o%20dos%20casos%20de%20teste) CT53.  
              
Correção 36 -    
36.1 Classe: "LoboGuara"    
36.2 Método: "caca"    
36.3 Linha: 77     
36.4 Erro: Referente a implementação do método o lobo se alimenta antes de andar sempre perdendo 1 de fome      
36.5 Solução: Adicionar na variável fome ovelha +1   
36.6 Rastreabilidade: Análise em grupo.    
           
Correção 37 -    
37.1 Classe: "SimuladorTela"    
37.2 Método: "preparePaint"    
37.3 Linha: 128     
37.4 Erro: Dentro da cláusula "if" tem um "getSize" que não redimensionava corretamente após colocar um campo muito grande       
37.5 Solução: Remover o "getSize" e adicionar um "getPrefireSize"  
37.6 Rastreabilidade: Análise em grupo.

Correção 38 -    
38.1 Classe: "Campo"    
38.2 Método: "localizacaoAdjacentRandomica"    
38.3 Linha: 72     
38.4 Erro: Lista null não possui a posição inicial 
38.5 Solução: Acionado clausula if para que se a lista esta vazia retorna null, caso contrario pega a primeira posição.  
38.6 Rastreabilidade:   [ Documentação caso de teste](https://bitbucket.org/rpiv_grupo4/rpiv_grupo4/wiki/Documenta%C3%A7%C3%A3o%20dos%20casos%20de%20teste) CT 42, CT 44.


Correção 39 -    
39.1 Classe: "Ovelha"    
392 Método: "podeProcriar"    
39.3 Linha: 85     
39.4 Erro: Ovelhas mortas podem procriar  
39.5 Solução: Clausula if verificando se ela esta viva e tem idade suficiente.  
39.6 Rastreabilidade:   [ Documentação caso de teste](https://bitbucket.org/rpiv_grupo4/rpiv_grupo4/wiki/Documenta%C3%A7%C3%A3o%20dos%20casos%20de%20teste) CT 47, CT 49.

      
    


    
    
## Diagrama de Classe Refatorado

![Diagrama de Classe Logo Guara e Ovelha versão antiga.png](https://github.com/LuizFritsch/RP4_testes_unitarios_junit/blob/master/diagramaClasseRefatorado.png)  


### Diagrama de Classe Antigo

![Diagrama de Classe Logo Guara e Ovelha.png](https://github.com/LuizFritsch/RP4_testes_unitarios_junit/blob/master/diagramaClasseAntigo.png)
