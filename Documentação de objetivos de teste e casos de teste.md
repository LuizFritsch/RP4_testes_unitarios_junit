#Requisitos do MD50  
 RE01: Modela o comportamento de um subconjunto do mundo real com base em um
modelo de software  
 RE02: Estima o comportamento de populações entre predadores e presas  
 RE03: Permite similar cenários de populações em diferentes áreas  
 RE04: Pode ser estendida para outros tipos de animais: predadores e presas  
  
#Casos de teste

 **Identificador:**  CT01  testGetLargura  classe CampoTest        

   **Objetivo:**  O teste deve verificar se em uma execução de simulação, o metodo GetLargura esta funcionando 

   **corretamente:** Para isso deve-se criar uma simulação com parâmetros validos e inválidos.    

   **Prioridade:** Média   
 
 **Condições prévias:** Nenhuma  

| Rastreabilidade:    |   RE01       |      RE02       |    RE03        |   RE04  |
|---------------------|--------------|-----------------|----------------|---------|  
|          CT01       |      X       |       --        |       X        |    X    |


| **Entradas**                                  | Resultado esperado                      |Resultado do Teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| profundidade 5 e largura 31  | É esperado que o teste não encontre erros  |  Teste passou |
| profundidade 5 e largura 0   | É esperado que o teste lance a exceção illergalArgumentException  |  Teste falhou, o teste lançou um ArithmeticException |


