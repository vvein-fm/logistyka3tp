abstract class Logistyka {
    protected abstract Paczka stworzPaczke();

    public void przygotujIWydaj() {
        Paczka nowaPaczka = stworzPaczke();
        System.out.println("--- Przygotowywanie paczki ---");
        nowaPaczka.wyslij();
        System.out.println("--- Paczka została wysłana ---");
    }
}