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

***

| Test Case ID: CT01.2  	| Objetivo: O teste deve verificar se em uma execução de simulação, o método GetLargura esta funcionando 	|
|---------------------	|-----------	|
| Prioridade:         	|    Média     	|
| Rastreador:         	|  RE01, RE03, RE04         	|
| Precondições:       	|    Nenhuma        	|
| Entradas:             | profundidade 5 e largura 0 	         |
| Resultado Esperado: 	| É esperado que o teste lance a exceção illergalArgumentException     	|

***

| Test Case ID:  CT02.1      	| Objetivo: 	O teste deve verificar se em uma execução de simulação, o metodo GetProfundidade esta funcionando corretamente. Para isso deve-se criar uma simulação com parâmetros validos e inválidos|
|---------------------	|-----------	|
| Prioridade:         	|       Média    	|
| Rastreador:         	|   RE01, RE03, RE04         	|
| Precondições:       	|        Nenhuma   	|
| Entradas:             |   profundidade 31 e largura 5 	            |
| Resultado Esperado: 	|   É esperado que o teste não encontre erros        	|

***

| Test Case ID:  CT02.2      	| Objetivo: 	O teste deve verificar se em uma execução de simulação, o metodo GetProfundidade esta funcionando corretamente. Para isso deve-se criar uma simulação com parâmetros validos e inválidos|
|---------------------	|-----------	|
| Prioridade:         	|       Média    	|
| Rastreador:         	|   RE01, RE03, RE04         	|
| Precondições:       	|        Nenhuma   	|
| Entradas:             |   profundidade 0 e largura 5 		            |
| Resultado Esperado: 	|   É esperado que o teste lance a exceção illegalArgumentExceptions        	|

***

| Test Case ID:   CT03.1    	| Objetivo: 	O teste deve verificar se é retornado os detalhes da população em uma simulação. |
|---------------------	|-----------	|
| Prioridade:         	|           Alta 	|
| Rastreador:         	|       RE01, RE02, RE03, RE04     	|
| Precondições:       	|       Nenhuma     	|
| Entradas:             |  criar um campo 3x3 e 3 ovelhas com parâmetros (0,0)(0,1)(0,2)             |
| Resultado Esperado: 	|       É esperado que o teste retorne null    	|

***

| Test Case ID:   CT03.2    	| Objetivo: 	O teste deve verificar se é retornado os detalhes da população em uma simulação. |
|---------------------	|-----------	|
| Prioridade:         	|           Alta 	|
| Rastreador:         	|       RE01, RE02, RE03, RE04     	|
| Precondições:       	|       Nenhuma     	|
| Entradas:             |  criar um campo 100x100 e 3 ovelhas com parâmetros (0,0)(0,1)(0,2)            |
| Resultado Esperado: 	|       É esperado que o teste retorne null    	|

***

| Test Case ID:  CT04.1     	| Objetivo: O teste deve verificar o uso do metodo Corre da ovelha. 	|
|---------------------	|-----------	|
| Prioridade:         	|    Alta        	|
| Rastreador:         	|       RE01, RE02  	|
| Precondições:       	|     Método estaViva funcionando corretamente        	|
| Entradas:             |     Executar o método corre e chamar o metodo estaViva          |
| Resultado Esperado: 	|        true   	|

***

| Test Case ID:  CT04.2     	| Objetivo: O teste deve verificar o uso do metodo Corre da ovelha. 	|
|---------------------	|-----------	|
| Prioridade:         	|    Alta        	|
| Rastreador:         	|       RE01, RE02  	|
| Precondições:       	|     Método estaViva funcionando corretamente        	|
| Entradas:             |     Incrementar a idade da ovelha até o máximo +1 e chamar o metodo estaViva|
| Resultado Esperado: 	|        true   	|

***

