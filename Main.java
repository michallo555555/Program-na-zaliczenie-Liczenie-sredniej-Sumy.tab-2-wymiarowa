import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Z dodatnich liczb policzona zostaje srednia arytmetyczna, zas z ujemnych ich suma. Wpisanie 0 powoduje wypisanie sumy oraz sredniej ");
    int[][] tablica=new int[3][3];
    Scanner scan = new Scanner(System.in);
    int liczba=scan.nextInt();
    int i=0;
    int j=0;
    int suma=0;
    int podziel=0;
    int sumaplus=0;
    int srednia;
    while(liczba!=0)
      {
        while(j<3&&liczba!=0)
          {
            tablica[i][j]=liczba;
            liczba=scan.nextInt();
            j++;
          }
        i++;
        j=0;
      }
    for(int k=0;k<3;k++)
      {
        for(int l=0;l<3;l++)
          {
            if(tablica[k][l]>0)
            {
              sumaplus=sumaplus+tablica[k][l];
              podziel++;
            }else
            {
              suma=suma+tablica[k][l];
            }
          }
      }
    System.out.println("Suma ujemnych: "+suma);
    srednia=sumaplus/podziel;
    System.out.println("Średnia dodatnich: "+srednia);
  }
}