# Requisitos do MD50#

**RE01:** Modela o comportamento de um subconjunto do mundo real com base em um modelo de software                                    
**RE02:** Estima o comportamento de populações entre predadores e presas                                             
**RE03:** Permite similar cenários de populações em diferentes áreas                                           
**RE04:** Pode ser estendida para outros tipos de animais: predadores e presas                                           
            
***
         
#Test Case Specification#
          
| Test Case ID: CT01.1   	| Objetivo: O teste deve verificar se em uma execução de simulação, o método GetLargura esta funcionando 	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	|    Nenhuma        	|
| Entradas:             | profundidade 5 e largura 31            |
| Resultado Esperado: 	| É esperado que o teste não encontre erros     	|
| Resultado Obtido:  	| Teste passou    	|


***

| Test Case ID: CT01.2  	| Objetivo: O teste deve verificar se em uma execução de simulação, o método GetLargura esta funcionando 	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	|    Nenhuma        	|
| Entradas:             | profundidade 5 e largura 0 	         |
| Resultado Esperado: 	| É esperado que o teste lance a exceção illergalArgumentException     	|
| Resultado Obtido:  	| Teste falhou. O teste lançou um ArithmeticException    	|


***

| Test Case ID:  CT02.1      	| Objetivo: 	O teste deve verificar se em uma execução de simulação, o metodo GetProfundidade esta funcionando corretamente. Para isso deve-se criar uma simulação com parâmetros validos e inválidos|
|---------------------	|-----------	|
| Prioridade:         	|       Média    	|
| Rastreador:         	|   RE01, RE03, RE04         	|
| Precondições:       	|        Nenhuma   	|
| Entradas:             |   profundidade 31 e largura 5 	            |
| Resultado Esperado: 	|   É esperado que o teste não encontre erros        	|
| Resultado Obtido:  	| Teste passou    	|


***

| Test Case ID:  CT02.2      	| Objetivo: 	O teste deve verificar se em uma execução de simulação, o metodo GetProfundidade esta funcionando corretamente. Para isso deve-se criar uma simulação com parâmetros validos e inválidos|
|---------------------	|-----------	|
| Prioridade:         	|       Média    	|
| Rastreador:         	|   RE01, RE03, RE04         	|
| Precondições:       	|        Nenhuma   	|
| Entradas:             |   profundidade 0 e largura 5 		            |
| Resultado Esperado: 	|   É esperado que o teste lance a exceção illegalArgumentExceptions        	|
| Resultado Obtido:  	| Teste falhou. O teste lançou um ArithmeticException    	|


***

| Test Case ID:   CT03.1    	| Objetivo: 	O teste deve verificar se é retornado os detalhes da população em uma simulação. |
|---------------------	|-----------	|
| Prioridade:         	|           Alta 	|
| Rastreador:         	|       RE01, RE02, RE03, RE04     	|
| Precondições:       	|       Nenhuma     	|
| Entradas:             |  criar um campo 3x3 e 3 ovelhas com parâmetros (0,0)(0,1)(0,2)             |
| Resultado Esperado: 	|       É esperado que o teste retorne null    	|
| Resultado Obtido:  	| Teste passou  	|


***

| Test Case ID:   CT03.2    	| Objetivo: 	O teste deve verificar se é retornado os detalhes da população em uma simulação. |
|---------------------	|-----------	|
| Prioridade:         	|           Alta 	|
| Rastreador:         	|       RE01, RE02, RE03, RE04     	|
| Precondições:       	|       Nenhuma     	|
| Entradas:             |  criar um campo 100x100 e 3 ovelhas com parâmetros (0,0)(0,1)(0,2)            |
| Resultado Esperado: 	|       É esperado que o teste retorne null    	|
| Resultado Obtido:  	| Teste passou   	|


***

| Test Case ID:  CT04.1     	| Objetivo: O teste deve verificar o uso do metodo Corre da ovelha. 	|
|---------------------	|-----------	|
| Prioridade:         	|    Alta        	|
| Rastreador:         	|       RE01, RE02  	|
| Precondições:       	|     Método estaViva funcionando corretamente        	|
| Entradas:             |     Executar o método corre e chamar o metodo estaViva          |
| Resultado Esperado: 	|        true   	|
| Resultado Obtido:  	| Teste falhou   	|


***

| Test Case ID:  CT04.2     	| Objetivo: O teste deve verificar o uso do metodo Corre da ovelha. 	|
|---------------------	|-----------	|
| Prioridade:         	|    Alta        	|
| Rastreador:         	|       RE01, RE02  	|
| Precondições:       	|     Método estaViva funcionando corretamente        	|
| Entradas:             |     Incrementar a idade da ovelha até o máximo +1 e chamar o metodo estaViva |
| Resultado Esperado: 	|        false   	|
| Resultado Obtido:  	| teste falhou, a ovelha continua viva após a idade máxima |


***

| Test Case ID: CT05.1       	| Objetivo:  O teste deve verificar o uso do método equals. Deve-se criar uma localização com parâmetros validos e inválidos  	|
|---------------------	|-----------	|
| Prioridade:         	|      Alta      	|
| Rastreador:         	|       RE04     	|
| Precondições:       	|     Nenhuma        	|
| Entradas:             |     Localizacao(10,10)          |
| Resultado Esperado: 	|    true       	|
| Resultado Obtido:  	| teste passou |

| Test Case ID: CT05.2       	| Objetivo:  O teste deve verificar o uso do método equals. Deve-se criar uma localização com parâmetros validos e inválidos  	|
|---------------------	|-----------	|
| Prioridade:         	|      Alta      	|
| Rastreador:         	|       RE04     	|
| Precondições:       	|     Nenhuma        	|
| Entradas:             |     Localizacao(,)    |
| Resultado Esperado: 	|    Illegalargumentexception 	|
| Resultado Obtido:  	| teste passou |

***

| Test Case ID: CT06.1      	| Objetivo: 	O teste deve criar uma Localizacao com parâmetros validos e inválidos e verificar o uso do método getLinha |
|---------------------	|-----------	|
| Prioridade:         	|         baixa   	|
| Rastreador:         	|       RE01, RE03, RE04     	|
| Precondições:       	|   Nenhuma        	|
| Entradas:             |  Localizacao(10,15)             |
| Resultado Esperado: 	|  Criação do objeto com sucesso         	|
| Resultado Obtido:  	| teste passou |


***

| Test Case ID: CT06.2      	| Objetivo: 	O teste deve criar uma Localizacao com parâmetros validos e inválidos e verificar o uso do método getLinha |
|---------------------	|-----------	|
| Prioridade:         	|         baixa   	|
| Rastreador:         	|       RE01, RE03, RE04     	|
| Precondições:       	|   Nenhuma        	|
| Entradas:             |  Localizacao(0,100)             |
| Resultado Esperado: 	|  Criação do objeto com sucesso         	|
| Resultado Obtido:  	| teste passou |


***

| Test Case ID: CT06.3      	| Objetivo: 	O teste deve criar uma Localizacao com parâmetros validos e inválidos e verificar o uso do método getLinha |
|---------------------	|-----------	|
| Prioridade:         	|         baixa   	|
| Rastreador:         	|       RE01, RE03, RE04     	|
| Precondições:       	|   Nenhuma        	|
| Entradas:             |  Localizacao(0,-100)           |
| Resultado Esperado: 	|  IllegalArgumentException.class         	|
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT07.1      	| Objetivo: O teste deve criar uma Localizacao com parâmetros validos e inválidos e verificar o uso do método getColuna	|
|---------------------	|-----------	|
| Prioridade:         	|       baixa      	|
| Rastreador:         	|       RE01,, RE03, RE04     	|
| Precondições:       	|      Nenhuma     	|
| Entradas:             |   Localizacao(10,15)            |
| Resultado Esperado: 	|  getColuna = 15        	|
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT07.2      	| Objetivo: O teste deve criar uma Localizacao com parâmetros validos e inválidos e verificar o uso do método getColuna	|
|---------------------	|-----------	|
| Prioridade:         	|       baixa      	|
| Rastreador:         	|       RE01,, RE03, RE04     	|
| Precondições:       	|      Nenhuma     	|
| Entradas:             |   Localizacao(0,100)            |
| Resultado Esperado: 	|  getColuna = 100        	|
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT07.3      	| Objetivo: O teste deve criar uma Localizacao com parâmetros validos e inválidos e verificar o uso do método getColuna	|
|---------------------	|-----------	|
| Prioridade:         	|       baixa      	|
| Rastreador:         	|       RE01,, RE03, RE04     	|
| Precondições:       	|      Nenhuma     	|
| Entradas:             |   Localizacao(-100,0)            |
| Resultado Esperado: 	|  IllegalArgumentException.class       	|
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:    CT08.1 | Objetivo: 	O teste deve criar uma Localizacao com parâmetros validos e inválidos e verificar o uso do método HashCode |
|---------------------	|-----------	|
| Prioridade:         	|  baixa          	|
| Rastreador:         	|       RE04     	|
| Precondições:       	|   Nenhuma         	|
| Entradas:             |   Localizacao(10,15)            |
| Resultado Esperado: 	|   teste passar        	|
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:    CT08.2 | Objetivo: 	O teste deve criar uma Localizacao com parâmetros validos e inválidos e verificar o uso do método HashCode |
|---------------------	|-----------	|
| Prioridade:         	|  baixa          	|
| Rastreador:         	|       RE04     	|
| Precondições:       	|   Nenhuma         	|
| Entradas:             |   Localizacao(-1,-1)          |
| Resultado Esperado: 	|   IllegalArgumentException.class       	|
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:    CT08.3 | Objetivo: 	O teste deve criar uma Localizacao com parâmetros validos e inválidos e verificar o uso do método HashCode |
|---------------------	|-----------	|
| Prioridade:         	|  baixa          	|
| Rastreador:         	|       RE04     	|
| Precondições:       	|   Nenhuma         	|
| Entradas:             |   Localizacao(-110, 15)           |
| Resultado Esperado: 	|   IllegalArgumentException.class        	|
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:      CT09.1   	| Objetivo: 	O teste deve criar um contador com parâmetros validos e inválidos, e testar a execução do método getName |
|---------------------	|-----------	|
| Prioridade:         	|      baixa       	|
| Rastreador:         	|       RE01, RE04     	|
| Precondições:       	|    Nenhuma       	|
| Entradas:             |     Contador ("lobo")          |
| Resultado Esperado: 	|   O teste não retornar nenhuma exceção        	|
| Resultado Obtido:  	| teste passou |

