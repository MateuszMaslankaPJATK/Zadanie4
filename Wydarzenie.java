class Wydarzenie {
    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc;
    private int dostępneMiejsca;
    private double cena;

    public Wydarzenie(String nazwa, double cena) {
        this(nazwa, cena, "Nieznana data", "Nieznane miejsce", 100);
    }

    public Wydarzenie(String nazwa, double cena, String data) {
        this(nazwa, cena, data, "Nieznane miejsce", 100);
    }

    public Wydarzenie(String nazwa, double cena, String data, String miejsce) {
        this(nazwa, cena, data, miejsce, 100);
    }

    public Wydarzenie(String nazwa, double cena, String data, String miejsce, int maxLiczbaMiejsc) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.data = data;
        this.miejsce = miejsce;
        this.maxLiczbaMiejsc = maxLiczbaMiejsc;
        this.dostępneMiejsca = maxLiczbaMiejsc;
    }

    public boolean zarezerwujMiejsce() {
        if (dostępneMiejsca > 0) {
            dostępneMiejsca--;
            return true;
        }
        return false;
    }

    public String toString() {
        return "Wydarzenie: " + nazwa + ", Data: " + data + ", Miejsce: " + miejsce + ", Cena: " + cena + " zł, Dostępne miejsca: " + dostępneMiejsca;
    }

    public void setCena(double nowaCena) {
        this.cena = nowaCena;
    }

    public double getCena() {
        return cena;
    }

    public String getNazwa() {
        return nazwa;
    }
}