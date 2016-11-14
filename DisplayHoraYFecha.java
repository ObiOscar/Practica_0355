
/**
 * Write a description of class DisplayHoraYFecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class DisplayHoraYFecha
{
    // instance variables - replace the example below with your own
    private NumberDisplay hora;
    private NumberDisplay minuto;
    private DisplayDosDigitos dia;
    private DisplayDosDigitos mes;
    private DisplayDosDigitos anno;
    

    /**
     * Constructor for objects of class DisplayHoraYFecha
     */
    public DisplayHoraYFecha()
    {
          hora = new NumberDisplay(24);
          minuto = new NumberDisplay(60);
          dia = new DisplayDosDigitos(31);
          mes = new DisplayDosDigitos(13);
          anno = new DisplayDosDigitos(100);  
    }
    
    /**Disponga de un método llamado avanzarMomento que permita avanzar un minuto el momento temporal.
     Hemos de tener en cuenta que los meses tienen todos 30 días.
     */
     public void avanzarMomento(){
         minuto.increment();  
         if (minuto.getValue() == 0) {
             hora.increment(); 
             
             if (hora.getValue() == 0) {
                 dia.incrementaValor();    
         
                if (dia.getValor() == 1) {
                    mes.incrementaValor();  
                    
                    if (mes.getValor() == 1) {
                        anno.incrementaValor();  
                    }
                 }
             }      
         }
    }
    
    /**Hago la "cerdada" de marcar los limites a mano, en lugar de marcar los limites con una funcion, por falta de tiempo los marco como:
     *    hora = (24);
          minuto = (60);
          dia = (31);
          mes = (13);
          anno = (100);
          
     Queda pendiente cambiarlo.
    */
    public void setMomento (int nuevaHora,int nuevoMinutos,int nuevoDia, int nuevoMes, int nuevoAno) {  
        
       if((nuevaHora >= 0) && (nuevaHora < 24) && (nuevoMinutos >= 0) && (nuevoMinutos < 60) && (nuevoDia >= 0) && (nuevoDia < 31) && (nuevoMes >= 0) && (nuevoMes < 13) && (nuevoAno >= 0) && (nuevoAno < 100)) {  
        hora.setValue(nuevaHora);
        minuto.setValue(nuevoMinutos);  
        dia.setValor(nuevoDia);  
        mes.setValor(nuevoMes);
        anno.setValor(nuevoAno);
       }
    }
    
    public String getMomento() {
		return hora.getDisplayValue() + ":" + minuto.getDisplayValue() +" / "+ dia.getValorDelDisplay() + " / " + mes.getValorDelDisplay() + " / " + anno.getValorDelDisplay();   
    }

}
