package rest.docker.test


import grails.test.mixin.TestFor
import spock.lang.Specification

/**
 * Test constraints of {@link rest.docker.test.Question} domain
 */
@TestFor(Question)
class QuestionSpec extends Specification {

    def setup() {
    }

    def cleanup() {
    }

    void "test text field is required"() {
        expect:"validation return false for empty text field"
            new Question(knowAnswer: true).validate() == false
    }

    void "test knowAnswer field is required"() {
        expect:"validation return false for empty text field"
        new Question(text: 'did you create a test?').validate() == false
    }

    void "test if all fields are field is required"() {
        expect:"validation return false for empty text field"
        new Question(text: 'did you create a test?', knowAnswer: true).validate() == true
    }
}
