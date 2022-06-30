package br.com.company.cadastro.items.controllers;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.company.cadastro.items.models.Atributo;
import br.com.company.cadastro.items.models.AtributoSKU;
import br.com.company.cadastro.items.services.AtributoServ;

@RestController
@RequestMapping("/atributos")
public class AtributoController {
	
    public static final Logger console = LoggerFactory.getLogger(AtributoController.class);
	
    @Autowired
    private AtributoServ atributoService;

    @GetMapping(path = "/{id}/det", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> findByIdDet(@PathVariable Integer id){

        try {

            if(id.equals(0)){
                return new ResponseEntity<>("O id do sku deve ser informado e maior que 0.", HttpStatus.BAD_REQUEST);
            }
            var atributos = atributoService.findById(id);

            List<AtributoSKU> listaAtributos = new ArrayList<>();
            //Loop na quantidade de Grupos de Atributos que o sku possui                
            for(Atributo atributo : atributos){
                listaAtributos.addAll(atributoService.findByIdList(atributo));
            }

            if(!listaAtributos.isEmpty()){
                return new ResponseEntity<>(listaAtributos, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("SKU não encontrado para o id " + id, HttpStatus.NOT_FOUND);
            }
            
        } catch (Exception e) {
            console.error(e.getMessage(), e);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    
    @GetMapping(path = "/attribid/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> listByAtributo(@PathVariable Long id){

        try {

            if(id.equals(0L)){
                return new ResponseEntity<>("O id do Atributo deve ser informado e maior que zero.", HttpStatus.BAD_REQUEST);
            }

            var lojas = atributoService.listByAtributo(id);

            if(lojas != null){
                return new ResponseEntity<>(lojas, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("Nenhum sku encontrado para o id " + id, HttpStatus.NOT_FOUND);
            }
            
        } catch (Exception e) {
            console.error(e.getMessage(), e);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
        }

    }
    @GetMapping("/getByItemAttribId")    
    public ResponseEntity<?> getItemByAttribId(
        @RequestParam(name = "atributo") Long atributo,
        @RequestParam(name = "item") Long item
    ){
        try {

            if(atributo.equals(" ") || atributo.equals(null)){
                return new ResponseEntity<>("atributo_required", HttpStatus.BAD_REQUEST);
            }
            if(item.equals(" ") || item.equals(null)){
                return new ResponseEntity<>("item_required", HttpStatus.BAD_REQUEST);
            }

            var retorno = atributoService.getItemByAttribId(item,atributo);

            if(retorno != null){
                return new ResponseEntity<>(retorno, HttpStatus.OK);
            } else {
                return new ResponseEntity<>("no_content " + retorno, HttpStatus.NOT_FOUND);
            }
            
        } catch (Exception e) {
            console.error(e.getMessage(), e);
            return new ResponseEntity<>(e.getMessage(), HttpStatus.NOT_FOUND);
        }
    }

}