***

| Test Case ID:      CT09.2   	| Objetivo: 	O teste deve criar um contador com parâmetros validos e inválidos, e testar a execução do método getName |
|---------------------	|-----------	|
| Prioridade:         	|      baixa       	|
| Rastreador:         	|       RE01, RE04     	|
| Precondições:       	|    Nenhuma       	|
| Entradas:             |     Contador ("")          |
| Resultado Esperado: 	|   IllegalArgumentException.class        	|
| Resultado Obtido:  	| teste passou |

***

| Test Case ID:      CT09.3   	| Objetivo: 	O teste deve criar um contador com parâmetros validos e inválidos, e testar a execução do método getName |
|---------------------	|-----------	|
| Prioridade:         	|      baixa       	|
| Rastreador:         	|       RE01, RE04     	|
| Precondições:       	|    Nenhuma       	|
| Entradas:             |     Contador ("Ovelha")          |
| Resultado Esperado: 	|   O teste não retornar nenhuma exceção        	|
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:    CT10.1     	| Objetivo: 	O teste deve criar um contador com parâmetros validos e inválidos, e testar a execução do método getCount |
|---------------------	|-----------	|
| Prioridade:         	|     baixa        	|
| Rastreador:         	|       RE01, RE03, RE04     	|
| Precondições:       	|   Nenhuma        	|
| Entradas:             | Contador ("") |
| Resultado Esperado: 	|    IllegalArgumentException.class       	|
| Resultado Obtido:  	| teste passou |

***

| Test Case ID:    CT10.2     	| Objetivo: 	O teste deve criar um contador com parâmetros validos e inválidos, e testar a execução do método getCount |
|---------------------	|-----------	|
| Prioridade:         	|     baixa        	|
| Rastreador:         	|       RE01, RE03, RE04     	|
| Precondições:       	|   Nenhuma        	|
| Entradas:             | Contador ("Ovelha") |
| Resultado Esperado: 	|    O teste não retornar nenhum erro       	|
| Resultado Obtido:  	| teste passou |

***

| Test Case ID:    CT11   	| Objetivo: 	O teste deve criar um contador com parâmetros validos, e testar a execução do método increment |
|---------------------	|-----------	|
| Prioridade:         	|   Media        	|
| Rastreador:         	|       RE01, RE03, RE04     	|
| Precondições:       	|     Nenhuma      	|
| Entradas:             |   Incrementar 1000 vezes a ovelha            |
| Resultado Esperado: 	|  tratamento de exceção         	|
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT12     	| Objetivo:  O teste deve criar um contador com parâmetros validos e inválidos, e testar a execução do método Reset 	|
|---------------------	|-----------	|
| Prioridade:         	|    baixa         	|
| Rastreador:         	|       RE01, RE03, RE04     	|
| Precondições:       	|      Nenhuma     	|
| Entradas:             |   chamar o método reset            |
| Resultado Esperado: 	|     teste retornar 0      	|
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:   CT13    	| Objetivo: 	 O método testGetLargura deve verificar se o método getLargura retorna a largura exata de um campo |
|---------------------	|-----------	|
| Prioridade:         	|  baixa          	|
| Rastreador:         	|       RE01, RE03, RE04     	|
| Precondições:       	|   Nenhuma        	|
| Entradas:             | chamar o método reset              |
| Resultado Esperado: 	|  teste retornar 0         	|
| Resultado Obtido:  	| teste passou |


***

| Test Case ID: CT14.1      	| Objetivo:  O teste verifica se o método GetPopulation retorna uma String informando corretamente os dados do campo 	|
|---------------------	|-----------	|
| Prioridade:         	|    Alta         	|
| Rastreador:         	|       RE01, RE02, RE03, RE04     	|
| Precondições:       	|       Nenhuma    	|
| Entradas:             |  Criar 3 ovelhas com entradas (0,0)(0,1)(0,2)             |
| Resultado Esperado: 	|  O método não deve retornar null         	|
| Resultado Obtido:  	| teste passou |

***

| Test Case ID: CT14.2      	| Objetivo:  O teste verifica se o método GetPopulation retorna uma String informando corretamente os dados do campo 	|
|---------------------	|-----------	|
| Prioridade:         	|    Alta         	|
| Rastreador:         	|       RE01, RE02, RE03, RE04     	|
| Precondições:       	|       Nenhuma    	|
| Entradas:             |  Criar 3 ovelhas com entradas validas, criar 3 lobos guará com entradas validas e criar 3 campos com entradas validas             |
| Resultado Esperado: 	|    O método deve retornar a String na ordem "ol.LoboGuara: 3 ol.Ovelha: 3 ol.Campo: 3"       	|
| Resultado Obtido:  	| teste falhou, o método não tem uma ordem especifica para retornar as Strings, os Objetos podem variar de posição em qualquer execução do método |


***

| Test Case ID: CT14.3      	| Objetivo:  O teste verifica se o método GetPopulation retorna uma String informando corretamente os dados do campo 	|
|---------------------	|-----------	|
| Prioridade:         	|    Alta         	|
| Rastreador:         	|       RE01, RE02, RE03, RE04     	|
| Precondições:       	|       Nenhuma    	|
| Entradas:             |  Deixar o campo vazio             |
| Resultado Esperado: 	|     O método deve informar que o campo se encontra vazio      	|
| Resultado Obtido:  	| teste falhou, o método ão retorna nenhuma informação |

| Test Case ID: CT14.4      	| Objetivo:  O teste verifica se o método GetPopulation retorna uma String informando corretamente os dados do campo 	|
|---------------------	|-----------	|
| Prioridade:         	|    Alta         	|
| Rastreador:         	|       RE01, RE02, RE03, RE04     	|
| Precondições:       	|       Nenhuma    	|
| Entradas:             |  Criar 3 ovelhas com entradas (0,0)(0,1)(0,2)	             |
| Resultado Esperado: 	|    O método deve retornar a String "Ovelha:3"    	|
| Resultado Obtido:  	| teste falhou, o pacote da classe é descrito na String, exemplo: ol.Ovelha: 3 |


***

| Test Case ID:   CT15.1    	| Objetivo: O método verifica se após a execução do método Redefine o campo terá 0 objetos	|
|---------------------	|-----------	|
| Prioridade:         	|  baixa          	|
| Rastreador:         	|       RE01 RE03, RE04     	|
| Precondições:       	| O método GetPopulationDetails da mesma classe, deve estar implementado corretamente          	|
| Entradas:             |  Deve ser criado 3 ovelhas e chamar o método Redefine             |
| Resultado Esperado: 	|   teste deve mostrar que não tem objetos no campo        	|
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:   CT15.2    	| Objetivo: O método verifica se após a execução do método Redefine o campo terá 0 objetos	|
|---------------------	|-----------	|
| Prioridade:         	|  baixa          	|
| Rastreador:         	|       RE01 RE03, RE04     	|
| Precondições:       	| O método GetPopulationDetails da mesma classe, deve estar implementado corretamente          	|
| Entradas:             |  Deve ser criado 3 ovelha, chamar o método Redefine e incrementar o campo          |
| Resultado Esperado: 	|  O teste só deve contar os objetos que foram incrementados após redefinir o campo  |
| Resultado Obtido:  	| teste passou |

| Test Case ID:   CT15.3    	| Objetivo: O método verifica se após a execução do método Redefine o campo terá 0 objetos	|
|---------------------	|-----------	|
| Prioridade:         	|  baixa          	|
| Rastreador:         	|       RE01 RE03, RE04     	|
| Precondições:       	| O método GetPopulationDetails da mesma classe, deve estar implementado corretamente          	|
| Entradas:             |  Deve ser criado 3 Ovelha e chamar o método Redefine    |
| Resultado Esperado: 	| teste deve mostrar que não tem objetos no campo  |
| Resultado Obtido:  	| teste passou|


***

| Test Case ID:   CT16    	| Objetivo: O método verifica a execução do método contadorFinalizado 	|
|---------------------	|-----------	|
| Prioridade:         	|     baixa       	|
| Rastreador:         	|       RE01, RE03, RE04     	|
| Precondições:       	| O método GetPopulationDetails da mesma classe, deve estar implementado corretamente           	|
| Entradas:             |  Deve ser criado 3 ovelhas e chamar o método contadorFinalizado             |
| Resultado Esperado: 	|     Saída esperada: " "      	|
| Resultado Obtido:  	| teste passou |

***

| Test Case ID:     CT17.1  	| Objetivo: 	 O método verifica se há um lobo e uma ovelha para fazer a simulação|
|---------------------	|-----------	|
| Prioridade:         	|  Média         	|
| Rastreador:         	|       RE01, RE02, RE03, RE04     	|
| Precondições:       	|      Nenhuma      	|
| Entradas:             |  O método cria 3 ovelhas             |
| Resultado Esperado: 	|     False      	|
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:     CT17.2  	| Objetivo: 	 O método verifica se há um lobo e uma ovelha para fazer a simulação|
|---------------------	|-----------	|
| Prioridade:         	|  Média         	|
| Rastreador:         	|       RE01, RE02, RE03, RE04     	|
| Precondições:       	|      Nenhuma      	|
| Entradas:             |    O método cria 3 ovelhas e um lobo guará           |
| Resultado Esperado: 	|     True      	|
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:     CT17.3  	| Objetivo: 	 O método verifica se há um lobo e uma ovelha para fazer a simulação|
|---------------------	|-----------	|
| Prioridade:         	|  Média         	|
| Rastreador:         	|       RE01, RE02, RE03, RE04     	|
| Precondições:       	|      Nenhuma      	|
| Entradas:             |   O método cria 1 e um campo            |
| Resultado Esperado: 	|       false    	|
| Resultado Obtido:  	| teste falhou |

