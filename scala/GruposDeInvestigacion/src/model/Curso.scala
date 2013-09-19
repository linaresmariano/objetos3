package model

import org.joda.time.DateTime
import mixines.VerificadorDeAula

class Curso(val diaDeLaSemana : Int,val horaInicio : Int, val horaFin : Int,val fechaComienzo : DateTime, val fechaFin : DateTime) extends VerificadorDeAula{

	def usaCanion : Boolean = true
	def usaMicrofono : Boolean = true
	def usaAireAcondicionado : Boolean = true
	def usaEstabilizador : Boolean = true
	def tamanioMinimoDePizarron : (Int,Int) = (2,10)
  
}