| Plano de Teste                  ||  
|-------------------------------|--------------------------------------------------------- ------------------|  
**1. Informações especificas:**
**1.1. Visão Geral: ** Este documento consiste numa modelagem detalhada do fluxo de trabalho durante o processo de teste do simulador de lobos guará e ovelha.
**1.2. Identificador único do documento: **  001           
**1.3. Organização emissora: ** -- 
**1.4. Autoridade de aprovação: ** Elder de Macedo Rodrigues e Maicon Bernardino da Silveira  
**1.5. Histórico de mudanças: ** --  
 **2. Introdução**
 **2.1. Escopo: ** Sistema que envolve monitoramento de populações de lobos guará e ovelhas dentro de uma área demarcada. A simulação tem por objetivo avaliar o resultado entre predador (lobo guará) e presa (ovelha).  
 **2.2. Referências:**  MD.050 APPLICATION EXTENSIONS FUNCTIONAL DESIGN.  
**2.3.Glossário: ** --
**3. Contexto do teste**
**3.1. Subprocesso de projeto/ teste: ** Inspeção. 
 **3.2. Itens de teste:** Métodos, padrões de projeto, arquitetura e consistência entre projeto e documentação.  
 **Problemas de Risco de Software: ** 1.Erro na interface de simulação pode acarretar em danos aos animais do habitat em questão.  2.Os módulos de documentação existentes no projeto são pouco detalhados.  
**3.3. Escopo de teste: ** Os testes deveram ser aplicados dos métodos de todas as classes do projeto, documentando seus resultados e caso encontrem erros, reportando-os.  
**3.4. Restrições: ** -- 
**3.5. Stakeholders: ** -- 
**4. Comunicação: ** 
A. Quando ocorrer um erro ele deve ser reportado por email e comunicado aos demais membros da equipe.  
B. O teste pode começar a qualquer hora pelo testador.]
**5. Registros de risco: **
**5.1. Riscos do produto: ** Se ocorrer algum erro com o produto no ambiente de execução pode acarretar em danos no habitat dos animais em questão.  
**5.2. Riscos do projeto: ** --  
**6. Estrategia de teste** 
**6.1. Submissão de processos: ** Todos os processos do teste devem ser documentados.  
**6.2. Produtos de teste: ** --
**6.3. Técnicas de design de teste: ** --
**6.4. Critérios de conclusão do teste: ** O plano de teste será finalizado ao final da execução dos casos de teste e correções, derivadas dos testes, no projeto.  
**6.5. Métricas a serem coletadas: ** --  
**6.6. Requisitos de dados de teste: ** O teste deve fornecer o motivo do teste, entrada, saída esperada e saída real.  
**6.7. Requisitos de ambiente de teste: ** Os testes serão realizados nos computadores pessoais dos testadores, sem nenhum requisito prévio. 
**6.8. Testes de repetição e regressão: ** Os testes devem ser refeitos após a correção dos erros encontrados.  
**6.9. Critérios de Suspensão e retomada: ** 
A. Se as partições de equivalência do teste já foram testadas e todas as entradas foram documentadas, o caso de teste deve ser finalizado.  
B. Se foi encontrado um erro fatal, os demais testes correm risco de serem consequências do erro primário. Nessas condições o erro deve ser reportado e corrigido para a liberação de execução dos demais testes.  
**6.10. Desvios da estratégia de teste organizacional: ** --
**7. Testando atividades e estimativas: **
A. testes JUnit, debug e revisões conjuntas.   
B. O gerenciamento de configuração deve ser feito pelos membros da equipe de teste.     
C. Os testes de regressão devem ser feitos a cada modificação do md50.  
**8. Pessoal**
**8.1. Papéis, atividades e responsabilidades: **
A. Guilherme Souza Santos - Implementação das classes de teste (JUnit)    
B. Luiz Guilherme Fritsch - Implementação das classes de teste (JUnit)  
C. Vitor Hugo Maciel dos Santos - Análise e correção das classes  
D. Iderli Pereira Souza Filho - Documentação **
**8.2. Necessidades de contratação**
**8.3. necessidades de treinamento**
**9. Cronograma: **



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