| Test Case ID:     CT17.4  	| Objetivo: 	 O método verifica se há um lobo e uma ovelha para fazer a simulação|
|---------------------	|-----------	|
| Prioridade:         	|  Média         	|
| Rastreador:         	|       RE01, RE02, RE03, RE04     	|
| Precondições:       	|      Nenhuma      	|
| Entradas:             |   O método cria 3 ovelhas e um LoboGuara         |
| Resultado Esperado: 	|       True    	|
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:   CT18.1    	| Objetivo: O metodo testEstaViva verifica se o método estaViva retorna true para ovelhas vivas e false para ovelhas mortas. 	|
|---------------------	|-----------	|
| Prioridade:         	|  Baixa         	|
| Rastreador:         	|       RE01, RE02, RE04     	|
| Precondições:       	|    Para o uso do segundo teste o método setMorte deve esta corretamente implementado.         	|
| Entradas:             |  O método cria uma ovelha             |
| Resultado Esperado: 	|    true       	|
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:   CT18.2    	| Objetivo: O metodo testEstaViva verifica se o método estaViva retorna true para ovelhas vivas e false para ovelhas mortas. 	|
|---------------------	|-----------	|
| Prioridade:         	|  Baixa         	|
| Rastreador:         	|       RE01, RE02, RE04     	|
| Precondições:       	|    Para o uso do segundo teste o método setMorte deve esta corretamente implementado.         	|
| Entradas:             |   O método cria uma ovelha e executa o setMorte            |
| Resultado Esperado: 	|   false        	|
| Resultado Obtido:  	| teste passou |


***

| Test Case ID: CT19      	| Objetivo: Verificar se após a execução do metodo setMorte a ovelha esteja marcada como morta. 	|
|---------------------	|-----------	|
| Prioridade:         	|   baixa        	|
| Rastreador:         	|       RE01, RE02, RE04     	|
| Precondições:       	|  O método estaViva deve estar funcionando corretamente.          	|
| Entradas:             |  Executa o metodo setMorte para uma ovelha e chama o método estaViva             |
| Resultado Esperado: 	|  false         	|
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT20     	| Objetivo: 	Verificar se após a execução do metodo setMorte a ovelha esteja marcada como morta. |
|---------------------	|-----------	|
| Prioridade:         	| baixa          	|
| Rastreador:         	|       RE01, RE02, RE04     	|
| Precondições:       	| O método estaViva deve estar funcionando corretamente.            	|
| Entradas:             | Executa o método setMorte para uma ovelha e chama o método estaViva              |
| Resultado Esperado: 	|  false         	|
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT21     	| Objetivo: 	Verificar se uma ovelha está procriando. |
|---------------------	|-----------	|
| Prioridade:         	| Média          	|
| Rastreador:         	|       RE01, RE02, RE04     	|
| Precondições:       	|  getProfundidade, getLargura e getObjectAt, funcionando corretamente.            	|
| Entrada               | Deve chamar o método ovelha 7 vezes, após isso deve ser testado se há outro objeto na mesma localização |
|Resultado esperado     | true|
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT22.1     	| Objetivo: 	O objetivo do teste é verificar o funcionamento do construtor da classe Simulador.  |
|---------------------	|-----------	|
| Prioridade:         	| baixa          	|
| Rastreador:         	|       RE01, RE03, RE04     	|
| Precondições:       	|  Nenhuma            	|
| Entrada               | (0,0) |
|  Resultado esperado   |  Tratamento de exceção      | 
| Resultado Obtido:  	| teste falhou |

***

| Test Case ID:  CT22.2     	| Objetivo: 	O objetivo do teste é verificar o funcionamento do construtor da classe Simulador.  |
|---------------------	|-----------	|
| Prioridade:         	| baixa          	|
| Rastreador:         	|       RE01, RE03, RE04     	|
| Precondições:       	|  Nenhuma            	|
| Entrada               | (1,1) |
|  Resultado esperado   |  Teste passar       | 
| Resultado Obtido:  	| teste passou |

***

| Test Case ID:  CT22.3     	| Objetivo: 	O objetivo do teste é verificar o funcionamento do construtor da classe Simulador.  |
|---------------------	|-----------	|
| Prioridade:         	| baixa          	|
| Rastreador:         	|       RE01, RE03, RE04     	|
| Precondições:       	|  Nenhuma            	|
| Entrada               | (-1,-1)   |
|  Resultado esperado   |  Tratamento de exceção        | 
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT23    	| Objetivo: 	O objetivo do teste é verificar o funcionamento do método getRandom. |
|---------------------	|-----------	|
| Prioridade:         	| Alta          	|
| Rastreador:         	|       RE01, RE03, RE04     	|
| Precondições:       	|  Nenhuma            	|
| Entrada               | Randomizar com parâmetro 1 |
| Resultado esperado    |   0                       |
| Resultado Obtido:  	| teste passou |

***

| Test Case ID:  CT24.1     	| Objetivo: 	 O metodo testEstaViva verifica se o método estaVivo retorna true para lobos vivos e false para lobos mortos. |
|---------------------	|-----------	|
| Prioridade:         	| Alta          	|
| Rastreador:         	|       RE01, RE03, RE04     	|
| Precondições:       	|  Para o uso do segundo teste o método setMorte deve esta corretamente implementado.|
| Entrada               | O método cria um lobo guará |
| Resultado esperado    |   true           |
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT24.2     	| Objetivo: 	 O metodo testEstaViva verifica se o método estaVivo retorna true para lobos vivos e false para lobos mortos. |
|---------------------	|-----------	|
| Prioridade:         	| Alta          	|
| Rastreador:         	|       RE01, RE03, RE04     	|
| Precondições:       	|  Para o uso do segundo teste o método setMorte deve esta corretamente implementado.|
| Entrada               | O método cria um lobo guará e executa o setMorte |
| Resultado esperado    |   teste passar           |
| Resultado Obtido:  	| teste passou |


| Test Case ID:  CT24.3     	| Objetivo: 	 O metodo testEstaViva verifica se o método estaVivo retorna true para lobos vivos e false para lobos mortos. |
|---------------------	|-----------	|
| Prioridade:         	| Alta          	|
| Rastreador:         	|       RE01, RE03, RE04     	|
| Precondições:       	|  Para o uso do segundo teste o método setMorte deve esta corretamente implementado.|
| Entrada               | O método cria um LoboGuara |
| Resultado esperado    |   true           |
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT25     	| Objetivo: 	    Testar se o construtor da classe SimuladorTela entá funcionando corretamente |
|---------------------	|-----------	|
| Prioridade:         	| Alta          	|
| Rastreador:         	|       RE01, RE04     	|
| Precondições:       	|  Nenhuma            	|
| Entrada               | Instancia um simuladorTela |
| Resultado esperado    | a tela deve apresentar o seguinte titulo "Simulacao Ovelhas and Lobos Guara"          |
| Resultado Obtido:  	| teste passou |

***

| Test Case ID:  CT26.1     	| Objetivo: 	Testar o funcionamento do método MostrarStatus. Checar se é possível criar um rótulo de etapa com informações validas e invalidas.|
|---------------------	|-----------	|
| Prioridade:         	| Alta          	|
| Rastreador:         	|       RE01, RE04     	|
| Precondições:       	|  O método deve tratar com thrwos as seguintes exceções: NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException.           	|
| Entrada               | Criar um rótulo com etapa "0" |
| Resultado esperado    | O teste deve passar. O rótulo deve ser criado com sucesso   |
| Resultado Obtido:  	| teste passou |

***

