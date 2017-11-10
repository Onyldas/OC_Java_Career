package Exercices;

public class Exo3 extends Exercices {
  public Exo3() {
    description = "3-- Choisissez un exercice: \n1: Affichage Carre \n2: Obstacles \n3: Obstacles Aléatoires";
  }
  
  public void Carre()
  {
    System.out.println("Saisissez un nombre entre 1 et 10 :");
    int cote = sc.nextInt();
    if ((cote < 1) || (cote > 10))
    {
      System.out.println("Ce n'est pas un nombre entre 1 et 10.");
    }
    else
    {
      String[][] square = new String[cote][cote];
      for (String[] longueur : square)
      {
        for (String largeur : longueur)
        {
          largeur = "#";
          System.out.print(largeur);
        }
        System.out.println();
      }
    }
  }
  
  public void obstacles()
  {
    System.out.println("Saisissez un nombre entre 3 et 10 :");
    int obstacle = sc.nextInt();
    String[] ligne = new String[100];
    int count = 1;
    for (String str : ligne)
    {
      if (count % obstacle == 0)
      {
        str = "#";
        System.out.print(str);
      }
      else
      {
        str = "_";
        System.out.print(str);
      }
      count++;
    }
  }
  
  public void obstaclesAlea()
  {
    String[] ligne = new String[100];
    int lower = 3;
    int higher = 21;
    
    int nb_obstacles = (int)(Math.random() * (higher - lower)) + lower;
    System.out.println("Il y aura " + nb_obstacles + " obstacles:\n");
    int[] position_alea = new int[nb_obstacles];
    
    for (int i = 0; i < position_alea.length; i++)
    {
      position_alea[i] = ((int)(Math.random() * 100.0D) + 0);
    }
    int j;
    for (int i = 0; i < ligne.length; i++)
    {
      for (j = 0; j < position_alea.length; j++)
      {
        if ((position_alea[j] == i) || (ligne[i] == "#"))
        {
          ligne[i] = "#";
        }
        else
        {
          ligne[i] = "_";
        }
      }
    }
    for (String str : ligne)
    {
      System.out.print(str);
    }
  }
  
  public void descris_toi() {
    super.descris_toi();
    int choix = sc.nextInt();
    Exo3 exo = new Exo3();
    switch (choix)
    {
    case 1: 
      exo.Carre();
      break;
    case 2: 
      exo.obstacles();
      break;
    case 3: 
      exo.obstaclesAlea();
    }
  }
}
