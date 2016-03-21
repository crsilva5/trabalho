package AtividadeInterface;

public class ExA extends DesenhoAbstrato{
	
	
	public static int altura = 8;
	@Override
	protected String getNome() {
		// TODO Auto-generated method stub
		return "A";
	}

	@Override
	public void desenhar() {
		
		identificar();
		
		System.out.println("a)\n\n");

		int caracteres = 1;
		for (int linha= 0; linha < altura; linha++){
			for( int coluna = 0; coluna < caracteres; coluna++){
				System.out.print("#");
			}
			caracteres++;
			System.out.print("\n");
		}

		
	}

// primeiro exercicio criar em java
	

}
