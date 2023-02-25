import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Perre
 */
public class Campionato {
    private Partita[] matches = new Partita[300];
    File file = new File("partite.dat");
    Partita partita;
     
     
    // COSTRUTTORE
    public Campionato(Partita[] matches){
        this.matches = matches;
    }
     
    // Create, Read, Update, Delete
    public void create(char girone, int giornata, Date data, String squadraCasa, 
            String squadraOspite, int golCasa, int golOspiti) throws FileNotFoundException, IOException{
        Partita nuovaPartita = new Partita(girone, giornata, data, squadraCasa, squadraOspite, golCasa, golOspiti);
         
        // SCRIVO LA NUOVA PARTITA SUL FILE
        FileOutputStream fout = new FileOutputStream(file, true);
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(nuovaPartita);
    }
    
    public void read() throws FileNotFoundException, IOException{
        FileInputStream fin = new FileInputStream("partite.dat");
        ObjectInputStream in = new ObjectInputStream(fin);
        char girone = in.readChar();
        int giornata = in.readInt();
        Date data = new Date(in.readLong());
        String squadraCasa = in.readUTF();
        String squadraOspite = in.readUTF();
        int golCasa = in.readInt();
        int golOspiti = in.readInt();
    }
    
    public void update(int indice, char girone, int giornata, Date data, String squadraCasa,
            String squadraOspite, int golCasa, int golOspiti) throws FileNotFoundException, IOException{
        Partita updatePartita = matches[indice];
        updatePartita = new Partita(girone, giornata, data, squadraCasa, squadraOspite, golCasa, golOspiti);
        
        //AGGIORNO LE PARTITE NEL FILE
        FileOutputStream fout = new FileOutputStream(file, true);
        ObjectOutputStream out = new ObjectOutputStream(fout);
        out.writeObject(updatePartita);
    }
    
    public void delete(int indice){
        matches[indice] = null;
    }
    
    // CALCOLI CLASSIFICA
    Map<String, Integer> punti = new HashMap<>();
    Map<String, Integer> golFatti = new HashMap<>();
    Map<String, Integer> golSubiti = new HashMap<>();
    for (Partita partita: partite) {
        String squadraCasa = partita.getSquadraCasa();
        String squadraOspite = partita.getSquadraOspite();
        int puntiCasa = partita.puntiCasa();
        int puntiOspite = partita.puntiOspiti();
        int golFattiCasa = partita.golFattiCasa();
        int golFattiOspite = partita.golFattiOspiti();
        int golSubitiCasa = partita.golSubitiCasa();
        int golSubitiOspite = partita.golSubitiOspiti();
    }
}
