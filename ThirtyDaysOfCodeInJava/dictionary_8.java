/*
Day 8 - Dictionary and Maps

Given  names and phone numbers, assemble a phone book that maps friends' names to their respective phone numbers. You will then be given an unknown number of names to query your phone book for. For each  queried, print the associated entry from your phone book on a new line in the form name=phoneNumber; if an entry for  is not found, print Not found instead.

Note: Your phone book should be a Dictionary/Map/HashMap data structure.
*/

public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String,Integer> phoneBook = new HashMap<String,Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            addToMap(phoneBook,name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            if(phoneBook.containsKey(s))
                System.out.println(s + "=" + phoneBook.get(s));
            else
                System.out.println("Not found");
        }
        in.close();
    }
    
    public static void addToMap(Map<String, Integer> phoneBook, String name, int phoneNumber){
        phoneBook.put(name,phoneNumber);
    }