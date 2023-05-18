package kz.kenzhakhimov.Store.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="items")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Item extends BaseEntity{
    private String name;
    private int price;
    private int amount;
    private String promo;
}
