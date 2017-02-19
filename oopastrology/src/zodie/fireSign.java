package zodie;

class fireSign extends Zodiac{

	public fireSign(String zodName, String symbol, String Planet){
		this.zodName = zodName;
		qualities = "Fireey in nature";
		bestCompatibilities = "Aries, Sagittarius and Leo.";
		Compatibility = "Gemini, Aquarius and Libra";
		this.symbol = symbol;
		this.planets = Planet;	
	}
	
	public static void main(String [] args){
		Zodiac Aries = new fireSign("Aries", "Ram", "Mars");
		Aries.traits = "Aries is the first astrological sign in the zodiac, spanning the first 30 degrees of celestial longitude. \nUnder the tropical zodiac, the Sun transits this sign mostly between March 21 and April 20 each year.";
		
		Aries.getProfile();
	}
}
