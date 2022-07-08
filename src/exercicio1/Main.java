package src.exercicio1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean repeticaoMenu = true;
        Jardinagem jardinagem = new Jardinagem();
        Scanner input = new Scanner(System.in);
        while (repeticaoMenu) {
            System.out.println("O que deseja fazer?");
            System.out.println("1: Dados sobre o jardim");
            System.out.println("2: Cadastrar/alterar jardim");
            System.out.println("3: Usar adubo");
            System.out.println("4: Calcular preço do adubo usado");
            System.out.println("5: Cortar e calcular preço do corte da grama");
            System.out.println("6: Finalizar");
            String opcaoMenu = input.next();
            switch (opcaoMenu) {
                case "1":
                    if (jardinagem.isCadastrado()) {
                        System.out.println("Nome do jardim: " + jardinagem.getNomeJardim());
                        System.out.println("Medida em metros:" + jardinagem.getQuantidadeMetros());
                        System.out.println("Quantidade de plantas: " + jardinagem.getQuantidadePlantas());
                        System.out.println("Metros de grama: " + jardinagem.getQuantidadeMetrosGrama());
                        System.out.println("Quilos de adubo no estoque: " + jardinagem.getQuilosAdubo());
                        System.out.println("Valor por 100 gramas de adubo: " + jardinagem.getValorAdubo());
                        System.out.println("Valor por metro de grama: " + jardinagem.getValorMetroGrama());
                    } else {
                        System.out.println("Nada para mostrar aqui. O jardim não está cadastrado.");
                    }
                    repeticaoMenu = true;
                    break;
                case "2":
                    System.out.println("Nome do jardim:");
                    jardinagem.setNomeJardim(input.next());
                    System.out.println("Medida do jardim em metros:");
                    jardinagem.setQuantidadeMetros(input.nextDouble());
                    System.out.println("Quantidade de plantas:");
                    jardinagem.setQuantidadePlantas(input.nextInt());
                    System.out.println("Metros de grama:");
                    jardinagem.setQuantidadeMetrosGrama(input.nextDouble());
                    System.out.println("Quilos de adubo:");
                    jardinagem.setQuilosAdubo(input.nextDouble());
                    System.out.println("Valor por 100 gramas de adubo:");
                    jardinagem.setValorAdubo(input.nextDouble());
                    System.out.println("Valor do metro de grama:");
                    jardinagem.setValorMetroGrama(input.nextDouble());
                    if (jardinagem.isCadastrado()) {
                        System.out.println("Jardim alterado com sucesso!");
                    } else {
                        jardinagem.setCadastrado(true);
                        System.out.println("Jardim cadastrado com sucesso!");
                    }
                    repeticaoMenu = true;
                    break;
                case "3":
                    jardinagem.usarAdubo();
                    System.out.println("Adubo utilizado com sucesso!");
                    repeticaoMenu = true;
                    break;
                case "4":
                    System.out.println("Valor do adubo utilizado: " + jardinagem.precoAdubo());
                    repeticaoMenu = true;
                    break;
                case "5":
                    jardinagem.precoCorteGrama();
                    System.out.println("Corte da grama realizado!");
                    System.out.println("O valor do corte da grama foi: " + jardinagem.getValorCorteGrama());
                    repeticaoMenu = true;
                    break;
                case "6":
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
