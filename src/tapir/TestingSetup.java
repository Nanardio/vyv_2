package tapir;

import java.util.HashMap;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import Entidades.EntidadesPersonaje.InfectadoAlpha;


public class TestingSetup {
	public static void setup() {
		HashMap<Integer, String> mapObjectsToCallSequence = null; 
		HashMap<String, String> mapMethodsToSymbols = null; 
		Pattern regularExpression = null; 
		Matcher matcher = null;
		
		//Specification of the test class\
		TestingCore.mapClassToTestingInformation = new HashMap<>();
			
		
		// Testing setup for Account class
		//Definition of the methods and their corresponding symbols
		mapObjectsToCallSequence = new HashMap<>(); 
		mapMethodsToSymbols = new HashMap<String, String>();
		mapMethodsToSymbols.put("Entidades.EntidadesPersonaje.InfectadoAlpha.<init>", "i");
		mapMethodsToSymbols.put("Entidades.EntidadesPersonaje.InfectadoAlpha.duplicarVelocidad", "d");
		mapMethodsToSymbols.put("Entidades.EntidadesPersonaje.InfectadoAlpha.setearCuarentena", "c");
		mapMethodsToSymbols.put("Entidades.EntidadesPersonaje.InfectadoAlpha.volverVelocidad", "v");
		//Definition of the regular expression
		regularExpression = Pattern.compile("i(d|c|v)*");
		//Initializing the regular expressions controller
		matcher = regularExpression.matcher("");	
		// All information related to how the Account class is testing is store in a TestingInformation instance
		TestingInformation ti = new TestingInformation(InfectadoAlpha.class.toString(), mapObjectsToCallSequence, mapMethodsToSymbols, regularExpression, matcher, true);
		TestingCore.mapClassToTestingInformation.put(InfectadoAlpha.class.toString(), ti);
		
		mapObjectsToCallSequence = null; 
		mapMethodsToSymbols = null; 
		regularExpression = null; 
		matcher = null;
}
	
}
