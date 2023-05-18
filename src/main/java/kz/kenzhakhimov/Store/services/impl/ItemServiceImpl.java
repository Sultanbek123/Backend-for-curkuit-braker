package kz.kenzhakhimov.Store.services.impl;

import kz.kenzhakhimov.Store.dto.ItemDto;
import kz.kenzhakhimov.Store.entities.Item;
import kz.kenzhakhimov.Store.mapper.ItemMapper;
import kz.kenzhakhimov.Store.repositories.ItemRepository;
import kz.kenzhakhimov.Store.services.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class ItemServiceImpl implements ItemService {
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private ItemMapper itemMapper;
    @Override
    public ItemDto addItem(ItemDto itemDto) {
        Item item = Item.builder()
                .name(itemDto.getName())
                .price(itemDto.getPrice())
                .amount(itemDto.getAmount())
                .promo(UUID.randomUUID().toString())
                .build();
        return itemMapper.mapToDto(itemRepository.save(item));
    }

    @Override
    public List<ItemDto> getAllItems() {
        return itemMapper.mapToDtoList(itemRepository.findAll());
    }
}