![Screenshot_1.png](https://.org/repo/z8947B5/images/497449455-Screenshot_1.png)

**Identificador:**            CT02   testGetProfundidade classe CampoTest      

 **Objetivo:**                    O teste deve verificar se em uma execução de simulação, o metodo GetProfundidade esta funcionando corretamente. Para isso deve-se criar uma simulação com parâmetros validos e inválidos.  

 **Prioridade:**                Média
  
 **Condições prévias:**           Nenhuma


| Rastreabilidade:    |   RE01       |    RE02         |    RE03        |   RE04  |
|---------------------|--------------|-----------------|----------------|---------|  
|          CT02       |      X       |      --         |       X        |    X    |

| Entradas                              |  Resultado esperado                             |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| profundidade 31 e largura 5  | É esperado que o teste não encontre erros  |  Teste passou |
| profundidade 0 e largura 5   | É esperado que o teste lance a exceção illegalArgumentException  |  Teste falhou, o teste lançou um ArithmeticException |

![Screenshot_1.png](https://.org/repo/z8947B5/images/497449455-Screenshot_1.png)

**Identificador:**             CT03   testGetPopulationDetails   classe CampoEstatisticaTest    
 
**Objetivo:**                    O teste deve verificar se é retornado os detalhes da população em uma simulação.   
 
**Prioridade:**                  Alta  
 
**Condições prévias:**           Nenhuma

| Rastreabilidade:    |   RE01       |    RE02         |    RE03        |   RE04  |
|---------------------|--------------|-----------------|----------------|---------|  
|          CT03       |      X       |      X         |       X        |    X    |

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| criar um campo 3x3 e 3 ovelhas com parâmetros (0,0)(0,1)(0,2) | É esperado que o teste retorne null  |  Teste passou |
| criar um campo 100x100 e 3 ovelhas com parâmetros (0,0)(0,1)(0,2) | "" |  ""|

![Screenshot_1.png](https://.org/repo/z8947B5/images/497449455-Screenshot_1.png)


**Identificador:**             CT04   testCorre classe OvelhaTest      

 **Objetivo:**                    O teste deve verificar o uso do metodo Corre da ovelha.    

 **Prioridade:**                  Alta  

 **Condições prévias:**           Método estaViva funcionando corretamente  


| Rastreabilidade:    |   RE01       |    RE02         |    RE03        |   RE04  |
|---------------------|--------------|-----------------|----------------|---------|  
|          CT04       |      X       |      X         |       --       |    --    |

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
|Executar o método corre e chamar o metodo estaViva  | return true  |  teste falhou |
|Incrementar a idade da ovelha até o máximo +1 e chamar o metodo estaViva  | return false  |  teste falhou, a ovelha continua viva após a idade máxima |


![Screenshot_1.png](https://.org/repo/z8947B5/images/497449455-Screenshot_1.png)

**Identificador:**            CT05   testEqualsObject classe LocalizacaoTest      

 **Objetivo:**                     O teste deve verificar o uso do metodo equals. Deve-se criar uma localizacao com parâmetros validos e inválidos   

 **Prioridade:**                  Alta    

**Condições prévias:**           Nenhuma  

| Rastreabilidade:    |   RE01       |    RE02         |    RE03        |   RE04  |
|---------------------|--------------|-----------------|----------------|---------|  
|          CT05       |      --    |      --         |       --       |    X   |

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| localizacao(10,10)|""  |  teste passou |
| localizacao(,)| "" |  teste passou |

![Screenshot_1.png](https://.org/repo/z8947B5/images/497449455-Screenshot_1.png)

**Identificador:**            CT06   testGetLinha classe LocalizacaoTest      
 
**Objetivo:**                     O teste deve criar uma localizacao com parametros validos e invalidos e verificar o uso do metodo getLinha 
 
**Prioridade:**                  baixa   
 
**Condições prévias:**           Nenhuma

| Rastreabilidade:    |   RE01       |    RE02         |    RE03        |   RE04  |
|---------------------|--------------|-----------------|----------------|---------|  
|          CT06       |      X      |      --         |       X        |    X    |

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| localizacao(10,15)| teste passar |  teste passou |
| localizacao(0,100)| tratamento de exceção |  teste passou |
| localizacao(0,-100)| tratamento de exceção |  teste retornou um IllegalArgumentException |

![Screenshot_1.png](https://.org/repo/z8947B5/images/497449455-Screenshot_1.png)

**Identificador:**        CT07   testGetColuna classe LocalizacaoTest      

 **Objetivo:**                     O teste deve criar uma localizacao com parametros validos e invalidos e verificar o uso do metodo getColuna 
 **Prioridade:**                  baixa   
 **Condições prévias:**           Nenhuma

| Rastreabilidade:    |   RE01       |    RE02         |    RE03        |   RE04  |
|---------------------|--------------|-----------------|----------------|---------|  
|          CT07       |      X       |      --         |       X        |    X    |

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| localizacao(10,15)|teste passar  |  teste passou |
| localizacao(0,100)| teste falhar |  teste passou |
| localizacao(-100,0)| teste falhar |  teste retornou um IllegalArgumentException |

![Screenshot_1.png](https://.org/repo/z8947B5/images/497449455-Screenshot_1.png)

**Identificador:**       CT08   testHashCode classe LocalizacaoTest      

** Objetivo:**                     O teste deve criar uma localizacao com parametros validos e invalidos e verificar o uso do metodo HashCode 

 **Prioridade:**                  baixa   

 **Condições prévias:**           Nenhuma

| Rastreabilidade:    |   RE01       |    RE02         |    RE03        |   RE04  |
|---------------------|--------------|-----------------|----------------|---------|  
|          CT08       |     --       |      --         |      --        |    X    |

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| localizacao(10,15)|teste passar  |  teste passou |
| localizacao(-1,-1)| tratamento de exceção |  teste retornou um IllegalArgumentException |
| localizacao(-110, 15)| tratamento de exceção |  teste retornou um IllegalArgumentException |

![Screenshot_1.png](https://.org/repo/z8947B5/images/497449455-Screenshot_1.png)

 **Identificador:**             CT09   testGetName classe ContadorTest     

 **Objetivo:**                     O teste deve criar um contador com parâmetros validos e inválidos, e testar a execução do método getName  

 **Prioridade:**                  baixa   

 **Condições prévias:**           Nenhuma

| Rastreabilidade:    |   RE01       |    RE02         |    RE03        |   RE04  |
|---------------------|--------------|-----------------|----------------|---------|  
|          CT09       |      X       |      --         |      --        |    X    |

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| Contador ("lobo")|O teste não retornar nenhum erro |  teste passou |
| Contador ("")| tratamento de exceção |  teste passou |
| Contador ("Ovelha")|  O teste não retornar nenhum erro |  teste passou  |

![Screenshot_1.png](https://.org/repo/z8947B5/images/497449455-Screenshot_1.png)

**Identificador:**        CT10   testGetCount classe ContadorTest     

 **Objetivo:**                     O teste deve criar um contador com parâmetros validos e inválidos, e testar a execução do método getCount  

 **Prioridade:**                  baixa   

 **Condições prévias:**           Nenhuma

| Rastreabilidade:    |   RE01       |    RE02         |    RE03        |   RE04  |
|---------------------|--------------|-----------------|----------------|---------|  
|          CT010       |      X       |      --         |       X        |    X    |

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| Contador ("")| tratamento de exceção |  teste passou |
| Contador ("Ovelha")|  O teste não retornar nenhum erro |  teste passou  |

![Screenshot_1.png](https://.org/repo/z8947B5/images/497449455-Screenshot_1.png)

**Identificador:**        CT11   testIncrement classe ContadorTest     

 **Objetivo:**                     O teste deve criar um contador com parâmetros validos, e testar a execução do método increment  

 **Prioridade:**                  Media   

 **Condições prévias:**           Nenhuma

| Rastreabilidade:    |   RE01       |    RE02         |    RE03        |   RE04  |
|---------------------|--------------|-----------------|----------------|---------|  
|          CT011       |     X       |      --         |       X        |    X    |

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| incrementar 1000 vezes a ovelha| tratamento de exceção |  teste passou |


![Screenshot_1.png](https://.org/repo/z8947B5/images/497449455-Screenshot_1.png)

**Identificador:**       CT12   testReset classe ContadorTest     
 
**Objetivo:**                     O teste deve criar um contador com parâmetros validos e inválidos, e testar a execução do método Reset   

 **Prioridade:**                  baixa   

 **Condições prévias:**           Nenhuma

| Rastreabilidade:    |   RE01       |    RE02         |    RE03        |   RE04  |
|---------------------|--------------|-----------------|----------------|---------|  
|          CT12       |      X       |      --         |       X        |    X    |

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| chamar o método reset| teste retornar 0 |  teste passou |

![Screenshot_1.png](https://.org/repo/z8947B5/images/497449455-Screenshot_1.png)

**Identificador:**        CT13   testGetLargura classe CampoTest    |

 **Objetivo:**                    O metodo testGetLargura deve verificar se o metodo getLargura retorna a largura exata de um campo  

 **Prioridade:**                  |baixa |  

 **Condições prévias:**           |Nenhuma|

| Rastreabilidade:    |   RE01       |    RE02         |    RE03        |   RE04  |
|---------------------|--------------|-----------------|----------------|---------|  
|          CT13       |      X       |      --         |       X        |    X    |

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| chamar o método reset| teste retornar 0 |  teste passou |

![Screenshot_1.png](https://.org/repo/z8947B5/images/497449455-Screenshot_1.png)

**Identificador:**       CT14   testGetPopulationDetails classe CampoEstatisticaTest    
 
**Objetivo:**                    O teste verifica se o metodo GetPopulation retorna uma String informando corretamente os dados do campo  
 
**Prioridade:**                  Alta   

 **Condições prévias:**           Nenhuma  

| Rastreabilidade:    |   RE01       |    RE02         |    RE03        |   RE04  |
|---------------------|--------------|-----------------|----------------|---------|  
|          CT14       |      X       |       X         |       X        |    X    |

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
|Criar 3 ovelhas com entradas (0,0)(0,1)(0,2) | O método não deve retornar null | teste passou |
|Criar 3 ovelhas com entradas (0,0)(0,1)(0,2) | O método deve retornar uma String | teste passou |
|Criar 3 ovelhas com entradas (0,0)(0,1)(0,2) | O método deve retornar a String "Ovelha:3" | teste falhou, o pacote da classe é descrito na String, exemplo: ol.Ovelha: 3 |
|Criar 3 ovelhas com entradas validas, criar 3 lobos guará com entradas validas e criar 3 campos com entradas validas | O método deve retornar a String na ordem "ol.LoboGuara: 3 ol.Ovelha: 3 ol.Campo: 3" | teste falhou, o método não tem uma ordem especifica para retornar as Strings, os Objetos podem variar de posição em qualquer execução do método |
|Deixar o campo vazio |O método deve informar que o campo se encontra vazio | teste falhou, o método ão retorna nenhuma informação |

![Screenshot_1.png](https://.org/repo/z8947B5/images/497449455-Screenshot_1.png)

**Identificador:**        CT15   testRedefine classe CampoEstatisticaTest    

 **Objetivo:**                     O método verifica se após a execução do método Redefine o campo terá 0 objetos 
 
**Prioridade:**                    baixa   

 **Condições prévias:**            O método GetPopulationDetails da mesma classe, deve estar implementado corretamente

| Rastreabilidade:    |   RE01       |    RE02         |    RE03        |   RE04  |
|---------------------|--------------|-----------------|----------------|---------|  
|          CT15       |      X       |      --         |       X        |    X    |

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| Deve ser criado 3 ovelhas e chamar o método Redefine | teste deve mostrar que não tem objetos no campo |  teste passou, retornou 0 |
| Deve ser criado 3 ovelha, chamar o método Redefine e incrementar o campo | O teste só deve contar os objetos que foram incrementados após redefinir o campo |  teste passou |

![Screenshot_1.png](https://.org/repo/z8947B5/images/497449455-Screenshot_1.png)

**Identificador:**      CT16   testContadorFinalizado classe CampoEstatisticaTest    
 **Objetivo:**                     O método verifica a execução do método contadorFinalizado  

 **Prioridade:**                   baixa 
  
 **Condições prévias:**           O método GetPopulationDetails da mesma classe, deve estar implementado corretamente  

| Rastreabilidade:    |   RE01       |    RE02         |    RE03        |   RE04  |
|---------------------|--------------|-----------------|----------------|---------|  
|          CT016       |      X      |      --         |       X        |    X    |

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| Deve ser criado 3 ovelhas e chamar o método contadorFinalizado | Saida esperada: " " |  teste passou |

![Screenshot_1.png](https://.org/repo/z8947B5/images/497449455-Screenshot_1.png)

**Identificador:**        CT17   testEhViavel classe CampoEstatisticaTest    

 **Objetivo:**                     O método verifica se há um lobo e uma ovelha para fazer a simulação

 **Prioridade:**                   Media   

 **Condições prévias:**            Nenhuma 

| Rastreabilidade:    |   RE01       |    RE02         |    RE03        |   RE04  |
|---------------------|--------------|-----------------|----------------|---------|  
|          CT17       |      X       |      X         |       X        |    X    |

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| O método cria 3 ovelhas  | False |  teste passou |
| O método cria 3 ovelhas e um lobo guará  | True |  teste passou |
| O método cria 1 e um campo  | false |  teste falhou |

![Screenshot_1.png](https://.org/repo/z8947B5/images/497449455-Screenshot_1.png)

**Identificador:**        CT18   testEstaViva classe OvelhaTest    

 **Objetivo:**                    O metodo testEstaViva verifica se o método estaViva retorna true para ovelhas vivas e false para ovelhas mortas.
 **Prioridade:**                   Baixa   

 **Condições prévias:**            Para o uso do segundo teste o método setMorte deve esta corretamente implementado.   

| Rastreabilidade:    |   RE01       |    RE02         |    RE03        |   RE04  |
|---------------------|--------------|-----------------|----------------|---------|  
|          CT18       |      X       |      X         |       --        |    X    |

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| O método cria uma ovelha  | true |  teste passou |
| O método cria uma ovelha e executa o setMorte | false |  teste passou |

![Screenshot_1.png](https://.org/repo/z8947B5/images/497449455-Screenshot_1.png)  

**Identificador:**        CT19   testSetMorte classe OvelhaTest    

 **Objetivo:**  Verificar se após a execução do metodo setMorte a ovelha esteja marcada como morta.  

 **Prioridade:**                   Baixa   

 **Condições prévias:**  O método estaViva deve estar funcionando corretamente.  

| Rastreabilidade:    |   RE01       |    RE02         |    RE03        |   RE04  |
|---------------------|--------------|-----------------|----------------|---------|  
|          CT19       |      X       |      X         |       --        |    X    |

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| Executa o metodo setMorte para uma ovelha e chama o método estaViva | false |  teste passou |


![Screenshot_1.png](https://.org/repo/z8947B5/images/497449455-Screenshot_1.png)  

**Identificador:**        CT19   testSetMorte classe OvelhaTest    

 **Objetivo:**  Verificar se após a execução do metodo setMorte a ovelha esteja marcada como morta.  

 **Prioridade:**                   Baixa   

 **Condições prévias:**  O método estaViva deve estar funcionando corretamente.  

| Rastreabilidade:    |   RE01       |    RE02         |    RE03        |   RE04  |
|---------------------|--------------|-----------------|----------------|---------|  
|          CT19       |      X       |      X         |       --        |    X    |

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| Executa o metodo setMorte para uma ovelha e chama o método estaViva | false |  teste passou |


![Screenshot_1.png](https://.org/repo/z8947B5/images/497449455-Screenshot_1.png)  

**Identificador:**        CT20   testProcria classe OvelhaTest    

 **Objetivo:** Verifica se uma ovelha está procriando.

 **Prioridade:**                  Alta   

 **Condições prévias:** Mudar probabilidade de procriar para 1, e os métodos corre, getProfundidade, getLargura e getObjectAt, funcionando corretamente. 

| Rastreabilidade:    |   RE01       |    RE02         |    RE03        |    RE04  |
|---------------------|--------------|-----------------|----------------|----------|  
|          CT20       |      X       |      --         |       --       |    --    |

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| Deve chamar o método ovelha 7 vezes, após isso deve ser testado se há outro objeto na mesma localização | true |  teste passou |


![Screenshot_1.png](https://.org/repo/z8947B5/images/497449455-Screenshot_1.png)  

**Identificador:**        CT21   testSimulador classe SimuladorTest    

 **Objetivo:** O objetivo do teste é verificar o funcionamento do construtor da classe Simulador.  

 **Prioridade:**                  Média   

 **Condições prévias:** Nenhum 

| Rastreabilidade:    |   RE01       |    RE02         |    RE03        |    RE04  |
|---------------------|--------------|-----------------|----------------|----------|  
|          CT21       |       X      |      --         |        X       |     x    |

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| (0,0) | Tratamento de exceção |  teste falhou |
| (1,1) | Teste passar |  teste passou |
| (-1,-1) | Tratamento de exceção |  teste falhou |

![Screenshot_1.png](https://.org/repo/z8947B5/images/497449455-Screenshot_1.png)  

**Identificador:**        CT22   testSimulador classe SimuladorTest    

 **Objetivo:** O objetivo do teste é verificar o funcionamento de uma simulação.  

 **Prioridade:**                  Alta   

 **Condições prévias:** Nenhum 

| Rastreabilidade:    |   RE01       |    RE02         |    RE03        |    RE04  |
|---------------------|--------------|-----------------|----------------|----------|  
|          CT22       |       X      |      --         |        X       |     X    |

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| criar uma simulação longa | Tratamento de exceção |  teste falhou |