package boletin17;

import javax.swing.JOptionPane;


public class Programacion {
    
    
    public void calcularNota(){
        int i = 0;
        
        while(i == 0){
            int boletinestotal;
            String primn = JOptionPane.showInputDialog("Dime la primera nota");
            float primn1 = Integer.parseInt(primn);
        
            String segunn = JOptionPane.showInputDialog("Dime la segunda nota");
            float segunn2 = Integer.parseInt(segunn);
        
            float notateorico = (primn1+segunn2)/2;
        
             float notateorico2 = (notateorico*40)/100;
        
        
        
            String notap = JOptionPane.showInputDialog("Dime la nota practica");
            float notapractica = Integer.parseInt(notap);
            float notapractica2 = (notapractica*40)/100;
        
            String boletinese = JOptionPane.showInputDialog("Dime cuantos boletines ah entregado");
            float boletinesen = Integer.parseInt(boletinese);
        
            if((boletinesen/20)*100 > 90){
               boletinestotal = 2;
            }
            else if ((boletinesen/20)*100 < 70){
                boletinestotal = 0;
            }
            else{
                boletinestotal = 1;
            }

            System.out.println("Probas teóricas: " + notateorico + "\nProbas práctica: " + notapractica + "\nBoletins: " + boletinestotal + "\nNota total: " + (notateorico2+notapractica2+boletinestotal) );

            String alumno = JOptionPane.showInputDialog("Desexas calcular otra nota?");
            String alumno2 = alumno.toLowerCase();
            if (alumno2.equals("no") || alumno2.equalsIgnoreCase("0") ){
                i++;
                System.out.println("Tenga un buen dia");
            }
            else{
                System.out.println("Siguientee");
            }
        
           
        }
    }
    
    
}
