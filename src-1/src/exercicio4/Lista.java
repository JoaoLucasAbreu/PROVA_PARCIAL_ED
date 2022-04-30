package exercicio4;

public class Lista {
	No inicio;
	No fim;
	
	// m�todo para inserir um elemento na lista.
	// a inser��o deve manter a lista ordenada (ordem crescente)
	public void inserir(int dado) {
		
		No no = new No(dado);
		No aux = inicio;

		if (inicio == null) {
			inicio = no;
			fim = no;

		} else if (no.dado >= fim.dado){
			fim.dir = no;
			no.esq = fim;
			fim = aux;

		} else if (no.dado <= inicio.dado){
			inicio.esq = no;
			no.dir = inicio;
			inicio = no;

		} else{
			while(aux != null){		
				if(no.dado >= aux.dado && no.dado <= aux.dir.dado){
					aux.dir.esq = no;
					no.dir = aux.dir;
					no.esq = aux;
					aux.dir = no;
					break;
					
				}
				aux = aux.dir;
				
			}
		}
	}
	
	// m�todo para imprimir os elementos da lista
	public void imprimir() {
		No aux = inicio;
		while(aux != null) {
			System.out.println(aux.dado);
			aux = aux.dir;
		}
	}
}
