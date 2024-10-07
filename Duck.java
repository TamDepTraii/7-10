
class Duck extends Animals {
    public Duck() {
        super("Duck");
    }

    @Override
    public String move() {
        return "walk" + "swim";
    }
}