package main.ejercicio2;

public aspect ValidadorAspect {
	
	private Validadores validadores = new Validadores();
	
	pointcut setter():
		set(* main.dominio..*);

	@SuppressWarnings({ "rawtypes", "unchecked" })
	void around(): setter()  {
		Object objeto = thisJoinPoint.getTarget();
		String field = thisJoinPoint.getSignature().getName();
		
		Validador validador = validadores.value(objeto, field);
		
		if(validador == null || validador.validar(thisJoinPoint.getArgs()[0])) {
			proceed();
		} else {
			throw new ValorInvalidoException();
		}
	}
	
	@SuppressWarnings("rawtypes")
	public void agregarValidador(Object objeto, String field, Validador validador) {
		validadores.put(objeto, field, validador);
	}

}
