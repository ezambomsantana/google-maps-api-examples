/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gmaps;

import com.google.maps.DistanceMatrixApi;
import com.google.maps.DistanceMatrixApiRequest;
import com.google.maps.GeoApiContext;
import com.google.maps.model.DistanceMatrix;

/**
 *
 * @author ezamb
 */
public class Distancia {
        /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        
        GeoApiContext context = new GeoApiContext().setApiKey("chave");
        
        String [] origem = { "São Paulo" }; // origem da viagem
        String [] destino = { "Lins" }; // destino da viagem
        
        DistanceMatrixApiRequest request =  DistanceMatrixApi.getDistanceMatrix(context, origem, destino );        
        DistanceMatrix results = request.await(); // faz a requisição no Google Maps      
        
        System.out.println(results.rows[0].elements[0].distance); // Mostra a distância entre a origem e o destino
        System.out.println(results.rows[0].elements[0].duration); // mostra o tempo estimado da viagem entre a origem e o destino
        
    }
}
