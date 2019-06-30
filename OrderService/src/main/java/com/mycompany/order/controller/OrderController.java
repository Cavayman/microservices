package com.mycompany.order.controller;

import com.mycompany.order.dto.OrderDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/", produces = MediaType.APPLICATION_JSON_VALUE)
public class OrderController {

    @GetMapping("getOrder")
    public OrderDTO getOrder(){
        return new OrderDTO(1L,"Yurii","123123qwerty");
    }

}
