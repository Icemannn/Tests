package exercise09DogClassAbs;

    class Dog {
    private String name;
    private String owner;
    private int age;

    public Dog(String name, String owner, int age) {
        this.name = name;
        this.owner = owner;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", owner='" + owner + '\'' +
                    ", age=" + age +
                    '}';
        }
    }
