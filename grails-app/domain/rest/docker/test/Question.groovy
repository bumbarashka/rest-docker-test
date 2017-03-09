package rest.docker.test


import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class Question {
    String text
    Boolean knowAnswer

    static constraints = {
        text blank: false, nullable: false
        knowAnswer blank: false, nullable: false
    }
}