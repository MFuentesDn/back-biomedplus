package com.softdevelop.biomedplus.repository;

import com.softdevelop.biomedplus.model.entity.EquipmentEntity;
import com.softdevelop.biomedplus.model.entity.SpareEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface SpareRepository extends CrudRepository<SpareEntity, Long> {
    List<SpareEntity> findAll();

}