| Test Case ID:  CT26.2     	| Objetivo: Testar o funcionamento do método MostrarStatus. Checar se é possível criar um rótulo de etapa com informações validas e invalidas.|
|---------------------	|-----------	|
| Prioridade:         	| Alta          	|
| Rastreador:         	|       RE01, RE04     	|
| Precondições:       	|  O método deve tratar com thrwos as seguintes exceções: NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException.           	|
| Entrada               | Criar um rótulo com etapa "999999999" |
| Resultado esperado    |O teste não deve passar  |
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT27.3     	| Objetivo: Testar o funcionamento do método MostrarStatus. Checar se é possível criar um rótulo de etapa com informações validas e invalidas.|
|---------------------	|-----------	|
| Prioridade:         	| Alta          	|
| Rastreador:         	|       RE01, RE04     	|
| Precondições:       	|  O método deve tratar com thrwos as seguintes exceções: NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException.           	|
| Entrada               | Criar um rótulo com etapa "-10" |
| Resultado esperado    | O teste não deve passar   |
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT27     	| Objetivo: 	    Verificar o tamanho do campo para criar uma tela.|
|---------------------	|-----------	|
| Prioridade:         	| Alta          	|
| Rastreador:         	|       RE01, RE04     	|
| Precondições:       	| Nenhuma         	|
| Entrada               | SimuladorTela (1,1) e campo (100,100) |
| Resultado esperado    | teste deve apresentar uma mensagem de erro   |
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT28.1     	| Objetivo: 	   O teste deve verificar se quando o animal é criado(teoricamente um recém nascido) ele inicialmente é setado como vivo.|
|---------------------	|-----------	|
| Prioridade:         	| Alta          	|
| Rastreador:         	|       RE01,RE02,RE04     	|
| Precondições:       	| Criação de objeto do tipo Campo, Localizacao e Ovelha     |
| Entrada               | false, Campo, Localizacao|
| Resultado esperado    |true  |
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT28.2    	| Objetivo: 	   O teste deve verificar se quando o animal é criado(teoricamente um recém nascido) ele inicialmente é setado como vivo.|
|---------------------	|-----------	|
| Prioridade:         	| Alta          	|
| Rastreador:         	|       RE01,RE02,RE04     	|
| Precondições:       	| Criação de objeto do tipo Campo, Localizacao e Ovelha     |
| Entrada               | true, Campo, Localizacao |
| Resultado esperado    |true  |
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT29.1     	| Objetivo:  O teste deve verificar se a localização retornada pelo método está correta     |
|---------------------	|-----------	|
| Prioridade:         	| Alta          	|
| Rastreador:         	|       RE01,RE02,RE04     	|
| Precondições:       	| Criação de objeto do tipo Campo e Localizacao(2 criados)        |
| Entrada               | O método cria uma Ovelha na localização específica (25,25) |
| Resultado esperado    | Objeto do tipo Localizacao com linha e coluna igual a 25 |
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT29.2     	| Objetivo:  O teste deve verificar se a localização retornada pelo método está correta     |
|---------------------	|-----------	|
| Prioridade:         	| Alta          	|
| Rastreador:         	|       RE01,RE02,RE04     	|
| Precondições:       	| Criação de objeto do tipo Campo e Localizacao(2 criados)        |
| Entrada               | O método cria uma Ovelha na localização específica (25,25) |
| Resultado esperado    | false |
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT30.1     	| Objetivo:  O teste deve verificar se a o método setLocalizacao(Localizacao) realmente altera a localização do animal     |
|---------------------	|-----------	|
| Prioridade:         	| Alta          	|
| Rastreador:         	|       RE01,RE02,RE04     	|
| Precondições:       	| Criação de objeto do tipo Campo, Localizacao(2 criados) e o método getLocalizacao(Localizacao) estar funcionando corretamente.         |
| Entrada               | O método cria uma Ovelha na localização específica (25,25) e logo após seta a mesma para (26,26)  |
| Resultado esperado    | Localizacao igual a (26,26) |
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT30.2     	| Objetivo:  O teste deve verificar se a o método setLocalizacao(Localizacao) realmente altera a localização do animal     |
|---------------------	|-----------	|
| Prioridade:         	| Alta          	|
| Rastreador:         	|       RE01,RE02,RE04     	|
| Precondições:       	| Criação de objeto do tipo Campo, Localizacao(2 criados) e o método getLocalizacao(Localizacao) estar funcionando corretamente.         |
| Entrada               | O método cria duas Ovelha na localização específica (25,25) e logo após seta a primeira delas para (26,26)  |
| Resultado esperado    | Localizacao da primeira Ovelha diferente de (25,25) e da segunda igual a (25,25) |
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT30.3     	| Objetivo:  O teste deve verificar se a o método setLocalizacao(Localizacao) realmente altera a localização do animal     |
|---------------------	|-----------	|
| Prioridade:         	| Alta          	|
| Rastreador:         	|       RE01,RE02,RE04     	|
| Precondições:       	| Criação de objeto do tipo Campo, Localizacao(2 criados) e o método getLocalizacao(Localizacao) estar funcionando corretamente.         |
| Entrada               | O método cria duas Ovelha na localização específica (25,25) e logo após seta a primeira delas para (26,26)  |
| Resultado esperado    | O objeto pertencente a Localizacao(25,25) não ser a segunda ovelha |
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT31     	| Objetivo:  Verificar se o construtor da classe Animal aceita uma Localizacao maior que o campo recebido.    |
|---------------------	|-----------	|
| Prioridade:         	| Média        	|
| Rastreador:         	|       RE01,RE02,RE04     	|
| Precondições:       	|  Criação de objeto do tipo Campo, Localizacao(Essa localização é inválida)      |
| Entrada               | O método cria Campo e Localizacao(esse é inválida) e animal  |
| Resultado esperado    | O método deve retornar uma exceção do tipo IllegalArgumentException  |
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT32.1     	| Objetivo:  Verificar se o método setMorte() altera o atributo vivo do animal para false    |
|---------------------	|-----------	|
| Prioridade:         	| Média        	|
| Rastreador:         	|       RE01,RE02,RE04     	|
| Precondições:       	| Criação de objeto do tipo Campo, Localizacao, Ovelha e o método getObjectAt() estar funcionando corretamente     |
| Entrada               | O método cria a Ovelha  |
| Resultado esperado    | O método setMorte() deve retornar false  |
| Resultado Obtido:  	| teste passou |

***

| Test Case ID:  CT32.2     	| Objetivo:  Verificar se o método setMorte() altera o atributo vivo do animal para false    |
|---------------------	|-----------	|
| Prioridade:         	| Média        	|
| Rastreador:         	|       RE01,RE02,RE04     	|
| Precondições:       	| Criação de objeto do tipo Campo, Localizacao, Ovelha e o método getObjectAt() estar funcionando corretamente     |
| Entrada               | O método cria a Ovelha  |
| Resultado esperado    | O método getObjectAt(Localizacao) que recebe a Localizacao da Ovelha deve retornar null  |
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT33     	| Objetivo:  Verificar se o método podeProcriar() está comparando a idade corretamente        |
|---------------------	|-----------	|
| Prioridade:         	| Média        	|
| Rastreador:         	|       RE01,RE02,RE04     	|
| Precondições:       	|  Criação de objeto do tipo Campo, Localizacao, LoboGuara e o método incrementaIdade() estar funcionando corretamente   |
| Entrada               | O método cria um LoboGuara com idade para procriar  |
| Resultado esperado    | LoboGuara estar apto para procriar  |
| Resultado Obtido:  	| teste passou |

***

| Test Case ID:  CT34.1     	| Objetivo: Verificar se o método incrementaIdade() está funcionando corretamente         |
|---------------------	|-----------	|
| Prioridade:         	| Média        	|
| Rastreador:         	|       RE01,RE02,RE04     	|
| Precondições:       	|   Criação de objeto do tipo Campo, Localizacao, LoboGuara  |
| Entrada               |  O método cria um objeto LoboGuara e chamar o metodo incrementaIdade() |
| Resultado esperado    | LoboGuara envelhecer |
| Resultado Obtido:  	| teste passou |

***

| Test Case ID:  CT34.2    	| Objetivo: Verificar se o método incrementaIdade() está funcionando corretamente         |
|---------------------	|-----------	|
| Prioridade:         	| Média        	|
| Rastreador:         	|       RE01,RE02,RE04     	|
| Precondições:       	|   Criação de objeto do tipo Campo, Localizacao, LoboGuara  |
| Entrada               | Animal loboGuara, nivel 8 de fome   |
| Resultado esperado    | O lobo esta morto  |
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT34.3     	| Objetivo: Verificar se o método incrementaIdade() está funcionando corretamente         |
|---------------------	|-----------	|
| Prioridade:         	| Média        	|
| Rastreador:         	|       RE01,RE02,RE04     	|
| Precondições:       	|   Criação de objeto do tipo Campo, Localizacao, LoboGuara  |
| Entrada               | Animal loboGuara, nivel 3 de fome    |
| Resultado esperado    | O lobo esta vivo   |
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT34.4     	| Objetivo: Verificar se o método incrementaIdade() está funcionando corretamente         |
|---------------------	|-----------	|
| Prioridade:         	| Média        	|
| Rastreador:         	|       RE01,RE02,RE04     	|
| Precondições:       	|   Criação de objeto do tipo Campo, Localizacao, LoboGuara  |
| Entrada               | Animal loboGuara, nivel 5 de fome    |
| Resultado esperado    | O lobo esta vivo   |
| Resultado Obtido:  	| teste passou |

***

| Test Case ID:  CT35.1     	| Objetivo: Verificar se o método decrementaFome() está funcionando.       |
|---------------------	|-----------	|
| Prioridade:         	| Média        	|
| Rastreador:         	|       RE01,RE02,RE04     	|
| Precondições:       	|   Criação de objeto do tipo Campo, Localizacao, LoboGuara  |
| Entrada               |  O método cria um objeto LoboGuara    |
| Resultado esperado    | LoboGuara morrer, de fome   |
| Resultado Obtido:  	| teste passou |

***

| Test Case ID:  CT35.2     	| Objetivo: Verificar se o método decrementaFome() está funcionando.       |
|---------------------	|-----------	|
| Prioridade:         	| Média        	|
| Rastreador:         	|       RE01,RE02,RE04     	|
| Precondições:       	|   Criação de objeto do tipo Campo, Localizacao, LoboGuara  |
| Entrada               |  Ovelha envelhecer e morrer    |
| Resultado esperado    | LoboGuara morrer, de fome   |
| Resultado Obtido:  	| teste passou |

***

| Test Case ID:  CT36.1     	| Objetivo: Verificar se o método podeProcriar() está funcionando.|
|---------------------	|-----------	|
| Prioridade:         	| Média        	|
| Rastreador:         	|       RE01,RE02,RE04     	|
| Precondições:       	|   Criação de objeto do tipo Campo, Localizacao, Ovelha |
| Entrada               |  O método cria um objeto Ovelha    |
| Resultado esperado    | ovelha estar apta para procriar |
| Resultado Obtido:  	| teste passou |

***

| Test Case ID:  CT36.2     	| Objetivo: Verificar se o método podeProcriar() está funcionando.|
|---------------------	|-----------	|
| Prioridade:         	| Média        	|
| Rastreador:         	|       RE01,RE02,RE04     	|
| Precondições:       	|   Criação de objeto do tipo Campo, Localizacao, Ovelha |
| Entrada               |  O método cria um objeto Ovelha    |
| Resultado esperado    | ovelha não estar apta para procriar |
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT36.3     	| Objetivo: Verificar se o método podeProcriar() está funcionando.|
|---------------------	|-----------	|
| Prioridade:         	| Média        	|
| Rastreador:         	|       RE01,RE02,RE04     	|
| Precondições:       	|   Criação de objeto do tipo Campo, Localizacao, Ovelha |
| Entrada               |  O método cria um objeto Ovelha    |
| Resultado esperado    | ovelha não estar apta para procriar, está morta |
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT36.4     	| Objetivo: Verificar se o método podeProcriar() está funcionando.|
|---------------------	|-----------	|
| Prioridade:         	| Média        	|
| Rastreador:         	|       RE01,RE02,RE04     	|
| Precondições:       	|   Criação de objeto do tipo Campo, Localizacao, Ovelha |
| Entrada               |  Animal ovelha, idade 11       |
| Resultado esperado    | ovelha está apta para procriar |
| Resultado Obtido:  	| teste passou |

