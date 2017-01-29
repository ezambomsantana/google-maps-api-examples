package gmaps;

import com.google.maps.GeoApiContext;
import com.google.maps.PlacesApi;
import com.google.maps.model.PlacesSearchResponse;
import com.google.maps.model.PlacesSearchResult;

/**
 *
 * @author Eduardo Santana
 */
public class Lugares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyAE0OZCWv6WwLB_rF9_h_yHbwtOP7qpaWw");    
        
        String local = "Bar do Jorge"; // local a ser buscado
        
        PlacesSearchResponse response =  PlacesApi.textSearchQuery(context, local).await(); // Faz a consulta sobre o lugar selecionado
        PlacesSearchResult results[] = response.results; // podem ser retornados vários resultados.
        
        for (PlacesSearchResult place : results) {
            System.out.println(place.name); // Mostra o nome do lugar
            System.out.println(place.formattedAddress); // o endereço
            System.out.println(place.rating); // a nota
            if (place.openingHours != null) {
                System.out.println(place.openingHours.openNow); // verifica se o lugar está aberto ou fechado
            }
            
        }
                
    }
    
}
