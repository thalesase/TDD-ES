class Dollar {

    Dollar(int amount) {
        this.amount = amount;
    }

    void times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}