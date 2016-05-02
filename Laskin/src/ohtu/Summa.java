package ohtu;

import javax.swing.JTextField;

public class Summa implements Komento {

    private Sovelluslogiikka sovelluslogiikka;
    private JTextField syotekentta;
    private JTextField tuloskentta;
    private int edellinen;

    public Summa(Sovelluslogiikka sovellus, JTextField tuloskentta, JTextField syotekentta) {
        this.sovelluslogiikka = sovellus;
        this.tuloskentta = tuloskentta;
        this.syotekentta = syotekentta;
        this.edellinen = 0;
    }
    
    @Override
    public void suorita() {
        int luku = Integer.parseInt(syotekentta.getText());
        sovelluslogiikka.plus(luku);
        edellinen = luku;
        tuloskentta.setText("" + sovelluslogiikka.tulos());
    }
    
    @Override
    public void peru() {
        sovelluslogiikka.miinus(edellinen);
        tuloskentta.setText("" + sovelluslogiikka.tulos());
    }
}
