package br.com.gestaoadm.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class PesquisaEmpresaBean {

	private List<Integer> empresaFiltrados;
	
	public PesquisaEmpresaBean() {
		empresaFiltrados = new ArrayList<>();
		for (int i = 0; i < 50; i++) {
			empresaFiltrados.add(i);
		}
	}

	public List<Integer> getEmpresaFiltrados() {
		return empresaFiltrados;
	}

	

}
