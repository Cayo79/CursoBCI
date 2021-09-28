package com.everis.curso.service.impl;

import com.everis.curso.dao.DAOProductoInterface;
import com.everis.curso.dao.DAOSPConsultaNombreInterface;
import com.everis.curso.model.Producto;
import com.everis.curso.model.SPConsulta;
import com.everis.curso.model.SPConsultaNombre;
import com.everis.curso.service.BSDProductoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.StoredProcedureQuery;
import java.util.ArrayList;
import java.util.List;

@Service
public class BSDProducto implements BSDProductoInterface {
    @Autowired
    private DAOProductoInterface daoProducto;

    @Autowired
    private EntityManager entityManager;

    @Autowired
    private DAOSPConsultaNombreInterface daospConsultaNombre;

    @Override
    public List<Producto> listarProducto() {
        return daoProducto.findAll(Sort.by(Sort.Direction.ASC, "cantidad"));
    }

    @Override
    public List<Producto> listarEstatusProducto(Boolean sts) {
        return daoProducto.findByEstatusEquals(sts);
    }

    @Override
    public Page<Producto> listarProductoDesc(Integer pageNumber) {

        // pageNumero es el numero de la pagina empezando desde 0
        // 4 es la cantidad de Registros
        // Sor.by es el ordenamiento ASC y DESC luego el nombre del Campo
        Pageable pageable = PageRequest.of(pageNumber.intValue(), 4, Sort.by(Sort.Direction.DESC, "idProducto"));
        return daoProducto.findAll(pageable);
    }

    @Override
    public List<Producto> listarProductoNombre(String nombre) {
        return daoProducto.findByNombreContains(nombre);
    }

    @Override
    public Producto crearProducto(Producto producto) {
        return daoProducto.save(producto);
    }

    @Override
    public void eliminarProducto(Integer id) {
        daoProducto.deleteById(id);
    }

    @Override
    public List<SPConsulta> buscarConsulta(Integer id) {
        StoredProcedureQuery storedProcedureQuery = this.entityManager.createNamedStoredProcedureQuery("SP_Producto");
        storedProcedureQuery.setParameter("vId", id);
        storedProcedureQuery.execute();

        return storedProcedureQuery.getResultList();
    }

    @Override
    public List<SPConsultaNombre> buscarNombre(String name) {
        List<SPConsultaNombre> lista = new ArrayList<>();
        lista = daospConsultaNombre.procedureName(name);
        return lista;
    }

}
