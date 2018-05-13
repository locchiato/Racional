package racional;

public class Racional {
	
	double numero;
	int numerador;
	int denominador;

	public Racional(final double numero)
	{
		this.numero = numero;
		convertirIterativo();
		simplificarRecursivo();
	}

	public void simplificarRecursivo() {
		int mcd = MCDRecursivo(numerador, denominador);
		numerador /= mcd;
		denominador /=mcd;
	}

	private int MCDRecursivo(int a, int b) {
		return b == 0 ? a : MCDRecursivo(b, a % b);
	}
	

	public void convertirIterativo() {
		int i = 0;
		double aux = numero;
		if(numerador % 1 != 0)
			while(aux % 1 != 0)
			{
				aux *= 10;
				i++;
			}
		numerador = (int) aux;
		denominador = (int) Math.pow(10, i);
	}

	public void simplificarIterativo() {
		// TODO Auto-generated method stub
		
	}

	public void convertirRecursivo() {
		// TODO Auto-generated method stub
		
	}	
}
