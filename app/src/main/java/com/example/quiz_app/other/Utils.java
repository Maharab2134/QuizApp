package com.example.quiz_app.other;

import android.content.Context;
import android.text.TextUtils;
import android.util.Patterns;


import com.example.quiz_app.R;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Random;

public class Utils {

    public static boolean isValidEmail(CharSequence target) {
        return (!TextUtils.isEmpty(target) && Patterns.EMAIL_ADDRESS.matcher(target).matches());
    }

    public static String formatDate(long time){
        SimpleDateFormat formatter = new SimpleDateFormat(Constants.DATE_FORMAT, Locale.getDefault());

        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        return formatter.format(calendar.getTime());
    }

    public static Map<String,String> getMathQuestions(){
        HashMap<String,String> questions = new HashMap<>();
        questions.put("1+1","2");
        questions.put("2+2","4");
        questions.put("3+3","6");
        questions.put("4+4","8");
        questions.put("5+5","10");
        questions.put("6+6","12");
        questions.put("7+7","14");
        questions.put("8+8","16");
        questions.put("9+9","18");
        questions.put("10+10","20");
        questions.put("11+11","22");
        questions.put("12+12","24");
        questions.put("13+13","26");
        questions.put("14+14","28");
        questions.put("15+15","30");

        return questions;
    }
    public static Map<String,String> getRandomMathQuestions(int SIZE){
        HashMap<String,String> questionsMap = new HashMap<>();
        Map<String,String> originalQuestion = getMathQuestions();
        int originalSize =  originalQuestion.size();
        ArrayList<String> keyList = new ArrayList<String>(originalQuestion.keySet());

        while (questionsMap.size()<=SIZE){
            Random random = new Random();
            int randomNumber = random.nextInt(originalSize);
            String question = keyList.get(randomNumber);
            if (!questionsMap.containsKey(question)){
                questionsMap.put(question,originalQuestion.get(question));
            }
        }
        return questionsMap;
    }
    public static Map<String,Map<String,Boolean>> getLiteratureQuestions(){
        HashMap<String,Map<String,Boolean>> questions = new HashMap<>();

        HashMap<String,Boolean> answer1 = new HashMap<>();
        answer1.put("Maya Angelou",true);
        answer1.put("Robert Hass",false);
        answer1.put("Jessica Hagdorn",false);
        answer1.put("Micheal Palmer",false);
        questions.put("Which American writer published ‘A brave and startling truth’ in 1996",answer1);

        HashMap<String,Boolean> answer2 = new HashMap<>();
        answer2.put("Acrostic ",true);
        answer2.put("Haiku",false);
        answer2.put("Epic",false);
        answer2.put("Alliterative",false);
        questions.put("What is a poem called whose first letters of each line spell out a word?",answer2);

        HashMap<String,Boolean> answer3 = new HashMap<>();
        answer3.put("Limerick",true);
        answer3.put("Quartet",false);
        answer3.put("Sextet",false);
        answer3.put("Palindrome",false);
        questions.put("What is a funny poem of five lines called?",answer3);

        HashMap<String,Boolean> answer4 = new HashMap<>();
        answer4.put("Robert Greene",true);
        answer4.put("John Milton",false);
        answer4.put("Philip Sidney",false);
        answer4.put("Christopher Marlowe",false);
        questions.put("Who succeeded Lyly?",answer4);

        HashMap<String,Boolean> answer5 = new HashMap<>();
        answer5.put("Hamlet",true);
        answer5.put("Cymbeline",false);
        answer5.put("Titus Andronicus",false);
        answer5.put("Pericles, Prince of Tyre",false);
        questions.put("Which famous Shakespeare play does the quote,”Neither a borrower nor a lender be” come from?",answer5);

        HashMap<String,Boolean> answer6 = new HashMap<>();
        answer6.put("16th",true);
        answer6.put("17th",false);
        answer6.put("14th",false);
        answer6.put("15th",false);
        questions.put("In which century was Shakespeare born?",answer6);

        HashMap<String,Boolean> answer7 = new HashMap<>();
        answer7.put("A thief",true);
        answer7.put("A clerk",false);
        answer7.put("A teacher",false);
        answer7.put("A dentist",false);
        questions.put("Who is Mr. Tench in The Power and the Glory?",answer7);

        HashMap<String,Boolean> answer8 = new HashMap<>();
        answer8.put("Coleridge",true);
        answer8.put("Wordsworth",false);
        answer8.put("Lamb",false);
        answer8.put("Shelley",false);
        questions.put("Who said ‘Keats was a Greek’?",answer8);

        HashMap<String,Boolean> answer9 = new HashMap<>();
        answer9.put("Gertrude",true);
        answer9.put("Beatrice",false);
        answer9.put("Margaret",false);
        answer9.put("Rosalind",false);
        questions.put("Which of the following is Hamlet’s mother?",answer9);

        HashMap<String,Boolean> answer10 = new HashMap<>();
        answer10.put("Stingy",true);
        answer10.put("Rude",false);
        answer10.put("Unintelligent",false);
        answer10.put("Fanatic",false);
        questions.put("Which of the following was Elizabeth known as?",answer10);

        HashMap<String,Boolean> answer11 = new HashMap<>();
        answer11.put("Keats",true);
        answer11.put("Blake",false);
        answer11.put("Tennyson",false);
        answer11.put("Shelley",false);
        questions.put("For whom it is said: “sensuousness is a paramount bias of his genius”:",answer11);

        HashMap<String,Boolean> answer12 = new HashMap<>();
        answer12.put("Maud",true);
        answer12.put("Ulysses",false);
        answer12.put("Break, Break, Break",false);
        answer12.put("Crossing the Bar",false);
        questions.put("Which of the following poems by Tennyson is a monodrama?",answer12);

        HashMap<String,Boolean> answer13 = new HashMap<>();
        answer13.put("Southey",true);
        answer13.put("Tennyson",false);
        answer13.put("Byron",false);
        answer13.put("Wordsworth",false);
        questions.put("Which one of the following poets was appointed Poet Laureate in the year 1813?",answer13);

        HashMap<String,Boolean> answer14 = new HashMap<>();
        answer14.put("Wordsworth",true);
        answer14.put("Keats",false);
        answer14.put("Byron",false);
        answer14.put("Blake",false);
        questions.put("Who believed that poetry is the spontaneous overflow of emotions?",answer14);

        HashMap<String,Boolean> answer15 = new HashMap<>();
        answer15.put("Dickens",true);
        answer15.put("George Eliot",false);
        answer15.put("Hardy",false);
        answer15.put("None of the above",false);
        questions.put("Moral choice is everything in the works of:",answer15);

        return questions;
    }

