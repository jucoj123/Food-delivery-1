package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OrderPlaced extends AbstractEvent {

    private Long orderid;
    private String foodid;
    private String customerid;
    private String options;
    private String address;
    private String status;
    private String preference;
}
