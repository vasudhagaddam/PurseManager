package com.coin;

import java.util.ArrayList;
import java.util.List;

import com.purse.Coin;

public class Purse {
	private List<Coin> coins;
	private int count;
	private int capacity;
	
	
	public int getCount() {
		return count;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	
	public Purse() {
		coins=new ArrayList<Coin>();
		count=0;
	}

	
	@Override
	public String toString() {
		return "\nPurse =>coins=" + coins + ", count=" + count + ", capacity=" + capacity + "]";
	}
	

	public Purse( int capacity) {
		coins=new ArrayList<Coin>();
		this.count = count;
		this.capacity = capacity;
	}

	public boolean insertCoin(Coin coin)
	{
		boolean status;
		if(coin.getAmount()==1 ||coin.getAmount()==5 || coin.getAmount()==10 )
		{
			coins.add(coin);
			this.count++;
			status=true;
		}
		else
		{
			status=false;
		}
		return status;
	}
	public boolean isPurseFull()
	{
		boolean status;
		if(this.getCapacity()-this.getCount()>0)
		{
			status=false;
		}
		else
		{
			status=true;
		}
		return status;
		
	}

}
