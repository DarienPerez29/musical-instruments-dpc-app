
package instrumusica;

import java.io.IOException;
import instrumusica.elements.Datos;
import instrumusica.managers.ManejadorListaDatos;
import instrumusica.tools.FileActions;
import java.util.Scanner;

/**
 *
 * @author dapec
 */
public class InstrumentosMusicales {
    
    public static void main(String[] args) {        
        Datos dataIn = new Datos();
        boolean insert = true;
        
        try{
            dataIn.setMarca("Yamaha");
            dataIn.setModelo("PAC012RM");
            dataIn.setClase("Cuerdas");
            dataIn.setTipo("Guitarra");
            dataIn.setSubtipo("Eléctrica");
            dataIn.setColor("Rojo");
            dataIn.setPrecio(4420.00);
            dataIn.setMateriales("Agathis");
            dataIn.setPeso(6500.00);
            dataIn.setDimensiones("L:110cm x A:45cm x H:7cm");
            dataIn.setPaisFab("Mexico"); 
        }//end try
        catch(Exception e){
            System.out.println("!!! Error con los tipos de datos de tu información !!!");
            System.out.println("\tVerifica que los tipos de datos sean válidos\nERROR: " 
                    + e.getMessage() + "\n");
            insert = false;
        }//end catch
        
        //Ruta dinámica predeterminada
        FileActions file = new FileActions("src\\extResources\\InstrumentosMusicales.csv");
        
        if(insert){
            try {
                file.fillFile(dataIn.toStringArchivoCSV() + "\n");
                System.out.println(">>>El instrumento se ha registrado exitosamente<<<");
            }//end try
            catch(IOException ioe) {
                System.out.println("!!! Error al registrar el instrumento !!!\nERROR: " 
                        + ioe.getMessage());
            }//end catch
        }//end if
        
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");
        
        ManejadorListaDatos manager = new ManejadorListaDatos();
        try {
            manager.fillListWithFile(file.getPathFile());
            System.out.println("\t  IMPRESIÓN DE INSTRUMENTOS");
            if(manager.printList() == "" || manager.printList() == null){
                System.out.println("\t\t[LISTA VACÍA]\n");
            }//end if
            else{
                System.out.println("\n" + manager.printList());
            }//end else
            
        }//end try
        catch (IOException ioe) {
            System.out.println("!!! Error en la lectura del archivo !!!\nERROR: " 
                    + ioe.getMessage());
        }//end catch
        
    }//end main
    
}//end main class