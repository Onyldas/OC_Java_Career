package Exercices;

public class Exo2 extends Exercices {
  public Exo2() {
    description = "2-- Choisissez un exercice: \n1: Somme tableau une dimension \n2: Somme tableau multidimensionnel \n3: Tri Tableau";
  }
  
  public int SommeTab(int[] tab)
  {
    int somme = 0;
    for (int i : tab)
    {
      somme += i;
    }
    return somme;
  }
  
  public int SommeTab2(int[][] tab)
  {
    int somme = 0;
    for (int[] i : tab)
    {
      for (int j : i)
      {
        somme += j;
      }
    }
    return somme;
  }
  
  public void AffichageTab(int[] tab)
  {
    System.out.print("{");
    for (int ligne : tab)
    {
      System.out.print(ligne + ",");
    }
    System.out.println("}");
  }
  
  public void AffichageTab2(int[][] tab)
  {
    System.out.print("{");
    for (int[] ligne : tab)
    {
      for (int colonne : ligne)
      {
        System.out.print(colonne + ",");
      }
      System.out.println();
    }
    System.out.println("}");
  }
  
  public int[] TriTab(int[] tab)
  {
    int[] tab2 = tab;
    for (int i = 1; i <= tab2.length - 1; i++)
    {
      for (int j = 0; j <= tab2.length - 2; j++)
      {
        if (tab2[(j + 1)] < tab2[j])
        {

          int temp = tab2[j];
          tab2[j] = tab2[(j + 1)];
          tab2[(j + 1)] = temp;
        }
      }
    }
    return tab2;
  }
  
  public void descris_toi()
  {
    super.descris_toi();
    int choix = sc.nextInt();
    Exo2 exo = new Exo2();
    switch (choix)
    {
    case 1: 
      System.out.println("Exemple de Tableau : {7,1,8,5,4}");
      int[] tab = { 7, 1, 8, 5, 4 };
      System.out.println(exo.SommeTab(tab));
      break;
    
    case 2: 
      System.out.println("Exemple de Tableau : {{7,1,8,5,4},{3,9,2,0,6}}");
      int[][] tab2 = { { 7, 1, 8, 5, 4 }, { 3, 9, 2, 0, 6 } };
      System.out.println(exo.SommeTab2(tab2));
      break;
    
    case 3: 
      System.out.println("Exemple de Tableau : {7,1,8,5,4}");
      int[] tab3 = { 7, 1, 8, 5, 4 };
      exo.AffichageTab(exo.TriTab(tab3));
    }
  }
}