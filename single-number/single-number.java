class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums){
            if(map.containsKey(n)){
                map.put(n,map.get(n)+1);
            }else{
                map.put(n,1);
            }
        }
        for(Map.Entry<Integer,Integer> entry:map.entrySet()){
            Integer k=entry.getKey();
            Integer v=entry.getValue();
            if(v==1){
                return k;
            }
        }
        return 0;
    }
}