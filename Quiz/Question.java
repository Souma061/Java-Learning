public class Question {
    public String question;
    public String[] options;
    public int correctOptionl;

    public Question(String question, String[] options, int correctOption) {
        this.question = question;
        this.options = options;
        this.correctOptionl = correctOption;
    }
    @Override
    public String toString() {
        return question;
    }
}
