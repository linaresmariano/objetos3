package main.ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class ContadorSubFuturo extends DobleMapLoco<Integer> {
	Map<Object, Map<String, Integer>> contador = new HashMap<Object, Map<String, Integer>>();

	public void put(Object objeto, String metodo) {
		super.put(objeto, metodo, 1);
	}

	@Override
	public Integer value(Object objeto, String metodo) {
		Integer retVal = super.value(objeto, metodo);
		
		if(retVal == null) {
			return 0;
		}
		
		return retVal;
	}
	
	public void replaceOldValue(Map<String, Integer> map, String metodo, Integer value) {
		if(map.get(metodo) == null) {
			map.put(metodo, 1);
		} else {
			int cantidadAnterior = map.get(metodo);
			map.put(metodo, cantidadAnterior + 1);
		}
	}
}
