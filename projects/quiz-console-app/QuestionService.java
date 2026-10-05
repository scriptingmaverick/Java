public class QuestionService {
  Question[] questions = new Question[5];

  public QuestionService() {
    questions[0] = new Question(1, "What is the capital of France?", "Berlin", "Madrid", "Paris", "Rome", "Paris");
    questions[1] = new Question(2, "What is the largest planet in our solar system?", "Earth", "Jupiter", "Mars", "Saturn", "Jupiter");
    questions[2] = new Question(3, "What is the chemical symbol for gold?", "Au", "Ag", "Fe", "Hg", "Au");
    questions[3] = new Question(4, "Who wrote 'To Kill a Mockingbird'?", "Harper Lee", "Mark Twain", "Ernest Hemingway", "F. Scott Fitzgerald", "Harper Lee");
    questions[4] = new Question(5, "What is the smallest prime number?", "0", "1", "2", "3", "2");
  }

  public void displayQuestions(){
    for (Question question : questions) {
      System.out.println(question.toString());
    }
  }
}