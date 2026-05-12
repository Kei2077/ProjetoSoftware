package com.dmgmodels.lojaRoupas.repository;
import com.dmgmodels.lojaRoupas.model.Roupa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.util.Streamable;

public interface RoupaRepository extends JpaRepository<Roupa, Integer> {
    Streamable<Roupa> findByNomeProduto(String nomeProduto);
}
