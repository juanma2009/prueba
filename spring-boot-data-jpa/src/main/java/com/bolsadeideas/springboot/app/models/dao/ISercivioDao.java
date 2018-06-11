package com.bolsadeideas.springboot.app.models.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.bolsadeideas.springboot.app.models.entity.Servicio;

public interface ISercivioDao extends PagingAndSortingRepository <Servicio,Long> {

}
