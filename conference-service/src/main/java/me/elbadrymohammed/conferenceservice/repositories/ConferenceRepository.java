package me.elbadrymohammed.conferenceservice.repositories;


import me.elbadrymohammed.conferenceservice.entities.Conference;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

@RepositoryRestController
public interface ConferenceRepository extends JpaRepository<Conference, Long> {
}
