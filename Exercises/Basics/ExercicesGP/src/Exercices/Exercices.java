package Exercices;

import java.util.Scanner;

public abstract class Exercices {
    public String description;
    Scanner sc;

    public Exercices() {
        this.sc = new Scanner(System.in);
    }

    public void descris_toi() {
        System.out.println(this.description);
    }
}