| Test Case ID: CT05.1       	| Objetivo:  O teste deve verificar o uso do método equals. Deve-se criar uma localização com parâmetros validos e inválidos  	|
|---------------------	|-----------	|
| Prioridade:         	|      Alta      	|
| Rastreador:         	|       RE04     	|
| Precondições:       	|     Nenhuma        	|
| Entradas:             |     Localizacao(10,10)          |
| Resultado Esperado: 	|    true       	|

***

| Test Case ID: CT05.2       	| Objetivo:  O teste deve verificar o uso do método equals. Deve-se criar uma localização com parâmetros validos e inválidos  	|
|---------------------	|-----------	|
| Prioridade:         	|      Alta      	|
| Rastreador:         	|       RE04     	|
| Precondições:       	|     Nenhuma        	|
| Entradas:             |     Localizacao(,)          |
| Resultado Esperado: 	|    IllegalArgumentException.class      	|

***

| Test Case ID: CT06.1      	| Objetivo: 	O teste deve criar uma Localizacao com parâmetros validos e inválidos e verificar o uso do método getLinha |
|---------------------	|-----------	|
| Prioridade:         	|         baixa   	|
| Rastreador:         	|       RE01, RE03, RE04     	|
| Precondições:       	|   Nenhuma        	|
| Entradas:             |  Localizacao(10,15)             |
| Resultado Esperado: 	|  Criação do objeto com sucesso         	|

***

| Test Case ID: CT06.2      	| Objetivo: 	O teste deve criar uma Localizacao com parâmetros validos e inválidos e verificar o uso do método getLinha |
|---------------------	|-----------	|
| Prioridade:         	|         baixa   	|
| Rastreador:         	|       RE01, RE03, RE04     	|
| Precondições:       	|   Nenhuma        	|
| Entradas:             |  Localizacao(0,100)             |
| Resultado Esperado: 	|  Criação do objeto com sucesso         	|

***

| Test Case ID: CT06.3      	| Objetivo: 	O teste deve criar uma Localizacao com parâmetros validos e inválidos e verificar o uso do método getLinha |
|---------------------	|-----------	|
| Prioridade:         	|         baixa   	|
| Rastreador:         	|       RE01, RE03, RE04     	|
| Precondições:       	|   Nenhuma        	|
| Entradas:             |  Localizacao(0,-100)           |
| Resultado Esperado: 	|  IllegalArgumentException.class         	|

***

| Test Case ID:  CT07.1      	| Objetivo: O teste deve criar uma Localizacao com parâmetros validos e inválidos e verificar o uso do método getColuna	|
|---------------------	|-----------	|
| Prioridade:         	|       baixa      	|
| Rastreador:         	|       RE01,, RE03, RE04     	|
| Precondições:       	|      Nenhuma     	|
| Entradas:             |   Localizacao(10,15)            |
| Resultado Esperado: 	|  getColuna = 15        	|

***

| Test Case ID:  CT07.2      	| Objetivo: O teste deve criar uma Localizacao com parâmetros validos e inválidos e verificar o uso do método getColuna	|
|---------------------	|-----------	|
| Prioridade:         	|       baixa      	|
| Rastreador:         	|       RE01,, RE03, RE04     	|
| Precondições:       	|      Nenhuma     	|
| Entradas:             |   Localizacao(0,100)            |
| Resultado Esperado: 	|  getColuna = 100        	|

***

| Test Case ID:  CT07.3      	| Objetivo: O teste deve criar uma Localizacao com parâmetros validos e inválidos e verificar o uso do método getColuna	|
|---------------------	|-----------	|
| Prioridade:         	|       baixa      	|
| Rastreador:         	|       RE01,, RE03, RE04     	|
| Precondições:       	|      Nenhuma     	|
| Entradas:             |   Localizacao(-100,0)            |
| Resultado Esperado: 	|  IllegalArgumentException.class       	|

***

| Test Case ID:    CT08.1 | Objetivo: 	O teste deve criar uma Localizacao com parâmetros validos e inválidos e verificar o uso do método HashCode |
|---------------------	|-----------	|
| Prioridade:         	|  baixa          	|
| Rastreador:         	|       RE04     	|
| Precondições:       	|   Nenhuma         	|
| Entradas:             |   Localizacao(10,15)            |
| Resultado Esperado: 	|   teste passar        	|

