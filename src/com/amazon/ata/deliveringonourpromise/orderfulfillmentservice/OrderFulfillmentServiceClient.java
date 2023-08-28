package com.amazon.ata.deliveringonourpromise.orderfulfillmentservice;

import com.amazon.ata.deliveringonourpromise.types.Promise;
import com.amazon.ata.deliverypromiseservice.service.DeliveryPromise;
import com.amazon.ata.deliverypromiseservice.service.DeliveryPromiseService;
import com.amazon.ata.orderfulfillmentservice.OrderFulfillmentService;
import com.amazon.ata.orderfulfillmentservice.OrderPromise;

public class OrderFulfillmentServiceClient {

    private OrderFulfillmentService ofService;

    /**
     * Create new client that calls OFS with the given service object
     *
     * @param ofService The DeliveryPromiseService that this client will call
     */

    public OrderFulfillmentServiceClient(OrderFulfillmentService ofService) {
        this.ofService = ofService;
    }

    public Promise getOrderPromiseByOrderItemId(String customerOrderItemId) {
        OrderPromise orderPromise = ofService.getOrderPromise(customerOrderItemId);

        if (null == orderPromise) {
            return null;
        }
        System.out.println("customerOrderItemId = " + customerOrderItemId);

            return Promise.builder()
                    .withPromiseLatestArrivalDate(orderPromise.getPromiseLatestArrivalDate())
                    .withCustomerOrderItemId(orderPromise.getCustomerOrderItemId())
                    .withPromiseLatestShipDate(orderPromise.getPromiseLatestShipDate())
                    .withPromiseEffectiveDate(orderPromise.getPromiseEffectiveDate())
                    .withIsActive(orderPromise.isActive())
                    .withPromiseProvidedBy(orderPromise.getPromiseProvidedBy())
                    .withAsin(orderPromise.getAsin())
                    .build();

    }
}
