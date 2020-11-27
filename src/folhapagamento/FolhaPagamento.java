/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package folhapagamento;

import java.util.Scanner;

/**
 *
 * @author luiz
 */
public class FolhaPagamento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        final double gratificacao_concursado = 200.00;
        final double gratificacao_temporario = 15.00;
        
        
        Scanner input = new Scanner(System.in);

        System.out.println("Informe a quantidade de funcionários");
        int employee_number = input.nextInt();
        int[] codes = new int[employee_number];
        int[] type_of_employee = new int[employee_number];
        double[] paycheck = new double[employee_number];
        int[] time = new int[employee_number];
        double calculated_paycheck;

        for (int controller = 0; controller < employee_number; controller++) {
            System.out.println("Digite o código do funcionário");
            codes[controller] = input.nextInt();
            input.nextLine();

            System.out.println("Digite 1 para funcionário concursado ou 2 para funcionário temporário.");
            type_of_employee[controller] = input.nextInt();
            input.nextLine();

            System.out.println("Digite o salário do funcionário.");
            paycheck[controller] = input.nextDouble();

            System.out.println("Digite o tempo de casa em anos se o funcionário for concursado ou meses se for temporário");
            time[controller] = input.nextInt();

        }

        for (int i = 0; i < employee_number; i++) {
            if (type_of_employee[i] == 1) {
                calculated_paycheck = paycheck[i] + gratificacao_concursado * time[i];                
                System.out.println("--------------- FUNCIONARIO CONCURSADO ---------------");
                System.out.println(codes[i]);
                System.out.println(calculated_paycheck);
            }
        }
        
        for (int i = 0; i < employee_number; i++) {
            if (type_of_employee[i] == 2) {
                calculated_paycheck = paycheck[i] + gratificacao_temporario * time[i];                
                System.out.println("--------------- FUNCIONARIO TEMPORARIO ---------------");
                System.out.println(codes[i]);
                System.out.println(calculated_paycheck);
            }
        }

    }

}
