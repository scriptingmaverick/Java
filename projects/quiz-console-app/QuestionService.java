import java.util.Scanner;

public class QuestionService {
  Question[] questions = new Question[5];
  String selection[] = new String[5];

  public QuestionService() {
    questions[0] = new Question(1, "What is the capital of France?", "Berlin", "Madrid", "Paris", "Rome", "Paris");
    questions[1] = new Question(2, "What is the largest planet in our solar system?", "Earth", "Jupiter", "Mars", "Saturn", "Jupiter");
    questions[2] = new Question(3, "What is the chemical symbol for gold?", "Au", "Ag", "Fe", "Hg", "Au");
    questions[3] = new Question(4, "Who wrote 'To Kill a Mockingbird'?", "Harper Lee", "Mark Twain", "Ernest Hemingway", "F. Scott Fitzgerald", "Harper Lee");
    questions[4] = new Question(5, "What is the smallest prime number?", "0", "1", "2", "3", "2");
  }

  public void displayQuestions(){
    int i = 0;
    for (Question question : questions) {
      System.out.println("Question no. : " + question.getId());
      System.out.println("Question : " + question.getQuesiton());
      System.out.println("Option 1 : " + question.getOpt1());
      System.out.println("Option 2 : " + question.getOpt2());   
      System.out.println("Option 3 : " + question.getOpt3());
      System.out.println("Option 4 : " + question.getOpt4());

      Scanner sc = new Scanner(System.in);
      String userAnswer = sc.nextLine();
      selection[i++] = userAnswer;
    }

    i = 0;
    for(String answer : selection){
      System.out.println("User selected answer : " + answer);
      System.out.println("Correct answer : " + questions[i++].getAnswer());
    }
  }

  public void printScore(){
    int score = 0;
    for(int i = 0; i < questions.length; i++){
      if(selection[i].equals(questions[i].getAnswer())){
        score++;
      }
    }
    System.out.println("Your score is : " + score + "/" + questions.length);
  }
}