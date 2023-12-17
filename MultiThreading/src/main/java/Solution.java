class Solution {
    public int strStr(String hs, String nd) {
        char firstChar = nd.charAt(0);
        int index = 0;
        boolean isPresent = false;
        for(int i =0; i<hs.length();i++){
            if(hs.charAt(i)==firstChar){
                isPresent = true;
                index = i;
                break;
            }
        }
        if(!isPresent){
            return -1;
        }
        return index;
    }
}