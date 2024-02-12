Modificadores de acesso 
    // private
    // public 

    desafio:

    Crie uma conta da netflix que tenha tela de loguin e senha 
        Email
        senha
    
    condição pra escolher qual catecoria ele quer

                Ação 
                Drama
                Rmance
                Comeida
                Suspence
                terror
     /----------------------------------------------------------/

    Depois da escolha da categoria:

                            vamos para qual filme ele vai assitir
                            Pra cada filme tem as suas especificação
    
                                ////Especificação
                            nome do filme
                            nome, Ator Principal
                            sinaopse
                            Classificação Indicativa
                            Premio oscar 

                                        <Nomes do filmes>

                            Ação    

                            "Guardiões da Galáxia",
                            "O Pacto",
                            "Homem-Aranha",
                            "John Wick 4",
                            "Resgate 2",
    
                            "Drama"

                            Que Horas Ela Volta?
                            O Impossível.
                            Pegando Fogo.
                            Lembranças.
                            O Jantar

                              "Romance

                            Antes do Amanhecer
                            Me Chame Pelo Seu Nome 
                            Shiva Baby 
                            CODA - No Ritmo do Coração
                            Amor, Sublime Amor

                                "comedia"
                        
                            nome do filme 
                            nome, Ator Principal
                            sinaopse
                            Classificação Indicativa
                            Premio oscar 

                            "Suspence"

                            Cisne Negro 
                            O Sexto Sentido
                            Donnie Darko
                            Psicose
                            À Espreita do Mal
          
                            "Terror"

                            O Exorcismo de Emily Rose.
                            Sorria.
                            Hereditário.
                            Invocação do Mal.
                            Sobrenatural.
         
        Explicação

            Importações (import javax.swing.*;): Isso importa todas as classes do pacote javax.swing, que são usadas para criar interfaces gráficas em Java. No nosso caso, estamos usando JOptionPane para exibir caixas de diálogo com mensagens e opções para o usuário.

Método main(String[] args): Este é o ponto de entrada do programa Java. O método main é onde a execução do programa começa.

Declaração de Arrays de Gêneros e Filmes: Aqui, nós definimos dois arrays: um para os gêneros de filmes e outro para os filmes em si. Os gêneros são representados como um array de strings simples, enquanto os filmes são representados como um array bidimensional, onde cada linha contém informações sobre um filme específico, como nome, ator principal, sinopse, classificação indicativa e se ganhou algum prêmio Oscar.

Mostrando Opções de Gênero: Usamos JOptionPane.showInputDialog para exibir uma caixa de diálogo com uma lista suspensa de opções de gênero para o usuário escolher.

Encontrando Filmes do Gênero Escolhido: Depois que o usuário escolhe um gênero, percorremos o array de gêneros para encontrar o índice correspondente ao gênero escolhido. Usamos esse índice para encontrar os filmes associados a esse gênero no array de filmes.

Mostrando Detalhes dos Filmes do Gênero Escolhido: Se filmes forem encontrados para o gênero escolhido, iteramos sobre eles e montamos uma mensagem contendo os detalhes de cada filme (nome, ator principal, sinopse, classificação indicativa e prêmio Oscar, se houver). Essa mensagem é exibida em uma caixa de diálogo usando JOptionPane.showMessageDialog.

Tratamento de Casos Especiais: Caso nenhum filme seja encontrado para o gênero escolhido, exibimos uma mensagem informando ao usuário que nenhum filme foi encontrado.
    