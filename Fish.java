class Fish extends Animals {
    public Fish() {
        super("Fish");
    }

    @Override
    public String move() {
        return "swim";
    }
}