***

| Test Case ID:  CT36.5     	| Objetivo: Verificar se o método podeProcriar() está funcionando.|
|---------------------	|-----------	|
| Prioridade:         	| Média        	|
| Rastreador:         	|       RE01,RE02,RE04     	|
| Precondições:       	|   Criação de objeto do tipo Campo, Localizacao, Ovelha |
| Entrada               | Animal ovelha, idade entre 11 e 40      |
| Resultado esperado    | ovelha está apta para procriar |
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT36.6     	| Objetivo: Verificar se o método podeProcriar() está funcionando.|
|---------------------	|-----------	|
| Prioridade:         	| Média        	|
| Rastreador:         	|       RE01,RE02,RE04     	|
| Precondições:       	|   Criação de objeto do tipo Campo, Localizacao, Ovelha |
| Entrada               | Animal ovelha, idade igual 40, Antes de morrer     |
| Resultado esperado    | ovelha está apta para procriar |
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT37.1     	| Objetivo: Decrementar a fome de um Lobo 5 vezes e verificar se o mesmo está vivo|
|---------------------	|-----------	|
| Prioridade:         	| Média        	|
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	| Nenhuma |
| Entrada               | Criar um "LoboGuara" e decrementar sua fome 5 vezes    |
| Resultado esperado    | true |
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT37.2     	| Objetivo: Decrementar a fome de um Lobo 2 vezes e verificar se o mesmo está vivo|
|---------------------	|-----------	|
| Prioridade:         	| Média        	|
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	| Criar um "LoboGuara" e decrementar sua fome 2 vezes  |
| Entrada               | "LoboGuara"     |
| Resultado esperado    | true |
| Resultado Obtido:  	| teste passou |


***


| Test Case ID:  CT37.3     	| Objetivo: Decrementar a fome de um Lobo 8 vezes e verificar se o mesmo está vivo|
|---------------------	|-----------	|
| Prioridade:         	| Média        	|
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	| Criar um "LoboGuara" e decrementar sua fome 8 vezes  |
| Entrada               | "LoboGuara"     |
| Resultado esperado    | false |
| Resultado Obtido:  	| teste falhou |


***

| Test Case ID:  CT37.4     	| Objetivo: Incrementar a idade de um Lobo até 150 e verificar se o mesmo está vivo|
|---------------------	|-----------	|
| Prioridade:         	| Média        	|
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	| Criar um "LoboGuara" e incrementar sua idade até 150 |
| Entrada               | "LoboGuara"     |
| Resultado esperado    | false |
| Resultado Obtido:  	| teste falhou |


***

| Test Case ID:  CT37.5     	| Objetivo: Incrementar a idade de um Lobo até 5000 e verificar se o mesmo está vivo|
|---------------------	|-----------	|
| Prioridade:         	| Média        	|
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	| Criar um "LoboGuara" e incrementar sua idade até 5000  |
| Entrada               | "LoboGuara"     |
| Resultado esperado    | false |
| Resultado Obtido:  	| teste falhou |


***

| Test Case ID:  CT38.1     	| Objetivo: Verificar se uma "Ovelha" que pode procriar pode procriar|
|---------------------	|-----------	|
| Prioridade:         	| Média        	|
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	| Criar uma "Ovelha" com 40 anos de idade  |
| Entrada               | "Ovelha"     |
| Resultado esperado    | true |
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT38.2     	| Objetivo: Verificar se uma "Ovelha" que pode procriar pode procriar|
|---------------------	|-----------	|
| Prioridade:         	| Média        	|
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	| Criar uma "Ovelha" com 10 anos de idade  |
| Entrada               | "Ovelha"     |
| Resultado esperado    | true |
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT38.3     	| Objetivo: Verificar se uma "Ovelha" que pode procriar pode procriar|
|---------------------	|-----------	|
| Prioridade:         	| Média        	|
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	| Criar uma "Ovelha" com 6 anos de idade  |
| Entrada               | "Ovelha"     |
| Resultado esperado    | true |
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT39     	| Objetivo: Verificar se uma "Ovelha" morta pode procriar|
|---------------------	|-----------	|
| Prioridade:         	| Média        	|
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	| Criar uma "Ovelha" e aumentar sua idade até que esteja morta  |
| Entrada               | "Ovelha"     |
| Resultado esperado    | false |
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT40     	| Objetivo: Verificar se uma Ovelha pode Procriar sem idade mínima de procriação|
|---------------------	|-----------	|
| Prioridade:         	| Média        	|
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	| Criar "Ovelha" com Idade Mínima de procriação - 1  |
| Entrada               |  "Ovelha"     |
| Resultado esperado    | False |
| Resultado Obtido:  	| teste passou |

***

| Test Case ID:  CT41     	| Objetivo: Verificar se um "Campo" de 1x1 retorna null como "Localizacao" adjacente|
|---------------------	|-----------	|
| Prioridade:         	| Média        	|
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	| Criar um "Campo" de 1x1  |
| Entrada               | localizacões adjacentes do "Campo"     |
| Resultado esperado    | null |
| Resultado Obtido:  	| teste falhou |


***

| Test Case ID:  CT42     	| Objetivo: Testar o se o método "LocalizacaoAdjacenteRandomica" retorna a "Localizacao" correta|
|---------------------	|-----------	|
| Prioridade:         	| Média        	|
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	| Criar "Campo" e "Localizacao"  |
| Entrada               | "Localizacao" adjacente do "Campo"     |
| Resultado esperado    | Localizacao(0,1) |
| Resultado Obtido:  	| teste passou |

***

| Test Case ID:  CT43     	| Objetivo: Testar a fome do Lobo Guara|
|---------------------	|-----------	|
| Prioridade:         	| Baixa       	|
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	| Criar um Lobo Guara  |
| Entrada               | Lobo Guara|
| Resultado esperado    | 7 |
| Resultado Obtido:  	| teste passou |


***

| Test Case ID:  CT44     	| Objetivo: Verificar se o objeto retornado pelo método "localizacaoAdjacenteRandomica" é uma "Localizacao"|
|---------------------	|-----------	|
| Prioridade:         	| Baixa  |
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	| Criar um "Campo"  |
| Entrada               | Campo de 100x100     |
| Resultado esperado    | True |
| Resultado Obtido:  	| teste passou |

***

| Test Case ID:  CT45     	| Objetivo: testar se o lobo está sendo criado com a fome certa |
|---------------------	|-----------	|
| Prioridade:         	| Média       	|
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	| Adicionar permissão de acesso ao atributo fome do Lobo Guara |
| Entrada               | Nível de fome do Lobo|
| Resultado esperado    | 6 |
| Resultado Obtido:  	| teste passou |

| Test Case ID:  CT46.1     	| Objetivo:  Verificar se ao criar um lobo com idade não randômica, o nível de fome é igual a 7 |
|---------------------	|-----------	|
| Prioridade:         	| Média       	|
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	| Criação de objeto LoboGuara, campo, ovelha. |
| Entrada               |Animal LoboGuara, idade randômica false.	|
| Resultado esperado    | nível fome igual à 7	|
| Resultado Obtido:  	| teste passou |

| Test Case ID:  CT46.2     	| Objetivo:  Verificar se ao criar um lobo com idade randômica, o nível de fome é igual esta entre 0 e 7, zero não incluso.|
|---------------------	|-----------	|
| Prioridade:         	| Média       	|
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	| Criação de objeto LoboGuara, campo.|
| Entrada               |Animal LoboGuara, idade randômica true.		|
| Resultado esperado    | nível fome esta entre 0 e 7		|
| Resultado Obtido:  	| teste falhou |

| Test Case ID:  CT46.3     	| Objetivo:  Verificar se ao criar um lobo com idade randômica, o nível de fome é igual esta entre 0 e 7, zero não incluso.|
|---------------------	|-----------	|
| Prioridade:         	| Média       	|
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	| Criação de objeto LoboGuara, campo, ovelha.|
| Entrada               | Animal LoboGuara, idade randômica false.			|
| Resultado esperado    | nível de fome é ajustado		|
| Resultado Obtido:  	| teste passou |


| Test Case ID:  CT46.4     	| Objetivo:  Verificar se ao criar um lobo com idade randômica, o nível de fome é igual esta entre 0 e 7, zero não incluso.|
|---------------------	|-----------	|
| Prioridade:         	| Média       	|
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	| Criação de objeto LoboGuara, campo, ovelha.|
| Entrada               | Animal LoboGuara, idade randômica true				|
| Resultado esperado    | nível de fome é ajustado		|
| Resultado Obtido:  	| teste passou |


| Test Case ID:  CT46.5     	| Objetivo:   Verificar se quando o LoboGuara se move, a fome é ajustada, assim como quando não se move.|
|---------------------	|-----------	|
| Prioridade:         	| Média       	|
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	|  Criação de objeto LoboGuara, campo. |
| Entrada               | LoboGuara idade randômica false, não se move.					|
| Resultado esperado    | nível de fome é ajustado		|
| Resultado Obtido:  	| teste falhou |

| Test Case ID:  CT46.6     	| Objetivo:   Verificar se quando o LoboGuara se move, a fome é ajustada, assim como quando não se move. Após refatoração do erro apontado pelo CT46.5|
|---------------------	|-----------	|
| Prioridade:         	| Média       	|
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	|  Criação de objeto LoboGuara, campo. |
| Entrada               | LoboGuara idade randômica false, não se move.					|
| Resultado esperado    | nível de fome é ajustado		|
| Resultado Obtido:  	| teste passou |


