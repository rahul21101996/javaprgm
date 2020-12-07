



import java.text.SimpleDateFormat;
import java.util.Date;

public class studentDemo {
	static SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yy");
	private int roll;
	private String name;
	private Date bdate;
	private String Address;
	private float m1;
	private float m2;
	private float m3;
	
	
	public studentDemo()
	{
		this.roll=0;
		this.name="";
		this.bdate=null;
		this.Address="";
		this.m1=0;
		this.m2=0;
		this.m3=0;
		
	}
	public studentDemo(int roll,String name,Date bdate,String Address,float m1, float m2, float m3)
	{
		this.roll=roll;
		this.name=name;
		this.bdate=bdate;
		this.Address=Address;
		this.m1=m1;
		this.m2=m2;
		this.m3=m3;
	}
	public void setroll(int roll)
	{
		this.roll=roll;
	}
	public void setname(String name)
	{
		this.name=name;
	}public void setbdate(Date bdate)
	{
		this.bdate=bdate;
	}
	public void setAddress(String Address)
	{
		this.Address=Address;
	}
	public void setm1(float m1)
	{
		this.m1=m1;
	}
	public void setm2(float m2)
	{
		this.m2=m2;
	}
	public void setm3(float m3)
	{
		this.m3=m3;
	}
	public int getroll()
	{
		return this.roll;
	}
	public String getname(String name)
	{
		return this.name;
	}
	public Date getbdate()
	{
		return this.bdate;
	}
	public String getAddress(String Address)
	{
		return this.Address;
	}
	public float getm1()
	{
		return this.m1;
	}
	public float getm2()
	{
		return this.m2;
	}
	public float getm3()
	{
		return this.m3;
	}
	public String toString() {
		return "roll:"+this.roll+"\nName:"+this.name+"\nAddress:"+this.Address+"\nbirth date:"+sdf.format(this.bdate)+"\nmark1:"+this.m1+"\nmark2:"+this.m2+"\nmark3:"+this.m3;
	}
	
	
	
}
