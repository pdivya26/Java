package ejb;
import javax.ejb.Stateless;
@Stateless //Annotation

public class currency 
{
    public int dollar(int r)
    {
        return(r / 65);
    }
}
