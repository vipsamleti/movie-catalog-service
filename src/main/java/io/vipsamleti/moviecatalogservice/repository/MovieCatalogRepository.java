package io.vipsamleti.moviecatalogservice.repository;

import io.vipsamleti.moviecatalogservice.model.MovieCatalog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MovieCatalogRepository extends JpaRepository<MovieCatalog, String> {
}
