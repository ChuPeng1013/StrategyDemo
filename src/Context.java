
public class Context 
{
	private Strategy strategy;
	public Context(Strategy strategy)
	{
		this.strategy = strategy;
	}
	//根据具体的策略对象，调用其算法
	public void ContextInterface()
	{
		strategy.AlgorithmInterface();
	}
}
