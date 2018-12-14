//switch implementation
public class Switch3
{
    public static void main(String args[])
    {
        int level=0;
        String levelstring="Expert";
        switch(levelstring)
        {
            case "begginer": level=1;
            break;
            case "intermmediate": level=2;
            break;
            case "Expert": level=3;
            break;
            default: System.out.println("invalid");
            break;
        }
        System.out.println("Your Level is" +level);
    }
    
}
