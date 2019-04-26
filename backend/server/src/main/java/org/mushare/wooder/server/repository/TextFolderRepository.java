package org.mushare.wooder.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TextFolderRepository extends JpaRepository<TextFolderDto, Long> {

}
