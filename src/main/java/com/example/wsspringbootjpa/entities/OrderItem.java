package com.example.wsspringbootjpa.entities;

import com.example.wsspringbootjpa.entities.pk.OrderItemPK;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name = "tb_order_item")
@Getter
@Setter
@AllArgsConstructor
@EqualsAndHashCode
public class OrderItem implements Serializable {
    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private OrderItemPK id = new OrderItemPK();

    private Integer quantity;
    private Double price;

    public OrderItem() {
    }

    @JsonIgnore
    public Order getOrder() {
        return id.getOrder();
    }

    public Double getSubTotal() {
        return price * quantity;
    }

}
