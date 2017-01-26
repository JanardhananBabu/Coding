package HackerRank;

import java.util.HashMap;
import java.util.Scanner;

public class ReadingTime {

    static HashMap<Integer,String> mapH = new HashMap<>();
    static HashMap<String,String> mapM = new HashMap<>();
    
	public ReadingTime(){

        mapH.put(1, "one");
        mapH.put(2, "two");
        mapH.put(3, "three");
        mapH.put(4, "four");
        mapH.put(5, "five");
        mapH.put(6, "six");
        mapH.put(7, "seven");
        mapH.put(8, "eight");
        mapH.put(9, "nine");
        mapH.put(10, "ten");
        mapH.put(11, "eleven");
        mapH.put(12, "twelve");
        mapH.put(0, "twelve");

        mapM.put("01", "one minute past");
        mapM.put("02", "two minutes past");
        mapM.put("03", "three minutes past");
        mapM.put("04", "four minutes past");
        mapM.put("05", "five minutes past");
        mapM.put("06", "six minutes past");
        mapM.put("07", "seven minutes past");
        mapM.put("08", "eight minutes past");
        mapM.put("09", "nine minutes past");
        mapM.put("10", "ten minutes past");
        mapM.put("11", "eleven minutes past");
        mapM.put("12", "twelve minutes past");
        mapM.put("13", "two minutes past");
        mapM.put("14", "three minutes past");
        mapM.put("15", "quarter past");
        mapM.put("16", "sixteen minutes past");
        mapM.put("17", "seventeen minutes past");
        mapM.put("18", "eighteen minutes past");
        mapM.put("19", "nineteen minutes past");
        mapM.put("20", "twenty minutes past");
        mapM.put("21", "twenty one minutes past");
        mapM.put("22", "twenty two minutes past");
        mapM.put("23", "twenty minutes past");
        mapM.put("24", "twenty four minutes past");
        mapM.put("25", "twenty five minutes past");
        mapM.put("26", "twenty six past");
        mapM.put("27", "twenty seven minutes past");
        mapM.put("28", "twenty eight minutes past");
        mapM.put("29", "twenty nine minutes past");
        mapM.put("30", "half past");
        mapM.put("31", "twenty nine minutes to");
        mapM.put("32", "twenty eight minutes to");
        mapM.put("33", "twenty seven minutes to");
        mapM.put("34", "twenty six minutes to");
        mapM.put("35", "twenty five minutes to");
        mapM.put("36", "twenty four minutes to");
        mapM.put("37", "twenty three minutes to");
        mapM.put("38", "twenty two minutes to");
        mapM.put("39", "twenty one minutes to");
        mapM.put("40", "twenty minutes to");
        mapM.put("41", "nineteen minutes to");
        mapM.put("42", "eighteen minutes to");
        mapM.put("43", "seventeen nine minutes to");
        mapM.put("44", "sixteen minutes to");
        mapM.put("45", "quarter to");
        mapM.put("46", "fourteen minutes to");
        mapM.put("47", "thirteen minutes to");
        mapM.put("48", "twelve minutes to");
        mapM.put("49", "eleven minutes to");
        mapM.put("50", "ten minutes to");
        mapM.put("51", "nine minutes to");
        mapM.put("52", "eight minutes to");
        mapM.put("53", "seven minutes to");
        mapM.put("54", "six minutes to");
        mapM.put("55", "five minutes to");
        mapM.put("56", "four minutes to");
        mapM.put("57", "three minutes to");
        mapM.put("58", "two minutes to");
        mapM.put("59", "one minute to"); 
       
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        String min = scan.nextLine();
        if(mapM.get(min).equals("00"))
        	System.out.println(mapH.get(h)+" o' clock");
        else{
        	System.out.println(mapM.get(min)+" "+mapH.get(h));
        }
    }
	
}
