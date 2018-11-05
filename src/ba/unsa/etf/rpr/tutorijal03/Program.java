package ba.unsa.etf.rpr.tutorijal03;

import java.util.Scanner;
import java.util.Set;

public class Program {
    public static Scanner ulaz = new Scanner(System.in);

    public static void main(String[] args) {
        String broj, ime, drzava, grad, slovo;
        Imenik imenik = new Imenik();
        int a, b, brojMobitela;
        boolean x, y;
        x = true;
        while (x) {
            System.out.println("Odaberite funkciju: \n 1. Unos broja novog korisnika \n 2. Broj postojećeg korisnika \n " +
                    "3. Ime postojećeg korisnika \n 4. Imena korisnika iz nekog grada  \n " +
                    "5. Brojevi korisnika iz nekog grada \n 6. Pretraživanje po početnom slovu.\n " +
                    "7. Izlaz \n");
            a = ulaz.nextInt();
            if (a == 7) {
                break;
            }
            switch (a) {
                case 1:
                    y = true;
                    while (y) {
                        System.out.print("Za unos korisnika fiksne mreže unesite broj 0\nZa unos korisnika mobilne mreže" +
                                " unesite broj 1\nZa unos korisnika međunarodne mreže 2\nZa izlaz unesite broj 3\n");
                        b = ulaz.nextInt();
                        if (b == 3) {
                            break;
                        }
                        switch (b) {
                            case 0:
                                System.out.print("Unesite grad: ");
                                grad = ulaz.next();
                                FiksniBroj.Grad grad1 = FiksniBroj.Grad.valueOf(grad.toUpperCase());
                                System.out.print("Unesite broj: ");
                                ulaz.nextLine();
                                broj = ulaz.nextLine();
                                System.out.print("Unesite ime: ");
                                ime = ulaz.nextLine();
                                imenik.dodaj(ime, new FiksniBroj(grad1, broj));
                                break;
                            case 1:
                                System.out.print("Unesite mobilnu mrežu: ");
                                brojMobitela = ulaz.nextInt();
                                System.out.print("Unesite broj: ");
                                ulaz.nextLine();
                                broj = ulaz.nextLine();
                                System.out.print("Unesite ime: ");
                                ime = ulaz.nextLine();
                                imenik.dodaj(ime, new MobilniBroj(brojMobitela, broj));
                                break;
                            case 2:
                                System.out.print("Unesite pozivni za državu: ");
                                ulaz.nextLine();
                                drzava = ulaz.nextLine();
                                System.out.print("Unesite broj: ");
                                broj = ulaz.nextLine();
                                System.out.print("Unesite ime: ");
                                ime = ulaz.nextLine();
                                imenik.dodaj(ime, new MedunarodniBroj(drzava, broj));
                                break;
                        }
                    }
                    break;
                case 2:
                    System.out.print("Unesite ime korisnika: ");
                    ulaz.nextLine();
                    ime = ulaz.nextLine();
                    broj = imenik.dajBroj(ime);
                    System.out.println(broj);
                    break;
                case 3:
                    System.out.print("Za  korisnika fiksne mreže unesite broj 0, za korisnika mobilne mreže" +
                            " unesite broj 1, za korisnika međunarodne mreže unesite broj 2 \n");
                    b = ulaz.nextInt();
                    switch (b) {
                        case 0:
                            System.out.print("Unesite grad: ");
                            FiksniBroj.Grad grad1 = FiksniBroj.Grad.valueOf(ulaz.next().toUpperCase());
                            System.out.print("Unesite broj: ");
                            ulaz.nextLine();
                            broj = ulaz.nextLine();
                            System.out.println(imenik.dajIme(new FiksniBroj(grad1, broj)));
                            break;
                        case 1:
                            System.out.print("Unesite mobilnu mrežu: ");
                            brojMobitela = ulaz.nextInt();
                            System.out.print("Unesite broj: ");
                            broj = ulaz.nextLine();
                            System.out.println(imenik.dajIme(new MobilniBroj(brojMobitela, broj)));
                            break;
                        case 2:
                            System.out.print("Unesite pozivni za državu: ");
                            drzava = ulaz.next();
                            System.out.print("Unesite broj: ");
                            broj = ulaz.nextLine();
                            System.out.println(imenik.dajIme(new MedunarodniBroj(drzava, broj)));
                            break;
                    }
                    break;
                case 4:
                    System.out.print("Unesite grad: ");
                    FiksniBroj.Grad grad1 = FiksniBroj.Grad.valueOf(ulaz.next().toUpperCase());
                    Set<String> set = imenik.izGrada(grad1);
                    String result = "";
                    for (String ime2 : set) {
                        result += ime2 + ",";
                    }
                    System.out.println(result);
                    break;
                case 5:
                    System.out.print("Unesite grad: ");
                    FiksniBroj.Grad gradNovi = FiksniBroj.Grad.valueOf(ulaz.next().toUpperCase());
                    Set<TelefonskiBroj> set2 = imenik.izGradaBrojevi(gradNovi);
                    String result1 = "";
                    for (TelefonskiBroj ime2 : set2) {
                        result1 += ime2.ispisi() + ",";
                    }
                    System.out.println(result1);
                    break;
                case 6:
                    System.out.print("Unesite slovo: ");
                    ulaz.nextLine();
                    slovo = ulaz.nextLine();
                    char c = String.valueOf(slovo.toUpperCase().charAt(0)).charAt(0);
                    System.out.print(imenik.naSlovo(c));
                    break;
            }
        }
    }
}