import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class Server{
    public static void main(String[] args) throws NamingException, RemoteException {
        Context context = new InitialContext();
        context.rebind("rmi://localhost:1099/imath",new ImathImpl());
    }
}

interface Imath extends Remote{
    Double add(Double a, Double b) throws RemoteException;
}
class ImathImpl extends UnicastRemoteObject implements Imath{
    protected ImathImpl() throws RemoteException{
    }
    @Override
    public Double add(Double a, Double b){
        return a+b;
    }
}