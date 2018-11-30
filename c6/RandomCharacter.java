public class RandomCharacter{
public static char getRandomCharacter(char n1,char n2){
return (char)(n1+Math.random()*(n2-n1+1));
}
public static char getRandomLowerCastLetter(){
return getRandomCharacter('a','z');
}
public static char getRandomUpperCastLetter(){
return getRandomCharacter('A','Z');
}
public static char getRandomDigitCharacter(){
return getRandomCharacter('0','9');
}
public static char getRandomCharacter(){
return getRandomCharacter('\u0000','\uFFFF');
}
public static void main(String[] args){
char ch1=getRandomLowerCastLetter();
char ch2=getRandomUpperCastLetter();
char ch3=getRandomDigitCharacter();
char ch4=getRandomCharacter();
System.out.println(ch1+" "+ch2+" "+ch3+" "+ch4);
}
}