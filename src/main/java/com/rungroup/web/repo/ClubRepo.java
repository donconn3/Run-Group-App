package com.rungroup.web.repo;

import com.rungroup.web.modals.Club;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ClubRepo extends JpaRepository<Club, Long> {
    Optional<Club> findByTitle(String url);
}
