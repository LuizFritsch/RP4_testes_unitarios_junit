#Casos de teste

| Identificador:                    |        CT01  testGetLargura        |
|--------------------------------------------|------------------------------------|  
| Objetivo:                    |O teste deve verificar se em uma execução de simulação, o metodo GetLargura esta funcionando corretamente. Para isso deve-se criar uma simulação com parâmetros validos e inválidos.  |
| Prioridade:                  |Média|  
| Rastreabilidade:             |                      | 
| Condições prévias:           |Nenhuma|

| **Entradas**                                  | Resultado esperado                      |Resultado do Teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| profundidade 5 e largura 31  | É esperado que o teste não encontre erros  |  Teste passou |
| profundidade 5 e largura 0   | É esperado que o teste lance a exceção illergalArgumentException  |  Teste falhou, o teste lançou um ArithmeticException |


| Identificador:     |        CT02   testGetLargura       |
|------------------------------|----------------------|  
| Objetivo:                    |O teste deve verificar se em uma execução de simulação, o metodo GetProfundidade esta funcionando corretamente. Para isso deve-se criar uma simulação com parâmetros validos e inválidos.  |
| Prioridade:                  |Média|  
| Rastreabilidade:             |                      | 
| Condições prévias:           |Nenhuma|

| Entradas                              |  Resultado esperado                             |Resultado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| profundidade 31 e largura 5  | É esperado que o teste não encontre erros  |  Teste passou |
| profundidade 0 e largura 5   | É esperado que o teste lance a exceção illegalArgumentException  |  Teste falhou, o teste lançou um ArithmeticException |


| Identificador:     |        CT03   testGetPopulationDetails       |
|------------------------------|----------------------|  
| Objetivo:                    |O teste deve verificar se é retornado os detalhes da população em uma simulação.   |
| Prioridade:                  |Média|  
| Rastreabilidade:             |                      | 
| Condições prévias:           |Nenhuma|

| Entradas                                   |  Resultado esperado                       |Resulado do teste      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| criar um campo 3x3 e 3 ovelhas com parâmetros (0,0)(0,1)(0,2) | É esperado que o teste retorne null  |  Teste passou |
| criar um campo 100x100 e 3 ovelhas com parâmetros (0,0)(0,1)(0,2) | "" |  ""|