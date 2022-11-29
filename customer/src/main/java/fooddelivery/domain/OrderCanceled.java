package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class OrderCanceled extends AbstractEvent {

    private Long orderid;
    private String foodid;
    private String customerid;
    private String options;
    private String address;
    private String status;
    private String preference;
}


