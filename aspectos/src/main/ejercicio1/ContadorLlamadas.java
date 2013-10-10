package main.ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class ContadorLlamadas {
	Map<Object, Map<String, Integer>> contador = new HashMap<Object, Map<String, Integer>>();

	public void contar(Object objeto, String metodo) {
		Map<String, Integer> map = this.contador.get(objeto);
		
		if(map == null) {
			Map<String, Integer> datos = new HashMap<String, Integer>();
			datos.put(metodo, 1);
			
			this.contador.put(objeto, datos);
		} else {

			if(map.get(metodo) == null) {
				map.put(metodo, 1);
			} else {
				int cantidadAnterior = map.get(metodo);
				map.put(metodo, cantidadAnterior + 1);
			}
		}
	}

	public int contadas(Object objeto, String metodo) {
		Map<String, Integer> map = this.contador.get(objeto);
		
		if(map != null && map.get(metodo) != null) {
			return map.get(metodo);
		}
		
		return 0;
	}
}
