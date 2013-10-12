package main.ejercicio3;

import java.util.HashMap;
import java.util.Map;

import main.ejercicio1.Monitored;

public aspect ContadorLlamadasBonusAspect pertarget(methodMonitored()){
	
	private Map<String, Integer> contador = new HashMap<String, Integer>();
	
	pointcut methodMonitored(): 
		call(@Monitored * *(..));
	
	after() returning(): methodMonitored() {
		String metodo = thisJoinPoint.getSignature().getName();
		
		Integer value = this.contador.get(metodo);
		this.contador.put(metodo, (value==null) ? 1 : value + 1);
	}
	
	public int cantLlamadas(String metodo) {
		Integer value = this.contador.get(metodo);
		return (value == null) ? 0 : value;
	}
}
