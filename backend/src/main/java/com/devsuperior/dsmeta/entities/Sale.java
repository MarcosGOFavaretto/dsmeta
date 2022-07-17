/**
 * O JPA é utilizado para mapear as colunas no banco de dados com os atributos da entidade no código Java. Onde:
 * 	-	@Entity: Indica que a classe possui uma tabela equiavelente no banco.
 * 	-	@Table(name = "nome"): Indica o nome da tabela equivalente à classe.
 * 	-	@Id: Indica o atributo referente à primary key da tabela.
 * 	-	@GeneratedValue(strategy = "estrategia"): Indica como os IDs devem ser gerados.
 */
package com.devsuperior.dsmeta.entities;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_sales")
public class Sale {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Define que os IDs serão auto-incrementados
	private long id;
	private String sellerName;
	private Integer visited;
	private Integer deals;
	private Double amount;
	private LocalDate date;

	public Sale() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSellerName() {
		return sellerName;
	}

	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}

	public Integer getVisited() {
		return visited;
	}

	public void setVisited(Integer visited) {
		this.visited = visited;
	}

	public Integer getDeals() {
		return deals;
	}

	public void setDeals(Integer deals) {
		this.deals = deals;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}
}