import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {
    public static void main(String[] args){


        //cliente
        Cliente carlos = new Cliente(1,"carlos","vargas","villaroel");

        //ciudad
        Ciudad cochabamba = new Ciudad(1,"Cochabamba");
        Ciudad santaCruz = new Ciudad(2,"Santa Cruz");
        Ciudad tarija = new Ciudad(3,"Tarija");

        //Categoria
        Categoria turista =new Categoria(1,"Turista");

        //Aeropuertos
        Aeropuerto jorgeWilstermann = new Aeropuerto("jW","Jorge Wilstermann",cochabamba );
        Aeropuerto viruViru =new Aeropuerto("VV","Viru Viru", santaCruz);
        Aeropuerto orielLea = new Aeropuerto("OL","ORiel Lea Plaza", tarija);


        //vuelos
        List<Vuelo> vuelos = new ArrayList<>();
        Vuelo cochabambaSantaCruz = new Vuelo("BOA_158", Calendar.getInstance().getTime(), jorgeWilstermann, viruViru);
        vuelos.add(cochabambaSantaCruz);
        Vuelo santaCruzTarija =new Vuelo("BOA_159",Calendar.getInstance().getTime(),viruViru, orielLea);
        vuelos.add(santaCruzTarija);

        //billete
        Billete billete =new Billete(1,Calendar.getInstance().getTime(), 650.5,carlos,cochabamba,tarija,turista,vuelos);

        System.out.println("Billete");
        System.out.println("=========");
        System.out.println("Id: "+billete.getIdBillete());
        System.out.println("fecha: "+billete.getFechaEmision());
        System.out.println("Precio: "+billete.getPrecioTotal());
        System.out.println("Cliente: "+billete.getCliente().getNombre());
        System.out.println("origen: "+ billete.getOrigen().getNombre());
        System.out.println("Destino: "+billete.getDestino().getNombre());
        System.out.println("Categoria: "+billete.getDestino().getNombre());
        System.out.println("Vuelos: "+billete.getVuelos());
        for (Vuelo vuelo:billete.getVuelos()){
            System.out.println("Codigo vuelo"+vuelo.getCodigoVuelo()+ "/ Salida"+vuelo.getSalida()+" / Origen"+vuelo.getOrigen().getNombre()+ "/ Destino"+vuelo.getDestino().getNombre());
        }
    }
}
