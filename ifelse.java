/*
//example of if condition

class ifelse{
public static void main(String[] args){
System.out.println("main started");
//boolean givenbiometric=!true;
boolean givenbiometric=true;
if (givenbiometric){
System.out.println("you successfully logged in");
}
System.out.println("main end");

}
}



//example for if else condition

class ifelse{
public static void main(String[] args){
//boolean validotp=true;
boolean validotp=!true;
if (validotp){
System.out.println("number verified");
}
else {
System.out.println("number  not verified");
}
}




//example for if else if condition


class ifelse{
public static void main(String[] args){
boolean fivethousand=false;
boolean sixthousand=false;
boolean seventhousand=false;

if (fivethousand){
System.out.println("four sharing room available");
}
else if(sixthousand){
System.out.println("three sharing room available");
}
else if(seventhousand){
System.out.println("two sharing room available");
}
else{
System.out.println("rooms are not available");
}
}
}



//example for nested if condition


class ifelse{
public static void main(String[] args){
//boolean enterhome=true;
//boolean enterhall=true;
//boolean enterroom=true;
boolean enterhome=true;
boolean enterhall=true;
boolean enterroom=!true;
if(enterhome){
if(enterhall){
if(enterroom){
System.out.println("its nandan");
}
else{
System.out.println(" stranger");
}
}
}
}
}*/




//example for switch statement


class ifelse{
	
public static void main(String[] args){
		
char foodmenu='g';
 
		
		switch(foodmenu){
		
		case 'a':System.out.println("show list of southindian food");
		       break;
			   
	    case 'b':System.out.println("show list of northindian food");
		       break;
			   
	    case 'c':System.out.println("show list of chats");
		       break;
		
		case 'e':System.out.println("show list of desert");
		       break;

        case 'f':System.out.println("show list of juices and milkshakes");
		       break;

default:System.out.println("hotel closed");
		       

}
}
}
			   
			   
	