| Test Case ID:  CT46.7     	| Objetivo:   Verificar se quando o LoboGuara se move, a fome é ajustada, assim como quando não se move. Após refatoração do erro apontado pelo CT46.5|
|---------------------	|-----------	|
| Prioridade:         	| Média       	|
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	|  Criação de objeto LoboGuara, campo. |
| Entrada               | LoboGuara idade randômica, não se move.						|
| Resultado esperado    | nível de fome é ajustado		|
| Resultado Obtido:  	| teste passou |


| Test Case ID:  CT47     	| Objetivo:  Verificar se corre esta funcionando corretamente, sem se mover.|
|---------------------	|-----------	|
| Prioridade:         	| Média       	|
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	|   Criação de objeto ovelha, campo. |
| Entrada               | ovelha idade randômica true que não se move					|
| Resultado esperado    | numero de indivíduos ovelhas máximo não atingido			|
| Resultado Obtido:  	| teste passou |


| Test Case ID:  CT48     	| Objetivo:  Verificar se o construtor da classe Animal aceita uma Localizacao com coluna e largura igual a tamanho máxima mais um.|
|---------------------	|-----------	|
| Prioridade:         	| Média       	|
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	|  Criação de objeto do tipo Campo, Localizacao(Essa localização é inválida)|
| Entrada               |  O método cria Campo e Localizacao(esse é inválida) e animal				|
| Resultado esperado    | O método deve retornar uma exceção do tipo IllegalArgumentException		|
| Resultado Obtido:  	| teste passou |

| Test Case ID:  CT49     	| Objetivo:  Verificar se o método podeProcriar está comparando a idade corretamente.|
|---------------------	|-----------	|
| Prioridade:         	| Média       	|
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	|  Criação de objeto do tipo Campo, Localizacao, LoboGuara e o método incrementaIdade() estar funcionando corretamente |
| Entrada               | O método cria um LoboGuara					|
| Resultado esperado    | LoboGuara estar apto para procriar	|
| Resultado Obtido:  	| teste passou |


| Test Case ID:  CT50     	| Objetivo:  O teste verifica se o metodo GetPopulation retorna uma String informando corretamente os dados do campo.|
|---------------------	|-----------	|
| Prioridade:         	| Alta      	|
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	|  Nenhuma |
| Entrada               | Criar 3 ovelhas com entradas validas, criar 3 LoboGuara com entradas validas e criar 3 campos com entradas validas |				|
| Resultado esperado    | O método deve retornar a String na ordem "ol.LoboGuara: 3 ol.Ovelha: 3 ol.Campo: 3"	|
| Resultado Obtido:  	| teste falhou, o método não tem uma ordem especifica para retornar as Strings, os Objetos podem variar de posição em qualquer execução do método |

| Test Case ID:  CT51     	| Objetivo: Verificar se corre esta funcionando corretamente, refatoração realizada, primeiro ela tenta se mover.|
|---------------------	|-----------	|
| Prioridade:         	| Alta      	|
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	| Criação de objeto Ovelha, Campo. |
| Entrada               | Ovelha com idade randômica, true e que se move. |				|
| Resultado esperado    | numero de indivíduos ovelhas máximo atingido (localização)	|
| Resultado Obtido:  	| teste passou |

| Test Case ID:  CT52     	| Objetivo: O objetivo do teste é verificar o funcionamento do simulador.|
|---------------------	|-----------	|
| Prioridade:         	| Alta      	|
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	| Nenhuma |
| Entrada               | criar uma simulação longa |				|
| Resultado esperado    | Tratamento de exceção	|
| Resultado Obtido:  	| teste falhou |

| Test Case ID:  CT53.1     	| Objetivo: Verificar se o método incrementaIdade está funcionando |
|---------------------	|-----------	|
| Prioridade:         	| Alta      	|
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	| Criação de objeto LoboGuara |
| Entrada               | Animal LoboGuara, idade igual 5000 |				|
| Resultado esperado    | O lobo esta morto	|
| Resultado Obtido:  	| teste passou |

| Test Case ID:  CT53.2     	| Objetivo: Verificar se o método incrementaIdade está funcionando |
|---------------------	|-----------	|
| Prioridade:         	| Alta      	|
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	| Criação de objeto LoboGuara |
| Entrada               | Animal LoboGuara, idade igual 150 |				|
| Resultado esperado    | O lobo esta vivo	|
| Resultado Obtido:  	| teste passou |  
  
***  

| Test Case ID: CT53.b   	| Objetivo: O teste deve verificar se o método getLargura esta funcionadno corretamente 	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE03         	|
| Precondições:       	|   Existir uma instância de campo       	|
| Entradas:             | 2^100000            |
| Resultado Esperado: 	| Que o método consiga retornar 2^100000     	|
| Resultado Obtido:  	| Teste passou    	|


***  

| Test Case ID: CT54.1   	| Objetivo: O teste deve verificar se o método getProfundidade esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE03         	|
| Precondições:       	|    Existir uma instância de campo             	|
| Entradas:             | Campo(31,5) entrada 500           |
| Resultado Esperado: 	| É esperado que o teste não passe     	|
| Resultado Obtido:  	| Teste falhou    	|


***  
| Test Case ID: CT54.2   	| Objetivo: O teste deve verificar se  o método getProfundidade esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE03         	|
| Precondições:       	|    Existir uma instância de campo             	|
| Entradas:             | Campo(1000,0), entrada 1000           |
| Resultado Esperado: 	| É esperado que o teste  passe     	|
| Resultado Obtido:  	| Teste passou    	|


***  

| Test Case ID: CT54.3   	| Objetivo: O teste deve verificar se  o método getProfundidade esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE03         	|
| Precondições:       	|    Existir uma instância de campo             	|
| Entradas:             | Campo(0,5) entrada 0           |
| Resultado Esperado: 	| É esperado que o teste  passe     	|
| Resultado Obtido:  	| Teste passou    	|


***   

| Test Case ID: CT54.4   	| Objetivo: O teste deve verificar se  o método getProfundidade esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE03         	|
| Precondições:       	|    Existir uma instância de campo             	|
| Entradas:             | Campo(1000,1000) entrada 1000           |
| Resultado Esperado: 	| É esperado que o teste  passe     	|
| Resultado Obtido:  	| Teste passou    	|


***  

| Test Case ID: CT55.1   	| Objetivo: O teste deve verificar se  o método LocalizacoesAdjacentes esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	|    Existir uma instância de campo, Campo(2,1)            	|
| Entradas:             | Localizacao(0,0), entrada (0,0)           |
| Resultado Esperado: 	| É esperado que o teste  passe     	|
| Resultado Obtido:  	| Teste passou    	|


***  
| Test Case ID: CT55.2  	| Objetivo: O teste deve verificar se  o método LocalizacoesAdjacentes esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	|    Existir uma instância de campo, Campo(2,2)            	|
| Entradas:             | Localizacao(0,0), entrada (0,0)           |
| Resultado Esperado: 	| É esperado que o teste  passe     	|
| Resultado Obtido:  	| Teste passou    	|


***  
| Test Case ID: CT55.3  	| Objetivo: O teste deve verificar se  o método LocalizacoesAdjacentes esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	|    Existir uma instância de campo, Campo(4,4)            	|
| Entradas:             | Localizacao(1,1), entrada (1,1)           |
| Resultado Esperado: 	| É esperado que o teste  passe     	|
| Resultado Obtido:  	| Teste passou    	|


***   
| Test Case ID: CT55.4  	| Objetivo: O teste deve verificar se  o método LocalizacoesAdjacentes esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	|    Existir uma instância de campo, Campo(400,400)            	|
| Entradas:             | Localizacao(0,399), entrada (0,399)           |
| Resultado Esperado: 	| É esperado que o teste  passe     	|
| Resultado Obtido:  	| Teste passou    	|


*** 

| Test Case ID: CT55.5 	| Objetivo: O teste deve verificar se  o método LocalizacoesAdjacentes esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	|    Existir uma instância de campo, Campo(400,400)            	|
| Entradas:             | Localizacao(399,399), entrada (399,399)           |
| Resultado Esperado: 	| É esperado que o teste  passe     	|
| Resultado Obtido:  	| Teste passou    	|


*** 
| Test Case ID: CT55.5 	| Objetivo: O teste deve verificar se  o método LocalizacoesAdjacentes esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	|    Existir uma instância de campo, Campo(400,400)            	|
| Entradas:             | Localizacao(-1,0), entrada (-1,0)           |
| Resultado Esperado: 	| É esperado que o teste não passe     	|
| Resultado Obtido:  	| Teste falhou    	|


***  

| Test Case ID: CT56.1  	| Objetivo: O teste deve verificar se  o método LocalizacaoAdjacenteLivre esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	|    Existir uma instância de campo, Campo(100,100)            	|
| Entradas:             | Localizacao(0,0), entrada (0,0)           |
| Resultado Esperado: 	| É esperado que o teste  lance uma execeção: IllegalArgumentException.class   	|
| Resultado Obtido:  	| Teste passou    	|


***   
| Test Case ID: CT56.2  	| Objetivo: O teste deve verificar se  o método LocalizacaoAdjacenteLivre esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	|    Existir uma instância de campo, Campo(100,100)            	|
| Entradas:             | Localizacao(101,100), entrada (101,100)           |
| Resultado Esperado: 	| É esperado que o teste  lance uma execeção: IllegalArgumentException.class   	|
| Resultado Obtido:  	| Teste passou    	|


***    
| Test Case ID: CT56.3  	| Objetivo: O teste deve verificar se  o método LocalizacaoAdjacenteLivre esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	|    Existir uma instância de campo, Campo(100,100)            	|
| Entradas:             | Localizacao(0,0), entrada (0,0)           |
| Resultado Esperado: 	| É esperado que o teste  lance uma execeção: IllegalArgumentException.class   	|
| Resultado Obtido:  	| Teste passou    	|


***  
| Test Case ID: CT56.4  	| Objetivo: O teste deve verificar se  o método LocalizacaoAdjacenteLivre esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	|    Existir uma instância de campo, Campo(100,100)            	|
| Entradas:             | Localizacao(0,0), entrada (0,0)           |
| Resultado Esperado: 	| É esperado que o teste  lance uma execeção: NullPointerException.class  	|
| Resultado Obtido:  	| Teste passou    	|


