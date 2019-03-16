package Triangle;

public class Triangle {
	//按钱的面值大小排序
	public int []coins={50,20,5,5,1,1,1};
	public int sum = 0;
	
	
	//钱的面值比较
	public  boolean isCoinTakenOut(int money)
	{   
		boolean c=false;
		
		for(int i=0;i<coins.length;i++)
		{
			sum+=coins[i];
		}
		if(money<=sum&&money>0)
		{
			for(int i=0;i<coins.length;i++)
			{
				//钱的面值相减
				if(money>=coins[i])
				{
					money-=coins[i];
					sum-=coins[i];
				}
				//判断后面的钱能否拼凑出钱数
				if(sum>coins[i])
				{
					int tmoney=money+coins[i];
					for(int j=i+1;j<coins.length;j++)
					{
						if(tmoney>=coins[j])
						{
							tmoney-=coins[j];
						}
						if(tmoney==0)
						{
							c=true;
						}
				    }
				}
				if(money==0)
				{
					c=true;
				}			
			}
			
		}
		return c;			
	}		

}
