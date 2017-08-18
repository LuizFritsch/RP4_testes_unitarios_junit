#Casos de teste

| Identificador:                    |        CT01  testGetLargura  classe CampoTest      |
|--------------------------------------------|------------------------------------|  
| Objetivo:                    |O teste deve verificar se em uma execução de simulação, o metodo GetLargura esta funcionando corretamente. Para isso deve-se criar uma simulação com parâmetros validos e inválidos.  |
| Prioridade:                  |Média|  
| Rastreabilidade:             |                      | 
| Condições prévias:           |Nenhuma|

| **Entradas**                                  | Resultado esperado                      |Resultado do Teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| profundidade 5 e largura 31  | É esperado que o teste não encontre erros  |  Teste passou |
| profundidade 5 e largura 0   | É esperado que o teste lance a exceção illergalArgumentException  |  Teste falhou, o teste lançou um ArithmeticException |


| Identificador:     |        CT02   testGetProfundidade classe CampoTest      |
|------------------------------|----------------------|  
| Objetivo:                    |O teste deve verificar se em uma execução de simulação, o metodo GetProfundidade esta funcionando corretamente. Para isso deve-se criar uma simulação com parâmetros validos e inválidos.  |
| Prioridade:                  |Média|  
| Rastreabilidade:             |                      | 
| Condições prévias:           |Nenhuma|

| Entradas                              |  Resultado esperado                             |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| profundidade 31 e largura 5  | É esperado que o teste não encontre erros  |  Teste passou |
| profundidade 0 e largura 5   | É esperado que o teste lance a exceção illegalArgumentException  |  Teste falhou, o teste lançou um ArithmeticException |


| Identificador:     |        CT03   testGetPopulationDetails   classe CampoEstatisticaTest    |
|------------------------------|----------------------|  
| Objetivo:                    |O teste deve verificar se é retornado os detalhes da população em uma simulação.   |
| Prioridade:                  |Média|  
| Rastreabilidade:             |                      | 
| Condições prévias:           |Nenhuma|

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| criar um campo 3x3 e 3 ovelhas com parâmetros (0,0)(0,1)(0,2) | É esperado que o teste retorne null  |  Teste passou |
| criar um campo 100x100 e 3 ovelhas com parâmetros (0,0)(0,1)(0,2) | "" |  ""|


| Identificador:     |        CT04   testCorre classe OvelhaTest      |
|------------------------------|----------------------|  
| Objetivo:                    | O teste deve verificar o uso do metodo Corre da ovelha.    |
| Prioridade:                  |Alta |  
| Rastreabilidade:             |                      | 
| Condições prévias:           |Nenhuma|

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| ""|""  |  "" |
| ""| "" |  ""|

| Identificador:     |        CT05   testEqualsObject classe LocalizacaoTest      |
|------------------------------|----------------------|  
| Objetivo:                    | O teste deve verificar o uso do metodo equals. Deve-se criar uma localizacao com parâmetros validos e inválidos   |
| Prioridade:                  |Alta |  
| Rastreabilidade:             |                      | 
| Condições prévias:           |Nenhuma|

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| localizacao(10,10)|""  |  teste passou |
| localizacao(,)| "" |  teste passou |

| Identificador:     |        CT06   testGetLinha classe LocalizacaoTest      |
|------------------------------|----------------------|  
| Objetivo:                    | O teste deve criar uma localizacao com parametros validos e invalidos e verificar o uso do metodo getLinha |
| Prioridade:                  |baixa |  
| Rastreabilidade:             |                      | 
| Condições prévias:           |Nenhuma|

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| localizacao(10,15)|""  |  teste passou |
| localizacao(0,100)| "" |  teste passou |
| localizacao(0,-100)| Erro |  teste retornou um IllegalArgumentException |

| Identificador:     |        CT07   testGetColuna classe LocalizacaoTest      |
|------------------------------|----------------------|  
| Objetivo:                    | O teste deve criar uma localizacao com parametros validos e invalidos e verificar o uso do metodo getColuna |
| Prioridade:                  |baixa |  
| Rastreabilidade:             |                      | 
| Condições prévias:           |Nenhuma|

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| localizacao(10,15)|""  |  teste passou |
| localizacao(0,100)| "" |  teste passou |
| localizacao(-100,0)| Erro |  teste retornou um IllegalArgumentException |

| Identificador:     |        CT08   testHashCode classe LocalizacaoTest      |
|------------------------------|----------------------|  
| Objetivo:                    | O teste deve criar uma localizacao com parametros validos e invalidos e verificar o uso do metodo HashCode |
| Prioridade:                  |baixa |  
| Rastreabilidade:             |                      | 
| Condições prévias:           |Nenhuma|

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| localizacao(10,15)|""  |  teste passou |
| localizacao(-1,-1)| Erro |  teste retornou um IllegalArgumentException |
| localizacao(-110, 15)| Erro |  teste retornou um IllegalArgumentException |

