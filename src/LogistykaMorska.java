public class LogistykaMorska extends Logistyka {
    @Override
    protected Paczka stworzPaczke() {
        System.out.println("Paczka zostanie wysłana morsko");
        return new PaczkaMorska();
    }
}