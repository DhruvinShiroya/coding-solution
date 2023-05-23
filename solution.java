public class Challenge {

    public static void main(String[] args) {
        System.out.println(firstNonReapeated("aabccbB"));
    }

    public static char firstNonReapeated(String str){
        if(str.length() == 0)
        {
            return 0;
        }else if(str.length() ==1 ){
            return 0;
        }else {
            Map<Character,Integer> charMap = new HashMap<Character,Integer>();
            for (int i = 0; i < str.length(); i++) {
                char ch = str.charAt(i);
                charMap.put(ch,charMap.getOrDefault(ch,0)+1);
            }
            for (int i = 0; i < str.length(); i++) {
                if(charMap.get(str.charAt(i)) == 1){
                    return str.charAt(i);
                }
            }
        }
        return 0;

    }
}
