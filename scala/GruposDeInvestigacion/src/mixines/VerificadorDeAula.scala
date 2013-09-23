package mixines

import model.Aula

trait VerificadorDeAula {
	
	def usaCanion : Boolean
	def usaMicrofono : Boolean
	def usaAireAcondicionado : Boolean
	def usaEstabilizador : Boolean
	def tamanioMinimoDePizarron : (Int,Int)
  
	def checkRecurso( usaRecurso : Boolean, aulaTieneRecurso: Boolean) : Boolean = {
	  	var checkRecurso : Boolean = true
	  	if(usaRecurso){checkRecurso = aulaTieneRecurso}
	  	return checkRecurso
	}
	
	def checkCanion(aula : Aula) : Boolean = this.checkRecurso(this.usaCanion,aula.tieneCanion)
	def checkMicrofono(aula : Aula) : Boolean = this.checkRecurso(this.usaMicrofono,aula.tieneMicrofono)
	def checkAireAcondicionado(aula : Aula) : Boolean = this.checkRecurso(this.usaAireAcondicionado,aula.tieneAireAcondicionado)
	def checkEstabilizador(aula : Aula) : Boolean = this.checkRecurso(this.usaEstabilizador,aula.tieneEstabilizador)
	def checkTamanioMinimoDePizarron(aula : Aula) : Boolean = aula.tieneTamanioMinimoDePizarron(tamanioMinimoDePizarron)
	
	def meSirve(aula : Aula) : Boolean = {
		return this.checkCanion(aula) && this.checkMicrofono(aula) && this.checkAireAcondicionado(aula) && this.checkEstabilizador(aula) && this.checkTamanioMinimoDePizarron(aula)

	}
	
  
}