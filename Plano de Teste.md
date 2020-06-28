| Plano de Teste                  ||  
|-------------------------------|--------------------------------------------------------- ------------------|  
**1. Informações especificas:**

1.1. Visão Geral: Este documento consiste numa modelagem detalhada do fluxo de trabalho durante o processo de teste do simulador de lobos guará e ovelha.

1.2. Identificador único do documento: 001        

1.3. Organização emissora: Unipampa   

1.4. Autoridade de aprovação: Elder de Macedo Rodrigues e Maicon Bernardino da Silveira  

1.5. Histórico de mudanças:  --  


**2. Introdução**

2.1. Escopo: Sistema que envolve monitoramento de populações de lobos guará e ovelhas dentro de uma área demarcada. A simulação tem por objetivo avaliar o resultado entre predador (lobo guará) e presa (ovelha).  

2.2. Referências: MD.050 APPLICATION EXTENSIONS FUNCTIONAL DESIGN. 

2.3.Glossário:

A. Stakeholders: pessoas interessadas no sistema.  


**3. Contexto do teste**

3.1. Subprocesso de projeto/teste: Inspeção. 

3.2. Itens de teste: Métodos, padrões de projeto, arquitetura e consistência entre projeto e documentação.  
Problemas de Risco de Software: 

1.Erro na interface de simulação pode acarretar em danos aos animais do habitat em questão.
2.Os módulos de documentação existentes no projeto são pouco detalhados.  

3.3. Escopo de teste: Os testes deveram ser aplicados dos métodos de todas as classes do projeto, documentando seus resultados e caso encontrem erros, reportando-os.  

3.4. Premissas e restrições: Os testes não devem mudar o código fonte do sistema.  

3.5. Stakeholders: Biólogos, Ambientalistas e professores.   


**4. Comunicação:**

A. Quando ocorrer um erro ele deve ser reportado por e-mail e comunicado aos demais membros da equipe via WhatsApp.  

B. O teste pode começar a qualquer hora pelo testador.


**5. Registros de risco:**

5.1. Riscos do produto: Se ocorrer algum erro com o produto no ambiente de execução pode acarretar em danos no habitat dos animais em questão podendo gerar até mesmo uma extinção de uma das espécies.  

5.2. Riscos do projeto:


**6. Estrategia de teste**

6.1. Subprocessos de teste:

6.2. Entregas de teste: ** Os testes devem ser entregues no repositório e colocados para documentação.    

6.3. Técnicas de design de teste:

6.4. Critérios de conclusão do teste:

A. Os testes devem ser finalizados apenas quando não encontrem erros, caso o erro seja encontrado o testador deve aguardar a correção e refazer o teste.

6.5. Métricas a serem coletadas:

6.6. Requisitos de dados de teste: O teste deve fornecer o motivo do teste, entrada, saída esperada e saída real.

6.7. Requisitos de ambiente de teste: Os testes serão realizados nos computadores pessoais dos testadores, sem nenhum requisito prévio.

6.8. Testes de repetição e regressão: Os testes devem ser refeitos após a correção dos erros encontrados.

6.9. Critérios de Suspensão e retomada:

A. Se as partições de equivalência do teste já foram testadas, todas as entradas foram documentadas e o testador não vê necessidade de mais testes, os caso de teste do método específico devem ser finalizados.

B. Se foi encontrado um erro fatal, os demais testes correm risco de serem consequências do erro primário. Nessas condições o erro deve ser reportado e corrigido para a liberação de execução dos demais testes.

6.10. Desvios da estratégia de teste organizacional:


**7. Testando atividades e estimativas:**
 
A. testes JUnit, debug, inspeção de software e revisões conjuntas.

B. O gerenciamento de configuração deve ser feito pelos membros da equipe de teste.

C. Os testes de regressão devem ser feitos a cada modificação do md50. 


**8. Pessoal**

**8.1. Papéis, atividades e responsabilidades:
     
| Índice | Nome                         | Papéis e Responsabilidades                                                                |
|--------|------------------------------|------------------------------------------------------------------|
| A      | Guilherme Souza Santos       | Implementação das classes de teste (JUnit) e Documentação  |
| B      | Luiz Guilherme Fritsch       | Implementação das classes de teste (JUnit) e Documentação  |
| C      | Vitor Hugo Maciel dos Santos | Análise e correção das classes, Implementação das classes de teste (JUnit) e Documentação |
| D      | Iderli Pereira Souza Filho   | Implementação das classes de teste (JUnit) e Documentação  |
    
**8.2. Necessidades de contratação:** Nenhuma

**8.3. necessidades de treinamento:** Nenhuma  


**9. Cronograma:**    
      
| Funcionário | 12/08 | 15/08 | 19/08 | 22/08 | 29/08 | 02/09 | 05/09 | 12/09 | 16/09 | 23/09 |
|:----------------------------:|:--------------------------------------------------:|:---------------------------------------------------------------------------------------------------------------:|:---------------------------------------------------------------------------------------------:|:-------------------------------------------------------------------------------:|:-----:|:---------------------------------:|:-------------------------------------------:|:--------------------------------------------------------------------------------------------------------------:|:----------------------------------------------------------------------------:|:-------------------------------------------------------------------------------------------------------------------------:|
| Iderli Pereira Souza Filho | Draft Plano de Teste IEEE | --- | --- | Terminar a documentação dos casos de teste das classes faltantes e refatoração: | --- | criar 10 casos de teste novos | --- | --- | Melhorar a identificação de casos de testes com múltiplas entradas e saídas. | --- |
| Guilherme Souza Santos | Implementação das classes de teste (JUnit) (campo) | Implementação da classes de teste (1 classe CampoEstatistica, Contador, Localizacao) e aplicar técnica de teste | Implementação da classes de teste (Classe SimuladorTela) e aplicar técnica de teste | --- | --- | --- | --- | Documentar os casos de testes implementados nas classes Lobo/Ovelha e demais métodos que o Fritsh implementar. | --- | --- |
| Luiz Guilherme Fritsch | Implementação das classes de teste (JUnit)  | Implementação das classes de teste (teste ovelha) e implementar Lobo (pelo menos parcial) | Implementação da classes de teste (Classe Simulador, Randomizador) e aplicar técnica de teste | --- | --- | Relatório dos resultados do teste | Criar 10 casos de teste classes lobo/ovelha | Revisar as classes refatoradas e finalizar a implementação dos métodos de testes que faltam. | Expandir os métodos de testes das classes de teste, bem como documentá-los. | --- |
| Vitor Hugo Maciel dos Santos | --- | Inspeção do software (4 classes): Simulador, Contador, Rsandomizador, LoboGuara | --- | --- | --- | Relatório dos resultados do teste | --- | --- | --- | Finalizar o documento do Plano de Teste. Corrigir o cronograma. Colocar os papéis e responsabilidades em forma de tabela. |
