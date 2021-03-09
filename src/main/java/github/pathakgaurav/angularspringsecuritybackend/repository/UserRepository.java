package github.pathakgaurav.angularspringsecuritybackend.repository;

import github.pathakgaurav.angularspringsecuritybackend.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
