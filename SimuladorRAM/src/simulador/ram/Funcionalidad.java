package simulador.ram;

import java.util.ArrayList;

/**
 *
 * @author Andrey
 */
public class Funcionalidad {
    
   public ArrayList <ArrayList> Resultado ;
   
    public Funcionalidad( ArrayList<Comando> Lista) {
           for(int z=0;z<Lista.size();z++){
            ArrayList <String> Temporal = new ArrayList <String>();
            Temporal.add(Lista.get(z).tipoComandoBinario);
            Temporal.add(Lista.get(z).operando1Binario);
            Temporal.add(Lista.get(z).operando2Binario);
            Resultado.add(Temporal);
        }
           
    }
    
}
