public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Random rand = new Random();
       int randValue = rand.nextInt(20);
       
        System.out.println("-------Guess the randam number console game-------");
        System.out.println("Rules:");
        System.out.println("->The number will be generated from 0-20");
        System.out.println("->You will get 5 life times to guess the correct number");
        int counter = 0;
        int guess;
        System.out.println("Game starts now:");
        while(counter<5){
            counter++;
            guess = sc.nextInt();
            if(guess == randValue){
                System.out.println("Congrats you guessed the correct number!");
                break;
            }
            else if(guess<randValue){
                System.out.println("Low guess");
            }
            else if(guess>randValue){
                System.out.println("High guess");
            }
        }
        
        System.out.println("The number was "+randValue);
       
    }