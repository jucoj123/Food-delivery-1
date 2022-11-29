package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Cooked extends AbstractEvent {

    private Long sotreid;
    private String foodid;
    private String orderid;
    private String status;
    private String prefernece;

    public Cooked(Store aggregate){
        super(aggregate);
    }
    public Cooked(){
        super();
    }
}
