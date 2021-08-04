package com.example.restaurant.db;

import java.util.List;
import java.util.Optional;

public interface MemoryDBRepository<T> {

    Optional<T> findById(int index); // 해당 타입의 (엔티티)데이터를 찾아 리턴
    T save(T entity); //저장
    void deleteById(int index); // 삭제
    List<T> findAll();
}
