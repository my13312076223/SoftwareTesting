package Triangle;

public class Triangle {
	//��Ǯ����ֵ��С����
	public int []coins={50,20,5,5,1,1,1};
	public int sum = 0;
	
	
	//Ǯ����ֵ�Ƚ�
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
				//Ǯ����ֵ���
				if(money>=coins[i])
				{
					money-=coins[i];
					sum-=coins[i];
				}
				//�жϺ����Ǯ�ܷ�ƴ�ճ�Ǯ��
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
