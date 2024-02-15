package no.hvl.dat102.oblig2.parenteser;

import java.util.Set;

public class ParentesSjekker {
	
	private static final Set<Character> STARTPARENTESER = Set.of('{', '(', '[', '<');
	private static final Set<Character> SLUTTPARENTESER = Set.of('}', ')', ']', '>');
	private static final Set<String>    PARENTESPAR = Set.of("{}", "()", "[]", "<>");
	
	public static boolean sjekkParenteser(String s) {
		
		StabelADT<Character> stabel = new TabellStabel<>();
		
		//TODO Ca. 10-15 kodelinjer her gir en komplett løsning 
		
		int antallSymboler = s.length();
		boolean erSortert = true;
		int index = 0;
		char nesteSymbol = ' ';
		
		while(erSortert && (index < antallSymboler)) {
			nesteSymbol = s.charAt(index);
			switch(nesteSymbol) {
			
			
			case '(' : stabel.push(nesteSymbol);
				break;
			
			case '[': stabel.push(nesteSymbol);
				break;
			
			case '{': stabel.push(nesteSymbol);
				break;
			
			  case ')':
	                if (stabel.isEmpty() || stabel.peek() != '(') {
	                    erSortert = false;
	                } else {
	                    stabel.pop();
	                }
	                break;

	            case '}':
	                if (stabel.isEmpty() || stabel.peek() != '{') {
	                    erSortert = false;
	                } else {
	                    stabel.pop();
	                }
	                break;

	            case ']':
	                if (stabel.isEmpty() || stabel.peek() != '[') {
	                    erSortert = false;
	                } else {
	                    stabel.pop();
	                }
	                break;
	        }
	        if (!erSortert) break;
	        index++;
	    }
		
		
		
		
		return erSortert;
	}

	private static boolean erStartParentes(char c) {
		//TODO 1 kodelinje her
		return false;
	}
	
	private static boolean erSluttParentes(char c) {
		//TODO 1 kodelinje her
		return false;
	}
	
	private static boolean erParentesPar(char start, char slutt) {
		//TODO 1-2 kodelinje(r) her
		return false;
	}
}
