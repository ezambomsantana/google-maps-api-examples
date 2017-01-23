/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gmaps;

import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;
import com.google.maps.model.LatLng;

/**
 *
 * @author ezamb
 */
public class EncontrarEndereco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        GeoApiContext context = new GeoApiContext().setApiKey("chave");
        GeocodingResult[] results =  GeocodingApi.geocode(context,
            "Rua Casa do Ator").await();
        System.out.println(results[0].formattedAddress);
        
        LatLng latlng = new LatLng(-23.579248, -46.728165);
        
        results =  GeocodingApi.reverseGeocode(context,
            latlng).await();
        System.out.println(results[0].formattedAddress);
        
    }
    
}
