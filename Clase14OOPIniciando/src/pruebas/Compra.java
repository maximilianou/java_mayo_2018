package pruebas;

class Compra {

    private int total;
    private boolean delivery;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public boolean isDelivery() {
        return delivery;
    }

    public void setDelivery(boolean delivery) {
        this.delivery = delivery;
    }

    void imprmirTotal() {
        if (this.isDelivery()) {
            System.out.println("Total Final con Delivery : " + ( total + ( total * 0.1 ) ));
//            System.out.println("Total Final: " + ( total * 1.1  ));
        } else {
            System.out.println("Total Final sin Delivery : " + total);
        }
    }

}
