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