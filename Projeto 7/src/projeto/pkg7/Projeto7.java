package projeto.pkg7;

import static projeto.pkg7.Aa.*;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Projeto7 {
       public static void main(String[] args) {
           Random gerador = new Random();
           Aa a = null;
           new Fenetre(a,"teste");
           while(true){
               String numero = JOptionPane.showInputDialog("Digite o numero");
               int num;
               if(numero!=null){
                num = Integer.parseInt(numero);
               }else{
                   break;
               }
                //int num = input.nextInt();
               a = insereECorrigeRaiz(a, num);
               
               new Fenetre(a,"asda");
           }
           //new Fenetre(a,"teste");
           
       }
}
