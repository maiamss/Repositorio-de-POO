
//lista 5 - exercício único

//Aluguel de carros
package lista5;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

 
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicita as informações do proprietário
        System.out.println("Digite o nome do proprietario:");
        String nome = scanner.nextLine();

        System.out.println("Digite o CPF do proprietario:");
        String cpf = scanner.nextLine();

        System.out.println("Digite o RG do proprietario:");
        String rg = scanner.nextLine();

        System.out.println("Digite a data de nascimento do proprietario (no formato dd/mm/aaaa):");
        String dataNascimentoStr = scanner.nextLine();
        Calendar dataNascimento = converterStringParaCalendar(dataNascimentoStr);

        // Solicita as informações do endereço
        System.out.println("Digite a rua do endereco:");
        String rua = scanner.nextLine();

        System.out.println("Digite o bairro do endereço:");
        String bairro = scanner.nextLine();

        System.out.println("Digite a cidade do endereço:");
        String cidade = scanner.nextLine();
        System.out.println("Digite o estado do endereço:");
        String estado = scanner.nextLine();

        System.out.println("Digite o CEP do endereço:");
        String cep = scanner.nextLine();

        // Cria um objeto Endereco
        Endereco endereco = new Endereco(rua, bairro, cidade, estado, cep);

        // Cria um objeto Proprietario com as informações fornecidas
        Proprietario proprietario = new Proprietario(nome, cpf, rg, dataNascimento, endereco);

        // Exibe as informações do proprietário
        System.out.println("\nInformações do Proprietário:");
        System.out.println("Nome: " + proprietario.getNome());
        System.out.println("CPF: " + proprietario.getCpf());
        System.out.println("RG: " + proprietario.getRg());
        System.out.println("Data de Nascimento: " + proprietario.getDataNascimento());
        System.out.println("Endereço:");
        System.out.println("Rua: " + endereco.getRua());
        System.out.println("Bairro: " + endereco.getBairro());
        System.out.println("Cidade: " + endereco.getCidade());
        System.out.println("Estado: " + endereco.getEstado());
        System.out.println("CEP: " + endereco.getCep());
        
         // Solicita as informações do carro
        System.out.println("Digite o modelo do carro:");
        String modelo = scanner.nextLine();

        System.out.println("Digite a marca do carro:");
        String marca = scanner.nextLine();

       System.out.println("Qual a velocidade máxima?");
        double velMax = scanner.nextDouble();
        
        System.out.println("Qual a velocidade atual?");
        double velAtual = scanner.nextDouble();

        System.out.println("Esta em qual marcha?");
        int numMarcha = scanner.nextInt();
        
        Carro carro = new Carro(modelo, marca,velMax,velAtual,2004, true, "preto", 2 , proprietario, 4, true, numMarcha);
        
        int opcao;
        do{
        System.out.println("\n-----------\nMENU:\n1.acelerar 1km/h\n2.reduzir para 0km/h\n3. trocar marcha\n4.reduzir uma marcha\n5.sair\n----------");
        opcao  = scanner.nextInt();
       
        switch(opcao){
            case 1:
                carro.acelerar();
                break;
            case 2:
                carro.frear();
                break;
            case 3:
                System.out.println("Quer colocar em qual marcha?");
                int marcha = scanner.nextInt();
                carro.trocarMarcha(marcha);
                break;
            case 4:
                carro.reduzirMarcha();
                break;
            case 5:
                return;
        }
        }while(opcao != 5);
        scanner.close();
    }

    // Método para converter uma String no formato "dd/mm/aaaa" para um objeto Calendar
    private static Calendar converterStringParaCalendar(String dataStr) {
        String[] partes = dataStr.split("/");
        int dia = Integer.parseInt(partes[0]);
        int mes = Integer.parseInt(partes[1]) - 1; // Mês começa do zero no Calendar
        int ano = Integer.parseInt(partes[2]);

        Calendar calendar = Calendar.getInstance();
        calendar.set(ano, mes, dia);

        return calendar;
    }
}


