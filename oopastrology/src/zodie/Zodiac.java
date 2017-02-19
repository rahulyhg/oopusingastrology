package zodie;

public class Zodiac {
	
	//Using access modifier to restrict access to package only.
	protected String zodName, planets, symbol, months;
	
	protected String bestCompatibilities, Compatibility, nonCompatibility;
	String qualities, dateRange, traits;	
	
	//instance methods
	public void getProfile(){
		
		//If Statements.
		if(zodName.toLowerCase().contains("aries")){
			months = "20 March and 19 April";
		}
		else if (zodName.toLowerCase().contains("taurus")){
			months = "19 April and 20 May";
		}
		else if (zodName.toLowerCase().contains("gemini")){
			months = "21 May and 20 June";
		}
		else if (zodName.toLowerCase().contains("cancer")){
			months = "21 June – 22 July";
		}

		
		System.out.println("Name: "+ zodName +
				"\nQualities: " +qualities +
				"\nSymbol: " +symbol +
				"\nPlanet: " + planets +
				"\nMonths: " + months +
				"\nCompatibilities: "+ bestCompatibilities +
				"\n\nTraits: " + traits +"\n"
				);
	}
	
	//Illustrating Method Overriding.
	public void getZodiacInfo(){
		System.out.println("This is a Generic Zodiac Information.");
	}
}