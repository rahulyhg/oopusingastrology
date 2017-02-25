package zodie;

class waterSign extends Zodiac{

	public waterSign(String zodName, String symbol, String Planet){
		this.zodName = zodName;
		qualities = "Watery in emotion";
		Compatibility = "Aries, Sagittarius and Leo.";
		bestCompatibilities = "Gemini, Aquarius and Libra";
		this.symbol = symbol;
		this.planets = Planet;	
	}
	
	public static void main(String [] args){
		Zodiac Cancer = new waterSign("Cancer", "Crab", "Mercury");
		Cancer.traits = "Cancer is the fourth astrological sign in the Zodiac, originating from the constellation of Cancer. \nIt spans the 90° to 120° of the zodiac, between 90° and 120° of celestial longitude.";	
		Cancer.getProfile();
		
		Zodiac Scorpio = new waterSign("Scorpio", "Crab", "Mercury");
		Scorpio.traits = "Scorpio is the fourth astrological sign in the Zodiac, originating from the constellation of Cancer. \nIt spans the 90° to 120° of the zodiac, between 90° and 120° of celestial longitude.";	
		Scorpio.getProfile();
		
		Zodiac Pisces = new waterSign("Pisces", "Crab", "Mercury");
		Pisces.traits = "Pisces is the fourth astrological sign in the Zodiac, originating from the constellation of Cancer. \nIt spans the 90° to 120° of the zodiac, between 90° and 120° of celestial longitude.";	
		Pisces.getProfile();
		
	}

	@Override
	public void zoDesc(String zodiacDescription) {
		// TODO Auto-generated method stub
		
	}
}
