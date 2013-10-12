package main.ejercicio4;

import java.util.HashMap;
import java.util.Map;

import main.Utils;
import main.ejercicio2.Validador;

@SuppressWarnings("rawtypes")
public aspect ValidadorConTecnicaDeObserver {

	private transient Map<Object, Validador> ValidableObjectSuport.validators;
	
	declare parents : @Validable * implements ValidableObjectSuport;

	pointcut setter(ValidableObjectSuport target,Object value) : 
		set(* *..*)
		&& args(value) 
		&& target(@Validable target)
		&& !withincode(*.new(..))
		&& within(@Validable *);

	@SuppressWarnings("unchecked")
	void around(ValidableObjectSuport target,Object value) : setter(target,value) {
	
		String metodo = thisJoinPoint.getSignature().getName();
		
		Utils.getFieldFromAccessor(metodo);
		
		Validador validator = (Validador) target.getValidator(metodo);
		
		if(validator == null || validator.validar(thisJoinPoint.getArgs()[0])) {
			proceed(target,value);
		}
	}
	
	after(ValidableObjectSuport target) : initialization(* ..*.new(..) ) && target(target) {
		target.initialize();
	}
	

	public void ValidableObjectSuport.initialize(){
		this.validators = new HashMap<Object,Validador>();
	}
	
	public void ValidableObjectSuport.addValidator(String fieldName, Validador validador) {
		this.validators.put(fieldName,validador);
	}

	public Validador ValidableObjectSuport.getValidator(String fieldName) {
		return this.validators.get(fieldName);
	}
	
}
