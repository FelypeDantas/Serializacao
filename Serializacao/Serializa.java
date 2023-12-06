package Serializacao;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class Serializa {

	public static void main(String[] args) throws Exception {
		
		String[] nomes = {"Felype" , "Beatriz", "Byanca" };
        
		
		//escrita de Objetos
		FileOutputStream fos = new FileOutputStream("D:/xti/files/objeto.ser");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(nomes);
		oos.close();
		
		//Leitura
		FileInputStream fis = new FileInputStream("D:/xti/files/objeto.ser");
		ObjectInputStream ois = new ObjectInputStream(fis);
		String[] nomes1 = (String[]) ois.readObject();
		
		System.out.println(Arrays.toString(nomes1));
		
	}

}
