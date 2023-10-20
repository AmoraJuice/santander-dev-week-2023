package me.dio.santanderdevweek2023.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    default boolean existsByAccountNumber(String accountNumber) {
        return false;
    }
}
