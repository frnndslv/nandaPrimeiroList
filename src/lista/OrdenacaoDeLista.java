package lista;


import java.util.ArrayList;
import java.util.List;

public class OrdenacaoDeLista {


	public static void main(String[] args) {
		// ordenaçao de lista exemple.
		
		List<Gato> meusgatos = new ArrayList<>(){{
			
				add(new Gato("Jon", 18, "preto"));
				add(new Gato("Simba", 6, "tigrado"));
				add(new Gato("Jon", 12, "amarelo"));
		}};
		
		System.out.println("--\tOrdem de Inserção\t---" );
		System.out.println(meusgatos);
	}
}
	

 class Gato { 
	 private String nome;
	 private Integer idade;
	 private String cor;
	 
	 public Gato(String nome, Integer idade, String cor) {
		
		 this.nome = nome;
		 this.idade = idade;
		 this.cor = cor;
		 
	}
	 
	 
	 public String getNome() {
		return nome;
	}
	 
	 public Integer getIdade() {
		return idade;
	}

	 
	public String getCor() {
		return cor;
		
	}
	
	@Override
	public String toString() {
		return "Gato { " +
				"nome = '" + nome + "', idade = " + idade + ", cor = '" + cor + '\'' +
				'}';
	}
	
 }
 
