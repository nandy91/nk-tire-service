package com.nanditha.nktireservice.repositories;

import com.nanditha.nktireservice.domain.Tire;
import org.springframework.data.repository.PagingAndSortingRepository;

import java.util.UUID;

public interface TireRepository extends PagingAndSortingRepository<Tire, UUID> {
}
