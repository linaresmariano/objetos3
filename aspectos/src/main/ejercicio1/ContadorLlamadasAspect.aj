package main.ejercicio1;

public aspect ContadorLlamadasAspect {
	
	private ContadorLlamadas contador = new ContadorLlamadas();
	
	pointcut methodMonitored():
		call(@Monitored * *(..));
	
	after() returning(): methodMonitored() {
		Object objeto = thisJoinPoint.getTarget();
		String metodo = thisJoinPoint.getSignature().getName();
		
		this.contador.contar(objeto, metodo);
	}
	
	public int cantLlamadas(Object objeto, String metodo) {
		return this.contador.contadas(objeto, metodo);
	}
}
