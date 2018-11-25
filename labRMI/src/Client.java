import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.RemoteException;
import java.util.Scanner;

public class Client{
    public static void main(String[] args) throws NamingException, RemoteException {
        Context context = new InitialContext();
        Imath imath = (Imath)context.lookup("rmi://localhost/imath");
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        Double a = in.nextDouble();
        Double b = in.nextDouble();
        String opet = in.next();
        AbstractTask task = new AbstractTask(a,b,opet);
        Double result = imath.add(a,b);
        System.out.println(result);
    }
}