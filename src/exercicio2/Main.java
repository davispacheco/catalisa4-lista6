package src.exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean repeticaoMenu = true;
        Scanner input = new Scanner(System.in);
        Caixa caixa = new Caixa();
        while (repeticaoMenu) {
            System.out.println("O que deseja fazer?");
            System.out.println("1: Executar lançamentos");
            System.out.println("2: Consultar saldo e quantidade de lançamentos");
            System.out.println("3: Finalizar");
            String opcaoMenu = input.next();
            switch (opcaoMenu) {
                case "1":
                    System.out.println("Quantos lançamentos deseja fazer?");
                    int quantidadeLancamentos = input.nextInt();
                    if (quantidadeLancamentos <= 0) {
                        System.out.println("Quantidade inválida para lançamentos, voltando ao menu principal...");
                        repeticaoMenu = true;
                    } else {
                        int contador = 1;
                        while (contador <= quantidadeLancamentos) {
                            boolean repeticaoLancamento = true;
                            while (repeticaoLancamento) {
                                System.out.println(contador + "º lançamento.");
                                System.out.println("Qual o valor?");
                                caixa.setValor(input.nextDouble());
                                if (caixa.getValor() <= 0) {
                                    System.out.println("Não pode trabalhar com um valor menor ou igual a 0.");
                                    repeticaoLancamento = true;
                                } else {
                                    boolean repeticaoCreditoDebito = true;
                                    while (repeticaoCreditoDebito) {
                                        System.out.println("Crédito ou débito?");
                                        System.out.println("1 para crédito, 2 para débito");
                                        String opcaoCreditoDebito = input.next();
                                        switch (opcaoCreditoDebito) {
                                            case "1":
                                                caixa.credito(caixa.getValor());
                                                contador++;
                                                System.out.println("Crédito de " + caixa.getValor() + " realizado com êxito!");
                                                repeticaoCreditoDebito = false;
                                                break;
                                            case "2":
                                                if (caixa.getValor() > caixa.getSaldo()) {
                                                    System.out.println("Não pode retirar a mais do que possui no caixa.");
                                                    repeticaoCreditoDebito = false;
                                                    repeticaoLancamento = true;
                                                } else {
                                                    caixa.debito(caixa.getValor());
                                                    contador++;
                                                    System.out.println("Débito de " + caixa.getValor() + " realizado com êxito!");
                                                    repeticaoCreditoDebito = false;
                                                }
                                                break;
                                            default:
                                                System.out.println("Opção inválida!");
                                        }
                                    }
                                    repeticaoLancamento = false;
                                }
                            }
                        }
                    }
                    break;
                case "2":
                    System.out.println("Saldo em caixa: " + caixa.getSaldo());
                    System.out.println("Lançamentos no crédito: " + caixa.getLancamentosCredito());
                    System.out.println("Lançamentos no débito: " + caixa.getLancamentosDebito());
                    System.out.println("Total de lançamentos: " + (caixa.getLancamentosCredito() + caixa.getLancamentosDebito()));
                    repeticaoMenu = true;
                    break;
                case "3":
                    System.out.println("Fim do programa!");
                    repeticaoMenu = false;
                    break;
                default:
                    System.out.println("Opção inválida!");
                    repeticaoMenu = true;
            }
        }
        input.close();
    }
}