    public static Map<String, Map<String, Boolean>> getIQQuestions() {
        HashMap<String, Map<String, Boolean>> questions = new HashMap<>();

        HashMap<String, Boolean> answer1 = new HashMap<>();
        answer1.put("15", false);
        answer1.put("20", true);
        answer1.put("25", false);
        answer1.put("30", false);
        questions.put("What is the square root of 400?", answer1);

        HashMap<String, Boolean> answer2 = new HashMap<>();
        answer2.put("4", true);
        answer2.put("5", false);
        answer2.put("6", false);
        answer2.put("7", false);
        questions.put("What is the result of 16 ÷ 4?", answer2);

        HashMap<String, Boolean> answer3 = new HashMap<>();
        answer3.put("6", true);
        answer3.put("8", false);
        answer3.put("4", false);
        answer3.put("10", false);
        questions.put("What is 2 + 2 × 2?", answer3);

        HashMap<String, Boolean> answer4 = new HashMap<>();
        answer4.put("25", true);
        answer4.put("36", false);
        answer4.put("20", false);
        answer4.put("30", false);
        questions.put("What is the next number in the series: 1, 4, 9, 16?", answer4);

        HashMap<String, Boolean> answer5 = new HashMap<>();
        answer5.put("6", true);
        answer5.put("7", false);
        answer5.put("8", false);
        answer5.put("5", false);
        questions.put("How many sides does a hexagon have?", answer5);

        HashMap<String, Boolean> answer6 = new HashMap<>();
        answer6.put("30", true);
        answer6.put("36", false);
        answer6.put("28", false);
        answer6.put("40", false);
        questions.put("What is the next number in the series: 2, 6, 12, 20?", answer6);

        HashMap<String, Boolean> answer7 = new HashMap<>();
        answer7.put("13", true);
        answer7.put("14", false);
        answer7.put("15", false);
        answer7.put("16", false);
        questions.put("What is the next number in the Fibonacci series: 1, 1, 2, 3, 5, 8?", answer7);

        HashMap<String, Boolean> answer8 = new HashMap<>();
        answer8.put("Paris", true);
        answer8.put("London", false);
        answer8.put("Rome", false);
        answer8.put("Berlin", false);
        questions.put("What is the capital of France?", answer8);

        HashMap<String, Boolean> answer9 = new HashMap<>();
        answer9.put("96", true);
        answer9.put("100", false);
        answer9.put("88", false);
        answer9.put("84", false);
        questions.put("What is 12 × 8?", answer9);

        HashMap<String, Boolean> answer10 = new HashMap<>();
        answer10.put("7", true);
        answer10.put("2", false);
        answer10.put("6", false);
        answer10.put("8", false);
        questions.put("Which number is the odd one out: 2, 3, 6, 7, 8?", answer10);

        HashMap<String, Boolean> answer11 = new HashMap<>();
        answer11.put("25", true);
        answer11.put("30", false);
        answer11.put("22", false);
        answer11.put("24", false);
        questions.put("What is the next number in the sequence: 5, 10, 15, 20?", answer11);

        HashMap<String, Boolean> answer12 = new HashMap<>();
        answer12.put("15", true);
        answer12.put("16", false);
        answer12.put("18", false);
        answer12.put("20", false);
        questions.put("What is the next number in the series: 3, 6, 9, 12?", answer12);

        HashMap<String, Boolean> answer13 = new HashMap<>();
        answer13.put("36", true);
        answer13.put("40", false);
        answer13.put("30", false);
        answer13.put("45", false);
        questions.put("What is the next number in the series: 1, 4, 9, 16, 25?", answer13);

        HashMap<String, Boolean> answer14 = new HashMap<>();
        answer14.put("4 dollars", true);
        answer14.put("3 dollars", false);
        answer14.put("2 dollars", false);
        answer14.put("5 dollars", false);
        questions.put("If two pencils cost 80 cents, how much would 10 pencils cost?", answer14);

        HashMap<String, Boolean> answer15 = new HashMap<>();
        answer15.put("56", true);
        answer15.put("54", false);
        answer15.put("50", false);
        answer15.put("48", false);
        questions.put("What is the value of 7 × (6 + 2)?", answer15);
        return questions;
        }

