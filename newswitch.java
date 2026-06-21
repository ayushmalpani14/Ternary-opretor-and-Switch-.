class newswitch
{
   public static void main (String arg [])

   {
     String day = "sunday";
     String result  = ""; 

    result = switch (day) {

     case "monday", "tuesday" : yield "6am";
     case "sunday" : yield  "10am";
     default :yield "8am";               
    };
    System.out.println(result); 
   }
}