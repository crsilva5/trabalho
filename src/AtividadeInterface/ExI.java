package AtividadeInterface;

public class ExI extends DesenhoAbstrato{
	
	public static int altura = 10;

	@Override
	protected String getNome() {
		// TODO Auto-generated method stub
		return "I";
	}
	
	@Override
	public void desenhar() {
		identificar();
		
		System.out.println("I)\n\n");
		
		int a = altura -1;
		for (int linha= 0; linha < altura; linha++){
			for( int coluna = 0; coluna < altura; coluna++){
				
				if (linha == altura -1|| linha == 0 || coluna == a || linha == coluna || coluna == 0 ||coluna == altura - 1){
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