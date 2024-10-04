package com.streamFlix.app.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.streamFlix.app.entities.Video;
import java.util.Optional;

@Repository
public interface VideoRepository extends JpaRepository <Video, String> {
	Optional<Video> findByTitle(String title);
}
