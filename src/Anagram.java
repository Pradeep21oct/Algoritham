public class Anagram {

    public static void main(String[] args) {
  //  System.out.println(isAnagram("ggg","666"));
        System.out.println(isDuplicate("ghgkmn"));
    }

    public static boolean isAnagram(String s1,String s2){
        if(s1.length()!=s2.length()) return false;

        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        int []lettes=new int[256];

        for(char c:s1.toCharArray()){
            lettes[c]++;
        }
        for(char c:s2.toCharArray()){
            lettes[c]--;
        }
        for (int i:lettes){
            if(i!=0) return false;
        }
        System.out.println(lettes);
        return true;
    }

    public static boolean isDuplicate(String s){
        if(s.length()<=1) return false;

        s=s.toLowerCase();
        int letter[]=new int[256];

        for (char c:s.toCharArray()){
            letter[c]++;
        }
        for (int i:letter){
            if(i>1) return true;
        }
        return  false;

    }
}
