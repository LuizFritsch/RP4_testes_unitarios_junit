| Plano de Teste                  ||  
|-------------------------------|--------------------------------------------------------- ------------------|  
 **Identificador do plano de teste: **  01                          
 **Referências:**  MD.050 APPLICATION EXTENSIONS FUNCTIONAL DESIGN.  
 **Introdução:** Este documento consiste numa modelagem detalhada do fluxo de trabalho durante o processo de teste do simulador de lobos guará e ovelha. Sistema que envolve monitoramento de populações de lobos guará e ovelhas dentro de uma área demarcada. A simulação tem por objetivo avaliar o resultado entre predador (lobo guará) e presa (ovelha).  
 **Itens de teste:** Métodos, padrões de projeto, arquitetura e consistência entre projeto e documentação.  
 **Problemas de Risco de Software: ** 1.Erro na interface de simulação pode acarretar em danos aos animais do habitat em questão.  2.Os módulos de documentação existentes no projeto são pouco detalhados.  
 **Recursos a serem Testados:** O teste deve preencher todas as etapas da simulação do habitat.  
 **Características a serem testadas:** --  
**Abordagem: **  
   1. Atividades: testes JUnit, debug e revisões conjuntas.  
   2. Técnicas: partições de equivalência, error guessing e casos de teste.  
   3. Ferramentas: JUnit, Eclipse e bitbucket. Nenhuma ferramenta necessita de treinamento especial.  
   4. O gerenciamento de configuração deve ser feito pelos membros da equipe de teste.   
   5. 


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

| **Obj 09**                  | Teste método estaViva |  
|-------------------------------|--------------------------------------------------------- ------------------|  
| Condição do teste             | O método deve retornar se a ovelha esta viva ou morta | 
| Abordagem             | Devem ser testados ovelhas vivas e ovelhas mortas| 
| Critério de aceitação             | o sistema deve retornar true para ovelhas vivas e false para ovelhas mortas | 

| **Obj 10**                  | Teste método GetLocalizacao |  
|-------------------------------|--------------------------------------------------------- ------------------|  
| Condição do teste             | Uma ovelha deve ser criada | 
| Abordagem             | Devem ser testadas ovelhas validas e invalidas | 
| Critério de aceitação             |O sistema deve retornar uma mensagem de erro para entradas invalidas e a localização da ovelha para entradas validas |
 
 #Casos de teste

**CT01: testGetLargura**  
**Descrição: ** O teste deve verificar se em uma execução de simulação, o metodo GetLargura esta funcionando corretamente. Para isso deve-se criar uma simulação com parâmetros validos e inválidos.  

**Precondições: ** --  

| **procedimento**                                    |  Verificação                               |Resultado      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| Criar um simulador com profundidade 5 e largura 31  | É esperado que o teste não encontre erros  |  Teste passou |
| Criar um simulador com profundidade 5 e largura 0   | É esperado que o teste lance a exceção illergalArgumentException  |  Teste falhou, o teste lançou um ArithmeticException |


**CT02: testGetProfundidade**  
**Descrição: ** O teste deve verificar se em uma execução de simulação, o metodo GetProfundidade esta funcionando corretamente. Para isso deve-se criar uma simulação com parâmetros validos e inválidos. 
 
**Precondições: ** --  

| **procedimento**                                    |  Verificação                               |Resultado      |  
|-----------------------------------------------------|--------------------------------------------|---------------|  
| Criar um simulador com profundidade 31 e largura 5  | É esperado que o teste não encontre erros  |  Teste passou |
| Criar um simulador com profundidade 0 e largura 5   | É esperado que o teste lance a exceção illergalArgumentException  |  Teste falhou, o teste lançou um ArithmeticException |




 


**Abordagem**  
   1. Atividades: testes JUnit, debug e revisões conjuntas.  
   2. Técnicas: partições de equivalência, error guessing e casos de teste.  
   3. Ferramentas: JUnit, Eclipse e .    

#Relatório resumo de teste

| **Relatório**                  ||  
|-------------------------------|--------------------------------------------------------- ------------------|  
| Nome do projeto              | Simulador de habitat de lobo guará e ovelha                         | 
| Data inicio teste    |   08/08/2017                                   |
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