package org.jiyeon.sns.repository;

import org.jiyeon.sns.domain.Board;
import org.jiyeon.sns.search.BoardSearch;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface BoardRepository extends JpaRepository<Board,Long>, BoardSearch {

    @Query(value="select now()", nativeQuery = true)
    String getTime();
}
