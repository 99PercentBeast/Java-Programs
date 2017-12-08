import java.util.Scanner;
public class StringMethods {
    public static Scanner scan = new Scanner(System.in);
    public static void main(String args[]){

        System.out.print("Enter a String : ");
        String string1=scan.nextLine();
        System.out.print("Enter another String : ");
        String string2=scan.nextLine();
        int choice;
        System.out.print("1.Concat\n2.toUpperCase\n3.toLowerCase\n4.Length\n5.Trim\n6.Replace\n7.Contains\n");
        System.out.print("Enter Operation to Perform : ");
        choice=scan.nextInt();
        choiceEnter(choice,string1,string2);
    }
    private static void choiceEnter(int choice,String string1,String string2){
        switch (choice){
            case 1:System.out.println("After Concatenation : "+string1+string2);
                   break;
            case 2:System.out.print("To Uppercase : "+string1.toUpperCase()+" "+string2.toUpperCase());
                   break;
            case 3:System.out.print("To Lowercase"+string1.toLowerCase()+" "+string2.toLowerCase());
                   break;
            case 4:System.out.println("Length of String 1 : "+ string1.length());
                   System.out.println("Length of String 2 : "+string2.length());
                   break;
            case 5:System.out.println("Original String : "+string1);
                   System.out.println("Trimmed String : "+string1.trim());
                   System.out.println("Original String : "+string2);
                   System.out.println("Trimmed String : "+string2.trim());
                   break;
            case 6:System.out.print("Enter a char to replace : ");
                   String replaceChar=scan.next();
                   System.out.print("Enter a char to replace with : ");
                   String replaceWithChar = scan.next();
                   System.out.println(string1.replaceAll(replaceChar,replaceWithChar));
                   System.out.println(string2.replaceAll(replaceChar,replaceWithChar));
                   break;
            case 7:boolean contain=string1.contains(string2);
                    if(contain) System.out.println("String 1 contains String 2");
                    else System.out.println("String 1 does not contain String 2");
                    break;
            default:System.out.println("Invalid Option!");
        }
    }
}
