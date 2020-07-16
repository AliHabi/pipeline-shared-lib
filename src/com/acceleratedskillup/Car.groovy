
package com.acceleratedskilup;
class car {
	int numberOfDoors
	string brand
	string model
	def script
	
		Car(script){
		this.script=script
	}
	void prontOutCar(){
		script.echo "using script.echo"
		script.echo "NumberOfDoors: ${numberOfDoors}"
		script.echo "brand: ${brand}"
		script.echo "model: ${model}"
	}
}