***

| Test Case ID:    CT08.2 | Objetivo: 	O teste deve criar uma Localizacao com parâmetros validos e inválidos e verificar o uso do método HashCode |
|---------------------	|-----------	|
| Prioridade:         	|  baixa          	|
| Rastreador:         	|       RE04     	|
| Precondições:       	|   Nenhuma         	|
| Entradas:             |   Localizacao(-1,-1)          |
| Resultado Esperado: 	|   IllegalArgumentException.class       	|

***

| Test Case ID:    CT08.3 | Objetivo: 	O teste deve criar uma Localizacao com parâmetros validos e inválidos e verificar o uso do método HashCode |
|---------------------	|-----------	|
| Prioridade:         	|  baixa          	|
| Rastreador:         	|       RE04     	|
| Precondições:       	|   Nenhuma         	|
| Entradas:             |   Localizacao(-110, 15)           |
| Resultado Esperado: 	|   IllegalArgumentException.class        	|

***

| Test Case ID:      CT09.1   	| Objetivo: 	O teste deve criar um contador com parâmetros validos e inválidos, e testar a execução do método getName |
|---------------------	|-----------	|
| Prioridade:         	|      baixa       	|
| Rastreador:         	|       RE01, RE04     	|
| Precondições:       	|    Nenhuma       	|
| Entradas:             |     Contador ("lobo")          |
| Resultado Esperado: 	|   O teste não retornar nenhuma exceção        	|
***

| Test Case ID:      CT09.2   	| Objetivo: 	O teste deve criar um contador com parâmetros validos e inválidos, e testar a execução do método getName |
|---------------------	|-----------	|
| Prioridade:         	|      baixa       	|
| Rastreador:         	|       RE01, RE04     	|
| Precondições:       	|    Nenhuma       	|
| Entradas:             |     Contador ("")          |
| Resultado Esperado: 	|   IllegalArgumentException.class        	|
***

| Test Case ID:      CT09.3   	| Objetivo: 	O teste deve criar um contador com parâmetros validos e inválidos, e testar a execução do método getName |
|---------------------	|-----------	|
| Prioridade:         	|      baixa       	|
| Rastreador:         	|       RE01, RE04     	|
| Precondições:       	|    Nenhuma       	|
| Entradas:             |     Contador ("Ovelha")          |
| Resultado Esperado: 	|   O teste não retornar nenhuma exceção        	|

***

| Test Case ID:    CT10.1     	| Objetivo: 	O teste deve criar um contador com parâmetros validos e inválidos, e testar a execução do método getCount |
|---------------------	|-----------	|
| Prioridade:         	|     baixa        	|
| Rastreador:         	|       RE01, RE03, RE04     	|
| Precondições:       	|   Nenhuma        	|
| Entradas:             | Contador ("") |
| Resultado Esperado: 	|    IllegalArgumentException.class       	|

***

| Test Case ID:    CT10.2     	| Objetivo: 	O teste deve criar um contador com parâmetros validos e inválidos, e testar a execução do método getCount |
|---------------------	|-----------	|
| Prioridade:         	|     baixa        	|
| Rastreador:         	|       RE01, RE03, RE04     	|
| Precondições:       	|   Nenhuma        	|
| Entradas:             | Contador ("Ovelha") |
| Resultado Esperado: 	|    O teste não retornar nenhum erro       	|

***

| Test Case ID:    CT11   	| Objetivo: 	O teste deve criar um contador com parâmetros validos, e testar a execução do método increment |
|---------------------	|-----------	|
| Prioridade:         	|   Media        	|
| Rastreador:         	|       RE01, RE03, RE04     	|
| Precondições:       	|     Nenhuma      	|
| Entradas:             |   Incrementar 1000 vezes a ovelha            |
| Resultado Esperado: 	|  tratamento de exceção         	|

