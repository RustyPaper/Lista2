package Lista2;

public class Osoba implements Comparable<Osoba> {
    private Long pesel;
    private String imie;
    private String nazwisko;
    private Integer wiek;
    private String adres;
    private Integer priorytet;

    public Osoba(Long pesel, String imie, String nazwisko, Integer wiek, String adres, Integer priorytet) {
        this.pesel = pesel;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.wiek = wiek;
        this.adres = adres;
        this.priorytet = priorytet;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "pesel=" + pesel +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", wiek=" + wiek +
                ", adres='" + adres + '\'' +
                ", priorytet=" + priorytet +
                '}';
    }

    @Override
    public int compareTo(Osoba o) {
        if (priorytet != null && o.priorytet != null)
            return priorytet.compareTo(o.priorytet);
        return 0;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Osoba osoba = (Osoba) o;

        return pesel != null ? pesel.equals(osoba.pesel) : osoba.pesel == null;
    }

    @Override
    public int hashCode() {
        return pesel != null ? pesel.hashCode() : 0;
    }

    public void setPriorytet(Integer priorytet) {
        this.priorytet = priorytet;
    }

    public Long getPesel() {
        return pesel;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public Integer getWiek() {
        return wiek;
    }

    public String getAdres() {
        return adres;
    }

    public Integer getPriorytet() {
        return priorytet;
    }
}
