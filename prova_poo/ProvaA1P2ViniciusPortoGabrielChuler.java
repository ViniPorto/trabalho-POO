/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provaa1p2ViniciusPortoGabrielChuler;

import java.util.Scanner;

/**
 *
 * @author gabri
 */
public class ProvaA1P2ViniciusPortoGabrielChuler {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Montadora mont = new Montadora("Montadora 1");
        CarroHibrido HaloIntersceptor = new CarroHibrido("Identificacao", "Proprietario", "Nome Veiculo", "Fabricante", "cor 1");
        
        while (true) {
            System.out.println("Digite uma opção:");
            System.out.println("1 - Ações");
            System.out.println("2 - SAIR");
            
            String opcao = scanner.next();
            switch (opcao) {
                case "1": //abrir conta;
                    while (true) {
                        System.out.println("-----Qual tipo de veículo deseja-----");
                        System.out.println("1 - Helicóptero");
                        System.out.println("2 - Lancha");
                        System.out.println("3 - Automóvel");
                        int opcaoVei = scanner.nextInt();
                        
                        int sairOpcao = 0;
                        
                        switch (opcaoVei) {
                            case 1:
                                while (sairOpcao != 13) {
                                    System.out.println("-----Helicóptero-----");
                                    System.out.println("1 - Ligar");
                                    System.out.println("2 - Desligar");
                                    System.out.println("3 - Iniciar Movimento");
                                    System.out.println("4 - Parar Movimento");
                                    System.out.println("5 - Virar para Direita");
                                    System.out.println("6 - Virar para Esquerda");
                                    System.out.println("7 - Voar");
                                    System.out.println("8 - Decolar");
                                    System.out.println("9 - Aterrissar");
                                    System.out.println("10 - Acionar Hélices");
                                    System.out.println("11 - Recolher Hélices");
                                    System.out.println("12 - Mostrar Dados");
                                    System.out.println("13 - Sair");
                                    int opcaoAcao = scanner.nextInt();
                                    
                                    switch (opcaoAcao) {
                                        case 1:
                                            HaloIntersceptor.ligar();
                                            break;
                                        case 2:
                                            HaloIntersceptor.desligar();
                                            break;
                                        case 3:
                                            HaloIntersceptor.iniciarMovimento();
                                            break;
                                        case 4:
                                            HaloIntersceptor.pararMovimento();
                                            break;
                                        case 5:
                                            HaloIntersceptor.virarParaDireita();
                                            break;
                                        case 6:
                                            HaloIntersceptor.virarParaEsquerda();
                                            break;
                                        case 7:
                                            HaloIntersceptor.voar();
                                            break;
                                        case 8:
                                            HaloIntersceptor.decolar();
                                            break;
                                        case 9:
                                            HaloIntersceptor.aterrissar();
                                            break;
                                        case 10:
                                            HaloIntersceptor.acionarHelices();
                                            break;
                                        case 11:
                                            HaloIntersceptor.recolherHelices();
                                            break;
                                        case 12:
                                            HaloIntersceptor.mostrarDadosHelicop();
                                            break;
                                        case 13:
                                            sairOpcao = 13;
                                            break;
                                        default:
                                            System.out.println("Opção inválida!");
                                    }
                                }
                            case 2:
                                while (sairOpcao != 13) {
                                    System.out.println("-----Lancha-----");
                                    System.out.println("1 - Ligar");
                                    System.out.println("2 - Desligar");
                                    System.out.println("3 - Iniciar Movimento");
                                    System.out.println("4 - Parar Movimento");
                                    System.out.println("5 - Virar para Direita");
                                    System.out.println("6 - Virar para Esquerda");
                                    System.out.println("7 - Navegar");
                                    System.out.println("8 - Lançar Ancora");
                                    System.out.println("9 - Recolher Ancora");
                                    System.out.println("10 - Acionar Casco");
                                    System.out.println("11 - Recolher Casco");
                                    System.out.println("12 - Mostrar Dados");
                                    System.out.println("13 - Sair");
                                    int opcaoAcao = scanner.nextInt();
                                    
                                    switch (opcaoAcao) {
                                        case 1:
                                            HaloIntersceptor.ligar();
                                            break;
                                        case 2:
                                            HaloIntersceptor.desligar();
                                            break;
                                        case 3:
                                            HaloIntersceptor.iniciarMovimento();
                                            break;
                                        case 4:
                                            HaloIntersceptor.pararMovimento();
                                            break;
                                        case 5:
                                            HaloIntersceptor.virarParaDireita();
                                            break;
                                        case 6:
                                            HaloIntersceptor.virarParaEsquerda();
                                            break;
                                        case 7:
                                            HaloIntersceptor.navegar();
                                            break;
                                        case 8:
                                            HaloIntersceptor.lancarAncora();
                                            break;
                                        case 9:
                                            HaloIntersceptor.recolherAncora();
                                            break;
                                        case 10:
                                            HaloIntersceptor.acionarCasco();
                                            break;
                                        case 11:
                                            HaloIntersceptor.recolherCasco();
                                            break;
                                        case 12:
                                            HaloIntersceptor.mostrarDadosLancha();
                                            break;
                                        case 13:
                                            sairOpcao = 13;
                                            break;
                                        default:
                                            System.out.println("Opção inválida!");
                                    }
                                }
                            case 3:
                                while (sairOpcao != 13) {
                                    System.out.println("-----Automóvel-----");
                                    System.out.println("1 - Ligar");
                                    System.out.println("2 - Desligar");
                                    System.out.println("3 - Iniciar Movimento");
                                    System.out.println("4 - Parar Movimento");
                                    System.out.println("5 - Virar para Direita");
                                    System.out.println("6 - Virar para Esquerda");
                                    System.out.println("7 - Movimentar");
                                    System.out.println("8 - Trocar Pneus");
                                    System.out.println("9 - Trocar Marcha");
                                    System.out.println("10 - Mostrar Dados");
                                    System.out.println("13 - Sair");
                                    int opcaoAcao = scanner.nextInt();
                                    
                                    switch (opcaoAcao) {
                                        case 1:
                                            HaloIntersceptor.ligar();
                                            break;
                                        case 2:
                                            HaloIntersceptor.desligar();
                                            break;
                                        case 3:
                                            HaloIntersceptor.iniciarMovimento();
                                            break;
                                        case 4:
                                            HaloIntersceptor.pararMovimento();
                                            break;
                                        case 5:
                                            HaloIntersceptor.virarParaDireita();
                                            break;
                                        case 6:
                                            HaloIntersceptor.virarParaEsquerda();
                                            break;
                                        case 7:
                                            HaloIntersceptor.movimentar();
                                            break;
                                        case 8:
                                            HaloIntersceptor.trocarPneu();
                                            break;
                                        case 9:
                                            HaloIntersceptor.trocarMarchaComoAuto();
                                            break;
                                        case 10:
                                            HaloIntersceptor.mostrarDadosAuto();
                                            break;
                                        case 13:
                                            sairOpcao = 13;
                                            break;
                                        default:
                                            System.out.println("Opção inválida!");
                                    }
                                }
                            break;    
                            default:
                                System.out.println("Opção inválida");
                                break;
                        }
                        break;
                    }
                case "2":
                    System.out.println("Saindo...");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }
        }

    }
    
}