***   
| Test Case ID: CT57.1  	| Objetivo: O teste deve verificar se  o método LocalizacoesAdjacentesLivres esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	|    Existir uma instância de campo, Campo(100,100)            	|
| Entradas:             | Localizacao(0,0), entrada (0,0)           |
| Resultado Esperado: 	| É esperado que o teste retorne 0  	|
| Resultado Obtido:  	| Teste passou    	|


***  
 
 | Test Case ID: CT57.2  	| Objetivo: O teste deve verificar se  o método LocalizacoesAdjacentesLivres esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	|    Existir uma instância de campo, Campo(100,100), e 3 instancia de loboGuara no campo, proximo de (0,0)  	|
| Entradas:             | Localizacao(0,0), entrada (0,0)           |
| Resultado Esperado: 	| É esperado que o teste retorne 1  	|
| Resultado Obtido:  	| Teste passou    	|


***  
 
 | Test Case ID: CT57.3  	| Objetivo: O teste deve verificar se  o método LocalizacoesAdjacentesLivres esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	|    Existir uma instância de campo, Campo(100,100) e  3 instancia de loboGuara no campo, proximo de (0,0)           	|
| Entradas:             | Localizacao(-1,0), entrada (-1,0)           |
| Resultado Esperado: 	| É esperado que o teste lance uma execção: IllegalArgumentException.class 	|
| Resultado Obtido:  	| Teste passou    	|


***   


| Test Case ID: CT58.1 	| Objetivo: O teste deve verificar se  o método LocalizacaoAdjacenteRandomica esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	|    Existir uma instância de campo, Campo(100,100) 	|
| Entradas:             | Localizacao(0,1)           |
| Resultado Esperado: 	| É esperado que o teste um object do tipo localizacao 	|
| Resultado Obtido:  	| Teste passou    	|


***   
| Test Case ID: CT58.2 	| Objetivo: O teste deve verificar se  o método LocalizacaoAdjacenteRandomica esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	|    Existir uma instância de campo, Campo(100,100) 	|
| Entradas:             | Localizacao(0,0)           |
| Resultado Esperado: 	| É esperado que o teste retorne uma localizacao proxima de localizacao(0,0)	|
| Resultado Obtido:  	| Teste passou    	|


***   
| Test Case ID: CT58.3 	| Objetivo: O teste deve verificar se  o método LocalizacaoAdjacenteRandomica esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	|    Existir uma instância de campo, Campo(100,100) 	|
| Entradas:             | Localizacao(-1,0)           |
| Resultado Esperado: 	| É esperado que o teste lance uma execeção:  IllegalArgumentException.class 	|
| Resultado Obtido:  	| Teste passou    	|


***  
| Test Case ID: CT59.1 	| Objetivo: O teste deve verificar se  o método GetObjectAt esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	|    Existir uma instância de campo, Campo(100,100) e Ovelha 	|
| Entradas:             | Localizacao(50,50)           |
| Resultado Esperado: 	| É esperado que o teste retorne uma ovelha	|
| Resultado Obtido:  	| Teste passou    	|


***   
    

| Test Case ID: CT59.1 	| Objetivo: O teste deve verificar se  o método GetObjectAt esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	|    Existir uma instância de campo, Campo(100,100)	|
| Entradas:             | Localizacao(50,50)           |
| Resultado Esperado: 	| É esperado que o teste null, já que não existe object no lugar	|
| Resultado Obtido:  	| Teste passou    	|


***  
| Test Case ID: CT59.3 	| Objetivo: O teste deve verificar se  o método GetObjectAt esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(100,100)  e Ovelha	|
| Entradas:             | Localizacao(50,50)           |
| Resultado Esperado: 	| É esperado que o teste null, apos usar o método limpa	|
| Resultado Obtido:  	| Teste passou    	|


***  
| Test Case ID: CT60. 	| Objetivo: O teste deve verificar se  o método GetObjectAtLocalizacao esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(100,100)  e Lobo	|
| Entradas:             | Localizacao(50,50)           |
| Resultado Esperado: 	| É esperado que o teste retorne uma instancia de LoboGura	|
| Resultado Obtido:  	| Teste passou    	|


***   

| Test Case ID: CT60.2 	| Objetivo: O teste deve verificar se  o método GetObjectAtLocalizacao esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(100,100)  e Ovelha	|
| Entradas:             | Localizacao(50,50)           |
| Resultado Esperado: 	| É esperado que o teste retorne uma instancia de Ovelha	|
| Resultado Obtido:  	| Teste passou    	|


***   
| Test Case ID: CT60.3 	| Objetivo: O teste deve verificar se  o método GetObjectAtLocalizacao esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(100,100)  e Ovelha	|
| Entradas:             | Localizacao(50,50)           |
| Resultado Esperado: 	| É esperado que o teste retorne null, apos usar o método limpar o campo	|
| Resultado Obtido:  	| Teste passou    	|


***  

| Test Case ID: CT60.4	| Objetivo: O teste deve verificar se  o método GetObjectAtLocalizacao esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(100,100)  e Ovelha	|
| Entradas:             | Localizacao(50,50)           |
| Resultado Esperado: 	| É esperado que o teste retorne null, apos limpar a localizacao(50,50)	|
| Resultado Obtido:  	| Teste passou    	|


***  


| Test Case ID: CT61.1	| Objetivo: O teste deve verificar se  o método LugarObjectLocalizacao esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(100,70)  e LoboGuara	|
| Entradas:             | Localizacao(50,50)           |
| Resultado Esperado: 	| É esperado que o teste retorne uma instancia de LoboGuara	|
| Resultado Obtido:  	| Teste passou    	|


***  


| Test Case ID: CT61.2	| Objetivo: O teste deve verificar se  o método LugarObjectLocalizacao esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(100,300)  e LoboGuara	|
| Entradas:             | Localizacao(50,50)           |
| Resultado Esperado: 	| É esperado que o teste retorne uma execeção : IllegalArgumentException.class	|
| Resultado Obtido:  	| Teste passou    	|


***  

| Test Case ID: CT61.3	| Objetivo: O teste deve verificar se  o método LugarObjectLocalizacao esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(10,10)  e LoboGuara	|
| Entradas:             | Localizacao(50,50)           |
| Resultado Esperado: 	| É esperado que o teste retorne uma execeção: Exception.class	|
| Resultado Obtido:  	| Teste passou    	|


***        
              
| Test Case ID: CT62	| Objetivo: O teste deve verificar se  o método LugarObject esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(10,10)  e LoboGuara	|
| Entradas:             | Localizacao(50,50)           |
| Resultado Esperado: 	| É esperado que o teste retorne uma execeção: IllegalArgumentException.class	|
| Resultado Obtido:  	| Teste passou    	|


***        
| Test Case ID: CT63.1	| Objetivo: O teste deve verificar se  o método LimpaLocalizacao esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(100,100)  e LoboGuara	|
| Entradas:             | Localizacao(50,50)           |
| Resultado Esperado: 	| É esperado que o teste retorne null apos o campo ser limpo	|
| Resultado Obtido:  	| Teste passou    	|


***  

| Test Case ID: CT63.2	| Objetivo: O teste deve verificar se  o método LimpaLocalizacao esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(100,100)  e Ovelha	|
| Entradas:             | Localizacao(50,50)           |
| Resultado Esperado: 	| É esperado que o teste retorne null apos o campo ser limpo	|
| Resultado Obtido:  	| Teste passou    	|


***  

| Test Case ID: CT63.3	| Objetivo: O teste deve verificar se  o método LimpaLocalizacao esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(100,100)  e LoboGuara	|
| Entradas:             | Localizacao(-1,-50)           |
| Resultado Esperado: 	| É esperado que o teste retorne uma execeção:  IllegalArgumentException.class 	|
| Resultado Obtido:  	| Teste passou    	|


***   
| Test Case ID: CT63.4	| Objetivo: O teste deve verificar se  o método LimpaLocalizacao esta funcionadno corretamente	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(590,500)  e LoboGuara	|
| Entradas:             | Localizacao(590,501)           |
| Resultado Esperado: 	| É esperado que o teste retorne uma execeção:  IndexOutOfBoundsException.class 	|
| Resultado Obtido:  	| Teste passou    	|


***   
| Test Case ID: CT64.1	| Objetivo: O teste deve verificar se  o método Limpa esta funcionadno corretamente	|
|--------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(100,100)  e LoboGuara em Localizacao(50,50)	|
| Entradas:             | Localizacao(50,50)           |
| Resultado Esperado: 	| É esperado que o teste não retorne uma instacia de Animal	|
| Resultado Obtido:  	| Teste passou    	|

***  
| Test Case ID: CT64.2	| Objetivo: O teste deve verificar se  o método Limpa esta funcionadno corretamente	|
|--------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(100,100)  e LoboGuara em Localizacao(50,50)	|
| Entradas:             | Localizacao(50,50)           |
| Resultado Esperado: 	| É esperado que o teste não retorne o endereço de memoria do lobo que estava na posição	|
| Resultado Obtido:  	| Teste passou    	|

***  
| Test Case ID: CT64.3	| Objetivo: O teste deve verificar se  o método Limpa esta funcionadno corretamente	|
|--------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(100,100)  e Ovelha em Localizacao(50,50)	|
| Entradas:             | Localizacao(50,50)           |
| Resultado Esperado: 	| É esperado que o teste não retorne o endereço de memoria da Ovelha que estava na posição	|
| Resultado Obtido:  	| Teste passou    	|

***  
| Test Case ID: CT64.4	| Objetivo: O teste deve verificar se  o método Limpa esta funcionadno corretamente	|
|--------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(100,100)	|
| Entradas:             | Localizacao(50,50)           |
| Resultado Esperado: 	| É esperado que o teste não retorne null, mesmo ao limpar o campo null	|
| Resultado Obtido:  	| Teste passou    	|

