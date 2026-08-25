# Laboratório Inicial de Java: Calculadora Orientada a Objetos 

O objetivo do Lab é consolidar os conceitos de abstração e modelagem criando uma Calculadora com estado interno (memória).

## Como baixar o código inicial

Como ainda não estamos utilizando o Git via linha de comando, siga os passos abaixo para iniciar:

1. No canto superior direito desta página, clique no botão verde escrito **`<> Code`**.
2. No menu que abrir, clique em **`Download ZIP`**.
3. Extraia (descompacte) a pasta baixada no seu computador.
4. Abra a pasta extraída no **VSCode** (ou no seu editor de preferência).

---

## Passo a Passo do Laboratório

### 1. Preparando o Terreno e Executando o Código Base
* Com a pasta aberta no seu editor, analise os arquivos `Main.java` e `Calculadora.java`.
* Abra o terminal do VSCode (`Terminal` > `New Terminal`).
* Compile as duas classes digitando o comando: 
  `javac Main.java Calculadora.java`
* Em seguida, execute o programa para testar a estrutura básica usando o comando: 
  `java Main`
* Insira os valores no terminal e confirme se a soma (que já vem implementada) está funcionando corretamente.

### 2. Expandindo as Operações Matemáticas
* Na classe `Calculadora.java`, você notará que o método de soma não guarda o resultado. Para resolver isso, crie um novo atributo chamado `private int ultimoResultado = 0;` logo abaixo do atributo `memoria`. 
* **Regra de Ouro da Engenharia de Software:** Acostume-se a inicializar os atributos da sua classe sempre com a visibilidade `private`. Isso é essencial para um bom design orientado a objetos, protegendo a integridade dos dados internos (falaremos com mais detalhes quando estudarmos encapsulamento).
* Altere o método `somar` para que, antes de devolver o valor usando o `return`, ele guarde a resposta no estado do objeto: `this.ultimoResultado = parcela1 + parcela2;`
* Implemente os métodos `subtrair`, `multiplicar` e `dividir` recebendo os parâmetros necessários e seguindo essa mesma lógica. 
* No método `dividir`, adicione uma validação com `if` para verificar se o divisor é zero. Se for, exiba uma mensagem de erro e retorne `0`.

### 3. Implementando e Testando a Memória
* Remova as barras de comentário do método `salvarNaMemoria()`. Dentro dele, pegue o valor salvo em `this.ultimoResultado` e atribua à variável `this.memoria`.
* Remova as barras de comentário do método `recuperarDaMemoria()`. Ele deve usar o comando `return` para devolver o valor que está protegido na `memoria`.
* Volte ao arquivo `Main.java`. Após realizar e imprimir a soma, adicione a chamada `calc.salvarNaMemoria();`.
* Peça para o usuário digitar novos números usando o `scanner`, realize uma chamada para o método de `subtrair` que você criou e imprima o novo resultado.
* Por fim, chame `calc.recuperarDaMemoria()` e imprima o resultado no terminal. O valor da soma original deve aparecer intacto, provando que o estado da calculadora funcionou!


### Desafio Extra (Para quem terminar cedo)
Se você concluiu os passos acima, tente implementar as seguintes melhorias:
1. **Função CE (Clear):** Crie um método `public void limparMemoria()` na classe `Calculadora` que resete os valores dos atributos `memoria` e `ultimoResultado` de volta para zero. Teste essa função no seu `Main`.
2. **Calculadora Contínua:** No arquivo `Main.java`, envolva a lógica de interação do `Scanner` em um laço de repetição (como um `while`). Crie um menu numérico simples para o usuário escolher qual operação deseja realizar (Ex: 1 - Somar, 2 - Subtrair... 9 - Sair), permitindo que ele faça várias contas sem que o programa feche.

---

## Como entregar a atividade

Ao finalizar todas as etapas e testar o seu código, siga os passos abaixo para entregar o laboratório:

1. Certifique-se de que os seus arquivos estão salvos e o programa compila sem erros.
2. Compacte a pasta do seu projeto (contendo os arquivos `.java` que você modificou) em um único arquivo **`.zip`**.
3. Acesse a página da disciplina no **Moodle**.
4. Encontre a tarefa correspondente a este laboratório (Lab01 - Calculadora).
5. Faça o upload do seu arquivo `.zip` e confirme o envio.

