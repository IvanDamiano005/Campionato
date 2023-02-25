import java.util.Date;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author utente
 */
public class Partita {
    private char girone;
    private int giornata;
    private Date data;
    private String squadraCasa;
    private String squadraOspite;
    private int golCasa;
    private int golOspiti;

    public Partita(char girone, int giornata, Date data, String squadraCasa, 
            String squadraOspite, int golCasa, int golOspiti) {
        this.girone = girone;
        this.giornata = giornata;
        this.data = data;
        this.squadraCasa = squadraCasa;
        this.squadraOspite = squadraOspite;
        this.golCasa = golCasa;
        this.golOspiti = golOspiti;
    }

    public char getGirone() {
        return girone;
    }
    
    public int getGiornata() {
        return giornata;
    }

    public Date getData() {
        return data;
    }

    public String getSquadraCasa() {
        return squadraCasa;
    }

    public String getSquadraOspite() {
        return squadraOspite;
    }

    public int getGolCasa() {
        return golCasa;
    }

    public int getGolOspiti() {
        return golOspiti;
    }
    
    // CALCOLI PUNTI PER IL CAMPIONATO
    
    public int puntiCasa(){
        if(golCasa > golOspiti){
            return 3;
        }else if(golCasa == golOspiti){
            return 1;
        }else{
            return 0;
        }
    }
    
    public int puntiOspiti(){
        if(golOspiti > golCasa){
            return 3;
        }else if(golOspiti == golCasa){
            return 1;
        }else{
            return 0;
        }
    }
    
    // CALCOLA I GOL FATTI E SUBITI 
    
    public int golFattiCasa(){
        return golCasa;
    }
    
    public int golFattiOspiti(){
        return golOspiti;
    }
    
    public int golSubitiCasa(){
        return golOspiti;
    }
    
    public int golSubitiOspiti(){
        return golCasa;
    }
}
