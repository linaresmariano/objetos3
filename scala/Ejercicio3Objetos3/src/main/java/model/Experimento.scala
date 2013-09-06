package main
import org.joda.time.DateTime

abstract class Experimento(val fechaDeRealizacion : DateTime,val horaComienzoDeExperimento : Int, val horaFinDeExperimento : DateTime, val descripcion : String) {
	
}