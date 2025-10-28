public class LogistykaInpost extends Logistyka{
    @Override
    protected Paczka stworzPaczke() {
        System.out.println("Paczka zostaje wysłana poprzez Inpost...");
        return new PaczkaInpost();
    }
}