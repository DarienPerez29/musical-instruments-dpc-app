
package instrumusica.lists;

import java.util.ArrayList;
import instrumusica.elements.Datos;

/**
 *
 * @author dapec
 */
public class ListaDatos {
    private ArrayList<Datos> dataList;
    
    public ListaDatos(){
        this.dataList = new ArrayList<>();
    }//end constructor
    
    //MÉTODOS PROPIOS DE LA LISTA
    public void addData(Datos data){
        this.dataList.add(data);
    }//end addDatos
    
    public Datos getData(int index){
        return this.dataList.get(index);
    }//end getDatos
    
    public int sizeDataList(){
        return this.dataList.size();
    }//end sizeListaDatos
    
    //MÉTODOS PROPIOS Y/O NUEVOS
    
}//end class