| Identificador:     |        CT09   testGetName classe ContadorTest     |
|------------------------------|----------------------|  
| Objetivo:                    | O teste deve criar um contador com parâmetros validos e inválidos, e testar a execução do método getName  |
| Prioridade:                  |baixa |  
| Rastreabilidade:             |                      | 
| Condições prévias:           |Nenhuma|

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| Contador ("lobo")|O teste não retornar nenhum erro |  teste passou |
| Contador ("")| tratamento de exceção |  teste passou |
| Contador ("Ovelha")|  O teste não retornar nenhum erro |  teste passou  |


| Identificador:     |        CT10   testGetCount classe ContadorTest     |
|------------------------------|----------------------|  
| Objetivo:                    | O teste deve criar um contador com parâmetros validos e inválidos, e testar a execução do método getCount  |
| Prioridade:                  |baixa |  
| Rastreabilidade:             |                      | 
| Condições prévias:           |Nenhuma|

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| Contador ("")| tratamento de exceção |  teste passou |
| Contador ("Ovelha")|  O teste não retornar nenhum erro |  teste passou  |



| Identificador:     |        CT11   testIncrement classe ContadorTest     |
|------------------------------|----------------------|  
| Objetivo:                    | O teste deve criar um contador com parâmetros validos, e testar a execução do método increment  |
| Prioridade:                  |Media |  
| Rastreabilidade:             |                      | 
| Condições prévias:           |Nenhuma|

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| incrementar 1000 vezes a ovelha| tratamento de exceção |  teste passou |


| Identificador:     |        CT12   testReset classe ContadorTest     |
|------------------------------|----------------------|  
| Objetivo:                    | O teste deve criar um contador com parâmetros validos e inválidos, e testar a execução do método Reset  |
| Prioridade:                  |baixa |  
| Rastreabilidade:             |                      | 
| Condições prévias:           |Nenhuma|

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| chamar o método reset| teste retornar 0 |  teste passou |


| Identificador:     |        CT13   testGetLargura classe CampoTest    |
|------------------------------|----------------------|  
| Objetivo:                    |  |
| Prioridade:                  |baixa |  
| Rastreabilidade:             |                      | 
| Condições prévias:           |Nenhuma|

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| chamar o método reset| teste retornar 0 |  teste passou |

| Identificador:     |        CT14   testGetPopulationDetails classe CampoEstatisticaTest    |
|------------------------------|----------------------|  
| Objetivo:                    | O teste verifica se o metodo GetPopulation retorna uma String informando corretamente os dados do campo |
| Prioridade:                  |Alta |  
| Rastreabilidade:             |                      | 
| Condições prévias:           |Nenhuma|

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
|Criar 3 ovelhas com entradas (0,0)(0,1)(0,2) | O método não deve retornar null | teste passou |
|Criar 3 ovelhas com entradas (0,0)(0,1)(0,2) | O método deve retornar uma String | teste passou |
|Criar 3 ovelhas com entradas (0,0)(0,1)(0,2) | O método deve retornar a String "Ovelha:3" | teste falhou, o pacote da classe é descrito na String, exemplo: ol.Ovelha: 3 |
|Criar 3 ovelhas com entradas validas, criar 3 lobos guará com entradas validas e criar 3 campos com entradas validas | O método deve retornar a String na ordem "ol.LoboGuara: 3 ol.Ovelha: 3 ol.Campo: 3" | teste falhou, o método não tem uma ordem especifica para retornar as Strings, os Objetos podem variar de posição em qualquer execução do método |
|Deixar o campo vazio |O método deve informar que o campo se encontra vazio | teste falhou, o método ão retorna nenhuma informação |

| Identificador:     |        CT15   testRedefine classe CampoEstatisticaTest    |
|------------------------------|----------------------|  
| Objetivo:                    | O método verifica se após a execução do método Redefine o campo terá 0 objetos |
| Prioridade:                  | baixa |  
| Rastreabilidade:             |                      | 
| Condições prévias:           |O método GetPopulationDetails da mesma classe, deve estar implementado corretamente |

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| Deve ser criado 3 ovelhas e chamar o método Redefine | teste deve mostrar que não tem objetos no campo |  teste passou, retornou 0 |
| Deve ser criado 3 ovelha, chamar o método Redefine e incrementar o campo | O teste só deve contar os objetos que foram incrementados após redefinir o campo |  teste passou |


| Identificador:     |        CT16   testContadorFinalizado classe CampoEstatisticaTest    |
|------------------------------|----------------------|  
| Objetivo:                    | O método verifica a execução do método contadorFinalizado|
| Prioridade:                  | baixa |  
| Rastreabilidade:             |                      | 
| Condições prévias:           |O método GetPopulationDetails da mesma classe, deve estar implementado corretamente |

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| Deve ser criado 3 ovelhas e chamar o método contadorFinalizado | Saida esperada: " " |  teste passou |


| Identificador:     |        CT17   testEhViavel classe CampoEstatisticaTest    |
|------------------------------|----------------------|  
| Objetivo:                    | O método verifica se há um lobo e uma ovelha para fazer a simulação|
| Prioridade:                  | baixa |  
| Rastreabilidade:             |                      | 
| Condições prévias:           | Nenhuma |

| Entradas                                   |  Resultado esperado                       |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| O método cria 3 ovelhas  | False |  teste passou |
| O método cria 3 ovelhas e um lobo guará  | True |  teste passou |
| O método cria 1 e um campo  | false |  teste falhou |