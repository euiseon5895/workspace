package classProblem;

import java.util.Arrays;

public class TicketsProblem {
    public static void main(String[] args) {
        int tickets = 8 ;
        int [][] requests = {{2,3},{1,7},{2,4},{3,5}};
    //    int [][] requests = {{1,9},{3,6},{2,5}};

        System.out.println(solution(tickets, requests));

    }
    public static int solution(int tickets, int[][] requests) {

        int soldTickets = 0;



        Arrays.sort(requests,(a,b)->{
            return -(a[1]-b[1]);
        });

        Arrays.sort(requests,(a,b)->{
            return (a[0]-b[0]);
        });


        for(int i = 0 ; i < requests.length ; i++){
            if(requests[i][1] <= tickets){
                soldTickets+=requests[i][1];
                tickets-=requests[i][1];
            }
        }








        return soldTickets;




    }
}
