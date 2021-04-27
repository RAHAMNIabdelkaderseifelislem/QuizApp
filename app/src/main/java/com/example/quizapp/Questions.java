package com.example.quizapp;

public class Questions {


    public String questions [] = {
            "Which one of this is programming language?",
            "Which one of this is OOP programming language?",
            "Which one of this is used for relational data bases?",
            "Which one of this is better to develop AI?",
            "Which one of this is framework for java?",
            "What's wrong with this for(int j=0;j>-1;j++)?",
            "Which One of this couldn't run Java codes?",
            "Which One of this used by BIG DATA programmers?",
            "Which One of this is not C ide?"};
    public String choices [][] = {
            {"Python","HTML","XML","CSS"},
            {"C","C++","JavaScript","Java"},
            {"NoSQL","MySQL","MongoDB","Neo4j"},
            {"C#","Fortran","Java","Prolog"},
            {"Qt","Spring","Flask","Xamarin"},
            {"Compile error","None of that","Infinite Loop","Warning"},
            {"Visual Studio","Codenvy","Eclipse","Green foot"},
            {"SWIFT","C++","C#","JAVA"},
            {"IntelliJ IDE","NetBeans","CodeLite","Anjuta"}};
    public String answers[] = {
            "Python",
            "Java",
            "MySQL",
            "Prolog",
            "Spring",
            "Infinite Loop",
            "Visual Studio",
            "JAVA",
            "IntelliJ IDE"
    };
    public String getQuestion(int a){
        String question = questions[a];
        return question;
    }
    public String getChoice1(int a){
        String choice = choices[a][0];
        return choice;
    }
    public String getChoice2(int a){
        String choice = choices[a][1];
        return choice;
    }
    public String getChoice3(int a){
        String choice = choices[a][2];
        return choice;
    }
    public String getChoice4(int a){
        String choice = choices[a][3];
        return choice;
    }
    public String getAnswer(int a){
        String answer = answers[a];
        return answer;
    }


}
