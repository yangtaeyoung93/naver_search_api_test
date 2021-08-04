package com.example.restaurant.wishList.Entity;

import com.example.restaurant.db.MemoryDbEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class WishListEntity extends MemoryDbEntity {

    private String title;       //장소명 , 음식명
    private String category;    // 카테고리
    private String address;     // 주소
    private String roadAddress;     //도로명
    private String hompageLink; // 홈페이지 링크
    private String imageLink;   //이미지 링크
    private boolean isVisit;        //방문여부
    private int visitCount;     // 방문 카운트
    private LocalDate lastVisitDate;       //마지막 방문일자

}
