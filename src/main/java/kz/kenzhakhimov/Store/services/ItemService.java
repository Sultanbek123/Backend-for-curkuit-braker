package kz.kenzhakhimov.Store.services;

import kz.kenzhakhimov.Store.dto.ItemDto;
import kz.kenzhakhimov.Store.entities.Item;

import java.util.List;

public interface ItemService {
    ItemDto addItem(ItemDto itemDto);
    List<ItemDto> getAllItems();
}
