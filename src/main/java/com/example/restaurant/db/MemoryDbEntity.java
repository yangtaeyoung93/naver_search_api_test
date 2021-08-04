package com.example.restaurant.db;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class MemoryDbEntity {
    protected Integer index; // 모든 DB를 ㄱㅏ지는 것은 상속
}
