package gmaps;

import com.google.maps.DistanceMatrixApi;
import com.google.maps.DistanceMatrixApiRequest;
import com.google.maps.GeoApiContext;
import com.google.maps.model.DistanceMatrix;

/**
 *
 * @author Eduardo Santana
 */
public class Distancia {
        
    public static void main(String[] args) throws Exception {
        
        // O aluno deve substituir a String "chave" pela chave gerada no Google.
        GeoApiContext context = new GeoApiContext().setApiKey("chave");
        
        String [] origem = { "São Paulo" }; // origem da viagem, pode ser um endereço completo ou apenas o nome de uma cidade.
        String [] destino = { "Lins" }; // destino da viagem, mesma coisa da origem.
        
        DistanceMatrixApiRequest request =  DistanceMatrixApi.getDistanceMatrix(context, origem, destino );        
        DistanceMatrix results = request.await(); // faz a requisição no Google Maps e recupera a resposta     
        
        System.out.println(results.rows[0].elements[0].distance); // Mostra a distância entre a origem e o destino
        System.out.println(results.rows[0].elements[0].duration); // mostra o tempo estimado da viagem entre a origem e o destino
        
    }
}
