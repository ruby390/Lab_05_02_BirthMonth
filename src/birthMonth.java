public class birthMonth {
    public static void main(String[] args){
        int birthMonth = 34;
        System.out.println("What is your birth month? enter a integer between 1 and 12.");
        if(birthMonth >= 1 && birthMonth <= 12)
        {
            System.out.println("Your birth month is: " + birthMonth);
        }
        else
        {
            System.out.println("you entered an incorrect value: " + birthMonth);
        }
    }
}
