
package com.acceleratedskilup;
class car {
	int numberOfDoors
	String brand
	String model
	def script
	
	car(script) {
		this.script = script
	}
	void printOutCar() {
		script.echo "using script.echo"
		script.echo "NumberOfDoors: ${numberOfDoors}"
		script.echo "brand: ${brand}"
		script.echo "model: ${model}"
	}
}
