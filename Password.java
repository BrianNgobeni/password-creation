import java.util.Scanner;

public class Password
{
    public static final int pswLength = 8;
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Create a new password with a min of 8 characters and 2 digits: ");
        String passWord = input.nextLine();

        if(isPasswordValid(passWord))
        {
            System.out.println("Password is valid: " + passWord);
        }
        else
        {
            System.out.println("Not a valid password: " + passWord);
        }
    }


public static boolean isPasswordValid(String password)
{
    int charCount = 0;
    int numCount = 0;
    if(password.length() < pswLength)
    {
        return false;
    }
    for (int i = 0; i < password.length(); i++)
    {
        
        if(password.charAt(i) >= '0' && password.charAt(i) <= '9')
        {
            numCount++;
        }
        if(password.charAt(i) >= 'a' && password.charAt(i) <= 'z')
        {
            charCount++;
        }
    }
    return (charCount >=2 && numCount ==2);
}}


