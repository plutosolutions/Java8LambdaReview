package net.putfirstthingsfirst;

import net.putfirstthingsfirst.features.IPerform;

/**
 * 
 * @author pluto
 *
 */
public class Welcome implements IPerform {

	@Override
	public void perform() {
		System.out.println("Welcome !");
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

	}

}