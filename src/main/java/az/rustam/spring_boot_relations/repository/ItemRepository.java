package az.rustam.spring_boot_relations.repository;

import az.rustam.spring_boot_relations.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntity,Long> {
}