    public static Map<String,Map<String,Boolean>> getGeographyQuestions(){
        HashMap<String,Map<String,Boolean>> questions = new HashMap<>();

        HashMap<String,Boolean> answer1 = new HashMap<>();
        answer1.put("Mustard",false);
        answer1.put("Linseed",false);
        answer1.put("Groundnut ",true);
        answer1.put("coconut",false);
        questions.put("The scarcity or crop failure of which of the following can cause a serious edible oil crisis in India?",answer1);

        HashMap<String,Boolean> answer2 = new HashMap<>();
        answer2.put("old mountains",true);
        answer2.put("young mountains",false);
        answer2.put("fold mountains",false);
        answer2.put("block mountains",false);
        questions.put("The pennines (Europe), Appalachians (America) and the Aravallis (India) are examples of",answer2);

        HashMap<String,Boolean> answer3 = new HashMap<>();
        answer3.put("5",false);
        answer3.put("13",true);
        answer3.put("8",false);
        answer3.put("10",false);
        questions.put("The number of major ports in India is",answer3);

        HashMap<String,Boolean> answer4 = new HashMap<>();
        answer4.put("Gondak",false);
        answer4.put("Kosi",false);
        answer4.put("Sutlej",false);
        answer4.put("Krishna",true);
        questions.put("Which of the following is a peninsular river of India?",answer4);

        HashMap<String,Boolean> answer5 = new HashMap<>();
        answer5.put("1730 hours",false);
        answer5.put("0630 hours",true);
        answer5.put("midnight ,GMT",false);
        answer5.put("None of the above",false);
        questions.put("When it is noon IST at Allahabad in India, the time at Greenwich, London, will be",answer5);

        HashMap<String,Boolean> answer6 = new HashMap<>();
        answer6.put("USA",false);
        answer6.put("Canada",true);
        answer6.put("Australia",false);
        answer6.put("India",false);
        questions.put("Which country has the largest coast line?",answer6);

        HashMap<String,Boolean> answer7 = new HashMap<>();
        answer7.put("Alluvial soils",true);
        answer7.put("Black soils",false);
        answer7.put("Laterite soils",false);
        answer7.put("Red soils",false);
        questions.put("Which of the following types of soil are mostly confined to river basins and coastal plains of India?",answer7);

        HashMap<String,Boolean> answer8 = new HashMap<>();
        answer8.put("USA",true);
        answer8.put("India",false);
        answer8.put("Australia",false);
        answer8.put("France",false);
        questions.put("Which of the following countries leads in the production of aluminium and its products in the world?",answer8);

        HashMap<String,Boolean> answer9 = new HashMap<>();
        answer9.put("Coconut",true);
        answer9.put("Cotton",false);
        answer9.put("Sugarcane",false);
        answer9.put("Rice",false);
        questions.put("Which of the following crops is regarded as a plantation crop?",answer9);

        HashMap<String,Boolean> answer10 = new HashMap<>();
        answer10.put("33.3%",true);
        answer10.put("30.3%",false);
        answer10.put("38.3%",false);
        answer10.put("42.3%",false);
        questions.put("The proportion of forest to the total national geographical area of India as envisaged by National Forest Policy is",answer10);

        HashMap<String,Boolean> answer11 = new HashMap<>();
        answer11.put("Gandhi Sagar",true);
        answer11.put("Hirakud",false);
        answer11.put("Periyar",false);
        answer11.put("Tungabhadra",false);
        questions.put("Which of the following dams has generations of power more than irrigation as its main purpose?",answer11);

        HashMap<String,Boolean> answer12 = new HashMap<>();
        answer12.put("The lease Himalayas and the Indo Gangetic plain",true);
        answer12.put("The foot hills and the Indo Gangetic plain",false);
        answer12.put("The greater Himalayas and the lesser Himalayas",false);
        answer12.put("Indo-Gangetic plains and the peninsula",false);
        questions.put("The outer Himalayas lie between",answer12);

        HashMap<String,Boolean> answer13 = new HashMap<>();
        answer13.put("Aravalis",true);
        answer13.put("Vindhyas",false);
        answer13.put("Satpuras",false);
        answer13.put("Nilgiri hills",false);
        questions.put("The oldest mountains in India are",answer13);

        HashMap<String,Boolean> answer14 = new HashMap<>();
        answer14.put("1/6",true);
        answer14.put("1/3",false);
        answer14.put("1/10",false);
        answer14.put("1/50",false);
        questions.put("Approximately what fraction of the world’s population lives in India?",answer14);

        HashMap<String,Boolean> answer15 = new HashMap<>();
        answer15.put("Second",true);
        answer15.put("Third",false);
        answer15.put("Fourth",false);
        answer15.put("Fifth",false);
        questions.put("India has the _________ largest population on Earth",answer15);

        return questions;
    }

