package rest.docker.test

class BootStrap {

    def init = { servletContext ->
        new Question(text: 'How to create docker image?', knowAnswer: true).save()
        new Question(text: 'How to run docker image in container on AWS?', knowAnswer: true).save()
    }
    def destroy = {
    }
}
