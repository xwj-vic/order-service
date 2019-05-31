package com.dmall.orderservice.adapter.inventory;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

//TODO change to use feign client
@FeignClient(value = "inventory-service")
public interface InventoryClient {

    @RequestMapping(method = RequestMethod.POST, value = "/inventories/lock")
    String lock(Lock lock);

    @RequestMapping(method = RequestMethod.PUT, value = "/inventories/{lockId}")
    void unlock(@PathVariable(value = "lockId") String lockId);
}
