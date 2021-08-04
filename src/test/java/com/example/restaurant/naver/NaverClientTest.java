package com.example.restaurant.naver;

import com.example.restaurant.naver.dto.SearchImageReq;
import com.example.restaurant.naver.dto.SearchLocalReq;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@SpringBootTest
public class NaverClientTest {

    @Autowired
    private NaverClient naverClient;

    @Test
    public void SearchLocalReq (){
        var search = new SearchLocalReq();
        search.setQuery("갈비집");

        var result = naverClient.localSearch(search);
        Assertions.assertNotNull(result.getItems().stream().findFirst().get().getCategory());
        System.out.println(result);
    }
    @Test
    public void SearchImageTest (){
        var search = new SearchImageReq();
        search.setQuery("갈비집");
        var result = naverClient.imageSearch(search);
        System.out.println(result);
    }
}
