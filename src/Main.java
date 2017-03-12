
public class Main 
{
	public static void main(String[] args) 
	{
		Context context;
		//算法一
		context = new Context(new ConcreteStrategyA());
		context.ContextInterface();
		//算法二
		context = new Context(new ConcreteStrategyB());
		context.ContextInterface();
		//算法三
		context = new Context(new ConcreteStrategyC());
		context.ContextInterface();
	}
}
