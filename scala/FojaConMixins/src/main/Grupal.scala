package main

import scala.collection.mutable.ListBuffer

trait Grupal {
  
	def origenDeLasCursadas:List[{ def cursadas:List[Cursada] }]
	
	def cursadas:List[Cursada] = {
		origenDeLasCursadas.foldLeft(ListBuffer(): ListBuffer[Cursada]) { (acum, elem) =>
			acum ++= elem.cursadas
		}.toList
	}
}