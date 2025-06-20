class Vehicle
{
	public void fea(String model,int weight)
	{
		System.out.println("Model is:"+model);
		System.out.println("Weight is:"+weight);
	}
}
class Car extends Vehicle
{
	public void feaa(String model,int weight)
	{
		System.out.println("Model is:"+model);
		System.out.println("Weight is:"+weight);
	}
}
class Main
{
	public static void main(String args[])
	{

		Car c = new Car();
		c.feaa("Tesla", 1500);
	}
}