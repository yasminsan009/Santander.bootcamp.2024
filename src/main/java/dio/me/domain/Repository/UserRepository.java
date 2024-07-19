package dio.me.domain.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.me.domain.model.ClientInformation;

public interface UserRepository extends JpaRepository<ClientInformation, Long>{

    
}