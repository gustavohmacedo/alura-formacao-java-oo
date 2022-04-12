package br.com.alura.teste.utill;

public class TesteAutoboxingUnboxing {
	public static void main(String[] args) {
		
		int idade = 33;
		Integer idadeRef = Integer.valueOf(idade); //Autoboxing: Primitivo -> Warapper(Obj)
		System.out.println(idadeRef);
		
		int idadePrimitivo = idadeRef.intValue(); //Unboxing: Warapper(Obj) -> primitivo
		System.out.println(idadePrimitivo);
		
		//parsing: Conversão do String para um tipo específico.
		String string = args[0];
		int stringParaInteiro = Integer.parseInt(string); //Unboxing: Warapper(Obj) -> primitivo 
		System.out.println(stringParaInteiro);
		
		
		
		
		
	}

}