    public static Map<String, Map<String, Boolean>> getSportsQuestions() {
        HashMap<String, Map<String, Boolean>> questions = new HashMap<>();

        HashMap<String, Boolean> answer1 = new HashMap<>();
        answer1.put("Football", true);
        answer1.put("Basketball", false);
        answer1.put("Tennis", false);
        answer1.put("Cricket", false);
        questions.put("Which sport is played the most in the world?", answer1);

        HashMap<String, Boolean> answer2 = new HashMap<>();
        answer2.put("Michael Jordan", true);
        answer2.put("LeBron James", false);
        answer2.put("Kobe Bryant", false);
        answer2.put("Shaquille O'Neal", false);
        questions.put("Who is considered the greatest basketball player of all time?", answer2);

        HashMap<String, Boolean> answer3 = new HashMap<>();
        answer3.put("Brazil", false);
        answer3.put("France", false);
        answer3.put("Russia", true);
        answer3.put("Germany", false);
        questions.put("Which country hosted the 2018 FIFA World Cup?", answer3);

        HashMap<String, Boolean> answer4 = new HashMap<>();
        answer4.put("Kenenisa Bekele", false);
        answer4.put("Eliud Kipchoge", true);
        answer4.put("Usain Bolt", false);
        answer4.put("Mo Farah", false);
        questions.put("Who was the first person to run a marathon in under 2 hours?", answer4);

        HashMap<String, Boolean> answer5 = new HashMap<>();
        answer5.put("Baseball", true);
        answer5.put("Golf", false);
        answer5.put("Skiing", false);
        answer5.put("Cricket", false);
        questions.put("Which sport was added to the Olympics in 2020?", answer5);

        HashMap<String, Boolean> answer6 = new HashMap<>();
        answer6.put("Michael Phelps", true);
        answer6.put("Ian Thorpe", false);
        answer6.put("Ryan Lochte", false);
        answer6.put("Caeleb Dressel", false);
        questions.put("Who has won the most Olympic gold medals in swimming?", answer6);

        HashMap<String, Boolean> answer7 = new HashMap<>();
        answer7.put("Cristiano Ronaldo", true);
        answer7.put("Lionel Messi", false);
        answer7.put("Pele", false);
        answer7.put("Diego Maradona", false);
        questions.put("Who holds the record for the most goals in football history?", answer7);

        HashMap<String, Boolean> answer8 = new HashMap<>();
        answer8.put("Roger Federer", false);
        answer8.put("Novak Djokovic", false);
        answer8.put("John Isner", true);
        answer8.put("Andy Murray", false);
        questions.put("Who played in the longest tennis match in history?", answer8);

        HashMap<String, Boolean> answer9 = new HashMap<>();
        answer9.put("Usain Bolt", true);
        answer9.put("Tyson Gay", false);
        answer9.put("Asafa Powell", false);
        answer9.put("Justin Gatlin", false);
        questions.put("Who holds the record for the fastest 100m sprint?", answer9);

        HashMap<String, Boolean> answer10 = new HashMap<>();
        answer10.put("USA", true);
        answer10.put("Russia", false);
        answer10.put("China", false);
        answer10.put("Germany", false);
        questions.put("Which country has won the most Olympic medals?", answer10);

        HashMap<String, Boolean> answer11 = new HashMap<>();
        answer11.put("Ferrari", true);
        answer11.put("Lamborghini", false);
        answer11.put("Porsche", false);
        answer11.put("BMW", false);
        questions.put("Which car brand is associated with F1 racing?", answer11);

        HashMap<String, Boolean> answer12 = new HashMap<>();
        answer12.put("Roger Federer", true);
        answer12.put("Rafael Nadal", false);
        answer12.put("Novak Djokovic", false);
        answer12.put("Serena Williams", false);
        questions.put("Who has won the most Tennis Grand Slam titles?", answer12);

        HashMap<String, Boolean> answer13 = new HashMap<>();
        answer13.put("Beijing", true);
        answer13.put("Sochi", false);
        answer13.put("Vancouver", false);
        answer13.put("Pyeongchang", false);
        questions.put("Which city hosted the Winter Olympics in 2022?", answer13);

        HashMap<String, Boolean> answer14 = new HashMap<>();
        answer14.put("Kathrine Switzer", true);
        answer14.put("Paula Radcliffe", false);
        answer14.put("Shalane Flanagan", false);
        answer14.put("Joan Benoit Samuelson", false);
        questions.put("Who was the first woman to officially run the Boston Marathon?", answer14);

        HashMap<String, Boolean> answer15 = new HashMap<>();
        answer15.put("Mahmoud Hassan", false);
        answer15.put("Tommy McDonald", false);
        answer15.put("Hakan Şükür", false);
        answer15.put("Matthias Jørgensen", true);
        questions.put("Who scored the fastest goal in football history?", answer15);

        return questions;
    }
    public static Map<String, Map<String, Boolean>> getProgrammingQuestions() {
        HashMap<String, Map<String, Boolean>> questions = new HashMap<>();

        // Question 1
        HashMap<String, Boolean> answer1 = new HashMap<>();
        answer1.put("Java", true);
        answer1.put("Python", false);
        answer1.put("C", false);
        answer1.put("Ruby", false);
        questions.put("Which programming language is used to develop Android applications?", answer1);

        // Question 2
        HashMap<String, Boolean> answer2 = new HashMap<>();
        answer2.put("Array", true);
        answer2.put("Linked List", false);
        answer2.put("Queue", false);
        answer2.put("Stack", false);
        questions.put("Which data structure is used to store elements in a contiguous block of memory?", answer2);

        // Question 3
        HashMap<String, Boolean> answer3 = new HashMap<>();
        answer3.put("Inheritance", true);
        answer3.put("Polymorphism", false);
        answer3.put("Encapsulation", false);
        answer3.put("Abstraction", false);
        questions.put("Which OOP concept allows a class to inherit properties and methods of another class?", answer3);

        // Question 4
        HashMap<String, Boolean> answer4 = new HashMap<>();
        answer4.put("public static void main(String[] args)", true);
        answer4.put("private static void main(String[] args)", false);
        answer4.put("public void main(String[] args)", false);
        answer4.put("static void main(String[] args)", false);
        questions.put("What is the entry point for a Java program?", answer4);

        // Question 5
        HashMap<String, Boolean> answer5 = new HashMap<>();
        answer5.put("ArrayList", true);
        answer5.put("HashMap", false);
        answer5.put("TreeMap", false);
        answer5.put("HashSet", false);
        questions.put("Which Java class allows dynamic resizing of an array?", answer5);

        // Question 6
        HashMap<String, Boolean> answer6 = new HashMap<>();
        answer6.put("public", true);
        answer6.put("private", false);
        answer6.put("protected", false);
        answer6.put("default", false);
        questions.put("Which access modifier allows a class to be accessed by any other class?", answer6);

        // Question 7
        HashMap<String, Boolean> answer7 = new HashMap<>();
        answer7.put("int", true);
        answer7.put("integer", false);
        answer7.put("Integer", false);
        answer7.put("double", false);
        questions.put("Which data type is used to represent integers in Java?", answer7);

        // Question 8
        HashMap<String, Boolean> answer8 = new HashMap<>();
        answer8.put("try-catch", true);
        answer8.put("throw-catch", false);
        answer8.put("catch-finally", false);
        answer8.put("catch-throw", false);
        questions.put("Which block is used to handle exceptions in Java?", answer8);

        // Question 9
        HashMap<String, Boolean> answer9 = new HashMap<>();
        answer9.put("extends", true);
        answer9.put("implements", false);
        answer9.put("super", false);
        answer9.put("this", false);
        questions.put("Which keyword is used to inherit a class in Java?", answer9);

        // Question 10
        HashMap<String, Boolean> answer10 = new HashMap<>();
        answer10.put("final", true);
        answer10.put("const", false);
        answer10.put("static", false);
        answer10.put("protected", false);
        questions.put("Which keyword is used to declare constants in Java?", answer10);

        // Question 11
        HashMap<String, Boolean> answer11 = new HashMap<>();
        answer11.put("Java Virtual Machine", true);
        answer11.put("Java Compiler", false);
        answer11.put("JDK", false);
        answer11.put("JRE", false);
        questions.put("What does JVM stand for?", answer11);

        // Question 12
        HashMap<String, Boolean> answer12 = new HashMap<>();
        answer12.put("Object", true);
        answer12.put("Class", false);
        answer12.put("Method", false);
        answer12.put("Variable", false);
        questions.put("What is the root class in Java from which every other class inherits?", answer12);

        // Question 13
        HashMap<String, Boolean> answer13 = new HashMap<>();
        answer13.put("Heap", true);
        answer13.put("Stack", false);
        answer13.put("Array", false);
        answer13.put("Class", false);
        questions.put("Which part of memory is used to store objects in Java?", answer13);

        // Question 14
        HashMap<String, Boolean> answer14 = new HashMap<>();
        answer14.put("String", true);
        answer14.put("StringBuffer", false);
        answer14.put("StringBuilder", false);
        answer14.put("CharSequence", false);
        questions.put("Which class is used to store immutable sequences of characters?", answer14);

        // Question 15
        HashMap<String, Boolean> answer15 = new HashMap<>();
        answer15.put("true", true);
        answer15.put("false", false);
        questions.put("Is Java a platform-independent language?", answer15);

        return questions;
    }

