



    

        import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class Time {
    private String chanceLibertadores;
    private String chanceRebaixamento;
    private String chanceSulamericana;
    private String chanceGanhar;

    public Time(String chanceLibertadores, String chanceRebaixamento, String chanceSulamericana, String chanceGanhar) {
        this.chanceLibertadores = chanceLibertadores;
        this.chanceRebaixamento = chanceRebaixamento;
        this.chanceSulamericana = chanceSulamericana;
        this.chanceGanhar = chanceGanhar;
    }

    public String getChanceLibertadores() {
        return chanceLibertadores;
    }

    public String getChanceRebaixamento() {
        return chanceRebaixamento;
    }

    public String getChanceSulamericana() {
        return chanceSulamericana;
    }

    public String getChanceGanhar() {
        return chanceGanhar;
    }
}

public class AnaliseDesempenhoTime {
    public static void main(String[] args) {
        // Criando um mapa para armazenar instâncias da classe Time para cada time
        Map<Integer, Time> times = new HashMap<>();
         times.put(1, new Time("Time Garantido na Libertadores", "Sem Chances de Rebaixamento", "Time Garantido na Libertadores", "eu"));
        times.put(2, new Time("Time Garantido na Libertadores", "Sem Chances de Rebaixamento", "Time Garantido na Libertadores", "Tem chance"));
        times.put(3, new Time("Time Garantido na Libertadores", "Sem Chances de Rebaixamento", "Time Garantido na Libertadores", "Tem chance"));
        times.put(4, new Time("Time Garantido na Libertadores", "Sem Chances de Rebaixamento", "Time Garantido na Libertadores", "Sem chance"));
        times.put(5, new Time("Time Garantido na Libertadores", "Sem Chances de Rebaixamento", "Time Garantido na Libertadores", "Sem chance"));
        times.put(6, new Time("Time Garantido na Libertadores", "Sem Chances de Rebaixamento", "Time Garantido na Libertadores", "Sem chance"));
        times.put(7, new Time("Time Garantido na Libertadores(Campeão Libertadores 2023)", "Sem Chances de Rebaixamento", "Time Garantido na Libertadores", "Sem chance"));
        times.put(8, new Time("Sem Chances de Libertadores", "Sem Chances de Rebaixamento", "Time Garantido na Sul-Americana", "Sem chance"));
        times.put(9, new Time("Sem Chances de Libertadores", "Sem Chances de Rebaixamento", "Time Garantido na Sul-Americana", "Sem chance"));
        times.put(10, new Time("Sem Chances de Libertadores", "Sem Chances de Rebaixamento", "Time Garantido na Sul-Americana", "Sem chance"));
        times.put(11, new Time("Time Garantido na Libertadoes(Campeão Copa do Brasil)", "Sem Chances de Rebaixamento", "Time Garantido na Libertadores", "Sem chance"));
        times.put(12, new Time("Sem Chances de Libertadores", "Sem Chances de Rebaixamento", "Time Garantido na Sul-Americana", "Sem chance"));
        times.put(13, new Time("Sem Chances de Libertadores", "Sem Chances de Rebaixamento", "Time Garantido na Sul-Americana", "Sem chance"));
        times.put(14, new Time("Sem Chances de Libertadores", "Sem Chances de Rebaixamento", "Tem Chance", "Sem chance"));
        times.put(15, new Time("Sem Chances de Libertadores", "Com Chances de Rebaixamento", "Tem Chance", "Sem chance"));
        times.put(16, new Time("Sem Chances de Libertadores", "Com Chances de Rebaixamento", "Sem Chance", "Sem chance"));
        times.put(17, new Time("Sem Chances de Libertadores", "Com Chances de Rebaixamento", "Sem chance", "Sem chance"));
        times.put(18, new Time("Sem Chances de Libertadores", "Rebaixado", "Sem chance", "Sem chance"));
        times.put(19, new Time("Sem Chances de Libertadores", "Rebaixado", "Sem chance", "Sem chance"));
        times.put(20, new Time("Sem Chances de Libertadores", "Rebaixado", "Sem chance", "Sem chance"));
        // Solicitar ao usuário que digite a POSIÇÃO do seu time
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a POSIÇÃO do seu time, para saber quais são suas chances!:\n1º-Palmeiras \r\n" + //
                "2º-Athletico-MG\r\n" + //
                "3º-Flamengo\r\n" + //
                "4º-Grêmio\r\n" + //
                "5º-Botafogo\r\n" + //
                "6º-Bragantino\r\n" + //
                "7º-Fluminense\r\n" + //
                "8º-Athletico-PR\r\n" + //
                "9º-Internacional\r\n" + //
                "10º-Fortaleza\r\n" + //
                "11º-São Paulo\r\n" + //
                "12º-Cuiabá\r\n" + //
                "13º-Corinthians\r\n" + //
                "14º-Cruzeiro\r\n" + //
                "15º-Santos\r\n" + //
                "16º-Vasco\r\n" + //
                "17º-Bahia\r\n" + //
                "19º-Goiás\r\n" + //
                "29º-Coritiba\r\n" + //
                "20º-América-MG");

