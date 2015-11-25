package com.metaclass

class Main {

	static main(args){
		
		Person person = new Person()
		person.metaClass.doRunning{"$name has new activity called doRunning. IT's AMAZING"}
		person.metaClass.doCrossfit{"$name has new activity called doCrossfit. IT's AMAZING"}
		person.name = 'Juan'
		println person.doEat()
		println 'But wait there\'s more'
		println person.doRunning()
		println "$person.name can do Running? REALLY???"
		println person.doCrossfit()
		println "$person.name can do Running? REALLY???"
		
		
	}
}

class Person{
	
	public String name
	public String doEat(){"$name can do eating"}
}
