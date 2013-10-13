package main.ejercicio1;

import java.util.Map;

public class ContadorLlamadas extends DobleMapLoco<Integer> {
	
	public void contar(Object objeto, String metodo) {
		super.put(objeto, metodo, 1);
	}
	
	public Integer contadas(Object objeto, String metodo) {
		Integer retVal = super.value(objeto, metodo);
		
		if(retVal == null) {
			return 0;
		}
		
		return retVal;
	}

	@Override
	protected void replaceOldValue(Map<String, Integer> map, String metodo, Integer value) {
		if(map.get(metodo) == null) {
			map.put(metodo, 1);
		} else {
			int cantidadAnterior = map.get(metodo);
			map.put(metodo, cantidadAnterior + 1);
		}
	}
}
