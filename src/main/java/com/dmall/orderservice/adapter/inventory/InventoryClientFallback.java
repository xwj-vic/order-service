package com.dmall.orderservice.adapter.inventory;

import org.springframework.stereotype.Component;

@Component
public class InventoryClientFallback implements InventoryClient {

  @Override
  public String lock(Lock lock) {
    return "我失败啦";
  }

  @Override
  public void unlock(String lockId) {

  }
}
