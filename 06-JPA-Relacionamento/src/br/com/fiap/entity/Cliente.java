package br.com.fiap.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="T_CLIENTE")
@SequenceGenerator(name="cliente", sequenceName="SQ_T_CLIENTE",allocationSize=1)
public class Cliente {
	
	
	@Id
	@Column(name="cd_cliente")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="cliente")
	private int id;
	
	@OneToOne(mappedBy="cliente")
	private CarrinhoCompras carrinho;
	
	@Column(name="nm_nome",length=200,nullable=false)
	private String nome;
	
	
	@Column(name="ds_cpf",length=11,nullable=false)
	private String cpf;

}
