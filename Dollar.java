class Dollar {

    Dollar(int amount) {
        this.amount = amount;
    }

    Money times(int multiplier) {
        return new Dollar(amount * multiplier);
    }
}