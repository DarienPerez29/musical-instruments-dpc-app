
package instrumusica.managers;

import java.io.IOException;
import java.util.ArrayList;
import instrumusica.elements.Datos;
import instrumusica.lists.ListaDatos;
import instrumusica.tools.FileActions;
/**
 *
 * @author dapec
 */
public class ManejadorListaDatos {
    private ListaDatos dataList;
    
    public ManejadorListaDatos(){
        this.dataList = new ListaDatos();
    }//end constructor
    
    public void fillListWithFile(String pathFile) throws IOException{
        FileActions file = new FileActions(pathFile);
        ArrayList<String> fileRows = file.getFileRows();
        Datos datumIn;
        String[] units;
        
        for(int i = 0; i < fileRows.size(); i++) {
            units = fileRows.get(i).split(",");
            datumIn = new Datos();
            datumIn.setMarca(units[0]);
            datumIn.setModelo(units[1]);
            datumIn.setClase(units[2]);
            datumIn.setTipo(units[3]);
            datumIn.setSubtipo(units[4]);
            datumIn.setColor(units[5]);
            datumIn.setPrecio(Double.parseDouble(units[6]));
            datumIn.setMateriales(units[7]);
            datumIn.setPeso(Double.parseDouble(units[8]));
            datumIn.setDimensiones(units[9]);
            datumIn.setPaisFab(units[10]);
            
            this.dataList.addData(datumIn);
        }//end for llenar dataList
    }//end fillListWithFile
    
    public String printList(){
        String temp = "";
        for(int i = 0; i < this.dataList.sizeDataList(); i++) {
            temp += "|================ INSTRUMENTO " + (i+1) + " ================|\n" 
                    + this.dataList.getData(i).toString() + "\n";
        }//end for recorrer lista
        
        return temp;
    }//end printList
    
}//end main class
