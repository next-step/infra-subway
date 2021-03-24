package nextstep.subway.line.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LineRepository extends JpaRepository<Line, Long> {

    @Query(value = "SELECT * FROM line WHERE SLEEP(3)", nativeQuery = true)
    List<Line> findAll();
}