***

| Test Case ID:  CT12     	| Objetivo:  O teste deve criar um contador com parâmetros validos e inválidos, e testar a execução do método Reset 	|
|---------------------	|-----------	|
| Prioridade:         	|    baixa         	|
| Rastreador:         	|       RE01, RE03, RE04     	|
| Precondições:       	|      Nenhuma     	|
| Entradas:             |   chamar o método reset            |
| Resultado Esperado: 	|     teste retornar 0      	|

***

| Test Case ID:   CT13    	| Objetivo: 	 O método testGetLargura deve verificar se o método getLargura retorna a largura exata de um campo |
|---------------------	|-----------	|
| Prioridade:         	|  baixa          	|
| Rastreador:         	|       RE01, RE03, RE04     	|
| Precondições:       	|   Nenhuma        	|
| Entradas:             | chamar o método reset              |
| Resultado Esperado: 	|  teste retornar 0         	|

***

| Test Case ID: CT14.1      	| Objetivo:  O teste verifica se o método GetPopulation retorna uma String informando corretamente os dados do campo 	|
|---------------------	|-----------	|
| Prioridade:         	|    Alta         	|
| Rastreador:         	|       RE01, RE02, RE03, RE04     	|
| Precondições:       	|       Nenhuma    	|
| Entradas:             |  Criar 3 ovelhas com entradas (0,0)(0,1)(0,2)             |
| Resultado Esperado: 	|  O método não deve retornar null         	|

***

| Test Case ID: CT14.2      	| Objetivo:  O teste verifica se o método GetPopulation retorna uma String informando corretamente os dados do campo 	|
|---------------------	|-----------	|
| Prioridade:         	|    Alta         	|
| Rastreador:         	|       RE01, RE02, RE03, RE04     	|
| Precondições:       	|       Nenhuma    	|
| Entradas:             |  Criar 3 ovelhas com entradas validas, criar 3 lobos guará com entradas validas e criar 3 campos com entradas validas             |
| Resultado Esperado: 	|    O método deve retornar a String na ordem "ol.LoboGuara: 3 ol.Ovelha: 3 ol.Campo: 3"       	|

***

| Test Case ID: CT14.3      	| Objetivo:  O teste verifica se o método GetPopulation retorna uma String informando corretamente os dados do campo 	|
|---------------------	|-----------	|
| Prioridade:         	|    Alta         	|
| Rastreador:         	|       RE01, RE02, RE03, RE04     	|
| Precondições:       	|       Nenhuma    	|
| Entradas:             |  Deixar o campo vazio             |
| Resultado Esperado: 	|     O método deve informar que o campo se encontra vazio      	|

***

| Test Case ID:   CT15.1    	| Objetivo: O método verifica se após a execução do método Redefine o campo terá 0 objetos	|
|---------------------	|-----------	|
| Prioridade:         	|  baixa          	|
| Rastreador:         	|       RE01 RE03, RE04     	|
| Precondições:       	| O método GetPopulationDetails da mesma classe, deve estar implementado corretamente          	|
| Entradas:             |  Deve ser criado 3 ovelhas e chamar o método Redefine             |
| Resultado Esperado: 	|   teste deve mostrar que não tem objetos no campo        	|

***

| Test Case ID:   CT15.2    	| Objetivo: O método verifica se após a execução do método Redefine o campo terá 0 objetos	|
|---------------------	|-----------	|
| Prioridade:         	|  baixa          	|
| Rastreador:         	|       RE01 RE03, RE04     	|
| Precondições:       	| O método GetPopulationDetails da mesma classe, deve estar implementado corretamente          	|
| Entradas:             |  Deve ser criado 3 ovelha, chamar o método Redefine e incrementar o campo          |
| Resultado Esperado: 	|  O teste só deve contar os objetos que foram incrementados após redefinir o campo       	|

***

