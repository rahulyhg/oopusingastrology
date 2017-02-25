package zodie;

class earthSign extends Zodiac{

	public earthSign(String zodName, String symbol, String Planet){
		this.zodName = zodName;
		qualities = "Earthy in nature";
		bestCompatibilities = "Capricorn, Taurus and Virgo.";
		Compatibility = "Gemini, Aquarius and Libra";
		this.symbol = symbol;
		this.planets = Planet;	
	}
	
	public static void main(String [] args){
		Zodiac Taurus = new earthSign("Taurus", "Bull", "Mars");
		Taurus.traits = "Taurus is the second astrological sign in"
				+ " the present zodiac. It spans the 30–60th degree of the zodiac.\n"
				+ " The Sun is in the sign of Taurus from about April 21 until about"
				+ " May 21 or from about May 16 to June 16";
		
		Taurus.getProfile();
	}
	
	public void zoDesc(String zodiacDescription){
		
	}
}
