package com.funtionalinterface.passwordstrength;

public interface SecurityUtils {
	
	static boolean strength(String s) {
		
		boolean result = true;
		
		for(int i = 0 ; i< s.length()-1 ; i++) {
			
			if(s.charAt(i) >= 'A' && s.charAt(i) <= 'Z' || s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				
				result = false;
				
			}
			else {
				result = true;
				break;
			}
			
		}
		return result;
		
	}

}
