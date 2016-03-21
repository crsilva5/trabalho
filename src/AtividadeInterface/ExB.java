package AtividadeInterface;

public class ExB extends DesenhoAbstrato {

		
		public static int altura = 8;

		@Override
		protected String getNome() {
			// TODO Auto-generated method stub
			return "B";
		}
		@Override
		public void desenhar() {
			identificar();
			
			System.out.println("b)\n\n");

			int caracteres = altura;
			for (int linha= 0; linha < altura; linha++){
				for( int coluna = 0; coluna < caracteres; coluna++){
					System.out.print("#");
				}
				caracteres--;
				System.out.print("\n");
			}

			
		}

	

		// segundo exercicio criar em java		

	}
