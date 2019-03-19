package br.com.fiap.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_PRODUTO")
@SequenceGenerator(name="produto",sequenceName="SQ_T_PRODUTO",allocationSize=1)
public class Produto {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="produto")
	@Column(name="cd_produto")
	private int id;
	
	
	@Column(name="nm_nome")
	private String nome;
	
	@Column(name="vl_valor")
	private double valor;
	
	
	@OneToMany(mappedBy="produto")
	private List<ItemCarrinho> itemCarrinho;

}
