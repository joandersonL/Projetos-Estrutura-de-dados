package projeto.pkg7;

import static projeto.pkg7.Aa.*;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Projeto7 {
       public static void main(String[] args) {
           
           //Icon figura = new ImageIcon (getToolkit().createImage(getClass().getResource("/download.png"))); 
           Random gerador = new Random();
           Aa a = null;
           new Fenetre(a,"teste");
           while(true){
                String numero = JOptionPane.showInputDialog("Digite o numero"); 
                int num;
                try{
                    num = Integer.parseInt(numero);
                    a = insereECorrigeRaiz(a, num);
                    new Fenetre(a,"Arvore AA");
                }catch(Exception e){
                   break;
                }
                //int num = input.nextInt();
               
           }
           if(testeArvoreAa(a)){
               JOptionPane.showMessageDialog(null,"Essa arvore é uma arovore AA","",JOptionPane.INFORMATION_MESSAGE);
           }else{
               JOptionPane.showMessageDialog(null,"Essa arvore não é uma arovore AA","",JOptionPane.OK_OPTION);
            }
           //new Fenetre(a,"teste");
        
       }
}
