package trabalhosignos;

import java.util.Scanner;
import java.util.Calendar;

//importação de ferramentas
public class TrabalhoSignos {

    public static void main(String[] args) {

        Calendar hoje = Calendar.getInstance();
        Scanner ler = new Scanner(System.in);
        String nome;
        int sexo, dia, mes, ano, sorte, corN, diaA, mesA, anoA, idade;
        diaA = hoje.get(Calendar.DATE);
        mesA = hoje.get(Calendar.MONTH) + 1;
        anoA = hoje.get(Calendar.YEAR);
        sorte = 1 + (int) (Math.random() * 999);
        corN = 1 + (int) (Math.random() * 10);
        String signo, cor = null;
// decidi usar uma váriavel para o numero da sorte para reduzir
        //definição de váriaveis
        System.out.println("Informe seu nome: ");
        nome = ler.nextLine();
        if (nome.length() < 8) {
            System.out.println("Nome inválido, minimo 8 letras.");
            return;
        }
        System.out.println("Informe seu sexo 1 para feminino, 2 para masculino ou 3 para outros");
        sexo = ler.nextInt();
        if (sexo > 3 || sexo < 1) {
            System.out.println("Opção inválida");
            return;
        }
//3 opções de sexo só porque quis ser inclusivo :^
        System.out.println("Informe o dia que nasceu: ");
        dia = ler.nextInt();
        if (dia < 1 || dia > 31) {
            System.out.println("O mês ainda continua tendo até 31 dias o bocó!");
            return;
        }
        System.out.println("Informe o mês que nasceu: ");
        mes = ler.nextInt();
        if (mes < 1 || mes > 12) {
            System.out.println("Mês informado inválido");
            return;
            // tinha uma piadinha aqui, removi pra fica profissonal '-'
        } else if ((mes == 2 && dia > 29) || ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia > 30)) {
            System.out.println("Dia do mês inválido");
            return;
        }
// verificador de dia do meses que possuem 30 dias
        System.out.println("Informe o ano que nasceu: ");
        ano = ler.nextInt();

        if (ano < 1900 || ano > anoA) {
            System.out.println("Ano informado inválido");
            return;
        } else if (mes == 2 && dia == 29) {
            if ((ano % 400 == 0) || (ano % 4 == 0 && ano % 100 != 0)) {
            } else {
                System.out.println("Ano informado não é bissexto");
                return;
            }
            //verificador de ano bissexto, receba a inteligência!
        }
//entrada de dados
/* poderia ter feito tudo em um ifzão em vez de dividir em vários? Sim, mas
preferi fazer assim para matar guerra de uma vez, e também meio que por desing?
Pois já informa o que está errado ao colocar os seus dados, e também não
frustar o usuário, ja lhe informa do seu erro logo de cara, acredito que ficou
 okay? deve ter alguma forma de fazer tudo em um ifzão e informa o erro que
cometeu? deve existir, mas não possuo tal conhecimento :/ */
        idade = anoA - ano;
        if (mes > mesA || (mes == mesA && diaA < dia)) {
            idade--;
        }

        if ((mes == 3 && dia >= 21) || (mes == 4 && dia <= 20)) {
            signo = "Áries";
        } else if ((mes == 4 && dia >= 21) || (mes == 5 && dia <= 20)) {
            signo = "Touro";
        } else if ((mes == 5 && dia >= 21) || (mes == 6 && dia <= 20)) {
            signo = "Gêmeos";
        } else if ((mes == 6 && dia >= 21) || (mes == 7 && dia <= 22)) {
            signo = "Câncer";
        } else if ((mes == 7 && dia >= 23) || (mes == 8 && dia <= 22)) {
            signo = "Leão";
        } else if ((mes == 8 && dia >= 23) || (mes == 9 && dia <= 22)) {
            signo = "Virgem";
        } else if ((mes == 9 && dia >= 23) || (mes == 10 && dia <= 22)) {
            signo = "Libra";
        } else if ((mes == 10 && dia >= 23) || (mes == 11 && dia <= 21)) {
            signo = "Escorpião";
        } else if ((mes == 11 && dia >= 22) || (mes == 12 && dia <= 21)) {
            signo = "Sagitário";
        } else if ((mes == 12 && dia >= 22) || (mes == 1 && dia <= 19)) {
            signo = "Capricórnio";
        } else if ((mes == 1 && dia >= 20) || (mes == 2 && dia <= 18)) {
            signo = "Aquário";
        } else {
            signo = "Peixes";
        }

        switch (corN) {
            case 1:
                cor = "Azul!";
                break;
            case 2:
                cor = "Vermelho!";
                break;
            case 3:
                cor = "Branco!";
                break;
            case 4:
                cor = "Preto!";
                break;
            case 5:
                cor = "Amarelo!";
                break;
            case 6:
                cor = "Verde!";
                break;
            case 7:
                cor = "Marrom!";
                break;
            case 8:
                cor = "Violeta!";
                break;
            case 9:
                cor = "Rosa!";
                break;
            case 10:
                cor = "Cinza!";
                break;
            default:

        }
        //era possível usar o if e else para definir a cor, utilizei o switch case para deixar mais limpo o código
        //processamento de dados

        if (sexo == 1) {
            System.out.println("Sra. " + nome + " nascida em " + dia + "/" + mes + "/" + ano + ", é do signo " + signo + ". Você tem " + idade + " anos. Seu numero da sorte é " + sorte + ". E sua cor da sorte é " + cor);
        } else {
            System.out.println("Sr. " + nome + " nascido em " + dia + "/" + mes + "/" + ano + ", é do signo " + signo + ". Você tem " + idade + " anos. Seu numero da sorte é " + sorte + ". E sua cor da sorte é " + cor);
        }
//saída de dados
//pensei em utilizar Math.random direto na saída de dados, só faria peso
//poderia ter usado o switch case nesse caso para fins de clareza
    }

}
