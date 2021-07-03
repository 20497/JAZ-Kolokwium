package pjatk.edu.pl.jaz20497nbp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pjatk.edu.pl.jaz20497nbp.models.Request;

@Repository
public interface NbpRepository extends JpaRepository<Request, Long> {
    Request save(Request newRequest);
}
