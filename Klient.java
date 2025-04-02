import java.util.ArrayList;
import java.util.List;

class Klient {
    private String imie;
    private String nazwisko;
    private String email;
    private List<Wydarzenie> listaRezerwacji;

    public Klient(String imie, String nazwisko, String email) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.email = email;
        this.listaRezerwacji = new ArrayList<>();
    }

    public void dodajRezerwacje(Wydarzenie wydarzenie) {
        listaRezerwacji.add(wydarzenie);
    }

    public void anulujRezerwacje(Wydarzenie wydarzenie) {
        listaRezerwacji.remove(wydarzenie);
    }

    public void wyswietlRezerwacje() {
        System.out.println("Rezerwacje klienta " + imie + " " + nazwisko + ":");
        for (Wydarzenie w : listaRezerwacji) {
            System.out.println(w);
        }
    }

    public String getNazwisko() {
        return nazwisko;
    }
}