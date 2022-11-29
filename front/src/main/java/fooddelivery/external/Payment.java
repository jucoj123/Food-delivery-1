package fooddelivery.external;

import java.util.Date;
import lombok.Data;

@Data
public class Payment {

    private Long payid;
    private String orderid;
}