    public static Map<String, Map<String, Boolean>> getIslamReligionQuestions() {
        HashMap<String, Map<String, Boolean>> questions = new HashMap<>();

        HashMap<String, Boolean> answer1 = new HashMap<>();
        answer1.put("Prophet Muhammad (PBUH)", true);
        answer1.put("Prophet Isa (Jesus)", false);
        answer1.put("Prophet Musa (Moses)", false);
        answer1.put("Prophet Ibrahim (Abraham)", false);
        questions.put("Who is considered the last prophet in Islam?", answer1);

        HashMap<String, Boolean> answer2 = new HashMap<>();
        answer2.put("Quran", true);
        answer2.put("Bible", false);
        answer2.put("Torah", false);
        answer2.put("Vedas", false);
        questions.put("What is the holy book of Islam?", answer2);

        HashMap<String, Boolean> answer3 = new HashMap<>();
        answer3.put("Makkah (Mecca)", true);
        answer3.put("Madinah (Medina)", false);
        answer3.put("Jerusalem", false);
        answer3.put("Cairo", false);
        questions.put("Which city is considered the holiest in Islam?", answer3);

        HashMap<String, Boolean> answer4 = new HashMap<>();
        answer4.put("Madinah (Medina)", true);
        answer4.put("Makkah (Mecca)", false);
        answer4.put("Jerusalem", false);
        answer4.put("Cairo", false);
        questions.put("What is the second holiest city in Islam?", answer4);

        HashMap<String, Boolean> answer5 = new HashMap<>();
        answer5.put("Sawm", true);
        answer5.put("Hajj", false);
        answer5.put("Zakat", false);
        answer5.put("Salat", false);
        questions.put("What is the practice of fasting in the month of Ramadan called?", answer5);

        HashMap<String, Boolean> answer6 = new HashMap<>();
        answer6.put("Hajj", true);
        answer6.put("Sawm", false);
        answer6.put("Zakat", false);
        answer6.put("Salat", false);
        questions.put("What is the name of the annual pilgrimage that Muslims perform?", answer6);

        HashMap<String, Boolean> answer7 = new HashMap<>();
        answer7.put("Zakat", true);
        answer7.put("Sadaqah", false);
        answer7.put("Sawm", false);
        answer7.put("Hajj", false);
        questions.put("What is the term for charity in Islam?", answer7);

        HashMap<String, Boolean> answer8 = new HashMap<>();
        answer8.put("Kaaba in Makkah", true);
        answer8.put("Jerusalem", false);
        answer8.put("Medina", false);
        answer8.put("Cairo", false);
        questions.put("What is the direction Muslims face when they pray?", answer8);

        HashMap<String, Boolean> answer9 = new HashMap<>();
        answer9.put("Five", true);
        answer9.put("Four", false);
        answer9.put("Seven", false);
        answer9.put("Six", false);
        questions.put("How many pillars of Islam are there?", answer9);

        HashMap<String, Boolean> answer10 = new HashMap<>();
        answer10.put("Masjid (Mosque)", true);
        answer10.put("Church", false);
        answer10.put("Synagogue", false);
        answer10.put("Temple", false);
        questions.put("What is the name of the Muslim place of worship?", answer10);

        HashMap<String, Boolean> answer11 = new HashMap<>();
        answer11.put("Allah", true);
        answer11.put("Yahweh", false);
        answer11.put("Brahman", false);
        answer11.put("Jehovah", false);
        questions.put("What is the Arabic word for God in Islam?", answer11);

        HashMap<String, Boolean> answer12 = new HashMap<>();
        answer12.put("Abu Bakr", true);
        answer12.put("Ali ibn Abi Talib", false);
        answer12.put("Uthman ibn Affan", false);
        answer12.put("Umar ibn Khattab", false);
        questions.put("Who was the first caliph after Prophet Muhammad (PBUH)?", answer12);

        HashMap<String, Boolean> answer13 = new HashMap<>();
        answer13.put("Ramadan", true);
        answer13.put("Shawwal", false);
        answer13.put("Dhul-Hijjah", false);
        answer13.put("Safar", false);
        questions.put("What is the month of fasting called in Islam?", answer13);

        HashMap<String, Boolean> answer14 = new HashMap<>();
        answer14.put("The end of Ramadan fasting", true);
        answer14.put("The beginning of Hajj pilgrimage", false);
        answer14.put("The birth of Prophet Muhammad (PBUH)", false);
        answer14.put("The victory in the Battle of Badr", false);
        questions.put("Which event is commemorated by the holiday of Eid al-Fitr?", answer14);

        HashMap<String, Boolean> answer15 = new HashMap<>();
        answer15.put("The willingness of Prophet Ibrahim (Abraham) to sacrifice his son", true);
        answer15.put("The beginning of Ramadan", false);
        answer15.put("The end of Hajj pilgrimage", false);
        answer15.put("The birth of Prophet Muhammad (PBUH)", false);
        questions.put("Which event is commemorated by the holiday of Eid al-Adha?", answer15);

        return questions;
    }

