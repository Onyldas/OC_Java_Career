package Exercices;

public class Exo1 extends Exercices {
    public Exo1() {
        this.description = "1-- Choisissez un exercice: \n1 :Dis bonjour au monsieur\n2 :Dis bonjour plusieurs fois\n3 :La factorielle\n4 :La factorielle du mot";
    }

    public void dis_bonjour1() {
        System.out.println("Veuillez saisir votre prénom:");
        String prenom = this.sc.nextLine();
        System.out.println("Bonjour " + prenom + " !");
    }

    public void dis_bonjour2() {
        System.out.println("Veuillez saisir votre prénom : ");
        String prenom = this.sc.nextLine();
        System.out.println("Veuillez saisir un nombre : ");
        int nb = this.sc.nextInt();

        for(int i = 0; i < nb; ++i) {
            System.out.println("Bonjour " + prenom + " !");
        }

    }

    public void factorielle(int nb) {
        int k = 1;

        for(int i = 1; i <= nb; ++i) {
            k *= i;
        }

        System.out.println("Factorielle de " + nb + " vaut " + k);
    }

    public void factorielle2() {
        System.out.println("Veuillez écrire un mot :");
        String mot = this.sc.nextLine();
        int nb = mot.length();
        this.factorielle(nb);
    }

    public void descris_toi() {
        super.descris_toi();
        Exo1 exo = new Exo1();
        int choix = this.sc.nextInt();
        switch(choix) {
        case 1:
            exo.dis_bonjour1();
            break;
        case 2:
            exo.dis_bonjour2();
            break;
        case 3:
            System.out.println("Veuillez saisir un nombre entre 1 et 15");
            int nb = this.sc.nextInt();
            if (nb >= 1 && nb <= 15) {
                exo.factorielle(nb);
            } else {
                System.out.println("Ce n'est pas un nombre entre 1 et 15");
            }
            break;
        case 4:
            exo.factorielle2();
            break;
        default:
            System.out.println("Ce n'est pas un exercice.");
        }

    }
}
