package teste;

import javax.swing.JOptionPane;

public class Main {
	public static void main(String[] args) {
		Livro livro = new Livro();
		livro.setTitulo("POO 2");
		int publicacao = Integer.parseInt(JOptionPane.showInputDialog("Qual o ano de publicação?"));
		
		livro.setPublicacao(publicacao);
		
		System.out.println(livro.getTitulo());
		JOptionPane.showMessageDialog(null, livro.getTitulo()+" \n"+livro.getPublicacao());
	}
}
