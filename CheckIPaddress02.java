package com.Decipherzone;
import java.util.Scanner;


public class CheckIPaddress02 {
    public static boolean emptyCheck(String ip)

    {
        return ip != null && !ip.isEmpty();
    }

    public static boolean endStartCheck(String ip)
    {
        return !ip.endsWith(".") && !ip.startsWith("0") && !ip.startsWith(".") && !ip.endsWith(":") && !ip.startsWith(":");

    }
    
    //--IPv4 checking method

    public static boolean checkIPv4 (String ip)
    {
try{
        if (emptyCheck(ip) || endStartCheck(ip)){

            String[] parts = ip.split( "\\.");

        if ( parts.length != 4 )
        {

            return false;
        }

        for ( String s : parts )
        {
            int i = Integer.parseInt( s );

            if ( (i < 0) || (i >255)  ) {

                return false;

            }}}} catch(NumberFormatException ignored){}
        return true;
    }

//--IPv6 checking method

    public static boolean checkIPv6 (String ip) {
try{
        if (emptyCheck(ip) || endStartCheck(ip))
        {
            String[] parts = ip.split("\\:");
            if (parts.length != 8)
            {return false;}

            for (String s : parts) {
                if (s.length() != 4)
                { return false; }

                int i = Integer.parseInt(s, 16);
                if ((i < 0) || (i > 65535))
                {return false;}
            }}} catch(NumberFormatException ignored) {}
                return true;
        }

        public static void main(String[] args)
        {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter IP to Check if ipv4/ipv6 or not");
        String ipref=sc.nextLine();
        if (checkIPv4(ipref))
        {
            System.out.println("It's an IPv4 Address");
        }else if(checkIPv6(ipref))
        {
            System.out.println("It's an IPv6 Address");
        } else
            {
            System.out.println("Invalid input");
        }}}
