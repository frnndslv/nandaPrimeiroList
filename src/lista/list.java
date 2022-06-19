package lista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class list {
	public static void main(String [] arge) {
		// Dada uma lista com 7 notas de um aluno [7, 8.5, 9.3, 5, 7,0 3.6], faça: 
		
		// List notas = new ArrayList();  // antes do java 5 // fazer via import 
		 
		// List notas = new ArrayList();  
		
		// List<Double> notas = new ArrayList<>();   //Generics(jdk 5) - Diamond Operator(Jdk 7)
		// ArreysList<Double> notas = new ArrayList<>();
		// List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6));
		
		/*  List<double> notas = Array.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
		notas.add(10d);
		system.out.println(notas); 
		*/
		
		/* 
		  List<double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
		  notas.add(1d);
		  notas.remove(5d);
		  System.out.println(notas)
		  
		  */
		
		  System.out.println("Crie uma lista e adicione as sete notas");
		  List<Double> notas = new ArrayList<Double>(); 
		  notas.add(7.0);
		  notas.add(8.5);
		  notas.add(9.3);
		  notas.add(5.0);
		  notas.add(7.0);
		  notas.add(0.0);
		  notas.add(3.6);
		  
		  System.out.println("Exiba a terceira nota adicionada: " + notas.get(2));
		  System.out.println(notas.toString());
		  
		  System.out.println("Exiba a terceira nota adicionada: " + Collections.min(notas));
		  
		  System.out.println("Exiba a terceira nota adicionada: " + Collections.max(notas));
		  
		  Iterator<Double> iterator = notas.iterator();
		  Double soma = 0d;
		  while(iterator.hasNext()) {
			  Double next = iterator.next();
			  soma = soma + next;
		  }
		  System.out.println("Exiba a soma dos valores: " + soma);
		  
		  System.out.println("Exiba a média das notas: " + (soma/notas.size()));
		  
		  System.out.println("Remova a nota 0: ");
		  notas.remove(0d);
		  System.out.println(notas);
		  
		  System.out.println("Remova a nota na posição 0: ");
		  notas.remove(0);
		  System.out.println(notas);
		  
		  System.out.println("Remova as notas menores que 7 e exiba a lista: ");
		  Iterator<Double> iterator1 = notas.iterator();
		  while(iterator1.hasNext()) {
			  Double next = iterator1.next();
			  if(next < 7) {
				  iterator1.remove();
			  }
		  }
		  System.out.println(notas);
		  
		  System.out.println("Apague toda a lista");
		  notas.clear();
		  System.out.println(notas);
		  
		  System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
		  
	}

}
