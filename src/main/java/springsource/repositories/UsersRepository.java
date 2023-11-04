package springsource.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springsource.model.User;


@Repository
public interface UsersRepository extends JpaRepository<User, Long> {
}
