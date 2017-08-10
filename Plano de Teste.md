| **Plano de Teste**                  ||  
|-------------------------------|--------------------------------------------------------- ------------------|  
| Nome do projeto              | Simulador de habitat de lobo guará e ovelha                         | 
| Pessoas Envolvidas / Responsabilidade |  Guilherme Souza Santos - Implementação das classes de teste (JUnit) |  
| |Luiz Guilherme Fritsch - Implementação das classes de teste (JUnit)  |
| |Vitor Hugo Maciel dos Santos - Análise e correção das classes  |
| |Iderli Pereira Souza Filho - Draft Plano de Teste IEEE  |
| Funcionalidades ou Módulos | Simular População de Lobos Guará e Ovelha. Simulação de Longa duração e  simulação por etapa                                              |
| Equipamentos/Softwares  | --                     |
| Cronograma  | Data de Início e Fim do Projeto: 01/08/2009 – 01/10/2010  |
| |Data de Início e Fim do Teste: 01/02/2010 a 01/10/2010  |
| Local dos Testes | O sistema não possui um local especifico para testes. Os mesmos serão executados nas maquinas das pessoas envolvidas em locais aleatórios |
| Critérios para considerar o teste finalizado | -- |
| Observações | O relatório de incidente será enviado para todos os desenvolvedores por e-mail assim que alguma alteração tenha sido feita. Serão criados os casos de testes, os relatórios de incidentes e o relatório resumo de teste |



#**Objetivos do teste**

| **Obj 01**                  | Teste metodo GetLargura |  
|-------------------------------|--------------------------------------------------------- ------------------|  
| Condição do teste             | Somente largura existente na simulação                          | 
| Abordagem             |Devem ser usadas entradas validas e invalidas | 
| Critério de aceitação             | O sistema deve lançar um tratamento para entradas invalidas e retornar a largura para entradas validas                         |  
 
| **Obj 02**                  | Teste metodo GetProfundidade |  
|-------------------------------|--------------------------------------------------------- ------------------|  
| Condição do teste             | Somente profundidade existente na simulação                        | 
| Abordagem             |Devem ser usadas entradas validas e invalidas | 
| Critério de aceitação             | O sistema deve lançar um tratamento para entradas invalidas e retornar a profundidade para entradas validas                         |  

| **Obj 03**                  | Teste método GetObject |  
|-------------------------------|--------------------------------------------------------- ------------------|  
| Condição do teste             | Somente campos existentes na simulação      | 
| Abordagem             |Devem ser usadas entradas validas e invalidas | 
| Critério de aceitação             | O sistema deve lançar um tratamento para entradas invalida, retornar um lobo guará para localização que esteja preenchida por lobo guará, ovelha para localização com ovelha e null para campos vazios |  

| **Obj 04**                  | Teste método LimpaLocalizacao |  
|-------------------------------|--------------------------------------------------------- ------------------|  
| Condição do teste             | Somente localizações existentes na simulação    | 
| Abordagem             |Devem ser usadas entradas validas e invalidas | 
| Critério de aceitação             | O sistema deve lançar um tratamento para localizações invalidas e mudar para null localizações validas |  

// pode ter modificações
| **Obj 05**                  | Teste método Limpa |  
|-------------------------------|--------------------------------------------------------- ------------------|  
| Condição do teste             | Simulação existente | 
| Abordagem             | Devem ser usadas entradas validas e invalidas | 
| Critério de aceitação             | O sistema deve lançar um tratamento para localizações invalidas e mudar para null localizações validas |  

| **Obj 06**                  | Teste método Lugar(object animal, Localizacao localizacao) |  
|-------------------------------|--------------------------------------------------------- ------------------|  
| Condição do teste             | Objeto deve ser um animal e a Localização deve ser existente na simulação| 
| Abordagem             | Devem ser usadas entradas validas e invalidas | 
| Critério de aceitação             | O sistema deve lançar um tratamento para entradas invalidas e mudar a localização para lobo guará ou ovelha em entradas validas |  


| **Obj 07**                  | Teste método Lugar(object animal, int linha, int coluna) |  
|-------------------------------|--------------------------------------------------------- ------------------|  
| Condição do teste             | Objeto deve ser um animal e a linha e coluna devem ser validas| 
| Abordagem             | Devem ser usadas entradas validas e invalidas | 
| Critério de aceitação             | O sistema deve lançar um tratamento para entradas invalidas e mudar a localização da linha e coluna para lobo guará ou ovelha em entradas validas  | 


| **Obj 08**                  | Teste método corre |  
|-------------------------------|--------------------------------------------------------- ------------------|  
| Condição do teste             | A simulação deve ser iniciada | 
| Abordagem             | Devem ser usadas entradas para idade da ovelha validas e invalidas| 
| Critério de aceitação             | O sistema deve lançar um tratamento para entradas invalidas e seguir o seu funcionamento para idade valida | 
 
 

 


**Abordagem**  
   1. Atividades: testes JUnit, debug e revisões conjuntas.  
   2. Técnicas: partições de equivalência, error guessing e casos de teste.  
   3. Ferramentas: JUnit, Eclipse e .    



| **Relatório Resumo de Teste**                  ||  
|-------------------------------|--------------------------------------------------------- ------------------|  
| Nome do projeto              | Simulador de habitat de lobo guará e ovelha                         | 
| Data inicio teste    | --                                     |
| Data fim teste    | --                                                                   |
| Descrição teste   | --                                                               |
| Pessoas envolvidas    | --                                                                  |
| **Números do teste** ||
| casos de teste criados antes do teste    |   --                                                     |
| casos de teste criados durante o teste    |   --                                                     |
| casos de teste executados    |   --                                                     |
| casos de teste com sucesso    |   --                                                     |
| casos de teste com erro    |   --                                                     |
| casos de teste enviados para correção    |   --                                                     |
| **Percentual**    |  |
| casos de teste executados    |   --                                                     |
| casos de teste executados com sucesso    |   --                                                     |
| casos de teste executados com incidência de erro   |   --                                                     |
| casos de teste corrigidos    |   --                                                     |