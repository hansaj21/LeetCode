class Solution {
	public int[] twoSum(int[] num,int target) {
		Map<Integer,Integer>num_map=new HashMap<>();
		for(int i=0;i<num.length;i++)
		{
			int complement=target-num[i];
			if(num_map.containsKey(complement))
			{
				return new int[] {num_map.get(complement),i};
			}
			num_map.put(num[i],i);
		}
		throw new IllegalArgumentException("no match here");
	}
}
