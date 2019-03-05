/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * Kevin Loarca 0901-17-11573
 */
public class Parcial1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String Matriz[][];
	Matriz=new String[11][5];
        String SPrecio,SCantidad,STotalAsociado; //declaramos variables
        float I_precio,I_Cantidad,I_TotalAsociado;
        Scanner Entrada = new Scanner(System.in);
        
   
            for(int i=1; i<11; i++){
               Matriz[i][1]=JOptionPane.showInputDialog(null,"Ingrese Nombre del Producto "+ i+ ": ");
             
               I_precio=(int) (1+(Math.random())*250);
               SPrecio=Integer.toString((int) I_precio);
               Matriz[i][2]=SPrecio;
               
               I_Cantidad=(int) (1+(Math.random())*500);
               SCantidad=Integer.toString((int) I_Cantidad);
               Matriz[i][3]=SCantidad;
               
               I_TotalAsociado=I_Cantidad*I_precio;
               STotalAsociado=Integer.toString((int) I_TotalAsociado);
               Matriz[i][4]=STotalAsociado;
            }
            
            System.out.print("Nombre\t\t\tPrecio\t\tCantidad\tTotal Asociado");
            for(int j=1; j<=10; j++){
                System.out.print("\n"+Matriz[j][1]+"\t\t\t"+Matriz[j][2]+"\t\t"+Matriz[j][3]+"\t\t"+Matriz[j][4]+"");
            }
            
               
            
        
    }


    
}
