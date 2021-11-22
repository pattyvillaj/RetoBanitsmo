package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {
    private String question;
    private String pdfText;

    public Answer(String question, String pdfText) {

        this.question = question;
        this.pdfText = pdfText;
    }

    public static Answer toThe(String question, String pdfText) {
        return new Answer(question,pdfText);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        return this.pdfText.contains(this.question);
    }
}
