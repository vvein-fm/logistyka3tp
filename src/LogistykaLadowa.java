public class LogistykaLadowa extends Logistyka{
    @Override
    protected Paczka stworzPaczke() {
        System.out.println("Paczka zostaje wysłana Lądowo...");
        return new PaczkaLadowa();
    }
}