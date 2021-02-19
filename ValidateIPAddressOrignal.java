import java.util.*;

public class ValidateIPAddressOrignal{

//----------------------------------------IPv4 cheking Method----------------------------------//

	public static boolean validIPv4 (String ip) {
    try {
        if ( ip == null || ip.isEmpty() ) {
	System.out.println("Not a IPv4 adress");
            return false;
        }

        String[] parts = ip.split( "\\." );
        
        if ( parts.length != 4 ) {
            
System.out.println("Not a IPv4 adress");
            return false;

            
        }

        for ( String s : parts ) {
            int i = Integer.parseInt( s );
            if ( (i < 0) || (i >255)  ) {
System.out.println("Not a IPv4 adress");
                return false;
            }
	
        }
        if ( ip.endsWith(".") ) {
System.out.println("Not a valid IPv4 adress");
            return false;
        }
if ( ip.startsWith("0") ) {
System.out.println("Not a valid IPv4 adress");
            return false;
        }
	System.out.println("Its an IPv4 Adress");
        return true;
    } catch (NumberFormatException nfe) {
        return false;
    }
}

//----------------------------IPv6 checking Method--------------------------------------------------//

 public static boolean validIPv6 (String ip)
    {
        try 
        {
            if ( ip == null || ip.isEmpty() )
        {
           System.out.println("Not a valid IPv6 adress");
            return false;
        }

             String[] parts = ip.split( "\\:" );

             if ( parts.length != 8 ) 
            {
                System.out.println("Not a valid IPv6 adress");
            
                return false;
                

            }

                for ( String s : parts ) 
                {
                    if(s.length() !=4 )
                    {
                        System.out.println("Not a valid IPv6 adress");
                        return false;

                    }
                    
                       int i = Integer.parseInt( s, 16);
                    if ( (i < 0) || (i >65535)  ) 
                    {
                        System.out.println("Not a valid IPv6 adress");
                        return false;
                    }
    

                }
                    if ( ip.endsWith(":") || ip.startsWith(":")) 
                    {
                        System.out.println("Not a valid IPv6 adress");
                        return false;
                    }

            System.out.println("It's an IPv6 Address");
            return true;
        } catch (NumberFormatException nfe) 
            {
                return false;
            }
    }


	public static void main(String[] args){
	
	 Scanner sc = new Scanner(System.in);

	System.out.println(" Enter IP to Check Is ipv4 or not");
	 String ip=sc.nextLine();
		validIPv4 (ip);
        validIPv6 (ip);

	}
}