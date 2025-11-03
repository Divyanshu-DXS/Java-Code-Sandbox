package com.dxs.projects.library_backend.repository;

import com.dxs.projects.library_backend.entities.Rating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RatingRepository extends JpaRepository<Rating,Integer> {
}
