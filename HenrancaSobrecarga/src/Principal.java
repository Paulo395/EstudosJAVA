import java.util.Calendar;

import models.Cachorro;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro c = new Cachorro();
		Calendar ca = Calendar.getInstance();
		
		//FRASE
		c.reagir("Bom Garoto");
		c.reagir("Vai Apanhar!");
		
		//HORA
		c.reagir(ca.get(Calendar.HOUR_OF_DAY));
		
		//DONO
		c.reagir(true);
		c.reagir(false);
		
		//IDADE E PESO
		c.reagir(2, 8);
		c.reagir(2, 12);
		
		c.reagir(17, 6);
		c.reagir(17, 12.7f);
	}

}
