package com.amazon.ata.deliveringonourpromise.orderfulfillmentservice;

import com.amazon.ata.deliveringonourpromise.types.Promise;
public interface ServiceClient {

    /**
     *
     * @param customerOrderItemId reference to
     * @return Promise
     */
    Promise getDeliveryPromiseByOrderItemId(String customerOrderItemId);

}
