import java.util.Scanner;

public class Verwaltung {
    private Scanner scanner;
    private Caesar caesar;

    public static void main(String[] args) {
        new Verwaltung();
    }
        public Verwaltung() {
            scanner = new Scanner(System.in);
            while (true) {
                System.out.println("== HAUPTMENÜ ==");
                System.out.println("[1] Caesar verschluesslen");
                System.out.println("[2] Caesar entschluesseln");
                System.out.println("[0] Beenden");
                int option = scanner.nextInt();
                scanner.nextLine(); // nextInt scannt keine neue Zeile. Ohne diese Anweisung würde das nächste gewollte nextLine nicht funktionieren.
                if (option == 1) {
                    System.out.println("Gib das zu verschlüsselnde Wort an:");
                    String zeichenkette = scanner.nextLine();
                    System.out.println("Gib den Schlüssel an");
                    String schluesselString = scanner.nextLine();
                    int schluessel = Integer.parseInt(schluesselString);
                    caesar = new Caesar();
                    this.caesar.setKt(zeichenkette);
                    this.caesar.setS(schluessel);
                    System.out.println("========Klartext=======");
                    System.out.println(this.caesar.getKt());
                    this.caesar.verschluesseln();
                    System.out.println("=======Geheimtext=======");
                    System.out.println(this.caesar.getGt());

                } else if (option == 2) {
                    // this.sendMessage();
                    this.caesar.entschluesseln();
                    System.out.println(this.caesar.getKt());
                }
                else if (option == 0) {
                    break;
                }
                System.out.println();
            }
        }
    }

}




















