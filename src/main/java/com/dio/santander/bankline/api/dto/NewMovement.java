package com.dio.santander.bankline.api.dto;



import com.dio.santander.bankline.api.model.MovementType;

public class NewMovement {
	private String description;	
	private Double valor;
	private MovementType type;	
	private Integer idAccount;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}
	public MovementType getType() {
		return type;
	}
	public void setType(MovementType type) {
		this.type = type;
	}
	public Integer getIdAccount() {
		return idAccount;
	}
	public void setIdAccount(Integer idAccount) {
		this.idAccount = idAccount;
	}
	
	
}
