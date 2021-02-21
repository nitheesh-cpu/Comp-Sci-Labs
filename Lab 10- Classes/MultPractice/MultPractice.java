public class MultPractice {
      private final int first;
      private int second;
      public MultPractice(int f, int s)
      {
        first = f;
        second = s;
      }

      public String getProblem()
      {
        return first + " TIMES " + second;
      }

      public void nextProblem()
      {
        second++;
      }
}
