package org.example.services;

public class PayService {

    private TaxService taxService = new TaxService();
    private DeliverService deliverService = new DeliverService();

    public PayService(TaxService taxService, DeliverService deliverService) {
        this.taxService = taxService;
        this.deliverService = deliverService;
    }

    public TaxService getTaxService() {
        return taxService;
    }

    public void setTaxService(TaxService taxService) {
        this.taxService = taxService;
    }

    public DeliverService getDeliverService() {
        return deliverService;
    }

    public void setDeliverService(DeliverService deliverService) {
        this.deliverService = deliverService;
    }

    public double finalPrice(double cost, String state){

        return cost;
    }
}

