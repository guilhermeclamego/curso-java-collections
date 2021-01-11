package br.com.exercicios;

import java.util.HashMap;
import java.util.Map;

public class ExercicioMap {
	public static void main(String[] args) {
		Map<Integer, String> municipios = new HashMap<Integer, String>();

		municipios.put(10, "Rio do Sul");
		municipios.put(15, "Criciuma");
		municipios.put(1, "Jaragua do Sul");
		municipios.put(45, "Biguacu");
		municipios.put(88, "Lages");

		System.out.println("Chaves do Mapa: " + municipios.keySet());

		System.out.println("\nApenas o valor do mapa:");
		municipios.keySet().forEach( key -> {
			System.out.println(municipios.get(key));
		});


		municipios.keySet().forEach( key -> {
			System.out.println("Chave: " + key + " Valor: " + municipios.get(key));
		});
        
    }
}
