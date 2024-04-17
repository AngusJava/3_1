import java.util.Scanner;

//program ktory wygeneruje kwadrat 10x10 z wybranego znaku
public class kwadracikznakowy {
  public static void main(String[] args) {

    System.out.println("Podaj szerokośc kwadratu: ");
    Scanner szerokosc = new Scanner(System.in);
    int szerokosc_Pobieranie = szerokosc.nextInt();

    System.out.println("Podaj dlugosc kwadratu: ");
    Scanner dlugosc = new Scanner(System.in);
    int dlugosc_Pobieranie = dlugosc.nextInt();

    System.out.println("Podaj z jakiego znaku ma byc zrobione ");
    Scanner znak = new Scanner(System.in);
    char znak_Pobieranie = znak.next().charAt(0);

    // Pętla robi znak od góry do dołu od 1 do szerokości
    for (int i = 0; i < szerokosc_Pobieranie; i++) {
      // petla robi znaki obok w dlugosci i odziela je specją
      for (int j = 0; j < dlugosc_Pobieranie; j++) {
        System.out.print(znak_Pobieranie + " ");
      }
      System.out.println();
    }
  }
}
