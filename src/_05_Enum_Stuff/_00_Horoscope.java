package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	public static void horoscope(Zodiac sign) {
		switch(sign) {
			case ARIES:{
				JOptionPane.showMessageDialog(null, "Aries Horoscope");
				break;
			}
			case TAURUS:{
				JOptionPane.showMessageDialog(null, "Taurs Horoscope");
				break;
			}
			case GEMINI:{
				JOptionPane.showMessageDialog(null, "Gemini Horoscope");
				break;
			}
			case CANCER:{
				JOptionPane.showMessageDialog(null, "Cancer Horoscope");
				break;
			}
			case LEO:{
				JOptionPane.showMessageDialog(null, "Leo Horoscope");
				break;
			}
			case VIRGO:{
				JOptionPane.showMessageDialog(null, "Virgo Horoscope");
				break;
			}
			case LIBRA:{
				JOptionPane.showMessageDialog(null, "Libra Horoscope");
				break;
			}
			case SCORPIO:{
				JOptionPane.showMessageDialog(null, "Scorpio Horoscope");
				break;
			}
			case SAGITTARIUS:{
				JOptionPane.showMessageDialog(null, "Sagittarius Horoscope");
				break;
			}
			case CAPRICORN:{
				JOptionPane.showMessageDialog(null, "Capricorn Horoscope");
				break;
			}
			case AQUARIUS:{
				JOptionPane.showMessageDialog(null, "Aquarius Horoscope");
				break;
			}
			case PISCES:{
				JOptionPane.showMessageDialog(null, "Pisces Horoscope");
				break;
			}
		}
	}
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		Zodiac leo = Zodiac.LEO;
		Zodiac libra = Zodiac.LIBRA;
		horoscope(leo);
		horoscope(libra);
	}
}