        int posicaoTime = scanner.nextInt();

        // Verificar se a posição do time está no mapa
        if (times.containsKey(posicaoTime)) {
            // Obter a instância da classe Time para o time escolhido
            Time timeEscolhido = times.get(posicaoTime);

            // Imprimir o nome do time
            System.out.println("Nome do Time: " + obterNomeTime(posicaoTime));

            // Imprimir as informações do time
            System.out.println("Chance de Libertadores: " + timeEscolhido.getChanceLibertadores());
            System.out.println("Chance de Rebaixamento: " + timeEscolhido.getChanceRebaixamento());
            System.out.println("Chance de Sulamericana: " + timeEscolhido.getChanceSulamericana());
            System.out.println("Chance de Ganhar: " + timeEscolhido.getChanceGanhar());

            // Perguntar ao usuário se deseja ver as chances exatas
            System.out.println("Deseja saber as chances exatas? Digite 'sim' ou 'nao'");
            scanner.nextLine(); // Consumir a quebra de linha pendente
            String resposta = scanner.nextLine().toLowerCase();

            if (resposta.equals("sim")) {
                // Mostrar resultados necessários específicos para o time escolhido
                mostrarResultadosNecessarios(posicaoTime);
            } else {
                System.out.println("Programa encerrado.");
            }
        } else {
            // Se a posição do time não estiver no mapa, informar ao usuário que o time não foi encontrado
            System.out.println("Time não encontrado.");
        }
    }

    // Método auxiliar para obter o nome do time com base na posição
    private static String obterNomeTime(int posicaoTime) {
        switch (posicaoTime) {
            case 1:
                return "Palmeiras";
            case 2:
                return "Athletico-MG";
            case 3:
                return "Flamengo";
            case 4:
                return "Grêmio";
            case 5:
                return "Botafogo";
            case 6:
                return "Bragantino";
            case 7:
                return "Fluminense";
            case 8:
                return "Athletico-PR";
            case 9:
                return "Internacional";
            case 10:
                return "Fortaleza";
            case 11:
                return "São Paulo";
            case 12:
                return "Cuiabá";
            case 13:
                return "Corinthians";
            case 14:
                return "Cruzeiro";
            case 15:
                return "Santos";
            case 16:
                return "Vasco";
            case 17:
                return "Bahia";
            case 19:
                return "Goiás";
            case 29:
                return "Coritiba";
            case 20:
                return "América-MG";
            default:
                return "Time não encontrado";
        }
    }

    // Método auxiliar para mostrar resultados necessários específicos para o time escolhido
    private static void mostrarResultadosNecessarios(int posicaoTime) {
        // Mostrar resultados necessários apenas para os times específicos (1, 2, 3, 14, 15)
        if (posicaoTime == 1 || posicaoTime == 2 || posicaoTime == 3 || posicaoTime == 14 || posicaoTime == 15) {
            switch (posicaoTime) {
                case 1:
                    System.out.println("Resultados necessários para o Palmeiras:");
                    // Adicione os resultados necessários específicos para o Palmeiras aqui
                    break;
                case 2:
                    System.out.println("Resultados necessários para o Athletico-MG:");
                    // Adicione os resultados necessários específicos para o Athletico-MG aqui
                    break;
                case 3:
                    System.out.println("Resultados necessários para o Flamengo Ganhar: Ganhar o último jogo");
                    // Adicione os resultados necessários específicos para o Flamengo aqui
                    break;
                case 14:
                    System.out.println("Resultados necessários para o Cruzeiro Conseguir Vaga para a Sul Americana:Ganha ou empatar o último jogo");
                    // Adicione os resultados necessários específicos para o Cruzeiro aqui
                    break;
                case 15:
                    System.out.println("Resultados necessários para o Santos Conseguir vaga para Sul Américana: Ganhar o último jogo e o Cruzeiro Perder.");
                    // Adicione os resultados necessários específicos para o Santos aqui
                    break;
            }
        } else {
            System.out.println("Não há resultados necessários disponíveis para este time.");
        }
    }
}
