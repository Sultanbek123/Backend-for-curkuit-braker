package kz.kenzhakhimov.Store.repositories;

import jakarta.transaction.Transactional;
import kz.kenzhakhimov.Store.entities.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Transactional
public interface ItemRepository extends JpaRepository<Item,Long> {

}
