package ex05.netflix;

import javax.swing.JOptionPane;

public class ContaNetflix {
    public static void main(String[] args) {

        Loguin premicao = new Loguin();
        premicao.enviarAcceso();

        String[] generos = { "Ação", "Drama", "Romance", "Comédia", "Suspense", "Terror" };

        String[][] filmes = {
                { "Guardiões da Galáxia", "Chris Pratt",
                        "Um grupo de desajustados se une para proteger a galáxia de uma ameaça iminente.", "12 anos",
                        "Não" },
                { "O Pacto", "Jason Momoa",
                        "Um ex-soldado une forças com um policial para investigar o assassinato de seu irmão.",
                        "16 anos", "Não" },
                { "Homem-Aranha", "Tom Holland",
                        "Peter Parker enfrenta um novo vilão enquanto tenta equilibrar sua vida como estudante do ensino médio.",
                        "10 anos", "Não" },
                { "John Wick 4", "Keanu Reeves",
                        "John Wick se vê forçado a lutar contra uma nova ameaça enquanto tenta fugir dos assassinos que o perseguem.",
                        "18 anos", "Não" },
                { "Resgate 2", "Chris Hemsworth",
                        "Um mercenário é contratado para resgatar o filho sequestrado de um criminoso.", "16 anos",
                        "Não" },
                { "Invocação do Mal", "Vera Farmiga",
                        "Uma família é assombrada por presenças sinistras em sua nova casa, e buscam ajuda de especialistas em paranormalidade.",
                        "16 anos",
                        "Não" }

        };

        String generoEscolhido = (String) JOptionPane.showInputDialog(null,
                "Escolha um gênero:",
                "Seleção de Gênero",
                JOptionPane.QUESTION_MESSAGE,
                null,
                generos,
                generos[0]);

        String[] filmesDoGenero = null;
        for (int i = 0; i < generos.length; i++) {
            if (generos[i].equals(generoEscolhido)) {
                filmesDoGenero = filmes[i];
                break;
            }
        }

        if (filmesDoGenero != null) {
            String mensagem = "Filmes do gênero " + generoEscolhido + ":\n";
            for (int i = 0; i < filmesDoGenero.length; i += 5) {
                mensagem += "\nNome: " + filmesDoGenero[0] +
                        "\nAtor Principal: " + filmesDoGenero[1] +
                        "\nSinopse: " + filmesDoGenero[2] +
                        "\nClassificação Indicativa: " + filmesDoGenero[3] +
                        "\nPrêmio Oscar: " + filmesDoGenero[4] + "\n";
            }
            JOptionPane.showMessageDialog(null, mensagem);
        } else {
            JOptionPane.showMessageDialog(null, "Nenhum filme encontrado para o gênero selecionado.");
        }
    }

}
