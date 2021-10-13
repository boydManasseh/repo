
public class CryptoManager {
	
	private static final char LOWER_BOUND = ' ';
	private static final char UPPER_BOUND = '_';
	private static final int RANGE = UPPER_BOUND - LOWER_BOUND + 1;

	/**
	 * This method determines if a string is within the allowable bounds of ASCII codes 
	 * according to the LOWER_BOUND and UPPER_BOUND characters
	 * @param plainText a string to be encrypted, if it is within the allowable bounds
	 * @return true if all characters are within the allowable bounds, false if any character is outside
	 */
	public static boolean stringInBounds (String plainText) {
		
		char[] pText = plainText.toCharArray();
		boolean isCorrect;
		for(int i = 0; i < plainText.length(); i++) {
			do {
				if (plainText.charAt(i) < LOWER_BOUND || plainText.charAt(i) > UPPER_BOUND ) {
					isCorrect =  false;
					
					/**
					if(plainText.charAt(i) < LOWER_BOUND) {
						char nChar = (char) (plainText.charAt(i) - RANGE);
					}else {
						char nChar = (char) (plainText.charAt(i) + RANGE);
					}
					*/
					
				}else {
					isCorrect = true;
				}
			}while(isCorrect = false);
			
		}
		return true;
	}

	/**
	 * Encrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in plainText is replaced by the character \"offset\" away from it 
	 * @param plainText an uppercase string to be encrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the encrypted string
	 */
	public static String encryptCaesar(String plainText, int key) {
		
		char [] pText = plainText.toCharArray();
		char [] eText = new char[plainText.length()];
		
		int i = 0;
		do {
			for(char t: pText) {
				
				t +=key;
				eText[i] = t;
				i++;
			}
		}while(i<plainText.length());
		String st = String.valueOf(eText);
		return st;
	}
	
	/**
	 * Encrypts a string according the Bellaso Cipher.  Each character in plainText is offset 
	 * according to the ASCII value of the corresponding character in bellasoStr, which is repeated
	 * to correspond to the length of plainText
	 * @param plainText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the encrypted string
	 */
	public static String encryptBellaso(String plainText, String bellasoStr) {
		String encryptedText = "";
		
		char [] enText = new char[plainText.length()];
		
		
	    mappingKeyToMessage(bellasoStr,plainText);
	    
	    char [] plText = plainText.toCharArray();
		char [] blText = bellasoStr.toCharArray();
		
		int i=0;
		int sum = 0;
		
		sum = sum + plText[i];
		sum = sum + blText[1];
		sum -= RANGE;
		System.out.print(sum);
		do {
			for(char m: plText) {
			
				if (sum >95) {
					sum -= RANGE;
					m += sum;
					i++;
				}else {
					m +=sum;
					enText[i] = m;
					i++;
				}	
			}
		}while(i<plainText.length());
		encryptedText = String.valueOf(enText);
		
	    
	    return encryptedText; 
	}
	


	public static String mappingKeyToMessage(String Key, String pText) {
		String mappedKey = "";
		String keyMap = "";
		
		for(int i = 0, j = 0; i < pText.length();i++) {
			if (pText.charAt(i) == (char)32) {
				keyMap += (char)32;
			}else {
				// map letters of key with plain text characters 
				if (j < Key.length()) {
					keyMap += Key.charAt(j);
					j++;
				}else {
					j = 0;
					keyMap += Key.charAt(j);
					j++;
				}
			}
			mappedKey = keyMap;
		}
		System.out.println(mappedKey);
		return mappedKey;
		// TODO Auto-generated method stub	
	}
	
	

	/**
	 * Decrypts a string according to the Caesar Cipher.  The integer key specifies an offset
	 * and each character in encryptedText is replaced by the character \"offset\" characters before it.
	 * This is the inverse of the encryptCaesar method.
	 * @param encryptedText an encrypted string to be decrypted.
	 * @param key an integer that specifies the offset of each character
	 * @return the plain text string
	 */
	public static String decryptCaesar(String encryptedText, int key) {
		char [] eText = encryptedText.toCharArray();
		char [] pText = new char[encryptedText.length()];
		
		int i = 0;
		do {
			for(char t: eText) {
				
				t -=key;
				pText[i] = t;
				i++;
			}
		}while(i<encryptedText.length());
		String st = String.valueOf(pText);
		return st;
	}
	
	/**
	 * Decrypts a string according the Bellaso Cipher.  Each character in encryptedText is replaced by
	 * the character corresponding to the character in bellasoStr, which is repeated
	 * to correspond to the length of plainText.  This is the inverse of the encryptBellaso method.
	 * @param encryptedText an uppercase string to be encrypted.
	 * @param bellasoStr an uppercase string that specifies the offsets, character by character.
	 * @return the decrypted string
	 */
	public static String decryptBellaso(String encryptedText, String bellasoStr) {
        String decryptedText = "";
		
		char [] deText = new char[encryptedText.length()];
		
	    mappingKeyToMessage(bellasoStr,encryptedText);
	    
	    char [] enText = encryptedText.toCharArray();
		char [] blText = bellasoStr.toCharArray();
		
		int i=0;
		int diff = 0;
		
		diff = diff + enText[i];
		diff = diff + blText[1];
		diff += RANGE;
		System.out.print(diff);
		do {
			for(char m: enText) {
			
				if (diff <32) {
					diff += RANGE;
					m += diff;
					i++;
				}else {
					m +=diff;
					deText[i] = m;
					i++;
				}	
			}
		}while(i<encryptedText.length());
		decryptedText = String.valueOf(deText);
		
	    
	    return decryptedText; 
	}
}