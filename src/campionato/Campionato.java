package campionato;

import java.time.LocalDate;
import java.text.SimpleDateFormat;

/**
 *
 * @author Perre
 */
public class Campionato {
    private char girone; // DEVE ESSERE 'A' (andata) o 'R' (ritorno)
    private int giornata; // DEVE ESSERE COMPRESO TRA 1 e 5
    private LocalDate data; 
    private String squadraCasa;
    private String squadraOspite;
    private int golCasa; // DEVE ESSERE COMPRESO TRA 0 e 10
    private int golOspite; // DEVE ESSERE COMPRESO TRA 0 e 10

    public Campionato(char girone, int giornata, LocalDate data, String squadraCasa, String squadraOspite, int golCasa, int golOspite) {
        this.girone = girone;
        this.giornata = giornata;
        this.data = data;
        this.squadraCasa = squadraCasa;
        this.squadraOspite = squadraOspite;
        this.golCasa = golCasa;
        this.golOspite = golOspite;
    }

    public char getGirone() {
        return girone;
    }

    public void setGirone(char girone) {
        if(girone != 'A' || girone != 'R'){
            throw new RuntimeException("'girone' non accetta questi parametri");
        }
        this.girone = girone;
    }

    public int getGiornata() {
        return giornata;
    }

    public void setGiornata(int giornata) {
        if(giornata < 0 || giornata > 5){
            throw new RuntimeException("giornata non esistente");
        }
        this.giornata = giornata;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getSquadraCasa() {
        return squadraCasa;
    }

    public void setSquadraCasa(String squadraCasa) {
        this.squadraCasa = squadraCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public void setSquadraOspite(String squadraOspite) {
        this.squadraOspite = squadraOspite;
    }

    public int getGolCasa() {
        return golCasa;
    }

    public void setGolCasa(int golCasa) {
        if(golCasa < 0 || golCasa > 10){
            throw new RuntimeException("parametro errato");
        }
        this.golCasa = golCasa;
    }

    public int getGolOspite() {
        return golOspite;
    }

    public void setGolOspite(int golOspite) {
        if(golOspite < 0 || golOspite > 10){
            throw new RuntimeException("parametro errato");
        }
        this.golOspite = golOspite;
    }
    
    public String toString(){
        return "girone: " + girone + " " + "giornata: " + giornata + " " + "giorno: " + data + " " + "squadra casa: " + squadraCasa + " " + "squadra ospite: " + squadraOspite + " " + "gol casa: " + golCasa + " " + "gol ospite: " + golOspite;
    }
}