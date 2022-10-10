import java.util.Scanner;

public class lt1_at8 {
    public static void main(String[] args) throws Exception {
        //Req_1: Pergunte quanto você ganha por hora e o número de horas trabalhadas no mês.
        Scanner sc = new Scanner(System.in);
        System.out.print("Entre com o seu valor/hora: ");
        int valor_hora = sc.nextInt();
        System.out.println();
        System.out.print("Entre com a quantidade de horas trabalhadas no mês: ");
        int horas_mes = sc.nextInt();
        sc.close();

        // Req_3: Calcule e mostre o total do seu salário no referido mês

        int salario_mes = valor_hora * horas_mes;
        System.out.println(" O valor do seu salário esse mês é de: " + salario_mes);
        
        }
}
