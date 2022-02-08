package com.fastcampus.practice.cotroller;

import com.fastcampus.practice.service.StringSortService;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MainController {

    private final StringSortService stringSortService;

    public MainController(StringSortService stringSortService) {
        this.stringSortService = stringSortService;
    }

    @GetMapping("/")
    public String main(@RequestParam("list") List<String> list){
        return stringSortService.doSort(list).toString();
    }
}
