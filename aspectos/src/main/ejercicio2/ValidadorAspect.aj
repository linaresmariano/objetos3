package main.ejercicio2;

import main.Utils;

public aspect ValidadorAspect {
	
	private Validadores validadores = new Validadores();
	
	pointcut setter():
		execution(void main.dominio..set*(*));

	@SuppressWarnings({ "rawtypes", "unchecked" })
	void around(): setter()  {
		Object objeto = thisJoinPoint.getTarget();
		String metodo = thisJoinPoint.getSignature().getName();
		
		String field = Utils.getFieldFromAccessor(metodo);
		
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
