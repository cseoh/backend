package com.choizeus02.demo.repository;

import com.choizeus02.demo.domain.Member;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataMemberRepository extends JpaRepository<Member, Long> {


}
