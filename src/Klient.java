public class Klient {
    public static void main(String[] args) {
        // Klient używa logistyki Lądowej
        Logistyka pierwszaLogistyka = new LogistykaLadowa();
        System.out.println("Klient wybiera Logistykę Lądową.");
        pierwszaLogistyka.przygotujIWydaj();

        System.out.println("\n--------------------------\n");

        // Klient używa logistyki lądowej
        Logistyka drugaLogistyka = new LogistykaMorska();
        System.out.println("Klient wybiera Logistykę Morską.");
        drugaLogistyka.przygotujIWydaj();

        System.out.println("\n--------------------------\n");

        // Klient używa logistyki InPost
        Logistyka trzeciaLogistyka = new LogistykaInpost();
        System.out.println("Klient wybiera wysyłkę poprzez InPost.");
        trzeciaLogistyka.przygotujIWydaj();
    }
}