    public static Map<String, Map<String, Boolean>> getHistoryOfBangladeshQuestions() {
        HashMap<String, Map<String, Boolean>> questions = new HashMap<>();

        HashMap<String, Boolean> answer1 = new HashMap<>();
        answer1.put("1971", true);
        answer1.put("1947", false);
        answer1.put("1952", false);
        answer1.put("1966", false);
        questions.put("When did Bangladesh gain independence?", answer1);

        HashMap<String, Boolean> answer2 = new HashMap<>();
        answer2.put("Sheikh Mujibur Rahman", true);
        answer2.put("Ziaur Rahman", false);
        answer2.put("Khaleda Zia", false);
        answer2.put("Hossain Mohammad Ershad", false);
        questions.put("Who is known as the Father of the Nation in Bangladesh?", answer2);

        HashMap<String, Boolean> answer3 = new HashMap<>();
        answer3.put("Bangladesh Liberation War", true);
        answer3.put("Independence Movement", false);
        answer3.put("Six-Point Movement", false);
        answer3.put("Language Movement", false);
        questions.put("What is the name of the war during which Bangladesh gained independence?", answer3);

        HashMap<String, Boolean> answer4 = new HashMap<>();
        answer4.put("March 7, 1971", true);
        answer4.put("December 16, 1971", false);
        answer4.put("January 26, 1952", false);
        answer4.put("August 15, 1975", false);
        questions.put("On which date did Sheikh Mujibur Rahman deliver his famous speech calling for the independence of Bangladesh?", answer4);

        HashMap<String, Boolean> answer5 = new HashMap<>();
        answer5.put("1975", true);
        answer5.put("1971", false);
        answer5.put("1981", false);
        answer5.put("1976", false);
        questions.put("In which year did Sheikh Mujibur Rahman, the first president of Bangladesh, die?", answer5);

        HashMap<String, Boolean> answer6 = new HashMap<>();
        answer6.put("1971", true);
        answer6.put("1970", false);
        answer6.put("1966", false);
        answer6.put("1952", false);
        questions.put("When did Pakistan's military launch Operation Searchlight in East Pakistan?", answer6);

        HashMap<String, Boolean> answer7 = new HashMap<>();
        answer7.put("The Liberation War of Bangladesh", true);
        answer7.put("The Bengal Famine of 1943", false);
        answer7.put("The Language Movement", false);
        answer7.put("The Partition of Bengal", false);
        questions.put("What event is marked by the victory on December 16, 1971, in Bangladesh?", answer7);

        HashMap<String, Boolean> answer8 = new HashMap<>();
        answer8.put("Mukti Bahini", true);
        answer8.put("Awami League", false);
        answer8.put("Jatiyo Party", false);
        answer8.put("BNP", false);
        questions.put("What was the name of the Bangladeshi freedom fighters during the liberation war?", answer8);

        HashMap<String, Boolean> answer9 = new HashMap<>();
        answer9.put("Bangabandhu Sheikh Mujibur Rahman", true);
        answer9.put("Khaleda Zia", false);
        answer9.put("Ziaur Rahman", false);
        answer9.put("Hossain Mohammad Ershad", false);
        questions.put("Who was the first president of independent Bangladesh?", answer9);

        HashMap<String, Boolean> answer10 = new HashMap<>();
        answer10.put("Shadhinota", true);
        answer10.put("Jatiyo Sangsad", false);
        answer10.put("Shaheed Minar", false);
        answer10.put("Bangladesh Liberation Front", false);
        questions.put("What is the Bengali word for 'Independence'?", answer10);

        HashMap<String, Boolean> answer11 = new HashMap<>();
        answer11.put("The Six-Point Movement", true);
        answer11.put("The Language Movement", false);
        answer11.put("The Great Famine", false);
        answer11.put("The Quit India Movement", false);
        questions.put("What movement, led by Sheikh Mujibur Rahman, called for greater autonomy for East Pakistan?", answer11);

        HashMap<String, Boolean> answer12 = new HashMap<>();
        answer12.put("Pakistan", true);
        answer12.put("India", false);
        answer12.put("United Kingdom", false);
        answer12.put("Afghanistan", false);
        questions.put("Which country ruled over Bangladesh before its independence?", answer12);

        HashMap<String, Boolean> answer13 = new HashMap<>();
        answer13.put("1970", true);
        answer13.put("1971", false);
        answer13.put("1952", false);
        answer13.put("1966", false);
        questions.put("In which year did the general election take place, leading to the Awami League's victory?", answer13);

        HashMap<String, Boolean> answer14 = new HashMap<>();
        answer14.put("The Partition of Bengal", true);
        answer14.put("The Liberation War", false);
        answer14.put("The Language Movement", false);
        answer14.put("The Great Bengal Famine", false);
        questions.put("What event in 1947 divided Bengal into East and West Bengal?", answer14);

        HashMap<String, Boolean> answer15 = new HashMap<>();
        answer15.put("Mujibnagar", true);
        answer15.put("Dhaka", false);
        answer15.put("Chittagong", false);
        answer15.put("Rajshahi", false);
        questions.put("Where was the provisional government of Bangladesh established during the Liberation War?", answer15);

        return questions;
    }
    public static Map<String, Map<String, Boolean>> getRandomLiteratureAndGeographyQuestions(Context context, String subject, int SIZE) {
        Map<String, Map<String, Boolean>> questionsMap = new HashMap<>();
        Map<String, Map<String, Boolean>> originalQuestion;

        if (subject.equals(context.getString(R.string.geography))) {
            originalQuestion = getGeographyQuestions();
        } else if (subject.equals(context.getString(R.string.literature))) {
            originalQuestion = getLiteratureQuestions();
        } else if (subject.equals(context.getString(R.string.programming))) {
            originalQuestion = getProgrammingQuestions();
        } else if (subject.equals(context.getString(R.string.sports))){
            originalQuestion = getSportsQuestions();
        } else if (subject.equals(context.getString(R.string.iqQuestion))) {
            originalQuestion = getIQQuestions();
        } else if (subject.equals(context.getString(R.string.islam))) {
            originalQuestion = getIslamReligionQuestions();
        }else if (subject.equals(context.getString(R.string.history))) {
            originalQuestion = getHistoryOfBangladeshQuestions();
        } else{
            return questionsMap;
        }

        int originalSize =  originalQuestion.size();
        ArrayList<String> keyList = new ArrayList<>(originalQuestion.keySet());

        while (questionsMap.size()<=SIZE){
            Random random = new Random();
            int randomNumber = random.nextInt(originalSize);
            String question = keyList.get(randomNumber);
            if (!questionsMap.containsKey(question)){
                questionsMap.put(question,originalQuestion.get(question));
            }
        }
        return questionsMap;
    }

}
