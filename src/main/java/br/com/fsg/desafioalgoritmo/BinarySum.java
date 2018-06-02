package br.com.fsg.desafioalgoritmo;

/**
 * Dado um nó da árvore calcule a soma de todos os nós subsequentes.
 * 
 * @author Fernando-Godoy
 *
 */
public class BinarySum {

	private BinaryTree binaryTree;
	private Integer soma;

	public Integer somarProximos(String identificao) {
		create();
		soma = 0;
		buscar(binaryTree, identificao, false);
		return soma;
	}

	private void buscar(BinaryTree binaryTree, String identificao, boolean encontrado) {
		if (binaryTree != null) {
			if (!encontrado && binaryTree.getId().equals(identificao)) {
				encontrado = true;
			}
			if (encontrado) {
				soma += binaryTree.getValor();
			}
			buscar(binaryTree.getLeft(), identificao, encontrado);
			buscar(binaryTree.getRight(), identificao, encontrado);
		}
	}

	private void create() {
		binaryTree = new BinaryTree("0", 0);
		BinaryTree b1 = new BinaryTree("1", 1);
		BinaryTree b2 = new BinaryTree("2", 2);
		binaryTree.setLeft(b1);
		binaryTree.setRight(b2);
		BinaryTree b3 = new BinaryTree("3", 3);
		BinaryTree b4 = new BinaryTree("4", 4);
		b1.setLeft(b3);
		b1.setRight(b4);
		BinaryTree b5 = new BinaryTree("5", 5);
		BinaryTree b6 = new BinaryTree("6", 6);
		b2.setLeft(b5);
		b2.setRight(b6);
		BinaryTree b7 = new BinaryTree("7", 7);
		BinaryTree b8 = new BinaryTree("8", 8);
		b3.setLeft(b7);
		b3.setRight(b8);

	}

}
