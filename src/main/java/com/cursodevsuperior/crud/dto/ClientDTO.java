package com.cursodevsuperior.crud.dto;

import java.time.LocalDate;

import com.cursodevsuperior.crud.entities.Client;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;

public class ClientDTO {

	private Long id;
	
	@NotBlank(message = "Nome é obrigatório")
	private String name;
	
	private String cpf;
	private Double income;
	
	@NotNull(message = "Data de nascimento é obrigatória")
	@PastOrPresent(message = "Data de nascimento precisa ser igual ou anterior a hoje")
	private LocalDate birthDate;
	
	private Integer children;
	
	public ClientDTO() {
	}

	public ClientDTO(Client entity) {
		id = entity.getId();
		name = entity.getName();
		cpf = entity.getCpf();
		income = entity.getIncome();
		birthDate = entity.getBirthDate();
		children = entity.getChildren();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getIncome() {
		return income;
	}

	public void setIncome(Double income) {
		this.income = income;
	}

	public LocalDate getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}

	public Integer getChildren() {
		return children;
	}

	public void setChildren(Integer children) {
		this.children = children;
	}
}
