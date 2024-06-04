public class Kontaktliste {

    Kontakt[] elementen = new Kontakt[10];

    public void hinzufuegen(Kontakt kontakt) {

        boolean eingetroffen = false;
        for (int i =0; i < elementen.length; i++) {
            if (elementen[i] == null) {
                elementen[i] = kontakt;
                eingetroffen = true;
                break;
            }
        }
        if (!eingetroffen) {
            Kontakt[] neueElementen = new Kontakt[elementen.length + 10];
            arrayKopieren(elementen, neueElementen);
            neueElementen[elementen.length] = kontakt;
            elementen = neueElementen;
        }
        }


    public void arrayKopieren(Kontakt[] a, Kontakt[] b) {
        int zahelerB = 0;
        for (int i =0; i < a.length; i++) {
            if (a[i] != null) {
                b[zahelerB] = a[i];
                zahelerB++;
            }
        }
    }

    public void entfernen(Kontakt kontakt) {
        for (int i = 0; i < elementen.length; i++) {
            if (elementen[i] != null) {
                Kontakt zumVergleich = elementen[i];
                if (kontakt.getTelefonnummer().equals(zumVergleich.getTelefonnummer()) &&
                    kontakt.getNachname().equals(zumVergleich.getNachname()) &&
                    kontakt.getVorname().equals(zumVergleich.getVorname())) {
                    elementen[i] = null;
                    break;
                }
            }
        }
    }
}
