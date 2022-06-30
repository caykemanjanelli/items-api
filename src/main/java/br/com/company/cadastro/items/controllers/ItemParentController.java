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
import br.com.company.cadastro.items.services.DiffGroupHeadServ;
import br.com.company.cadastro.items.services.ItemParentServ;

@RestController
@RequestMapping("/item-parents")
public class ItemParentController {

    public static final Logger console = LoggerFactory.getLogger(SKUController.class);

    @Autowired
    private ItemParentServ service;

    @Autowired
    private DiffGroupHeadServ diffGroupHeadService;

    @GetMapping("/{id}")    
    public ResponseEntity<?> findFullById(@PathVariable String id){
        try {

            if(id == null || id.trim().equals("")){
                return new ResponseEntity<>("The id of item parent is required", HttpStatus.BAD_REQUEST);
            }

            var itemParent = service.findById(id);

            if(itemParent.getId() != null){

                itemParent.setColor(diffGroupHeadService.findById(itemParent.getDiff01()));
                itemParent.setSize(diffGroupHeadService.findById(itemParent.getDiff02()));

                return new ResponseEntity<>(itemParent, HttpStatus.OK);
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
                return new ResponseEntity<>("The id of item parent is required", HttpStatus.BAD_REQUEST);
            }

            var itemParent = service.findById(id);

            if(itemParent != null){

                return new ResponseEntity<>(itemParent, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("No data has been founded for id " + id, HttpStatus.NOT_FOUND);
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

            var itemParents = service.findByIdList(payload.getIds());

            if(!itemParents.isEmpty()){
                return new ResponseEntity<>(itemParents, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("No data has been founded for request body " + payload.toString(), HttpStatus.NOT_FOUND);
            }
            
        } catch (Exception e) {
            console.error(e.getMessage(), e);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping(path = "/by-id-list", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)    
    public ResponseEntity<?> findFullByIdList(@RequestBody StringIds payload){
        try {

            if(payload == null || payload.getIds().isEmpty()){
                return new ResponseEntity<>("The list of ids is required", HttpStatus.BAD_REQUEST);
            }

            var itemParents = service.findByIdList(payload.getIds());

            if(!itemParents.isEmpty()){

                for(var itemParent : itemParents){
                    
                    itemParent.setColor(diffGroupHeadService.findById(itemParent.getDiff01()));
                    itemParent.setSize(diffGroupHeadService.findById(itemParent.getDiff02()));
    
                }

                return new ResponseEntity<>(itemParents, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("No data has been founded for request body " + payload.toString(), HttpStatus.NOT_FOUND);
            }
            
        } catch (Exception e) {
            console.error(e.getMessage(), e);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }


}