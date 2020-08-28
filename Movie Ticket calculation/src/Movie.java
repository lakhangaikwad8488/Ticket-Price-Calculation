
 

import java.io.*;  
class Movie{
    public static void main (String[] args) throws IOException {
        float cost=1;
        InputStreamReader r=new InputStreamReader(System.in);    
        BufferedReader br=new BufferedReader(r);  
        System.out.println("Enter the no of ticket:");
        int no=Integer.parseInt(br.readLine());
        if(no<5 || no>40){
            System.out.println("Minimum of 5 and Maximum of 40 tickets");
        }
        else{
             System.out.println("Do you want refreshment:");
             String ref=br.readLine();
             System.out.println("Do you have coupon code:");
             String cou=br.readLine();
             System.out.println("Enter the circle:");
             String cir=br.readLine();
             if(cir.equalsIgnoreCase("k")){
                 cost=(float)(no*75);
                 if(no>20){
                     cost=(float)(cost*0.9);
                 }
                
             if(cou.equalsIgnoreCase("y")){
                    cost=(float)(cost*0.98);
                } 
                 
             if(ref.equalsIgnoreCase("y")){
                     cost=(float)(cost+(no*50));
                }
                System.out.printf("Ticket cost:%.2f",cost);
                }
             else if(cir.equalsIgnoreCase("q")){
                 cost=(float)(no*150);
                 if(no>20){
                     cost=(float)(cost*0.9);
                 }
                
             if(cou.equalsIgnoreCase("y")){
                    cost=(float)(cost*0.98);
                } 
                 
             if(ref.equalsIgnoreCase("y")){
                     cost=(float)(cost+(no*50));
                }
                System.out.printf("Ticket cost:%.2f",cost);
                }
             else{
                   System.out.print("Invalid Input");
               }
                 
             
        }
    }
}