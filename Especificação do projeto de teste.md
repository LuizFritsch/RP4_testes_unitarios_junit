#Simulador habitat natural - lobo guará e ovelha 

| Versões                  ||  
|-------------------------------|--------------------------------------------------------- ------------------|
**Data: **  29/08/2017       
**Versão:  **   0.1   
**Preparado por:  **  Iderli Souza  
**Descrição da mudança:  **    Primeiro rascuho  
         
#1 Introdução     
**1.2 Finalidade**  
O objetivo desta parte da especificação do teste é fornecer uma visão geral do que será testado no sistema.  
**1.3 Documento de referência: ** MD.050 APPLICATION EXTENSIONS FUNCTIONAL DESIGN.  
**1.4 Glossário: ** -- 

#2 Identificação dos casos de teste  

| **ID caso de teste 01**                  | **Rastreabilidade** Test simulação longa |  
|-------------------------------|--------------------------------------------------------- ------------------|
| Prioridade                    |  Média                                          |
| Pré condição             | O simulador estar executando simulação longa                         | 
| Objetivo                   |    Testar as funcionalidades de uma simulação longa |
| Entrada            | Deve ser iniciada uma simulação longa com entradas validas | 
| Resultado esperado             | A simulação deve ser realizada sem qualquer alteração no sistema e algum dos animais deve ser extinto para o término da execução| 

| **ID caso de teste 02**                  | **Rastreabilidade** Test simulação por etapa |  
|-------------------------------|--------------------------------------------------------- ------------------|
| Prioridade                    |  Média                                          |
| Pré condição             | O simulador estar executando simulação por etapa                         |
| Objetivo                   |    Testar as funcionalidades de uma simulação por etapa | 
| Entrada            | Deve ser iniciada uma simulação por etapa com entradas validas | 
| Resultado esperado             | A simulação deve ser realizada sem qualquer alteração no sistema e todos os passos da etapa devem acabar para o término da execução| 

| **ID caso de teste 03**                  | **Rastreabilidade** Test Tela de simulação |  
|-------------------------------|--------------------------------------------------------- ------------------|
| Prioridade                    |  baixa                                          |
| Pré condição             | O simulador estar executando                        |
| Objetivo                   |    Testar se a tela de simulação está corretamente desenvolvida | 
| Entrada            |Deve ser iniciada uma simualação | 
| Resultado esperado             |A tela deve estar exatamente igual ao exemplo especificado no MD.50| 

| **ID caso de teste 04**                  | **Rastreabilidade** Test a estrutura das classes |  
|-------------------------------|--------------------------------------------------------- ------------------|
| Prioridade                    |  Alta                                          |
| Pré condição             | O projeto deve estar atualizado                        |
| Objetivo                   |   Testar se o diagrama de classes corresponde ao projeto desenvolvido | 
| Entrada            |Deve ser analisado o projeto do "simulador de habitat natural de lobo guará e ovelha"| 
| Resultado esperado             |As classes do projeto devem estar iguais aos do diagrama de classes do MD.50|

| **ID caso de teste 05**                  | **Rastreabilidade** Test ciclo de vida ovelha |  
|-------------------------------|--------------------------------------------------------- ------------------|
| Prioridade                    |  Média                                         |
| Pré condição             | O simulador deve estar executando alguma simulação                       |
| Objetivo                   |   Testar se uma ovelha pode procriar e morrer| 
| Entrada            |Deve ser executado uma simulação| 
| Resultado esperado             | O ciclo de vida da ovelha deve estar corretamente expressado |


| **ID caso de teste 06**                  | **Rastreabilidade** Test ciclo de vida lobo guará |  
|-------------------------------|--------------------------------------------------------- ------------------|
| Prioridade                    |  Média                                         |
| Pré condição             | O simulador deve estar executando alguma simulação                       |
| Objetivo                   |   Testar se um lobo guará pode procriar e morrer| 
| Entrada            |Deve ser executado uma simulação| 
| Resultado esperado             | O ciclo de vida do lobo guará deve estar corretamente expressado |