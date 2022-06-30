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
import br.com.company.cadastro.items.services.PackItemServ;
import br.com.company.cadastro.items.services.PackServ;
import br.com.company.cadastro.items.services.SKUServ;

@RestController
@RequestMapping("/packs")
public class PackController {

    public static final Logger console = LoggerFactory.getLogger(PackController.class);

    @Autowired
    private PackServ packService;

    @Autowired
    private PackItemServ packItemService;

    @Autowired 
    private SKUServ skuService;

    @GetMapping(path = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> findFullById(@PathVariable String id){

        try {

            Long converted = Long.parseLong(id);

            if(converted.compareTo(0L) <= 0){
                return new ResponseEntity<>("The pack id is required", HttpStatus.BAD_REQUEST);
            }

            var pack = packService.findById(id);

            if(pack != null){
                pack.setItems(packItemService.findByPackId(id));

                for(var packItem : pack.getItems()){
                    packItem.setSku(skuService.findById(packItem.getSkuId()));
                }

                return new ResponseEntity<>(pack, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("No data has been founded for id " + id, HttpStatus.NOT_FOUND);
            }

            
        } catch (Exception e) {
            console.error(e.getMessage(), e);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(path = "/by-id-list", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> findFullByIdList(@RequestBody StringIds payload){

        try {

            if(payload.getIds().isEmpty()){
                return new ResponseEntity<>("The list of ids is required", HttpStatus.BAD_REQUEST);
            }

            var packs = packService.findByIdList(payload.getIds());

            if(!packs.isEmpty()){

                for(var pack : packs){
                    pack.setItems(packItemService.findByPackId(pack.getId()));

                    for(var packItem : pack.getItems()){
                        packItem.setSku(skuService.findById(packItem.getSkuId()));
                    }
                }

                return new ResponseEntity<>(packs, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("No data has been founded for request body " + payload.toString(), HttpStatus.NOT_FOUND);
            }

            
        } catch (Exception e) {
            console.error(e.getMessage(), e);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(path = "/header/by-id-list", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> findHeadByIdList(@RequestBody StringIds payload){

        try {

            if(payload.getIds().isEmpty()){
                return new ResponseEntity<>("The list of ids is required", HttpStatus.BAD_REQUEST);
            }

            var packs = packService.findByIdList(payload.getIds());

            if(!packs.isEmpty()){
                return new ResponseEntity<>(packs, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("No data has been founded for request body " + payload.toString(), HttpStatus.NOT_FOUND);
            }

            
        } catch (Exception e) {
            console.error(e.getMessage(), e);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @PostMapping(path = "/items-header/by-id-list", produces = MediaType.APPLICATION_JSON_VALUE, consumes = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> findItemsHeadByIdList(@RequestBody StringIds payload){

        try {

            if(payload.getIds().isEmpty()){
                return new ResponseEntity<>("The list of ids is required", HttpStatus.BAD_REQUEST);
            }

            var packs = packService.findByIdList(payload.getIds());

            if(!packs.isEmpty()){

                for(var pack : packs){
                    pack.setItems(packItemService.findByPackId(pack.getId()));
                }

                return new ResponseEntity<>(packs, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("No data has been founded for request body " + payload.toString(), HttpStatus.NOT_FOUND);
            }
            
        } catch (Exception e) {
            console.error(e.getMessage(), e);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(path = "/{id}/header", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> findHeadById(@PathVariable String id){

        try {

            Long converted = Long.parseLong(id);

            if(converted.compareTo(0L) <= 0){
                return new ResponseEntity<>("The pack id is required", HttpStatus.BAD_REQUEST);
            }

            var pack = packService.findById(id);

            if(pack != null){
                return new ResponseEntity<>(pack, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("No data has been founded for id " + id, HttpStatus.NOT_FOUND);
            }

            
        } catch (Exception e) {
            console.error(e.getMessage(), e);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping(path = "/{id}/items-header", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> findItemsWithHeadById(@PathVariable String id){

        try {

            Long converted = Long.parseLong(id);

            if(converted.compareTo(0L) <= 0){
                return new ResponseEntity<>("The pack id is required", HttpStatus.BAD_REQUEST);
            }

            var pack = packService.findById(id);

            if(pack != null){
                pack.setItems(packItemService.findByPackId(id));

                return new ResponseEntity<>(pack, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("No data has been founded for id " + id, HttpStatus.NOT_FOUND);
            }

            
        } catch (Exception e) {
            console.error(e.getMessage(), e);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }



}