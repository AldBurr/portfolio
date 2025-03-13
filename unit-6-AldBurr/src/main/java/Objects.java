import java.lang.Object;
public class Objects {
    public static Object[] funWithObjects(Object obj)
    {
        String objectString = obj.toString();
        Object[] objectArray = new Object[7];
        objectArray[0] = objectString;
        objectArray[1] = 100;
        return objectArray;
    }
    public static void main(String[] args) 
    {
        Object obj = 0;
        System.out.println(Objects.funWithObjects(obj));
    }
}
