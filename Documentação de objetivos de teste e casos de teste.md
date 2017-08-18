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