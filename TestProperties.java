import java.util.Properties;
class TestProperties
{
public static void main(String args[])
{
Properties props=System.getProperties();
props.list(System.out);
}
}