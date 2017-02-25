package zodie;

//Inheritance
class fireSign extends Zodiac{
	

	//Method Overriding to be used by subclasses.
	public void getZodiacInfo(){
		System.out.println("This is a FireSign Page.\n");
	}
	
	//Constructor with instance variable
	public fireSign(String zodName){
		this.zodName = zodName;
		qualities = "Fireey in nature";
		bestCompatibilities = "Aries, Sagittarius and Leo.";
		Compatibility = "To be completed";
		this.symbol = "Not yet known";
		this.planets = "Somewhere in the clouds";	
		this.months = "Month to be updated!";
	}

	//Constructor Overloading
	public fireSign(String zodName, String symbol, String Planet){
		this.zodName = zodName;
		qualities = "Fireey in nature";
		bestCompatibilities = "Aries, Sagittarius and Leo.";
		Compatibility = "Gemini, Aquarius and Libra";
		this.symbol = symbol;
		this.planets = Planet;	
		this.months = "Month to be updated!";
	}	
	
	
	public static void main(String [] args){
		
		//Instantiation of object using one of the declared constructors.
		Zodiac Aries = new fireSign("Aries", "Ram", "Mars");
		//Overridden method is executed instead of that of the Superclass
		Aries.getZodiacInfo();
		//Invoking the instance methods on Objects
		Aries.getProfile();
		Aries.zoDesc("Aries is the first astrological sign in the zodiac, spanning the first 30 degrees of celestial longitude. \nUnder the tropical zodiac, the Sun transits this sign mostly between March 21 and April 20 each year.\n\n");

		
		//New Objects instantiation
		Zodiac tome = new fireSign("Tommie", "Ram", "Mars");
		Zodiac Leo = new fireSign("Leo");
		tome.getProfile();
		
		
		Leo.getProfile();
	}

	//Use of Overriden Abstract method
	@Override
	public void zoDesc(String zodiacDescription) {
		System.out.println(zodiacDescription);
		
	}
	


}
