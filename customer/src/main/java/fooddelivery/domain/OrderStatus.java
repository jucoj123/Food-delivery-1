package fooddelivery.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;

@Entity
@Table(name="OrderStatus_table")
@Data
public class OrderStatus {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long orderid;
        private String foodid;
        private String deliverystatus;
        private String orderstatus;


}