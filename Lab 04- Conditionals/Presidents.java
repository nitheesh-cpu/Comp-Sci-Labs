import static java.lang.System.*;
import java.util.*;

public class Presidents{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(in);
        int year;
        String x;

        year = input.nextInt();
        x = getPresident(year);
        out.println(x);
    }

    public static String getPresident(int year){
        int y = year;
            if(y == 1900){ return "William McKinley";}
            else if(y == 1901){ return "William McKinley and Theodore Roosevelt";}
            else if(y == 1902|y == 1903|y == 1904|y == 1905|y == 1906|y == 1907|y == 1908){ return "Theodore Roosevelt";}
            else if(y == 1909){ return "Theodore Roosevelt and William Taft";}
            else if(y == 1910|y == 1911|y == 1912){ return "William Taft";}
            else if(y == 1913){ return "William Taft and Woodrow Wilson";}
            else if(y == 1914|y == 1915|y == 1916|y == 1917|y == 1918|y == 1919|y == 1920){ return "Woodrow Wilson";}
            else if(y == 1921){ return "Woodrow Wilson and Warren Harding";}
            else if(y == 1922){ return "Warren Harding";}
            else if(y == 1923){ return "Warren Harding and Calvin Coolidge";}
            else if(y == 1924|y == 1925|y == 1926|y == 1927|y == 1928){ return "Calvin Coolidge";}
            else if(y == 1929){ return "Calvin Coolidge and Herbert Hoover";}
            else if(y == 1930|y == 1931|y == 1932){ return "Herbert Hoover";}
            else if(y == 1933){ return "Herbert Hoover and Franklin Roosevelt";}
            else if(y == 1934|y == 1935|y == 1936|y == 1937|y == 1938|y == 1939|y == 1940|y == 1941|y == 1942|y == 1943|y == 1944){ return "Franklin Roosevelt";}
            else if(y == 1945){ return "Franklin Roosevelt and Harry Truman";}
            else if(y == 1946|y == 1947|y == 1948|y == 1949|y == 1950|y == 1951|y == 1952){ return "Harry Truman";}
            else if(y == 1953){ return "Harry Truman and Dwight Eisenhower";}
            else if(y == 1954|y == 1955|y == 1956|y == 1957|y == 1958|y == 1959|y == 1960){ return "Dwight Eisenhower";}
            else if(y == 1961){ return "Dwight Eisenhower and John Kennedy";}
            else if(y == 1962){ return "John Kennedy";}
            else if(y == 1963){ return "John Kennedy and Lyndon Johnson";}
            else if(y == 1964|y == 1965|y == 1966|y == 1967|y == 1968){ return "Lyndon Johnson";}
            else if(y == 1969){ return "Lyndon Johnson and Richard Nixon";}
            else if(y == 1970|y == 1971|y == 1972|y == 1973){ return "Richard Nixon";}
            else if(y == 1974){ return "Richard Nixon and Gerald Ford";}
            else if(y == (1975|1976)){ return "Gerald Ford";}
            else if(y == 1977){ return "Gerald Ford and Jimmy Carter";}
            else if(y == 1978|y == 1979|y == 1980){ return "Jimmy Carter";}
            else if(y == 1981){ return "Jimmy Carter and Ronald Reagan";}
            else if(y == 1982|y == 1983|y == 1984|y == 1985|y == 1986|y == 1987|y == 1988){ return "Ronald Reagan";}
            else if(y == 1989){ return "Ronald Reagan and George Bush";}
            else if(y == 1990|y == 1991|y == 1992){ return "George Bush";}
            else if(y == 1993){ return "George Bush and Bill Clinton";}
            else if(y == 1994|y == 1995|y == 1996|y == 1997|y == 1998|y == 1999|y == 2000){ return "Bill Clinton";}
            else if(y == 2001){ return "Bill Clinton and George W. Bush";}
            else if(y == 2002|y == 2003|y == 2004|y == 2005|y == 2006|y == 2007|y == 2008){ return "George W. Bush";}
            else if(y == 2009){ return "George W. Bush and Barack Obama";}
            else if(y == 2010|y == 2011|y == 2012|y == 2013|y == 2014|y == 2015|y == 2016){ return "Barack Obama";}
            else if(y == 2017){ return "Barack Obama and Donald Trump";}
            else if(y == 2018|y == 2019|y == 2020|y == 2021){ return "Donald Trump";}
            else{return "Not a valid year";}
    }

}
