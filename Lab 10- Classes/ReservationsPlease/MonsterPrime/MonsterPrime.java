public class MonsterPrime implements Comparable {

    private int age;
    private int height;
    private int weight;

    public MonsterPrime() {
        this(0, 0, 0);
    }

    public MonsterPrime(int i) {
        height = i;
    }

    public MonsterPrime(int i, int x) {
        height = i;
        weight = x;
    }

    public MonsterPrime(int i, int x, int v) {
        height = i;
        weight = x;
        age = v;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Object clone() {
        return this;
    }

    public int compareTo(Object o) {
        MonsterPrime mTwo = (MonsterPrime) o;
        if (this.height == mTwo.getHeight()) {
            return 0;
        } else if (this.height > mTwo.getHeight()) {
            return 1;
        } else {
            return -1;
        }

    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public String toString() {
        return height + " " + weight + " " + age;
    }
}
