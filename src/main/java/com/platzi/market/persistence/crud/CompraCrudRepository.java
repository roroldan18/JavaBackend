

package com.platzi.market.persistence.crud;

import com.platzi.market.persistence.entity.Compra;
import java.util.*;
import org.springframework.data.repository.CrudRepository;


public interface CompraCrudRepository extends CrudRepository<Compra, Integer> {
    
    Optional<List<Compra>> findByIdCliente(String idCliente);
    
}
