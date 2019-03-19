package br.com.fiap.entity;

import java.util.Calendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;


@Entity
@Table(name="T_CARRINHO_COMPRAS")
@SequenceGenerator(name="carrinhoCompras",sequenceName="SQ_T_CARRINHO_COMPRAS",allocationSize=1)
public class CarrinhoCompras {
	
	@Id
	@Column(name="cd_id")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="carrinhoCompras")
	private int codigo;
	
	
	@Column(name="dt_data_compra")
	@CreationTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar data;
	
	@OneToMany(mappedBy="carrinho")
	private List<ItemCarrinho> itens;
	
	@OneToOne
	@JoinColumn(name="cd_cliente",nullable=false)
	private Cliente cliente;
	
	@Column(name="vl_valor")
	private double valorTotal;

}
