package kz.kenzhakhimov.Store.controllers;

import kz.kenzhakhimov.Store.dto.ItemDto;
import kz.kenzhakhimov.Store.entities.Item;
import kz.kenzhakhimov.Store.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping(value="/api")
public class ItemController {
    @Autowired
    private ItemService itemService;
    @GetMapping
    public ResponseEntity<List<ItemDto>> getAllBooks(){
        try
        {
            List<ItemDto> listOfItems = new ArrayList<>();
            itemService.getAllItems().forEach(listOfItems::add);

            if(listOfItems.isEmpty())
            {
                return new ResponseEntity<>(HttpStatus.NO_CONTENT);
            }

            return new ResponseEntity<>(listOfItems, HttpStatus.OK);
        }
        catch (Exception e)
        {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @PostMapping()
    public ResponseEntity<ItemDto> addItemToStore(@RequestBody ItemDto itemDto)
    {
        try
        {
            return new ResponseEntity<>(itemService.addItem(itemDto), HttpStatus.CREATED);
        }
        catch (Exception e)
        {
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
