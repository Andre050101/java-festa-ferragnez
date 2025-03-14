package com.ferragnez.party;
import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args) {
        String[] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Benvenuto alla festa dei ferragnez! Qui verifichiamo che siate in lista per entrare. Come ti chiami?");
        String name = in.nextLine();

        in.close();
        
        boolean invited = false;
        //Ricerca con ciclo for
        for(int i = 0; i < invitati.length; i++){
            if(invitati[i].toLowerCase().replaceAll("\\s+", "").equals(name.toLowerCase().replaceAll("\\s+", ""))){
                invited = true;
                break;
            }
        }
        //con ciclo while
        int cont = 0;
        while(invited == false && cont < invitati.length){
            if(invitati[cont].toLowerCase().replaceAll("\\s+", "").equals(name.toLowerCase().replaceAll("\\s+", ""))){
                invited = true;
            }
            cont++;
        }

        //Risposta
        if(invited == true)
            System.out.println("Risulti nella lista, puoi entrare, divertiti e mangia più pandoro possibile");
        else
            System.out.println("Non risulti nella lista, ci dispiace ma non puoi entrare");
    }
}
