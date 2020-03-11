package it.polito.tdp.parole.model;

import java.util.*;
import java.util.List;

public class Parole {
		
	TreeMap<String, String> parole;
	
	public Parole() {
		//TODO
		 parole = new TreeMap<String,String>();
	}
	
	public void addParola(String p) {
		//TODO
		parole.put(p,p);
	}
	
	public List<String> getElenco() {
		//TODO
		LinkedList<String>lp=new LinkedList<String>(parole.values());
		return lp;
	}
	
	public void reset() {
		// TODO
		parole.clear();
	}
	
	public void elimina(String p) {
		parole.remove(p);
	}
	
	}
