import java.util.Scanner; //takes input
import java.io.IOException;
import java.util.Random; //generates random nums

public class test {

    //methods
    static void calculator(){
        System.out.println("I am a calculator");
    }
    static int addition(int x, int y){
        return (x + y);
    }

    //method overloading
    static double addition(double x, double y){
        return (x + y);
    }

    //fibonacci
    static void fibonacci(){
        
        System.out.print("Enter the upper bound n: ");
        int n = use.in().nextInt(); //input method //FIX ME!!
        
        System.out.print("Do you want nth (T)erm or the (S)equence till n: ");
        String _ts = use.in().next().toLowerCase();
        if(_ts.charAt(0) == 't'){
            System.out.println(nth_fibonacci(n, 2, 1, 1));
        }else if(_ts.charAt(0) == 's'){
            int[] sq_fb = seq_fibonacci(n);
            for(int i : sq_fb){
                System.out.print(i + ", ");
            }
        }else{System.out.println("Error");}
    }
    //nth term
    static int nth_fibonacci(int n, int ith, int one_back, int two_back){
        if (n != ith){
        one_back = nth_fibonacci(n, ith + 1, addition(one_back, two_back), one_back);
        }
        return one_back;
    }
    //sequence till n
    static int[] seq_fibonacci(int len){
        int[] seq = new int[len]; //create an array variable length
        seq[0] = 1; seq[1] = 1;
        for(int i = 2; i < len; i++){
            seq[i] = addition(seq[i - 1], seq[i - 2]);
        }
        return seq;
    }


    //extract firstname & lastname //Fname_Lname@0123456.office.com
    static void extractor(){
        System.out.print("Enter Your University email address: ");
        String email = use.in().nextLine();
        final char sep1 = '_'; final char sep2 = '@';
        int idSep1 = email.indexOf(sep1);
        int idSep2 = email.indexOf(sep2);
        if(idSep1 != -1 && idSep2 != -1){
            int studentID = Integer.parseInt(email.substring(idSep2 + 1));
            String Fname = email.substring(0, idSep1).toUpperCase();
            String Lname = email.substring(idSep1 + 1, idSep2).toUpperCase();
            if(Integer.toString(studentID).length() == 7 && Fname.length() >= 3 && Lname.length() >= 3){
                System.out.printf("Last Name: %s   First Name: %s   Student ID: %s\n", Lname, Fname, studentID);
            }else{
                System.out.println("Error");
            }
        }else{
            System.out.println("Error");
        }
    }



    public static void main(String[] args) throws IOException{

        extractor();

        //declaration and initialization
        float _decim = 3E10f; //double for large (d)
        double _decim1 = 3E25d;
        int garages = (int)(Math.random() * 26);
        byte a,b,c ; //short for th,int for hd-th,long for rest (L)
        a = b = c = 5;
        byte rows;
        byte cells;
        String line;
        char _char = '$';

        //type casting, narrow // byte->short->int->long->float->double
        double _decim2 = 9.987654321d;
        byte _int = (byte)_decim2;

        //assignment ops: +,-,*,/,%
        int car = 5;
        car += 5;
    
        //logical ops: and = &&, or = ||, not = !
        
        //print manipulation
        System.out.println(_decim);
        System.out.println(_decim1);
        System.out.println(car);
        System.out.println(_int);
        System.out.println((a + b) * c);
        System.out.println((byte)'c'); // decimal val of char
        String name = "lolipop";
        System.out.println(name.concat(" and joe banana"));
        System.out.print(name +" and ");
        System.out.println("joe banana where \"" + name + "\" is " + name.length() + " cm long");
        System.out.println("Hassan\nBilal");
        System.out.println("Hassan\rBilal");
        System.out.printf("decim2 is: %.3f \n", _decim2); // decimal place restriction
        System.out.println((int)Math.sqrt(11 + a));
        
        //if...else
        if (car < garages){
            System.out.println("all cars parked");
        }else if(car == garages){
            System.out.println("all cars parked and all garages occupied");
        }else{
            System.out.println("all garages occupied");
        }
        
        //if...else shorthand
        System.out.println((car < garages) ? ((garages - car) + " more garage(s)") : ((car - garages) + " more car(s)"));

        //case...else
        switch (garages){
            case 10:
                System.out.println("balanced");
                break;
            default:
                System.out.println("unbalanced");
        }
        //while loop
        rows = 5;
        while(rows > 0){
            cells = 0; line = "";
            while(cells - rows != 0){
                line += _char; cells++;
            }
            System.out.println(line);
            rows--;
        }
        //do loop
        rows = 5;
        do{
            cells = 0; line = "";
            do{
                line += _char; cells++;
            }while(cells - rows != 0);
            System.out.println(line);
            rows--;
        }while(rows > 0);

        //for loop
        for(int i = 5; i > 0; i--){
            line = ""; cells = 0;
            do{
                line += _char; cells++;
            }while(cells - i != 0);
            System.out.println(line);
        }
        
        //input
        Scanner input = new Scanner(System.in);
        String newname = input.nextLine(); //input.next() for just one word omitting spaces
        System.out.println("Welcome " + newname + "!");
        //input.close(); //optional in most cases

        //random num generator
        Random rand = new Random();
        int randInt = rand.nextInt(50); //interval [0,50) //add or sub to will
        double randDouble = rand.nextDouble(50.1) - 25; //rand_interval [0.0,50.1) //interval [-25.0,25.0] to 1dp
        System.out.printf("Random Integer is: " + randInt + "\nRandom Double is: %.1f\n", randDouble);

        //array //predetermined size, only lists have variable sizes
        int[] primes = {2,3,5,7,11,13,17,19,23,29,31};
        String[] cars = {"","","","","","","","","","",""};
        for(int i = 0;i < cars.length; i++){
            cars[i] = "car " + (i + 1) + " total inspections: " + primes[i];
        }
        //for loop enhanced
        for(String i : cars){
            System.out.println(i);
        }

        //multi-dimensional array
        int[][] graph = {{1,2,3,4,5},{17,13,11,7,5}};
        for(int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].length; j++) {
                System.out.println(graph[i][j]);
            }
        }
        //multi-dimensional array enhanced loop
        for(int[] i : graph){
            for(int j : i){
                System.out.println(j);
            }
        }
        
        //method calling
        calculator();
        System.out.println(addition(2, 4));

        //method overload call
        System.out.println(addition(2.5, 4.1));
        System.out.println(addition(7/5f,8/5f));
        
        fibonacci();
        extractor();
        

        input.close();
        //System.in.read(); //console.readkey()
    }

    //method defn after main
    public static int addition(float x, float y){
        return (int)(x + y);
    }
}
