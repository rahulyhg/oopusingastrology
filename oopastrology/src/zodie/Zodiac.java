package zodie;

public class Zodiac {
	protected String zodName, planets, symbol, months;
	
	protected String bestCompatibilities, Compatibility, nonCompatibility;
	String qualities, dateRange, traits;	
	
	public void getProfile(){
		if(zodName.toLowerCase().contains("aries")){
			months = "20 March and 19 April";
		}
		else if (zodName.toLowerCase().contains("taurus")){
			months = "19 April – 20 May";
		}
		else if (zodName.toLowerCase().contains("gemini")){
			months = "21 May – 20 June";
		}
		else if (zodName.toLowerCase().contains("cancer")){
			months = "21 June – 22 July";
		}
		else if (zodName.toLowerCase().contains("Leo")){
			months = "21 June – 22 July";
		}
		else if (zodName.toLowerCase().contains("Virgo")){
			months = "21 June – 22 July";
		}
		else if (zodName.toLowerCase().contains("Libra")){
			months = "21 June – 22 July";
		}
		else if (zodName.toLowerCase().contains("Scorpio")){
			months = "21 June – 22 July";
		}
		else if (zodName.toLowerCase().contains("Saggitarius")){
			months = "21 June – 22 July";
		}
		else if (zodName.toLowerCase().contains("Aquarius")){
			months = "21 June – 22 July";
		}
		else if (zodName.toLowerCase().contains("Pisces")){
			months = "21 June – 22 July";
		}
		
		System.out.println("Name: "+ zodName +
				"\nQualities: " +qualities +
				"\nSymbol: " +symbol +
				"\nPlanet: " + planets +
				"\nMonths: " + months +
				"\nCompatibilities: "+ bestCompatibilities +
				"\n\nTraits: " + traits
				);
	}
}