# **INS01** - Check List para inspeção das classes “LoboGuara”, “Randomizador” e “Simulador”  

|**Status**                              |**Sim**  |**Não**  |**Indiferente**  | 
|----------------------------------------|---------|---------|-----------------|   
|Todas as constantes foram denominadas?  |     X   |   --    |       --        |  
|O limite superior de vetores deve ser igual ao tamanho do vetor ou tamanho -1?|   X   |   --    |    --    |
|Para cada declaração condicional, a condição está correta?|  --   |    X    |    --    |
|Cada loop está terminando corretamente? |  --   |    X    |    --    |
|As declarações compostas estão corretamente delimitadas entre parênteses? |   X   |   --    |    --    |
|Todas as variáveis de entrada são usadas? |   X   |   --    |    --    |
|Nenhuma  das entradas inesperadas podem fazer com que os dados sejam corrompidos?|  --   |    X    |    --    |
|Todas as condições possíveis de erro foram consideradas? |  --   |   --    |     X    |
|Toda as chamadas de funções e de métodos tem o número correto de parâmetros? |   X   |   --    |    --    |
|Os parâmetros estão na ordem correta? |   X   |   --    |    --    |
|Toda as chamadas de funções e de métodos tem o número correto de parâmetros? |   X   |   --    |    --    |
|As variáveis são de fácil entendimento? |   X   |   --    |    --    |





**Correções da inspeção**   


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


# **INS02** - Check List para inspeção das classes “Ovelha”, “Campo”

|**Status**                              |**Sim**  |**Não**  |**Indiferente**  | 
|----------------------------------------|---------|---------|-----------------|   
|Todas as constantes foram denominadas?  |     X   |   --    |       --        |  
|O limite superior de vetores deve ser igual ao tamanho do vetor ou tamanho -1?|   --   |   X    |    --    |
|Para cada declaração condicional, a condição está correta?|  X   |    --    |    --    |
|Cada loop está terminando corretamente? |  X   |   --    |    --    |
|As declarações compostas estão corretamente delimitadas entre parênteses? |   X   |   --    |    --    |
|Todas as variáveis de entrada são usadas? |   X   |   --    |    --    |
|Nenhuma  das entradas inesperadas podem fazer com que os dados sejam corrompidos?|  --   |   --    |    X    |
|Todas as condições possíveis de erro foram consideradas? |  X   |   --    |    --    |
|Toda as chamadas de funções e de métodos tem o número correto de parâmetros? |   X   |   --    |    --    |
|Os parâmetros estão na ordem correta? |   X   |   --    |    --    |
|Toda as chamadas de funções e de métodos tem o número correto de parâmetros? |   --  |   X    |    --    |
|As variáveis são de fácil entendimento? |   --   |   X    |    --    |



# **INS03** - Check List para inspeção das classes “SimuladorTela”, “CampoEstatistica”

|**Status**                              |**Sim**  |**Não**  |**Indiferente**  | 
|----------------------------------------|---------|---------|-----------------|   
|Todas as constantes foram denominadas?  |     X   |   --    |       --        |  
|O limite superior de vetores deve ser igual ao tamanho do vetor ou tamanho -1?|   X   |   --    |    --    |
|Para cada declaração condicional, a condição está correta?|  --   |    X    |    --    |
|Cada loop está terminando corretamente? |  X   |   --    |    --    |
|As declarações compostas estão corretamente delimitadas entre parênteses? |   X   |   --    |    --    |
|Todas as variáveis de entrada são usadas? |   X   |   --    |    --    |
|Nenhuma  das entradas inesperadas podem fazer com que os dados sejam corrompidos?|  X   |   --    |   --    |
|Todas as condições possíveis de erro foram consideradas? |  --   |   --    |    --    |
|Toda as chamadas de funções e de métodos tem o número correto de parâmetros? |   X   |   --    |    --    |
|Os parâmetros estão na ordem correta? |   X   |   --    |    --    |
|Toda as chamadas de funções e de métodos tem o número correto de parâmetros? |   --  |   --    |    --    |
|As variáveis são de fácil entendimento? |   X   |   --    |    --    |



