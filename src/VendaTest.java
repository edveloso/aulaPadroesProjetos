import java.util.ArrayList;
import java.util.List;

import junit.framework.Assert;
import modelo.Cliente;
import modelo.Item;
import modelo.Produto;
import modelo.Venda;

import org.junit.Test;


public class VendaTest {

	@Test
	public void test() {
		Venda venda = new Venda();
		venda.setNumero(1);
		List<Item> itens = new ArrayList<Item>();
		Item item = new Item();
		item.setQuantidade(10);
		Produto produto = new Produto();
		produto.setCodigo(123);
		produto.setDescricao("Manteiga qualy");
		produto.setValorUnitario(2.99);
		item.setProduto(produto);
		itens.add(item);
		venda.setItens(itens);
		Assert.assertEquals(venda.getNumero(), 1);
		Assert.assertEquals(venda.getItens().size(), 1);
	}

}
