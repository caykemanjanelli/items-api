package br.com.company.cadastro.items.configs;

import org.ehcache.event.CacheEvent;
import org.ehcache.event.CacheEventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CacheEventLogger implements CacheEventListener<Object, Object>{

    private final Logger console = LoggerFactory.getLogger(CacheEventLogger.class);

    @Override
    public void onEvent(CacheEvent<?, ?> cacheEvent) {
      console.info("Key: {} | EventType: {} | Old value: {} | New value: {}",
               cacheEvent.getKey(), cacheEvent.getType(), cacheEvent.getOldValue(), 
               cacheEvent.getNewValue());
    }    
    
}