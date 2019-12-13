package com.student.lukasz.appoftheyear19_20.DOM;

public class Vragen {
    public int questionID;
    public SoortVraag typeQuestion;
    public String[] possibleAnswers;
    public int correctAnswer;

    public Vragen(int questionID, SoortVraag typeQuestion, String[] possibleAnswers, int correctAnswer){
        this.questionID = questionID;
        this.typeQuestion = typeQuestion;
        this.possibleAnswers = possibleAnswers;
        this.correctAnswer = correctAnswer;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public int getQuestionID() {
        return questionID;
    }

    public void setTypeQuestion(SoortVraag typeQuestion) {
        this.typeQuestion = typeQuestion;
    }

    public SoortVraag getTypeQuestion() {
        return typeQuestion;
    }

    public void setCorrectAnswer(int correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }

    public void setPossibleAnswers(String[] possibleAnswers) {
        this.possibleAnswers = possibleAnswers;
    }

    public String[] getPossibleAnswers() {
        return possibleAnswers;
    }
}
