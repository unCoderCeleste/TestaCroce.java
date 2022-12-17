/*
Esercizio 4
Scriviamo un applicazione che visualizzi su un numero di 20 lanci:
T se esce testa e C se esce croce.
Contare quante volte è uscita testa e quante volte croce.
Si può implementare il programma inserendo le T e le C
in un array di 20 elementi che contiene i singoli caratteri (T e C)
*/
import java.util.Scanner;
public class TestaCroce {
    public static void main(String[] args) {
        Scanner sorte= new Scanner(System.in);
        System.out.println("TESTA O CROCE");
        System.out.print("Inserisci la quantità di lanci da fare: ");
        int quant= sorte.nextInt();
        char[] teoCro = new char[quant];
        int lancio;
        char toc;
        int conTest=0, conCro=0;
        System.out.println();

        for (int l = 0; l<quant; l++) {
            lancio = (int) (Math.random() * quant) + 1;
            if (lancio%2 == 0) {
                toc = 'T';
                conTest++;
            } else {
                toc = 'C';
                conCro++;
            }
            teoCro[l] = toc;
            System.out.print(teoCro[l] + "\t");
        }
        System.out.print("\n\nTesta è uscita: " +conTest +" volte." +"\nCroce è uscita: " +conCro +" volte.\n");
    }
}