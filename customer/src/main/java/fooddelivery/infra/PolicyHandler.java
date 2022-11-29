package fooddelivery.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import fooddelivery.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import fooddelivery.domain.*;


@Service
@Transactional
public class PolicyHandler{
    @Autowired NotificationRepository notificationRepository;
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='DeliveryStarted'")
    public void wheneverDeliveryStarted_NotifyKakaotalk(@Payload DeliveryStarted deliveryStarted){

        DeliveryStarted event = deliveryStarted;
        System.out.println("\n\n##### listener NotifyKakaotalk : " + deliveryStarted + "\n\n");


        

        // Sample Logic //
        Notification.notifyKakaotalk(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderPlaced'")
    public void wheneverOrderPlaced_NotifyKakaotalk(@Payload OrderPlaced orderPlaced){

        OrderPlaced event = orderPlaced;
        System.out.println("\n\n##### listener NotifyKakaotalk : " + orderPlaced + "\n\n");


        

        // Sample Logic //
        Notification.notifyKakaotalk(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='OrderCanceled'")
    public void wheneverOrderCanceled_NotifyKakaotalk(@Payload OrderCanceled orderCanceled){

        OrderCanceled event = orderCanceled;
        System.out.println("\n\n##### listener NotifyKakaotalk : " + orderCanceled + "\n\n");


        

        // Sample Logic //
        Notification.notifyKakaotalk(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Paid'")
    public void wheneverPaid_NotifyKakaotalk(@Payload Paid paid){

        Paid event = paid;
        System.out.println("\n\n##### listener NotifyKakaotalk : " + paid + "\n\n");


        

        // Sample Logic //
        Notification.notifyKakaotalk(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Accepted'")
    public void wheneverAccepted_NotifyKakaotalk(@Payload Accepted accepted){

        Accepted event = accepted;
        System.out.println("\n\n##### listener NotifyKakaotalk : " + accepted + "\n\n");


        

        // Sample Logic //
        Notification.notifyKakaotalk(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Rejected'")
    public void wheneverRejected_NotifyKakaotalk(@Payload Rejected rejected){

        Rejected event = rejected;
        System.out.println("\n\n##### listener NotifyKakaotalk : " + rejected + "\n\n");


        

        // Sample Logic //
        Notification.notifyKakaotalk(event);
        

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Cooked'")
    public void wheneverCooked_NotifyKakaotalk(@Payload Cooked cooked){

        Cooked event = cooked;
        System.out.println("\n\n##### listener NotifyKakaotalk : " + cooked + "\n\n");


        

        // Sample Logic //
        Notification.notifyKakaotalk(event);
        

        

    }

}