***             
| Test Case ID: CT65.1	| Objetivo: O teste deve verificar se  o método Campo, construtor esta funcionadno corretamente	|
|--------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(100,100)	|
| Entradas:             | Campo(100,100)          |
| Resultado Esperado: 	| É esperado que as variaveis, larguraInt e profundidadeInt, tenha os valores passados para o construtor	|
| Resultado Obtido:  	| Teste passou    	|

***    

| Test Case ID: CT65.2	| Objetivo: O teste deve verificar se  o método Campo, construtor esta funcionadno corretamente	|
|--------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(100,100)	|
| Entradas:             | 101, 101, campo(100,100)          |
| Resultado Esperado: 	| É esperado que as variaveis, larguraInt e profundidadeInt, tenha os valores passados para o construtor	|
| Resultado Obtido:  	| Teste passou    	|

***  
| Test Case ID: CT65.3	| Objetivo: O teste deve verificar se  o método Campo, construtor esta funcionadno corretamente	|
|--------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(0,100)	|
| Entradas:             | Campo(0,100)          |
| Resultado Esperado: 	| É esperado que as variaveis, larguraInt e profundidadeInt, tenha os valores passados para o construtor	|
| Resultado Obtido:  	| Teste passou    	|

***  

| Test Case ID: CT65.4	| Objetivo: O teste deve verificar se  o método Campo, construtor esta funcionadno corretamente	|
|--------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(0,100)	|
| Entradas:             | localizacao(61,21)         |
| Resultado Esperado: 	| É esperado que as posiçõe seja criadas como null|
| Resultado Obtido:  	| Teste passou    	|

***   
| Test Case ID: CT65.5	| Objetivo: O teste deve verificar se  o método Campo, construtor esta funcionadno corretamente	|
|--------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(100,100)	|
| Entradas:             | localizacao(100,2100)         |
| Resultado Esperado: 	| É esperado que o campo seja delimitado pelo tamanho passado para o construtor:IndexOutOfBoundsException.class) |
| Resultado Obtido:  	| Teste passou    	|

***  
| Test Case ID: CT65.6	| Objetivo: O teste deve verificar se  o método Campo, construtor esta funcionadno corretamente	|
|--------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(100,100)	|
| Entradas:             | localizacao(-100,-2100)         |
| Resultado Esperado: 	| É esperado que o campo seja delimitado pelo tamanho passado para o construtor:IndexOutOfBoundsException.class) |
| Resultado Obtido:  	| Teste passou    	|

***  
   
| Test Case ID: CT66.1	| Objetivo: O teste deve verificar se  o método GetPopulationDetails, esta funcionadno corretamente	|
|--------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(3,3) e tres instâncias de Ovelha	|
| Entradas:             |    "Ovelha: 3 LoboGuara: 3 ol.Campo: 3     |
| Resultado Esperado: 	| É esperado que o método retorne uma execeção: IllegalArgumentException.class) |
| Resultado Obtido:  	| Teste passou    	|

***  
| Test Case ID: CT66.2	| Objetivo: O teste deve verificar se  o método GetPopulationDetails, esta funcionadno corretamente	|
|--------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(10000,2) e 10000 instâncias de Ovelha e 10000 de loboGuara	|
| Entradas:             | 10000 de cada classe, lobo e ovelha    |
| Resultado Esperado: 	| É esperado que o método retorne:  "Ovelha: 10000 LoboGuara: 10000 ") |
| Resultado Obtido:  	| Teste passou    	|

***    

| Test Case ID: CT67	| Objetivo: O teste deve verificar se  o método Redefine, esta funcionadno corretamente	|
|--------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(10000,2) e 10000 instâncias de Ovelha e 10000 de loboGuara	|
| Entradas:             |   3 objeto da classe ovelha    |
| Resultado Esperado: 	| É esperado que o método retorne:  "Ovelha: 0") |
| Resultado Obtido:  	| Teste passou    	|

***  

| Test Case ID: CT68.1	| Objetivo: O teste deve verificar se  o método IncrementaContador, esta funcionadno corretamente	|
|--------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(3,3), instâncias de ovelha|
| Entradas:             |  Uma instância da calsse ovelha    |
| Resultado Esperado: 	| É esperado que o método retorne:  "Ovelha: 1") |
| Resultado Obtido:  	| Teste passou    	|

***  
| Test Case ID: CT68.2	| Objetivo: O teste deve verificar se  o método IncrementaContador, esta funcionadno corretamente	|
|--------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(3,3), instâncias de ovelha|
| Entradas:             |  Uma instância da calsse ovelha    |
| Resultado Esperado: 	| É esperado que o método retorne 4 instância da classe ovelha após, usar o getPopulationDetalis e chamar o incrementaContador |
| Resultado Obtido:  	| Teste passou    	|

***

| Test Case ID: CT68.2	| Objetivo: O teste deve verificar se  o método IncrementaContador,  esta funcionadno corretamente	|
|--------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(3,3), instâncias de ovelha|
| Entradas:             |  Uma instância da calsse ovelha    |
| Resultado Esperado: 	| É esperado que o método retorne 4 instância da calsse ovelha após, usar o incrementaContador e chamar o getPopulationDetalis |
| Resultado Obtido:  	| Teste passou    	|

***   

| Test Case ID: CT69	| Objetivo: O teste deve verificar se  o método ContadorFinalizado, esta funcionadno corretamente	|
|--------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(100,100), instâncias de ovelha|
| Entradas:             | 3 objectos da classe ovelha   |
| Resultado Esperado: 	| É esperado que apos chamar o finalizar contador, o método getPopulationDetails retorne " " |
| Resultado Obtido:  	| Teste passou    	|

*** 

| Test Case ID: CT70.1	| Objetivo: O teste deve verificar se  o método EhViavel, esta funcionadno corretamente	|
|--------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	| RE01, RE02, RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(100,100), instâncias de ovelha|
| Entradas:             | 3 objectos da classe ovelha   |
| Resultado Esperado: 	| É esperado que o método retorne false |
| Resultado Obtido:  	| Teste passou    	|

*** 

| Test Case ID: CT70.2	| Objetivo: O teste deve verificar se  o método EhViavel, esta funcionadno corretamente	|
|--------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	| RE01, RE02, RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(100,100), instâncias de ovelha e loboGuara|
| Entradas:             | 3 objectos da classe ovelha e um de loboGuara   |
| Resultado Esperado: 	| É esperado que o método retorne true |
| Resultado Obtido:  	| Teste passou    	|

***   

| Test Case ID: CT70.3	| Objetivo: O teste deve verificar se  o método EhViavel, esta funcionadno corretamente	|
|--------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	| RE01, RE02, RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(100,100), instâncias de ovelha e loboGuara|
| Entradas:             | um objectos da classe ovelha e um de loboGuara   |
| Resultado Esperado: 	| É esperado que o método retorne true |
| Resultado Obtido:  	| Teste passou    	|

***  
| Test Case ID: CT71.1	| Objetivo: O teste deve verificar se  o método hasH, esta funcionadno corretamente	|
|--------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	| RE01, RE02, RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(100,100), instâncias de ovelha e loboGuara|
| Entradas:             | um objectos da classe ovelha e um de loboGuara   |
| Resultado Esperado: 	| É esperado que o método retorne as qauntidades: 1 para objeto ovelha e 1 para objeto lobo |
| Resultado Obtido:  	| Teste passou    	|

***  

| Test Case ID: CT71.2	| Objetivo: O teste deve verificar se  o método hasH, esta funcionadno corretamente	|
|--------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	| RE01, RE02, RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(100,100), instâncias de ovelha e loboGuara|
| Entradas:             | um objectos da classe ovelha e um de loboGuara   |
| Resultado Esperado: 	| É esperado que o método retorne as qauntidades: 1 para objeto ovelha e 1 para objeto lobo |
| Resultado Obtido:  	| Teste passou    	|

***   
| Test Case ID: CT71.3	| Objetivo: O teste deve verificar se  o método hasH, esta funcionadno corretamente	|
|--------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	| RE01, RE02, RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(100,100), instâncias de ovelha e loboGuara instância de outro objecto distindo de animal|
| Entradas:             | um objectos da classe ovelha e um de loboGuara e outro objeto dsitinto da classe animal   |
| Resultado Esperado: 	| É esperado que o método retorne uma execeção ou não aceite outros objecto que não seja de Animal|
| Resultado Obtido:  	| Teste passou    	|

***   

| Test Case ID: CT71.3	| Objetivo: O teste deve verificar se  o método hasH, esta funcionadno corretamente	|
|--------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	| RE01, RE02, RE03, RE04         	|
| Precondições:       	| Existir uma instância de campo, Campo(1000000,2), instâncias de ovelha e loboGuara instância |  
| Entradas:             | 1000000 de objectos da classe ovelha e 1000000 de objeto de loboGuara |
| Resultado Esperado: 	| É esperado que o método retorne: 1000000 de lobos e 1000000 de ovelha|
| Resultado Obtido:  	| Teste passou    	|

***   
 
| Test Case ID: CT72.1	| Objetivo: O teste deve verificar se  o método contadoresValidos, esta funcionadno corretamente	|
|--------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	| Existir uma instância de campo, Campo(1000,1000), instância de campoEstatistica |  
| Entradas:             | Instacia campoEstatistica |
| Resultado Esperado: 	| É esperado que o método retorne: false para a variavél contadoresValidos |
| Resultado Obtido:  	| Teste passou    	|

***    
 
| Test Case ID: CT72.2	| Objetivo: O teste deve verificar se  o método contadoresValidos, esta funcionadno corretamente	|
|--------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	| RE01, RE02, RE03, RE04     	|
| Precondições:       	| Existir uma instância de campo, Campo(1000,1000), instância de campoEstatistica |  
| Entradas:             | Instacia campoEstatistica |
| Resultado Esperado: 	| É esperado que o método retorne: ture após chamar o getPopulationDetails |  
| Resultado Obtido:  	| Teste passou    	|

***