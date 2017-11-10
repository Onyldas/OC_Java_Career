package Exercices;

public class Exo4 extends Exercices {
    public Exo4() {
        this.description = "Plus ou moins ?";
    }

    public void pOm() {
        System.out.println("Choisissez votre niveau de difficulté : \n1 : Easy \n2 : Medium \n3 : Hard");
        int choix = this.sc.nextInt();
        int essais = 0;
        int random = 0;
        switch(choix) {
        case 1:
            System.out.println("Saisissez un nombre entre 1 et 10 :");
            essais = 5;
            random = (int)(Math.random() * 9.0D) + 1;
            break;
        case 2:
            System.out.println("Saisissez un nombre entre 1 et 100 :");
            essais = 8;
            random = (int)(Math.random() * 99.0D) + 1;
            break;
        case 3:
            System.out.println("Saisissez un nombre entre 1 et 1000 :");
            essais = 15;
            random = (int)(Math.random() * 999.0D) + 1;
        }

        int nb;
        for(nb = this.sc.nextInt(); nb != random && essais != 0; nb = this.sc.nextInt()) {
            --essais;
            if (nb > random) {
                System.out.println("C'est moins !");
            } else if (nb < random) {
                System.out.println("C'est plus !");
            }

            System.out.print(" Essaye encore ! Il te reste " + essais + " essais\n");
        }

        if (nb == random) {
            System.out.println("Tu as réussi à trouver le nombre " + random + "!\nBien joué !");
        } else {
            System.out.println("Perdu ! Retente ta chance !");
        }

    }

    public void descris_toi() {
        Exo4 exo = new Exo4();
        exo.pOm();
    }
}
