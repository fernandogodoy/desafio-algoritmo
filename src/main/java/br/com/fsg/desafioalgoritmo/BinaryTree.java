package br.com.fsg.desafioalgoritmo;

public class BinaryTree {

	private String id;
	private int valor;

	private BinaryTree left;

	private BinaryTree right;

	public BinaryTree(String id, int valor) {
		this.id = id;
		this.valor = valor;
	}

	public String getId() {
		return id;
	}

	public int getValor() {
		return valor;
	}

	public BinaryTree getLeft() {
		return left;
	}

	public void setLeft(BinaryTree left) {
		this.left = left;
	}

	public BinaryTree getRight() {
		return right;
	}

	public void setRight(BinaryTree right) {
		this.right = right;
	}

}
