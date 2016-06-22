package week1;

import java.util.HashMap;

public class WordCounter {

	public static void main(String[] args) {
	  String sentence="aad dd aa bbe ff a ss ss a ff errf";
	  String[] words = sentence.split(" ");
	  HashMap map = new HashMap();
	  for(String word : words){
		  if(map.containsKey(word)){
			  // get the counter value from map
			  int counter=(int) map.get(word);
			  // increase the value
			  counter++;
			  // add the word back to the map
			  map.put(word, counter);
		  }
		  else{
			  // if word is present only 1 time then
			  // add map.put("sss",1)
			  map.put(word, 1);
		  }
	  }
	  System.out.println(map.toString()); // printing the hashmap using toString function
	}

}
