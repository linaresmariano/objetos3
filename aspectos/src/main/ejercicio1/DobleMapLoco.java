package main.ejercicio1;

import java.util.HashMap;
import java.util.Map;

public class DobleMapLoco<T> {
	Map<Object, Map<String, T>> contador = new HashMap<Object, Map<String, T>>();

	public void put(Object objeto, String metodo, T valor) {
		Map<String, T> map = this.contador.get(objeto);
		
		if(map == null) {
			Map<String, T> datos = new HashMap<String, T>();
			datos.put(metodo, valor);
			
			this.contador.put(objeto, datos);
		} else {
			replaceOldValue(map, metodo, valor);
		}
	}

	private void replaceOldValue(Map<String, T> map, String metodo, T valor) {
		map.put(metodo, valor);
	}

	public T value(Object objeto, String metodo) {
		Map<String, T> map = this.contador.get(objeto);
		
		if(map != null && map.get(metodo) != null) {
			return map.get(metodo);
		}
		
		return null;
	}
}
