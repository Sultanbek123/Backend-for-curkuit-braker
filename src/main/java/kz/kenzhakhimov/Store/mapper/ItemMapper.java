package kz.kenzhakhimov.Store.mapper;

import kz.kenzhakhimov.Store.dto.ItemDto;
import kz.kenzhakhimov.Store.entities.Item;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ItemMapper {
    ItemDto mapToDto(Item item);
    Item mapToEntity(ItemDto itemDto);
    List<ItemDto> mapToDtoList(List<Item>items);
}
