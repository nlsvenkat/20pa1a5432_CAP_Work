import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Game{
    public static void main(String[] args) {
        //creating an object to take input from user
        Scanner in=new Scanner(System.in);
        
        //Get Max Value From Board Class
        Board board=new Board();
        int max=board.get_max();
        System.out.println("Board is added to the Game");

        //Creating Snakes and Ladders
        HashMap<Integer,Integer> Snakes_and_Ladders=new HashMap<Integer,Integer>();
        Snakes_and_Ladders.put(7,28);
        Snakes_and_Ladders.put(15,2);
        Snakes_and_Ladders.put(23,6);
        Snakes_and_Ladders.put(14,25);

        System.out.println("Snakes and  Ladders added to the Game\n\n");
        

        //creating the players by the input given by user
        System.out.println("Enter no.of players : ");
        int no_of_players=in.nextInt();

        //Intiating postions of All Players with 0
        HashMap<Integer,Integer> players_data=new HashMap<Integer,Integer>();
        for(int i=1;i<=no_of_players;i++){
            players_data.put(i,0);
        }
        

        System.out.println("Player data  is ready");

        //inserting all the players in queue so that player after player play is done easily

        Queue<Integer> players=new LinkedList<>();
        for(int i=1;i<=no_of_players;i++){
            players.offer(i);
        }

        System.out.println("Players are Ready");

        Dice dice=new Dice();

        System.out.println("Dice is added to the game");

        Movement mov=new Movement();

        System.out.println("Movement is added");
        System.out.println("\n\n\n");


        //Implementing 
        while(true){
            int player=players.poll();
            players.offer(player);
            int pos=players_data.get(player);

            System.out.println("Press Enter to roll dice");
            in.nextLine();
            int value=dice.roll_dice();
            System.out.println("Player "+player+" got "+value);

            int sl=0;
            if(Snakes_and_Ladders.containsKey(pos+value)) sl=Snakes_and_Ladders.get(pos+value);
            
            // System.out.println("Player goes to "+(pos+value));

            int new_pos=mov.move(pos, value, sl);

            if(new_pos==max){
                System.out.println("Player "+player+" wins");
                break;
            }
            else{
                System.out.println("Player "+player +" is in position :  "+new_pos);
            }
            players_data.put(player,new_pos);



        }
        in.close();
        

        
    }
}