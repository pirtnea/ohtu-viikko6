package ohtu;

import javax.swing.JTextField;

public class Erotus implements Komento {

    private Sovelluslogiikka sovelluslogiikka;
    private JTextField syotekentta;
    private JTextField tuloskentta;
    private int edellinen;

    public Erotus(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovelluslogiikka = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.edellinen = 0;
    }
    
    @Override
    public void suorita() {
        int luku = Integer.parseInt(syotekentta.getText());
        sovelluslogiikka.miinus(luku);
        edellinen = luku;
        tuloskentta.setText("" + sovelluslogiikka.tulos());
    }
    
    @Override
    public void peru() {
        sovelluslogiikka.plus(edellinen);
        tuloskentta.setText("" + sovelluslogiikka.tulos());
    }
}
