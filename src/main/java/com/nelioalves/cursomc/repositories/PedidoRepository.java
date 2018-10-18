package com.nelioalves.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nelioalves.cursomc.domain.Pedido;

@Repository //camada de acesso a dados, faz operação no BD e retorna para a camada de serviço
public interface PedidoRepository extends JpaRepository<Pedido, Integer>{ 

}
