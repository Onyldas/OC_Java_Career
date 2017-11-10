package Exercices;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.println("Choisissez un exercice: \n1 :Bonjour monsieur\n2 :Boucles_Tableaux\n3 :Dessins_Concole\n4 :Plus ou moins");
        int choix = sc.nextInt();
        switch(choix) {
        case 1:
            Exercices exo = new Exo1();
            exo.descris_toi();
            break;
        case 2:
            Exercices exo2 = new Exo2();
            exo2.descris_toi();
            break;
        case 3:
            Exercices exo3 = new Exo3();
            exo3.descris_toi();
            break;
        case 4:
            Exercices exo4 = new Exo4();
            exo4.descris_toi();
        }

        sc.close();
    }
}