# Correções da inspeção das classes “SimuladorTela”, “Ovelha”, “Campo”, “CampoEstatistica”  


1.Erro encontrado por meio do Junit  
1.1 Classe: ‘Campo’  
1.2 Método: ‘localizacoesAdjacentes(Localizacao localizacao)’  
1.3 Linha: 78  
1.4 Erro: O método aceita uma Localizacao com linha/coluna maior que a profundidade/largura do campo  
1.5 Solução: Adição de uma condição ‘if’ na linha 78 que exige que a linha/coluna da localização seja menor que a profundidade/largura do campo.  


2. Erro encontrado por meio do Junit  
2.1 Classe: ‘Localizacao’  
2.2 Método: Construtor  
2.3 Linha: 20  
2.4 Erro: Não lançava exceção quando recebia dados inválidos  
2.5 Solução: Refatoração do ‘if’ de ‘(linha>=0 && coluna>=0)’ para ‘(linha<0 || coluna<0)’ e quando satisfeita a condição fazer com que lance uma exceção ‘IllegalArgumentException’ além da mudança do código que antes estava   
2.6 dentro do ‘if’ para dentro do ‘else’   


3. Correção   
3.1 Classe: ‘Campo’  
3.2 Método: ‘localizacaoAdjacenteRandomica(Localizacao localizacao)’  
3.3 Linha: 51  
3.4 Erro: Caso a lista usada no método esteja vazia o sistema retornará uma exceção ‘IndexOutOfBoundsException’  
3.5 Solução: Adição de cláusula ‘if’ para verificar o tamanho da ‘List’ e adição de um ‘return null;’ fora da  cláusula.  


# **INS04** - Check List para inspeção da classe “LoboGuara”


|**Status**                              |**Sim**  |**Não**  |**Indiferente**  | 
|----------------------------------------|---------|---------|-----------------|   
|Todas as constantes foram denominadas?  |     X   |   --    |       --        |  
|O limite superior de vetores deve ser igual ao tamanho do vetor ou tamanho -1?|   --  |    X   |    --    |
|Para cada declaração condicional, a condição está correta?|  --   |    X    |    --    |
|Cada loop está terminando corretamente? |  --   |    X    |    --    |
|As declarações compostas estão corretamente delimitadas entre parênteses? |   X   |   --    |    --    |
|Todas as variáveis de entrada são usadas? |   X   |   --    |    --    |
|Nenhuma  das entradas inesperadas podem fazer com que os dados sejam corrompidos?|  --   |    X    |    --    |
|Todas as condições possíveis de erro foram consideradas? |  --   |   X   |    --    |
|Toda as chamadas de funções e de métodos tem o número correto de parâmetros? |   X   |   --    |    --    |
|Os parâmetros estão na ordem correta? |   X   |   --    |    --    |
|Toda as chamadas de funções e de métodos tem o número correto de parâmetros? |   X   |   --    |    --    |
|As variáveis são de fácil entendimento? |   --   |    X    |    --    |



# Correções da inspeção das classes “LoboGuara”  

1.Classe: ‘LoboGuara’  
1.1 Método: ‘daALuz(List<LoboGuara> novosLobos)’  
1.2 Linha: 97  
1.3 Erro: Quando o método é chamado ele não compara se tem a quantidade correta de localizações livres para 
introduzir os filhotes de lobo guará.  
1.4 Solução: Verificar se há adjacentes livres, e ir adicionando filhotes até zerar a lista. Caso o número de localizações adjacentes livres seja menor que a de filhotes, ele remove os filhotes excedentes. (Não nascem)



2.Classe: ‘LoboGuara’  
2.1 Método: ‘procuraComida(Localizacao localizacao)’  
2.2 Linha: 82  
2.3 Erro:  Não verifica se o animal encontrado é uma ovelha  
2.4 Solução: Verificar se o objeto encontrado é uma Ovelha
