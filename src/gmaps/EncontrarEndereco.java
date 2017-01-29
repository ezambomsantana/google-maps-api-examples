package gmaps;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;

public class EncontrarEndereco {

    /**
     * Parte 1 - Passa um endereço qualquer, e o maps responde com o endereço formatado caso ele seja encontrado.
     * Parte 2 - Passa uma Lat/Long qualquer, e o maps responde com o endereço correspondente.
     */
    public static void main(String[] args) throws Exception {
        
        // substituir a String "chave" pela chave gerada na API do Google.
        GeoApiContext context = new GeoApiContext().setApiKey("chave");
        GeocodingResult[] results =  GeocodingApi.geocode(context, "Rua Casa do Ator").await(); //Passa um endereço
        System.out.println(results[0].formattedAddress); // Recebe como resposta o endereço completo, caso ele exista
        
        LatLng latlng = new LatLng(-23.579248, -46.728165); // Uma Lat/Lng qualquer
        
        results =  GeocodingApi.reverseGeocode(context, latlng).await(); // Busca o endereço dessa posição
        System.out.println(results[0].formattedAddress); // Escreve o endereço encontrado
        
    }
    
}
