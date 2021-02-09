import java.util.*;
import java.io.*;

public class StudentScores {
    public static void main(String args[]) throws IOException {
    ArrayList<String[]> classAnswers = new ArrayList<>();
    ArrayList<String> answers = new ArrayList<>();
    ArrayList<String> key = new ArrayList<>();
    ArrayList<String> student = new ArrayList<>();

    setKey(key);
    addAnswers(classAnswers, student);
    printList(classAnswers, student, key);

    }

    public static void setKey(ArrayList<String> key) throws IOException {
    Scanner sc = new Scanner(new File("AnswerKey.txt"));
    while(sc.hasNext())
        key.add(sc.next());
    }

    public static void addAnswers(ArrayList<String[]> classAnswers, ArrayList<String> student) throws IOException {
    Scanner sc = new Scanner(new File("ClassAnswers.txt"));
    while(sc.hasNext()) {
        student.add(sc.nextLine());
        String[] arr = sc.nextLine().split(" ");
        classAnswers.add(arr);
    }

    }

    public static double getScore(int x, ArrayList<String[]> classAnswers, ArrayList<String> key) {
    double score = 0;
    for(int i = 1; i < key.size(); i++) {
        if(classAnswers.get(x)[i].equals(key.get(i))) score += 1;
        else if(classAnswers.get(x)[i].equals("?")) continue;
        else score -= 0.25;
    }return score;
    }

    public static void printList(ArrayList<String[]> classAnswers, ArrayList<String> student, ArrayList<String> key) {
    int indexHigh = 0;
    double highScore = Integer.MIN_VALUE;
    for(int i = 0; i < classAnswers.size(); i++) {
        double score = getScore(i, classAnswers, key);
        if(score > highScore) {
        highScore = score;
        indexHigh = i;
        }
        System.out.printf("%s score:%s%n", student.get(i), score);
    }
    System.out.printf("%nHighest score: %s %s%n", student.get(indexHigh), highScore);
    }

}
