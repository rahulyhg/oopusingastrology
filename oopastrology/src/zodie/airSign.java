package zodie;

class airSign extends Zodiac{
	
	public airSign(String zodName, String symbol, String Planet){
		this.zodName = zodName;
		qualities = "Airy in nature";
		Compatibility = "Aries, Sagittarius and Leo.";
		bestCompatibilities = "Gemini, Aquarius and Libra";
		this.symbol = symbol;
		this.planets = Planet;
	}
	
	public static void main(String [] args){
		Zodiac Gemini = new airSign("Gemini", "Twins", "Mercury");
		//Not Overridden
		Gemini.getZodiacInfo();
		
		Gemini.traits = "Gemini is the third astrological sign in the zodiac, originating from the constellation of Gemini."
				+ "\nUnder the tropical zodiac, the sun transits this sign between May 21 and June 21. \nGemini is represented by The Twins Castor and Pollux.";
		Gemini.getProfile();
		
		Zodiac Libra = new airSign("Libra", "Twins", "Mercury");
		Libra.traits = "Gemini is the third astrological sign in the zodiac, originating from the constellation of Gemini."
				+ "\nUnder the tropical zodiac, the sun transits this sign between May 21 and June 21. \nGemini is represented by The Twins Castor and Pollux.";
		Gemini.getProfile();
		
		Zodiac Aquarius = new airSign("Aquarius", "Twins", "Mercury");
		Aquarius.traits = "Gemini is the third astrological sign in the zodiac, originating from the constellation of Gemini."
				+ "\nUnder the tropical zodiac, the sun transits this sign between May 21 and June 21. \nGemini is represented by The Twins Castor and Pollux.";
		Gemini.getProfile();
	}
}
