package com.practica.demo.util;

import java.util.List;

public class QueryResult {

	private int totalRecords;
	private List<Object> lista;
	
	
	public int getTotalRecords() {
		return totalRecords;
	}
	public void setTotalRecords(int totalRecords) {
		this.totalRecords = totalRecords;
	}
	public List<Object> getLista() {
		return lista;
	}
	public void setLista(List<Object> lista) {
		this.lista = lista;
	}
}
