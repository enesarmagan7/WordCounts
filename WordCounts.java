package week4;

import java.util.HashMap;
import java.util.Scanner;

public class WordCounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, Integer> wordSet = new HashMap<>();
        int count = 1;
        System.out.println("Lütfen bir metin girin :");
        String text = sc.nextLine();
        String words[] = text.split(" ");
        for (String s : words) {

          if (wordSet.containsKey(s)) {
        count=wordSet.get(s);
        count++;
        wordSet.put(s, count);
          } else {
        count = 1;
        wordSet.put(s, count);
          }

          }
        int a=0;

        for (Integer i: wordSet.values()){
            if(i>a){
                a=i;
            }


        }

        for(String s:wordSet.keySet() ) {
            if (wordSet.get(s) == a) {
                System.out.println("Metinde en çok geçen kelime :  "+ s);
            }
        }

    }
}