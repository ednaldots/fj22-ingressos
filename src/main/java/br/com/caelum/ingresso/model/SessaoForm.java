package br.com.caelum.ingresso.model;

import java.time.LocalTime;
import javax.validation.constraints.NotNull;

import org.springframework.format.annotation.DateTimeFormat;

import br.com.caelum.ingresso.dao.FilmeDao;
import br.com.caelum.ingresso.dao.SalaDao;

public class SessaoForm {
	
	private Integer id; 
	
	@NotNull
	private Integer salaId;
	
	@DateTimeFormat(pattern="HH:mm") 
	@NotNull
	private LocalTime horário; 
	
	@NotNull
	private Integer filmeId;

	private LocalTime horario;
	
	public Sessao toSessao(SalaDao salaDao, FilmeDao filmeDao){ 
	Filme filme = filmeDao.findOne(filmeId); 
	Sala sala = salaDao.findOne(salaId);
	
	Sessao sessao = new Sessao(this.horario, filme, sala); 
	
	return toSessao(null, null);
	}
	//criar getters e setters

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSalaId() {
		return salaId;
	}

	public void setSalaId(Integer salaId) {
		this.salaId = salaId;
	}

	public LocalTime getHorário() {
		return horário;
	}

	public void setHorário(LocalTime horário) {
		this.horário = horário;
	}

	public Integer getFilmeId() {
		return filmeId;
	}

	public void setFilmeId(Integer filmeId) {
		this.filmeId = filmeId;
	}

	public LocalTime getHorario() {
		return horario;
	}

	public void setHorario(LocalTime horario) {
		this.horario = horario;
	}
	

}
