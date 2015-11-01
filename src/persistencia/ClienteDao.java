package persistencia;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import datautil.ConversaoData;
import entidade.Cliente;
import entidade.Endereco;

public class ClienteDao extends Dao {

	public void create(Cliente c) throws Exception {
		open();

		stmt = con.prepareStatement("insert into cliente values(seqcli.nextval, ?, ?, ?, to_date(?, 'DD/MM/YYYY'))");
		stmt.setString(1, c.getNome());
		stmt.setString(2, c.getEmail());
		stmt.setString(3, c.getSexo());
		stmt.setString(4, new SimpleDateFormat("DD/MM/YYYY").format(c.getNascimento()));
		stmt.execute();
		stmt.close();

		stmt = con.prepareStatement("insert into endereco values(seqend.nextval, ?, ?, ?, seqcli.currval)");
		stmt.setString(1, c.getEndereco().getRua());
		stmt.setString(2, c.getEndereco().getBairro());
		stmt.setString(3, c.getEndereco().getCidade());

		stmt.execute();

		stmt.close();

		close();
	}

	public List<Cliente> findAll() throws Exception {

		open();

		stmt = con.prepareStatement(
				"select idCliente, nome, email, sexo, " + "to_char(datanasc, 'DD/MM/YYYY') as nascimento, rua, bairro, "
						+ "cidade from cliente inner join endereco on idCliente = id_cliente");
		rs = stmt.executeQuery();
		List<Cliente> lista = new ArrayList<>();
		while (rs.next()) {
			Cliente c = new Cliente(rs.getInt("idCliente"), rs.getString("nome"), rs.getString("email"),
					rs.getString("sexo"), new ConversaoData().dataParaJava(rs.getString("nascimento")));
			c.setEndereco(new Endereco(null, rs.getString("rua"), rs.getString("bairro"), rs.getString("cidade")));
			lista.add(c);
		}

		close();
		return lista;

	}

	public void delete(Integer id) throws Exception {

		open();
		stmt = con.prepareStatement("delete from endereco where id_cliente = ?");
		stmt.setInt(1, id);
		stmt.execute();
		stmt.close();

		stmt = con.prepareStatement("delete from cliente where idCliente = ?");
		stmt.setInt(1, id);
		stmt.execute();
		stmt.close();

		close();
	}

}
