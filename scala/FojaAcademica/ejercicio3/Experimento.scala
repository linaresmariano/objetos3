package ejercicio3

class Experimento {
	
	var fechaDeRealizacion : AlgunDate
	var horaComienzoDeExperimento : Hora
	var horaFinDeExperimento : Hora
	var descripcion : String = ""
	
	def getFechaDeRealizacion = fechaDeRealizacion
	def setFechaDeRealizacion(fecha : AlgunDate) = fechaDeRealizacion = fecha
	
	def getHoraComienzoDeExperimento = horaComienzoDeExperimento
	def sethoraComienzoDeExperimento(hora : Hora) = horaComienzoDeExperimento = hora
	
	def getHoraFinDeExperimento = horaFinDeExperimento
	def sethoraFinDeExperimento(hora : Hora) = horaFinDeExperimento = hora

	def getDescripcion = descripcion
	def setDescripcion(nuevaDescripcion : String) = descripcion = nuevaDescripcion
	
}