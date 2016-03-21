package AtividadeInterface;

public class ExH extends DesenhoAbstrato{
	
	public static int altura = 8;
	
	@Override
	protected String getNome() {
		// TODO Auto-generated method stub
		return "H";
	}

	@Override
	public void desenhar() {
		identificar();
		System.out.println("H)\n\n");
		
		int a = altura -1;
		for (int linha= 0; linha < altura; linha++){
			for( int coluna = 0; coluna < altura; coluna++){
				
				if (linha == altura -1|| linha == 0 || coluna == a || linha == coluna){
					System.out.print("#");
				}else{
					System.out.print(" ");
				}
			}
			a--;
			System.out.print("\n");
		}

		
	}


	

}