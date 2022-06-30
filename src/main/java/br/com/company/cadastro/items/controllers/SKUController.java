package br.com.company.cadastro.items.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.company.cadastro.items.payloads.StringIds;
import br.com.company.cadastro.items.services.DiffIdServ;
import br.com.company.cadastro.items.services.ItemParentServ;
import br.com.company.cadastro.items.services.SKUServ;

@RestController
@RequestMapping("/skus")
public class SKUController {

    public static final Logger console = LoggerFactory.getLogger(SKUController.class);

    @Autowired
    private SKUServ service;

    @Autowired
    private DiffIdServ diffIdService;

    @Autowired
    private ItemParentServ itemParentService;


    @GetMapping("/{id}")    
    public ResponseEntity<?> findFullById(@PathVariable String id){
        try {

            if(id.equals(" ") || id.equals(" ")){
                return new ResponseEntity<>("The id of SKU is required", HttpStatus.BAD_REQUEST);
            }

            var sku = service.findById(id);

            if(sku != null){
                sku.setColor(diffIdService.findById(sku.getDiff01()));
                sku.setSize(diffIdService.findById(sku.getDiff02()));
                sku.setItemParent(itemParentService.findById(sku.getItemParentId()));

                return new ResponseEntity<>(sku, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("No data has been founded for id " + id, HttpStatus.NOT_FOUND);
            }
            
        } catch (Exception e) {
            console.error(e.getMessage(), e);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{id}/header")    
    public ResponseEntity<?> findHeadById(@PathVariable String id){
        try {

            if(id.equals(" ") || id.equals(" ")){
                return new ResponseEntity<>("The id of SKU is required", HttpStatus.BAD_REQUEST);
            }

            var sku = service.findById(id);

            if(sku != null){
                return new ResponseEntity<>(sku, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("No data has been founded for id " + id, HttpStatus.NOT_FOUND);
            }
            
        } catch (Exception e) {
            console.error(e.getMessage(), e);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{itemParentId}/by-item-parent-id")    
    public ResponseEntity<?> findByItemParentId(@PathVariable String itemParentId){
        try {

            Long converted = Long.valueOf(itemParentId);

            if(converted.compareTo(0L) <= 0){
                return new ResponseEntity<>("The id of SKU is required", HttpStatus.BAD_REQUEST);
            }

            var skus = service.findByIdItemParent(itemParentId);

            if(!skus.isEmpty()){

                for(var sku : skus){
                    sku.setColor(diffIdService.findById(sku.getDiff01()));
                    sku.setSize(diffIdService.findById(sku.getDiff02()));
                    sku.setItemParent(itemParentService.findById(sku.getItemParentId()));
                }

                return new ResponseEntity<>(skus, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("No data has been founded for item parent " + itemParentId, HttpStatus.NOT_FOUND);
            }
            
        } catch (Exception e) {
            console.error(e.getMessage(), e);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/{itemParentId}/header/by-item-parent-id")    
    public ResponseEntity<?> findHeadByItemParentId(@PathVariable String itemParentId){
        try {

            if(itemParentId.equals(" ") || itemParentId.equals(" ")){
                return new ResponseEntity<>("The id of SKU is required", HttpStatus.BAD_REQUEST);
            }

            var skus = service.findByIdItemParent(itemParentId);

            if(!skus.isEmpty()){
                return new ResponseEntity<>(skus, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("No data has been founded for item parent " + itemParentId, HttpStatus.NOT_FOUND);
            }
            
        } catch (Exception e) {
            console.error(e.getMessage(), e);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(path = "/header/by-id-list", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)    
    public ResponseEntity<?> findHeadByIdList(@RequestBody StringIds payload){
        try {

            if(payload == null || payload.getIds().isEmpty()){
                return new ResponseEntity<>("The list of ids is required", HttpStatus.BAD_REQUEST);
            }

            var skus = service.findByIdList(payload.getIds());

            if(!skus.isEmpty()){
                return new ResponseEntity<>(skus, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("No data has been founded for request body " + payload.toString(), HttpStatus.NOT_FOUND);
            }
            
        } catch (Exception e) {
            console.error(e.getMessage(), e);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(path = "/by-id-list", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)    
    public ResponseEntity<?> findByIdList(@RequestBody StringIds payload){
        try {

            if(payload == null || payload.getIds().isEmpty()){
                return new ResponseEntity<>("The list of ids is required", HttpStatus.BAD_REQUEST);
            }

            var skus = service.findByIdList(payload.getIds());

            if(!skus.isEmpty()){

                for(var sku : skus){
                    sku.setColor(diffIdService.findById(sku.getDiff01()));
                    sku.setSize(diffIdService.findById(sku.getDiff02()));
                    sku.setItemParent(itemParentService.findById(sku.getItemParentId()));
                }

                return new ResponseEntity<>(skus, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("No data has been founded for request body " + payload.toString(), HttpStatus.NOT_FOUND);
            }
            
        } catch (Exception e) {
            console.error(e.getMessage(), e);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }


}