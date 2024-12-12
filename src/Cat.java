class Cat implements Meowable {
    private final String name;
    private int meowCount = 0;

    int getMeowCount() {
        return meowCount;
    }
    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void meow() {
        meowCount++;
        System.out.println(name + ": мяу!");
    }


    @Override
    public String toString() {
        return "кот: " + name;
    }
}