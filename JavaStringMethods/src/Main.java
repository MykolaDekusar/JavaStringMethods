
public class Main {

	public static void main(String[] args) {
		// String = è un tipo di dato di RIFERIMENTO che può contenere 1 o più caratteri
					//essendo di tipo RIFERIMENTO ha accesso a molti metodi utili
		String nome = "   Nico D";
		//alcuni dei principali metodi
		boolean r= nome.equals("Nico"); //verifica se sono uguali
		int e= nome.length(); //ritorna la lunghezza
		char s=nome.charAt(0); //ritorna il char nella posizione
		int u=nome.indexOf("D"); //ritorna la posizione del char
		boolean l=nome.isEmpty(); //verifica se è vuoto
		String t=nome.toUpperCase(); //trasforma in maiuscolo
		String a=nome.toLowerCase(); //trasforma in minuscolo
		String q=nome.trim(); //rimuove gli spazi all'inizio e alla fine
		String p=nome.replace('c','b'); //sostituisce il primo char con il secondo
		
		System.out.println(nome);
		System.out.println(r);
		System.out.println(e);
		System.out.println(s);
		System.out.println(u);
		System.out.println(l);
		System.out.println(t);
		System.out.println(a);
		System.out.println(q);
		System.out.println(p);
	}

}
