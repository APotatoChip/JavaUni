import java.util.Scanner;

public class longWords {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("How many words?");
        int numberOfWords=scan.nextInt();
        System.out.printf("Please enter %d unique words\n",numberOfWords);
        String[] wordsArr = new String[numberOfWords];
        String word="";

        for(int i=0;i<numberOfWords;){
            boolean exists=false;
            word=scan.next();
          
                for(int j=0;j<i;j++){
                    if(wordsArr[j].equalsIgnoreCase(word)){
                        System.out.printf("%s already exists,try again!\n",word);
                        exists=true;
                        break;
                    }
                }

                if(!exists){
                    wordsArr[i]=word;
                    i++;
                }
                
        }

        System.out.print("Display words longer than: ");
        int wLength=scan.nextInt();
        int count=0;
        for(String w:wordsArr){
            int ln = w.length();
            if(ln>wLength){
                System.out.println(w);
                count++;
            }
        }
        scan.close();
        System.out.printf("There are %d words longer than %d letters\n",count,wLength);
   }
}
