
package instrumusica.tools;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
/**
 *
 * @author dapec
 */
public class FileActions {
    private String pathFile;
    
    public FileActions(){
        this.pathFile = null;
    }//end constructor sin parámetro
    
    public FileActions(String pathFile){
        this.pathFile = pathFile;
    }//end constructor con parámetro
    
    //SETTERS
    public void setPathFile(String pathFile) {
        this.pathFile = pathFile;
    }//end setRutaArchivo
    
    
    //GETTERS
    public String getPathFile() {   
        return pathFile;
    }//end getRutaArchivo
    
    
    //MÉTODOS PRINCIPALES
    public void fillFile(String Data) throws IOException{
        BufferedWriter fill = new BufferedWriter(new FileWriter(this.pathFile, true));
        fill.write(Data);
        fill.close();
    }//end fillFile
    
    public ArrayList<String> getFileRows() throws FileNotFoundException, IOException{
        ArrayList<String> fileRows = new ArrayList<>();
        String readingLine;
        BufferedReader dataFile = new BufferedReader(new FileReader(pathFile));
        while((readingLine=dataFile.readLine()) != null){
            fileRows.add(readingLine);
        }//end while leer datos
        dataFile.close();
        return fileRows;
    }//end getFileRows
}
