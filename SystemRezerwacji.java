import java.util.ArrayList;
import java.util.List;

class SystemRezerwacji {
    private List<Wydarzenie> listaWydarzen;
    private List<Klient> listaKlientow;

    public SystemRezerwacji() {
        listaWydarzen = new ArrayList<>();
        listaKlientow = new ArrayList<>();
    }

    public void dodajWydarzenie(Wydarzenie wydarzenie) {
        listaWydarzen.add(wydarzenie);
    }

    public void dodajKlienta(Klient klient) {
        listaKlientow.add(klient);
    }

    public Wydarzenie znajdzWydarzenie(String nazwa) {
        for (Wydarzenie w : listaWydarzen) {
            if (w.getNazwa().equalsIgnoreCase(nazwa)) {
                return w;
            }
        }
        return null;
    }

    public Klient znajdzKlienta(String nazwisko) {
        for (Klient k : listaKlientow) {
            if (k.getNazwisko().equalsIgnoreCase(nazwisko)) {
                return k;
            }
        }
        return null;
    }

    public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie) {
        if (wydarzenie.zarezerwujMiejsce()) {
            klient.dodajRezerwacje(wydarzenie);
        } else {
            System.out.println("Brak dostępnych miejsc na to wydarzenie!");
        }
    }
}