
public class CalendarioBasico
{
    // declarando variables dia mes y año
    private DisplayDosCaracteres dia;
    private DisplayDosCaracteres mes;
    private DisplayDosCaracteres ano;

        /**
        *constructor de clase CalendarioBasico
        */

    public CalendarioBasico()
    {
        DisplayDosCaracteres dia = new DisplayDosCaracteres(31);
        DisplayDosCaracteres mes = new DisplayDosCaracteres(13);
        DisplayDosCaracteres ano = new DisplayDosCaracteres(2099);
    }
    /**
    *Fijamos fecha nueva
    */
        public void fijarFecha(int nuevoDia, int nuevoMes,int nuevoAnio)
    {
        dia.setValorAlmacenado (nuevoDia);
        mes.setValorAlmacenado (nuevoMes);
        ano.setValorAlmacenado (nuevoAnio);
    }
    /**
    *metodo para obtener la fecha
    */
    public String obtenerFecha()
    {
      
        return  dia.getTextoDelDisplay()+ "-"+ mes.getTextoDelDisplay()+ "-" + ano.getTextoDelDisplay();
    }

    /**
    *avanzar un dia en la fecha
    */
   public void avanzarFecha()
    {
        dia.incrementaValorAlmacenado();
    }


}

