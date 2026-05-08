
package bob;

import java.util.Scanner;
public class Bob {
 
  
    public static void main(String[] args) {
        
        int tur = 0;
        Scanner input= new Scanner(System.in);
        System.out.println("hur många spelare är ni ");
        int spelare = input.nextInt();
        input.nextLine();
        int[]plats = new int[spelare];
        String[] namn = new String[spelare];
        for (int i = 0; i < namn.length; i++) {
            System.out.println("namn på spelare " + i);
            namn[i] = input.nextLine();
        } 
        
        for (int i = 0; i < 400; i++) {
            System.out.println("det är spelare " + namn[tur]);
            int  tärning = (int)(Math.random()*6 + 1);
            System.out.println("du slog en " +tärning);
            plats[tur] = plats[tur] + tärning;
               
           //räkna platsen upp tills nån har vunnit   
           if (plats[tur] <= 100) {
                System.out.println("du är på plats " + plats[tur]);
                
               
                //händelse block som låter användare få lite roligt 
                if (plats[tur] == 2) {
                    System.out.println("här händer +2");
                    plats[tur]+=2;
                   
                    System.out.println("du är på plats " + plats[tur]);
                   
                }
                else if (plats[tur] == 77) {
                    System.out.println("här är det -7");
                    plats[tur]-=7; 
                    System.out.println("du är på plats " + plats[tur]);  
                }
                else if (plats[tur] == 7) {
                    System.out.println("här är det -1");
                    plats[tur]--;
                    System.out.println("du är på plats " + plats[tur]); 
                } 
                else if (plats[tur] == 15) {
                    System.out.println("här är det +1");
                    plats[tur]++;
                    System.out.println("du är på plats " + plats[tur]);
                } 
                else if (plats[tur] == 28) {
                    System.out.println("här är det +3");
                    plats[tur]+=3;
                    System.out.println("du är på plats " + plats[tur]);
                } 
                else if (plats[tur] == 41) {
                    System.out.println("här är det -10");
                    plats[tur]-=10;
                    System.out.println("du är på plats " + plats[tur]);
                } 
                else if (plats[tur]== 59) {
                    System.out.println("här är det +5");
                    plats[tur]+=5;
                    System.out.println("du är på plats " + plats[tur]);
                } 
                else if (plats[tur] == 64) {
                    System.out.println("här är det -7");
                    plats[tur]-=7;
                    System.out.println("du är på plats " + plats[tur]);
                } 
                else if (plats[tur] == 82) {
                    System.out.println("här är det +11");
                    plats[tur]+=11;
                    System.out.println("du är på plats " + plats[tur]);
                }
                else if (plats[tur] == 99) {
                    System.out.println("här är det -40");
                    plats[tur]-=40;
                    System.out.println("du är på plats " + plats[tur]);
                }
            // vinst markör        
            }
           else if (plats[tur] >= 100) {
               
               
               break;
            }
           //startar om cykeln av spelare
           tur++;
            if (tur ==namn.length) {
              tur=0;  
            }
           
        }
        System.out.println(namn[tur] + " vann");
        
       
    }
    
}
