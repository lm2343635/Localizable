package org.mushare.wooder.server.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectRepository extends JpaRepository<ProjectDto, Long> {

  Page<ProjectDto> findByGroupDtoId(long groupId, Pageable pageable);
}
