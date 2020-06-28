# Simulador habitat natural - lobo guará e ovelha 

| Versões                  ||  
|-------------------------------|--------------------------------------------------------- ------------------|

**Data:**  29/08/2017  -  22/09/2017     

**Versão:**   0.2   

**Preparado por:**  Iderli Souza  

**Descrição da mudança:**    Documento refatorado para melhor atender ao modelo da IEEE    
 
 
# 1 Introdução    

**1.2 Finalidade** 

O objetivo desta parte da especificação do teste é fornecer uma visão geral do que será testado no sistema.  

**1.3 Documento de referência:** MD.050 APPLICATION EXTENSIONS FUNCTIONAL DESIGN.  

**1.4 Glossário:** --  

# Conjunto de Características  

**Característica C01** Configuração do Sistema

Objetivo: Testar o resultado da simulação entregue ao usuário.  
Prioridade: Alta  
Abordagem: Testes estruturais e particionamento de equivalência. 
 
| Rastreabilidade:    |   RE01       |      RE02       |    RE03        |   RE04  |
|---------------------|--------------|-----------------|----------------|---------|  
|          C01        |      --      |       --        |       X        |    X    |

**Característica C02** Simulação longa  
Objetivo: Testar os resultados presentes em uma simulação longa.   
Prioridade: Média  
Abordagem: Testes estruturais.   

| Rastreabilidade:    |   RE01       |      RE02       |    RE03        |   RE04  |
|---------------------|--------------|-----------------|----------------|---------|  
|          C02        |       X      |       --        |       X        |    X    |

**Característica C03** Simulação por etapa 
Objetivo: Testar os resultados presentes em uma simulação por etapa.     
Prioridade: Média  
Abordagem: Testes estruturais.   

| Rastreabilidade:    |   RE01       |      RE02       |    RE03        |   RE04  |
|---------------------|--------------|-----------------|----------------|---------|  
|          C03        |       X      |       --        |       X        |    X    |

**Característica C04** Tela 
Objetivo: Testar o tamanho para criação da tela do simulador.     
Prioridade: Média  
Abordagem: Particionamento de equivalência.     

| Rastreabilidade:    |   RE01       |      RE02       |    RE03        |   RE04  |
|---------------------|--------------|-----------------|----------------|---------|  
|          C04        |       --     |       --        |       --       |    X    |

**Característica C05** Randomização.  
Objetivo: Testar os resultados oferecidos pela classe randomizador.      
Prioridade: Média  
Abordagem: Testes estruturais, Particionamento de equivalência. 
    
| Rastreabilidade:    |   RE01       |      RE02       |    RE03        |   RE04  |
|---------------------|--------------|-----------------|----------------|---------|  
|          C05        |       --     |       --        |       --       |    X    |

**Característica C06** Lobo-guará  
Objetivo: Testar o ciclo de vida do lobo-guará.        
Prioridade: Média  
Abordagem: Testes estruturais.     

| Rastreabilidade:    |   RE01       |      RE02       |    RE03        |   RE04  |
|---------------------|--------------|-----------------|----------------|---------|  
|          C06        |       x      |        x        |       --       |    X    |

**Característica C07** Ovelha  
Objetivo: Testar o ciclo de vida da Ovelha.        
Prioridade: Média  
Abordagem: Testes estruturais.     

| Rastreabilidade:    |   RE01       |      RE02       |    RE03        |   RE04  |
|---------------------|--------------|-----------------|----------------|---------|  
|          C07        |       x      |        x        |       --       |    X    |


# Requisitos do MD50  
 RE01: Modela o comportamento de um subconjunto do mundo real com base em um
modelo de software  
 RE02: Estima o comportamento de populações entre predadores e presas  
 RE03: Permite similar cenários de populações em diferentes áreas  
 RE04: Pode ser estendida para outros tipos de animais: predadores e presas
