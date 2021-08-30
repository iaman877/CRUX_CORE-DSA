class Solution {
    public int romanToInt(String s) {
        int res = 0;
    int len = s.length();
	
    HashMap<Character, Integer> map = new HashMap<Character, Integer>();
    map.put('I', 1);
    map.put('V', 5);
    map.put('X', 10);
    map.put('L', 50);
    map.put('C', 100);
    map.put('D', 500);
    map.put('M', 1000);
    
    for (int i = 0; i < len; i++){
        int currCharacter = map.get(s.charAt(i));
        
        if (i != len -1 && currCharacter < map.get(s.charAt(i +1)))
            res -= currCharacter;
        else 
            res += currCharacter;
    }
    
    return res;
        
    }
}