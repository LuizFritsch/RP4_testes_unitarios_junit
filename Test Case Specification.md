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

| Test Case ID:       	| Objetivo: 	|
|---------------------	|-----------	|
| Prioridade:         	|           	|
| Rastreador:         	|       RE01, RE02, RE03, RE04     	|
| Precondições:       	|           	|
| Entradas:             |               |
| Resultado Esperado: 	|           	|

***

| Test Case ID:       	| Objetivo: 	|
|---------------------	|-----------	|
| Prioridade:         	|           	|
| Rastreador:         	|       RE01, RE02, RE03, RE04     	|
| Precondições:       	|           	|
| Entradas:             |               |
| Resultado Esperado: 	|           	|

***

| Test Case ID:       	| Objetivo: 	|
|---------------------	|-----------	|
| Prioridade:         	|           	|
| Rastreador:         	|       RE01, RE02, RE03, RE04     	|
| Precondições:       	|           	|
| Entradas:             |               |
| Resultado Esperado: 	|           	|

***

| Test Case ID:       	| Objetivo: 	|
|---------------------	|-----------	|
| Prioridade:         	|           	|
| Rastreador:         	|       RE01, RE02, RE03, RE04     	|
| Precondições:       	|           	|
| Entradas:             |               |
| Resultado Esperado: 	|           	|

***

| Test Case ID:       	| Objetivo: 	|
|---------------------	|-----------	|
| Prioridade:         	|           	|
| Rastreador:         	|       RE01, RE02, RE03, RE04     	|
| Precondições:       	|           	|
| Entradas:             |               |
| Resultado Esperado: 	|           	|