| Test Case ID:   CT16    	| Objetivo: O método verifica a execução do método contadorFinalizado 	|
|---------------------	|-----------	|
| Prioridade:         	|     baixa       	|
| Rastreador:         	|       RE01, RE03, RE04     	|
| Precondições:       	| O método GetPopulationDetails da mesma classe, deve estar implementado corretamente           	|
| Entradas:             |  Deve ser criado 3 ovelhas e chamar o método contadorFinalizado             |
| Resultado Esperado: 	|     Saída esperada: " "      	|

***

| Test Case ID:     CT17.1  	| Objetivo: 	 O método verifica se há um lobo e uma ovelha para fazer a simulação|
|---------------------	|-----------	|
| Prioridade:         	|  Média         	|
| Rastreador:         	|       RE01, RE02, RE03, RE04     	|
| Precondições:       	|      Nenhuma      	|
| Entradas:             |  O método cria 3 ovelhas             |
| Resultado Esperado: 	|     False      	|

***

| Test Case ID:     CT17.2  	| Objetivo: 	 O método verifica se há um lobo e uma ovelha para fazer a simulação|
|---------------------	|-----------	|
| Prioridade:         	|  Média         	|
| Rastreador:         	|       RE01, RE02, RE03, RE04     	|
| Precondições:       	|      Nenhuma      	|
| Entradas:             |    O método cria 3 ovelhas e um lobo guará           |
| Resultado Esperado: 	|     True      	|

***

| Test Case ID:     CT17.3  	| Objetivo: 	 O método verifica se há um lobo e uma ovelha para fazer a simulação|
|---------------------	|-----------	|
| Prioridade:         	|  Média         	|
| Rastreador:         	|       RE01, RE02, RE03, RE04     	|
| Precondições:       	|      Nenhuma      	|
| Entradas:             |   O método cria 1 e um campo            |
| Resultado Esperado: 	|       false    	|

***

| Test Case ID:   CT18.1    	| Objetivo: O metodo testEstaViva verifica se o método estaViva retorna true para ovelhas vivas e false para ovelhas mortas. 	|
|---------------------	|-----------	|
| Prioridade:         	|  Baixa         	|
| Rastreador:         	|       RE01, RE02, RE04     	|
| Precondições:       	|    Para o uso do segundo teste o método setMorte deve esta corretamente implementado.         	|
| Entradas:             |  O método cria uma ovelha             |
| Resultado Esperado: 	|    true       	|

***

| Test Case ID:   CT18.2    	| Objetivo: O metodo testEstaViva verifica se o método estaViva retorna true para ovelhas vivas e false para ovelhas mortas. 	|
|---------------------	|-----------	|
| Prioridade:         	|  Baixa         	|
| Rastreador:         	|       RE01, RE02, RE04     	|
| Precondições:       	|    Para o uso do segundo teste o método setMorte deve esta corretamente implementado.         	|
| Entradas:             |   O método cria uma ovelha e executa o setMorte            |
| Resultado Esperado: 	|   false        	|

***

| Test Case ID: CT19      	| Objetivo: Verificar se após a execução do metodo setMorte a ovelha esteja marcada como morta. 	|
|---------------------	|-----------	|
| Prioridade:         	|   baixa        	|
| Rastreador:         	|       RE01, RE02, RE04     	|
| Precondições:       	|  O método estaViva deve estar funcionando corretamente.          	|
| Entradas:             |  Executa o metodo setMorte para uma ovelha e chama o método estaViva             |
| Resultado Esperado: 	|  false         	|

***

| Test Case ID:  CT20     	| Objetivo: 	Verificar se após a execução do metodo setMorte a ovelha esteja marcada como morta. |
|---------------------	|-----------	|
| Prioridade:         	| baixa          	|
| Rastreador:         	|       RE01, RE02, RE04     	|
| Precondições:       	| O método estaViva deve estar funcionando corretamente.            	|
| Entradas:             | Executa o método setMorte para uma ovelha e chama o método estaViva              |
| Resultado Esperado: 	|  false         	|