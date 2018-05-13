package racional;

public class Racional {
	
	double numero;
	int numerador;
	int denominador  = 1;

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
		while(numero % 1 != 0)
		{
			numero *= 10;
			denominador *= 10;
		}
		numerador = (int) numero;	
		numero /= denominador;
	}

	public void simplificarIterativo() {
		int aden = denominador, anum = numerador;
		int i=0, resto = aden;
		while(resto != 0)
		{
			if(i%2 == 0)
			{
				anum %= resto;
				resto = anum;
			}
			else
			{
				aden %= resto;
				resto = aden;
			}
			i++;
		}
		int cmd;
		
		if(aden == 0)
			cmd = anum;
		else
			cmd = aden;
			
		numerador /= cmd;
		denominador /= cmd;
		
	}

	public void convertirRecursivo() {
		if(numero % 1 != 0)
		{
			numero *= 10;
			denominador *= 10;
			convertirRecursivo();
		}
		numerador = (int) numero;	
		numero /= denominador;
	}	
}
