package com.educacionit.clase8;

public class AppPrincipal {

	public static void main(String[] args) {
		// DEmo bolsa no generica
		/*
		 * Bolsa bolsa = new Bolsa(5); Chocolatina c = new Chocolatina("milka");
		 * Chocolatina c1 = new Chocolatina("Cofler"); Chocolatina c2 = new
		 * Chocolatina("Ferrero"); Golosina g1 = new Golosina("GomitasMasticables");
		 * Golosina g2 = new Golosina("chicle"); // agregos los chocolates y golosinas a
		 * la bolsa bolsa.add(c); bolsa.add(c1); bolsa.add(c2); bolsa.add(g1);
		 * bolsa.add(g2); // bolsa.add(g2); // bolsa.add(g2); for (Object o : bolsa) {
		 * if (o instanceof Chocolatina) { Chocolatina chocolatina = (Chocolatina) o;
		 * System.out.println(chocolatina.getMarca()); } else { Golosina golosina =
		 * (Golosina) o; System.out.println(golosina.getNombre()); } }
		 */

		// DEmo bolsa generica
		BolsaGenerica<Chocolatina> bolsa = new BolsaGenerica<Chocolatina>(5);

		Chocolatina c = new Chocolatina("milka");
		Chocolatina c1 = new Chocolatina("Cofler");
		Chocolatina c2 = new Chocolatina("Ferrero");

		bolsa.add(c);
		bolsa.add(c1);
		bolsa.add(c2);
		for (Chocolatina chocolatinaAux : bolsa) {
			System.out.println(chocolatinaAux.getMarca());
		}

		BolsaGenerica<Golosina> bolsaGenericaDos = new BolsaGenerica<Golosina>(5);
		Golosina g1 = new Golosina("GomitasMasticables");
		Golosina g2 = new Golosina("chicle");
		bolsaGenericaDos.add(g1);
		bolsaGenericaDos.add(g2);

		for (Golosina golosinaAux : bolsaGenericaDos) {
			System.out.println(golosinaAux.getNombre());

		}

	}

}
